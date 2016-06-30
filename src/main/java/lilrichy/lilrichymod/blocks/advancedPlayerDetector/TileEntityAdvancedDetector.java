/*
package lilrichy.lilrichymod.blocks.advancedPlayerDetector;


import lilrichy.lilrichymod.handler.ConfigurationHandler;
import lilrichy.lilrichymod.tileEntity.TileEntityLiLRichyMod;
import net.minecraft.util.ITickable;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

*/
/**
 * Created by Rich on 11/23/2015.
 *//*


public class TileEntityAdvancedDetector extends TileEntityLiLRichyMod implements IInventory, ITickable{
    public boolean activated = false;
    public boolean invert = false;
    private int tick = 0;
    private int range = ConfigurationHandler.defaultRangeAdvancedDetector;
    private ItemStack camoStack;

    @Override
    public void update() {
        if (worldObj.isRemote)
            return;

        int rate = 5;
        if (tick >= rate) {
            tick = 0;
            EntityPlayer player = worldObj.getClosestPlayer(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, range + 0.5D);
            //Found Player
            if (player != null) {
                if (!activated && !invert) {
                    setActivated(true);
                } else if (!activated && invert) {
                    setActivated(false);
                } else if (activated && invert) {
                    setActivated(false);
                }
            }

            //No player
            else {
                if (activated && !invert) {
                    setActivated(false);
                } else if (activated && invert) {
                    setActivated(true);
                } else if (!activated && invert) {
                    setActivated(true);
                }
            }
        } else
            tick++;
    }

    @Override
    public void onGuiButtonPress(int id) {
        if (id == 0) {
            invert = !invert;
        }
    }

    private void updateBlocks() {
        */
/*worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord - 1, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord + 1, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord - 1, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord + 1, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord - 1, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord + 1, worldObj.getBlock(xCoord, yCoord, zCoord));*//*

    }

    public int getRange() {
        return range;
    }

    public void setRange(int value) {
        this.range = value;
    }

    public ItemStack getCamouflage(int camoSlot) {
        return getStackInSlot(camoSlot);
    }

    public void setCamouflage(int camoSlot, ItemStack stack) {
        setInventorySlotContents(camoSlot, stack);
        this.camoStack = stack;
        worldObj.markBlockForUpdate(pos);
    }

    public Boolean getActivated() {
        return activated;
    }

    private void setActivated(boolean output) {
        activated = output;
        worldObj.markBlockForUpdate(pos);
        updateBlocks();
    }

    public void writeToPacket(ByteBuf buf) {
        ByteBufUtils.writeItemStack(buf, camoStack);
        buf.writeBoolean(activated);
        buf.writeBoolean(invert);
    }

    public void readFromPacket(ByteBuf buf) {
        camoStack = ByteBufUtils.readItemStack(buf);
        activated = buf.readBoolean();
        invert = buf.readBoolean();
        worldObj.markBlockForUpdate(pos);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        activated = tag.getBoolean("activated");
        invert = tag.getBoolean("invert");
        range = tag.getInteger("range");
        if (tag.hasKey("camoStack")) {
            camoStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("camoStack"));
        } else {
            camoStack = null;
        }
        super.readFromNBT(tag);
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        tag.setBoolean("activated", activated);
        tag.setBoolean("invert", invert);
        tag.setInteger("range", range);
        if (camoStack != null) {
            NBTTagCompound t = new NBTTagCompound();
            camoStack.writeToNBT(t);
            tag.setTag("camoStack", t);
        }
        super.writeToNBT(tag);
    }

    @Override
    public int getSizeInventory() {
        return 1;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        return camoStack;
    }

    @Override
    public ItemStack decrStackSize(int slot, int decreaseAmount) {
        if (camoStack != null) {
            ItemStack itemstack;

            if (camoStack.stackSize <= decreaseAmount) {
                itemstack = camoStack;
                setInventorySlotContents(0, null);
                markDirty();
                return itemstack;
            } else {
                itemstack = camoStack.splitStack(decreaseAmount);
                if (camoStack.stackSize == 0) {
                    setInventorySlotContents(0, null);
                }
                markDirty();
                return itemstack;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

*/
/*
    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        if (camoStack != null) {
            ItemStack itemstack = camoStack;
            camoStack = null;
            return itemstack;
        } else {
            return null;
        }
    }
*//*


    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        camoStack = stack;
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
        markDirty();
        worldObj.markBlockForUpdate(pos);
    }

    @Override
    public String getName() {
        return ModTileEntity.advancedDetector.getUnlocalizedName() + ".name";
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public IChatComponent getDisplayName() {
        return null;
    }
    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return worldObj.getTileEntity(pos) != this ? false : player.getDistanceSq(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack stack) {
        return stack != null && stack.getItem() instanceof ItemBlock;
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


}
*/
