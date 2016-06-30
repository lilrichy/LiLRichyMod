/*
package lilrichy.lilrichymod.blocks.blockTable;

import lilrichy.lilrichymod.reference.Reference;
import lilrichy.lilrichymod.inventory.ContainerLiLRichyMod;
import lilrichy.lilrichymod.recipes.BlockTableRecipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

*/
/**
 * Created by Rich on 12/10/2015.
 *//*

public class ContainerBlockTable extends ContainerLiLRichyMod {
    public static final int OUTPUT[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
    public static final int INPUT_CONCRETE_1 = 0, INPUT_MODIFIER_2 = 1, INV_START = OUTPUT.length + 1,
            INV_END = INV_START + 26, HOTBAR_START = INV_END + 1, HOTBAR_END = HOTBAR_START + 8;
    private TileEntityBlockTable te;

    public ContainerBlockTable(InventoryPlayer playerInventory, TileEntityBlockTable te) {
        this.te = te;

        //crafting slots
        this.addSlotToContainer(new SlotInputConcrete(te, INPUT_CONCRETE_1, 8, 33));
        this.addSlotToContainer(new SlotInputModifier(te, INPUT_MODIFIER_2, 45, 33));
        //Results Grid
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                this.addSlotToContainer(new SlotOutput(te, OUTPUT[j + i * 5], j * 18 + 80, i * 18 + 16));
            }
        }
        //Player inventory and hot bar slots
        this.addPlayerSlots(playerInventory, 8, 84);
    }


    public ItemStack slotClick(int slot, int clickButton, int clickID, EntityPlayer player) {
        if (slot > INPUT_MODIFIER_2 && slot < INV_START) {
            te.doCrafting(slot, clickButton, clickID, player);
        }
        return super.slotClick(slot, clickButton, clickID, player);
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return te.isUseableByPlayer(player);
    }
//--------------------------------------------------------

    */
/**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     *//*

    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot) this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // If item is in TileEntity inventory
            if (slotIndex >= INPUT_CONCRETE_1 && slotIndex <= INPUT_MODIFIER_2 && slotIndex < INV_START) {
                // try to place in player inventory / action bar
                if (!this.mergeItemStack(itemstack1, INV_START, HOTBAR_END + 1, false)) {
                    return null;
                }
                slot.onSlotChange(itemstack1, itemstack);
            }
            // Item is in player inventory, try to place in GUI
            else if (slotIndex < HOTBAR_END) {
                // if it's a correct block put in first slot
                if (BlockTableRecipes.isCraftableBlock(itemstack1)) {
                    if (!this.mergeItemStack(itemstack1, INPUT_CONCRETE_1, INPUT_CONCRETE_1 + 1, false)) {
                        player.worldObj.playSoundEffect((double) this.te.getPos().getX() + 0.5D, (double) te.getPos().getY() + 0.5D,
                                (double) te.getPos().getZ() + 0.5D, Reference.MOD_ID + ":" + "blockTableCraftSound2", 0.3F, .1f);
                        return null;
                    }
                }
                // if it is a recipe material, place in the Modifier input slot
                else if (BlockTableRecipes.isMaterial(itemstack1)) {
                    if (!this.mergeItemStack(itemstack1.splitStack(1), INPUT_MODIFIER_2, INPUT_MODIFIER_2 + 1, false)) {
                        player.worldObj.playSoundEffect((double) this.te.getPos().getX() + 0.5D, (double) te.getPos().getY() + 0.5D,
                                (double) te.getPos().getZ(), Reference.MOD_ID + ":" + "blockTableCraftSound2", 0.3F, .1f);
                        return null;
                    }
                }
                // item in player's inventory, but not in action bar
                else if (slotIndex >= INV_START && slotIndex < HOTBAR_START) {
                    // place in action bar
                    if (!this.mergeItemStack(itemstack1, HOTBAR_START, HOTBAR_END + 1, false)) {
                        return null;
                    }
                }
                // item in action bar - place in player inventory
                else if (slotIndex >= HOTBAR_START && slotIndex < HOTBAR_END + 1 &&
                        !this.mergeItemStack(itemstack1, INV_START, HOTBAR_START, false)) {
                    return null;
                }
            }
            // In one of the slots; try to place in player inventory / action bar
            else if (slotIndex >= INPUT_CONCRETE_1 && slotIndex <= INPUT_MODIFIER_2 &&
                    !this.mergeItemStack(itemstack1, INV_START, HOTBAR_END + 1, false)) {
                return null;
            }
            if (itemstack1.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }
            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(player, itemstack1);
        }
        return itemstack;
    }

    // SlotInput is a slot for Concrete item
    public class SlotInputConcrete extends Slot {
        public SlotInputConcrete(IInventory inventoryIn, int index, int xPosition, int yPosition) {
            super(inventoryIn, index, xPosition, yPosition);
        }

        // if this function returns false, the player won't be able to insert the given item into this slot
        @Override
        public boolean isItemValid(ItemStack stack) {
            return TileEntityBlockTable.isItemValidForBlockInputSlot(stack);
        }
    }

    // SlotInput is a single stack slot for Modifier item
    public class SlotInputModifier extends Slot {
        public SlotInputModifier(IInventory inventoryIn, int index, int xPosition, int yPosition) {
            super(inventoryIn, index, xPosition, yPosition);
        }

        // if this function returns false, the player won't be able to insert the given item into this slot
        @Override
        public boolean isItemValid(ItemStack stack) {
            return TileEntityBlockTable.isItemValidForModifierInputSlot(stack);
        }
    }

    // SlotOutput is a slot that will not accept any item
    public class SlotOutput extends Slot {
        public SlotOutput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
            super(inventoryIn, index, xPosition, yPosition);
        }

        @Override
        public void onPickupFromSlot(EntityPlayer player, ItemStack stack) {
            super.onPickupFromSlot(player, stack);
        }

        // if this function returns false, the player won't be able to insert the given item into this slot
        @Override
        public boolean isItemValid(ItemStack stack) {
            return TileEntityBlockTable.isItemValidForOutputSlot(stack);
        }
    }
}*/
