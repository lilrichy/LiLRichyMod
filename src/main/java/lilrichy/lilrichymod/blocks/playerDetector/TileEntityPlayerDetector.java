package lilrichy.lilrichymod.blocks.playerDetector;

import lilrichy.lilrichymod.handler.ConfigurationHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

/**
 * Created by Rich on 11/23/2015.
 */
public class TileEntityPlayerDetector extends TileEntity implements ITickable {
    public boolean activated = false;
    private int tick = 0;
    private int rate = 5;
    private int range = ConfigurationHandler.defaultRangePlayerDetector;
    //  private ItemStack camoStack;
    private NBTTagCompound tag = new NBTTagCompound();

    @Override
    public void update() {
        {
            if (worldObj.isRemote)
                return;

            if (tick >= rate) {
                tick = 0;
                EntityPlayer player = worldObj.getClosestPlayer(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, range + 0.5D, false);
                if (player != null) {
                    if (!activated) {
                        setActivated(true);
                        BlockPlayerDetector.setState(true, getWorld(), pos);
                    }
                } else {
                    if (activated) {
                        setActivated(false);
                        BlockPlayerDetector.setState(false, getWorld(), pos);
                    }
                }
            } else
                tick++;
        }
    }

    private void updateBlocks() {
        worldObj.notifyNeighborsOfStateChange(pos, worldObj.getBlockState(pos).getBlock());
    }

//    public ItemStack getCamouflage() {
//        return camoStack;
//    }
//
//    public void setCamouflage(ItemStack stack) {
//        this.camoStack = stack;
//        worldObj.markBlockRangeForRenderUpdate(pos, pos);
//        ;
//    }

    private void setActivated(boolean output) {
        activated = output;
        worldObj.markBlockRangeForRenderUpdate(pos, pos.add(1, 1, 1));
        updateBlocks();
    }

//    public void writeToPacket(ByteBuf buf) {
//        ByteBufUtils.writeItemStack(buf, camoStack);
//        buf.writeBoolean(activated);
//    }
//
//    public void readFromPacket(ByteBuf buf) {
//        camoStack = ByteBufUtils.readItemStack(buf);
//        activated = buf.readBoolean();
//        worldObj.markBlockRangeForRenderUpdate(pos, pos.add(1, 1, 1));
//    }
//
//    @Override
//    public void readFromNBT(NBTTagCompound tag) {
//        activated = tag.getBoolean("activated");
//        range = tag.getInteger("range");
//        if (tag.hasKey("camoStack")) {
//            camoStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("camoStack"));
//        } else {
//            camoStack = null;
//        }
//        super.readFromNBT(tag);
//    }
//
//    @Override
//    public NBTTagCompound writeToNBT(NBTTagCompound tag) {
//        tag.setBoolean("activated", activated);
//        tag.setInteger("range", range);
//        if (camoStack != null) {
//            NBTTagCompound t = new NBTTagCompound();
//            camoStack.writeToNBT(t);
//            tag.setTag("camoStack", t);
//        }
//        super.writeToNBT(tag);
//        return tag;
//    }
}