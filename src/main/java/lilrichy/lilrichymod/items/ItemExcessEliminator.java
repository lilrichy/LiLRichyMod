package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.LiLRichyMod;
import lilrichy.lilrichymod.handler.GuiHandler;
import lilrichy.lilrichymod.inventory.ItemInventory;
import lilrichy.lilrichymod.inventory.PlayerItemInventory;
import lilrichy.lilrichymod.inventory.StackEqualityTesterBuilder;
import lilrichy.lilrichymod.reference.Reference;
import lilrichy.lilrichymod.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by LiLRichy on 7/10/2016.
 */
public class ItemExcessEliminator extends Item {

    public static final int STACK_LIMIT = 5;
    private static final StackEqualityTesterBuilder.IEqualityTester tester = new StackEqualityTesterBuilder().useItem().useDamage().useNBT().build();

    public ItemExcessEliminator() {
        setMaxStackSize(1);
        this.setRegistryName(Reference.ModItems.ITEM_EXCESS_ELIMINATOR.getRegistryName());
        this.setUnlocalizedName(Reference.ModItems.ITEM_EXCESS_ELIMINATOR.getUnlocalizedName());
    }

    private static int calculateDepth(ItemStack stack) {
        return calculateDepth(stack, 1);
    }

    private static int calculateDepth(ItemStack stack, int count) {
        if (stack == null) return count;
        if (stack.getItem() instanceof lilrichy.lilrichymod.items.ItemExcessEliminator) {
            final ItemStack innerStack = new ItemInventory(stack, 1).getStackInSlot(0);
            return calculateDepth(innerStack, count + 1);
        }

        return count;
    }

    public static boolean areItemAndTagEqual(final ItemStack stackA, ItemStack stackB) {
        return stackA.isItemEqual(stackB) && ItemStack.areItemStackTagsEqual(stackA, stackB);
    }

    public static boolean areMergeCandidates(ItemStack source, ItemStack target) {
        return areItemAndTagEqual(source, target) && target.stackSize < target.getMaxStackSize();
    }

    public static boolean tryInsertStack(IInventory targetInventory, int slot, ItemStack stack, boolean canMerge) {
        if (targetInventory.isItemValidForSlot(slot, stack)) {
            ItemStack targetStack = targetInventory.getStackInSlot(slot);
            if (targetStack == null) {
                int limit = targetInventory.getInventoryStackLimit();
                if (limit < stack.stackSize) {
                    targetInventory.setInventorySlotContents(slot, stack.splitStack(limit));
                } else {
                    targetInventory.setInventorySlotContents(slot, stack.copy());
                    stack.stackSize = 0;
                }
                return true;
            } else if (canMerge) {
                if (targetInventory.isItemValidForSlot(slot, stack) &&
                        areMergeCandidates(stack, targetStack)) {
                    int space = targetStack.getMaxStackSize() - targetStack.stackSize;
                    int mergeAmount = Math.min(space, stack.stackSize);
                    ItemStack copy = targetStack.copy();
                    copy.stackSize += mergeAmount;
                    targetInventory.setInventorySlotContents(slot, copy);
                    stack.stackSize -= mergeAmount;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        if (!worldIn.isRemote && (playerIn.isSneaking()))
            playerIn.openGui(LiLRichyMod.instance, GuiHandler.GuiIDs.ITEM_EXCESS_ELIMINATOR.ordinal(), worldIn, playerIn.inventory.currentItem, 0, 0);

        return new ActionResult(EnumActionResult.PASS, itemStackIn);
    }

    @Override
    public EnumActionResult onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
        IInventory inventory = new ItemInventory(stack, 1);
        ItemStack containedStack = inventory.getStackInSlot(0);
        if (containedStack != null) {
            Item item = containedStack.getItem();
            if (item instanceof ItemBlock) {
                final Block placedBlock = ((ItemBlock) item).getBlock();
                // logic based on ItemBlock.canPlaceBlockOnSide, so don't blame me for hardcoding
                final Block block = world.getBlockState(pos).getBlock();

                if (block == Blocks.SNOW_LAYER && block.isReplaceable(world, pos)) side = EnumFacing.UP;
                else if (!block.isReplaceable(world, pos)) pos = pos.offset(side);

                if (world.canBlockBePlaced(placedBlock, pos, false, side, null, stack))
                    return EnumActionResult.PASS;
            }
        }

        return EnumActionResult.FAIL;
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        PlayerItemInventory inventory = new PlayerItemInventory(playerIn, 1);
        ItemStack containedStack = inventory.getStackInSlot(0);
        if (containedStack != null) {
            Item item = containedStack.getItem();
            if (item instanceof ItemBlock) {
                EnumActionResult response = item.onItemUse(containedStack, playerIn, worldIn, pos, null, facing, hitX, hitY, hitZ);
                if (containedStack.stackSize == 0) {
                    inventory.setInventorySlotContents(0, null);
                }
                inventory.markDirty();
                return response;
            }
        }
        return EnumActionResult.PASS;
    }

    @SubscribeEvent
    public void onItemPickUp(EntityItemPickupEvent evt) {

        final EntityPlayer player = evt.getEntityPlayer();
        final ItemStack pickedStack = evt.getItem().getEntityItem();

        if (pickedStack == null || player == null) return;

        boolean foundMatchingContainer = false;

        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            final ItemStack stack = player.inventory.getStackInSlot(i);

            if (stack != null) {

                final ItemInventory inventory = new ItemInventory(stack, 1);
                final ItemStack containedStack = inventory.getStackInSlot(0);
                if (containedStack != null) {
                    final boolean isMatching = tester.isEqual(pickedStack, containedStack);
                    if (isMatching) {
                        LogHelper.info("Pick up");
                        tryInsertStack(inventory, 0, pickedStack, true);
                        if (pickedStack.stackSize == 0) return;
                        foundMatchingContainer = true;
                    }
                }
            }
        }

        if (foundMatchingContainer) pickedStack.stackSize = 0;
        evt.getItem().setEntityItemStack(null);

    }

    public static class ItemExcessEliminatorInventory extends PlayerItemInventory {
        private final EntityPlayer player;

        public ItemExcessEliminatorInventory(EntityPlayer player) {
            super(player, 1);
            this.player = player;
        }

        @Override
        public boolean isItemValidForSlot(int i, ItemStack stack) {
            return calculateDepth(stack) < STACK_LIMIT + 2;
        }
    }
}