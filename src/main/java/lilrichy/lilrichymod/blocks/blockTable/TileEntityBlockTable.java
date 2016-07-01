package lilrichy.lilrichymod.blocks.blockTable;


import lilrichy.lilrichymod.recipes.BlockTableRecipes;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;

import java.util.ArrayList;

/**
*Created by Rich on 12/8/2015.
*/


public class TileEntityBlockTable extends TileEntity implements IInventory, ITickable {
    public static final int PLAYER_SLOTS_TOTAL = 36;
    public static final int INPUT_SLOTS_COUNT = 2;
    public static final int OUTPUT_SLOTS_COUNT = 15;
    public static final int TOTAL_SLOTS_COUNT = PLAYER_SLOTS_TOTAL + INPUT_SLOTS_COUNT + OUTPUT_SLOTS_COUNT;
    public static final int FIRST_INPUT_SLOT = ContainerBlockTable.INPUT_CONCRETE_1;
    public static final int FIRST_OUTPUT_SLOT = FIRST_INPUT_SLOT + 2;

    public int direction;
    public ItemStack[] input;
    private int decreaseAmt = 0;
    private ItemStack[] itemStacks = new ItemStack[TOTAL_SLOTS_COUNT];
    private ItemStack resultItemStack;

    // Return true if the given stack is allowed to be inserted in the given slot
    static public boolean isItemValidForBlockInputSlot(ItemStack itemStack) {
        return BlockTableRecipes.isCraftableBlock(itemStack);
    }

    static public boolean isItemValidForModifierInputSlot(ItemStack itemStack) {
        return BlockTableRecipes.isMaterial(itemStack);
    }

    static public boolean isItemValidForOutputSlot(ItemStack itemStack) {
        return false;
    }

    //-----------------------------------------------------------------------------------------------------------
    //Main Recipe, tileEntity, and other Methods.
    //-----------------------------------------------------------------------------------------------------------
    public void update() {
        getInput();
        resultItemStack = getCurrentRecipe();
        if (resultItemStack != null) {
            updateOutputSlots();
        } else {
            clearOutput();
        }
        if (!inputHasItems()) {
            clearOutput();
        }
    }

    public ItemStack getCurrentRecipe() {
        if (inputHasItems()) {
            if (BlockTableRecipes.recipes().getCraftingResult(getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1)) != null) {
                return BlockTableRecipes.recipes().getCraftingResult(getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1));
            }
        }
        return null;
    }

    public void doCrafting(int slot, int clickButton, ClickType clickID, EntityPlayer player) {
        if (inputHasItems() && getCurrentRecipe() != null && getStackInSlot(slot) != null) {
            this.decrStackSize(0, decreaseAmt);
            this.decrStackSize(1, decreaseAmt);
            player.inventory.addItemStackToInventory(getStackInSlot(slot));
           // worldObj.playSoundEffect((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D,
            //        (double) this.pos.getZ() + 0.5D, Reference.MOD_ID + ":" + "blockTableCraftSound", 0.3F, .1f);
            this.markDirty();

        }
    }

    public void getInput() {
        this.input = new ItemStack[]{getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1)};
        if (inputHasItems()) {
            if (getStackInSlot(FIRST_INPUT_SLOT).stackSize >= getStackInSlot(FIRST_INPUT_SLOT + 1).stackSize) {
                this.decreaseAmt = this.getStackInSlot(FIRST_INPUT_SLOT + 1).stackSize;
            } else if (getStackInSlot(FIRST_INPUT_SLOT).stackSize < getStackInSlot(FIRST_INPUT_SLOT + 1).stackSize) {
                this.decreaseAmt = this.getStackInSlot(FIRST_INPUT_SLOT).stackSize;
            }
        } else this.decreaseAmt = 0;
    }

    @Override
    public ItemStack decrStackSize(int slotIndex, int count) {
        ItemStack itemStackInSlot = getStackInSlot(slotIndex);
        if (itemStackInSlot == null) return null;
        ItemStack itemStackRemoved;
        if (itemStackInSlot.stackSize <= count) {
            itemStackRemoved = itemStackInSlot;
            setInventorySlotContents(slotIndex, null);
        } else {
            itemStackRemoved = itemStackInSlot.splitStack(count);
            if (itemStackInSlot.stackSize == 0) {
                setInventorySlotContents(slotIndex, null);
            }
        }
        markDirty();
        return itemStackRemoved;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

    public void updateOutputSlots() {
        clearOutput();
        Block block = Block.getBlockFromItem(resultItemStack.getItem());
        ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        block.getSubBlocks(resultItemStack.getItem(), null, list);

        for (int i = 0; i < list.size(); i++) {
            ItemStack stack = new ItemStack(resultItemStack.getItem(), decreaseAmt, i);
            setInventorySlotContents(FIRST_OUTPUT_SLOT + i, stack);
        }
    }

    public void clearOutput() {
        for (int i = FIRST_OUTPUT_SLOT; i < FIRST_OUTPUT_SLOT + OUTPUT_SLOTS_COUNT; i++) {
            setInventorySlotContents(i, null);
        }
    }

    public boolean inputHasItems() {
        return getStackInSlot(FIRST_INPUT_SLOT) != null && getStackInSlot(FIRST_INPUT_SLOT + 1) != null;
    }

// -----------------------------------------------------------------------------------------------------------
// NBT, Packets, and slot methods.
// -----------------------------------------------------------------------------------------------------------

//    @Override
//    public void writeToNBT(NBTTagCompound tag) {
//        super.writeToNBT(tag);
//        tag.setInteger("direction", direction);
//        NBTTagList nbttaglist = new NBTTagList();
//        if (getStackInSlot(FIRST_INPUT_SLOT) != null) {
//            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
//            getStackInSlot(FIRST_INPUT_SLOT).writeToNBT(nbttagcompound1);
//            nbttaglist.appendTag(nbttagcompound1);
//        }
//        if (getStackInSlot(FIRST_INPUT_SLOT + 1) != null) {
//            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
//            getStackInSlot(FIRST_INPUT_SLOT + 1).writeToNBT(nbttagcompound1);
//            nbttaglist.appendTag(nbttagcompound1);
//        }
//        tag.setTag("Items", nbttaglist);
//    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);
        direction = tag.getInteger("direction");
        NBTTagList nbttaglist = (NBTTagList) tag.getTag("Items");
        NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(0);
        setInventorySlotContents(FIRST_INPUT_SLOT, ItemStack.loadItemStackFromNBT(nbttagcompound1));
        nbttagcompound1 = nbttaglist.getCompoundTagAt(1);
        setInventorySlotContents(FIRST_INPUT_SLOT + 1, ItemStack.loadItemStackFromNBT(nbttagcompound1));
    }

//    @Override
//    public Packet getDescriptionPacket() {
//        NBTTagCompound var1 = new NBTTagCompound();
//        writeToNBT(var1);
//        return new S35PacketUpdateTileEntity(pos, 1, var1);
//    }
//
//    @Override
//    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
//        readFromNBT(pkt.getNbtCompound());
//    }

// -----------------------------------------------------------------------------------------------------------
// The following methods must be implemented but don't really affect the way the table works
// -----------------------------------------------------------------------------------------------------------

    // Gets the number of slots in the inventory
    @Override
    public int getSizeInventory() {
        return itemStacks.length;
    }

    // Gets the stack in the given slot
    @Override
    public ItemStack getStackInSlot(int i) {
        return itemStacks[i];
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        if (index < 0 || index >= this.getSizeInventory())
            return;
        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
            stack.stackSize = this.getInventoryStackLimit();
        if (stack != null && stack.stackSize == 0)
            stack = null;
        this.itemStacks[index] = stack;
        this.markDirty();
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        if (this.worldObj.getTileEntity(pos) != this) return false;
        final double X_CENTRE_OFFSET = 0.5;
        final double Y_CENTRE_OFFSET = 0.5;
        final double Z_CENTRE_OFFSET = 0.5;
        final double MAXIMUM_DISTANCE_SQ = 8.0 * 8.0;
        return player.getDistanceSq(player.posX + X_CENTRE_OFFSET, player.posY + Y_CENTRE_OFFSET, player.posZ + Z_CENTRE_OFFSET) < MAXIMUM_DISTANCE_SQ;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

//    @Override
//    public String getInventoryName() {
//        return ModTileEntity.blockTable.getUnlocalizedName() + ".name";
//    }
//
//    @Override
//    public boolean hasCustomInventoryName() {
//        return false;
//    }

    @Override
    public boolean isItemValidForSlot(int slotIndex, ItemStack itemstack) {
        return false;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

//    @Override
//    public ItemStack getStackInSlotOnClosing(int slotIndex) {
//        ItemStack itemStack = getStackInSlot(slotIndex);
//        if (itemStack != null) setInventorySlotContents(slotIndex, null);
//        return itemStack;
//    }



    @Override
    public String getName() {
        return Reference.ModBlocks.BLOCK_TABLE.getUnlocalizedName();
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public ITextComponent getDisplayName() {
        return null;
    }


}
