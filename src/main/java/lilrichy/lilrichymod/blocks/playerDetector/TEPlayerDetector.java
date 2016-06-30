//package lilrichy.lilrichymod.blocks.playerDetector;
//
//import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
//import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityLiLRichyMod;
//import io.netty.buffer.ByteBuf;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemStack;
//import net.minecraft.nbt.NBTTagCompound;
//import net.minecraft.util.ITickable;
//import net.minecraftforge.fml.common.network.ByteBufUtils;
//
///**
// * Created by Rich on 11/23/2015.
// */
//public class TEPlayerDetector extends TileEntityLiLRichyMod implements ITickable {
//    public boolean activated = false;
//    private int tick = 0;
//    private int rate = 5;
//    private int range = ConfigurationHandler.defaultRangePlayerDetector;
//    private ItemStack camoStack;
//    private NBTTagCompound tag = new NBTTagCompound();
//
//    @Override
//    public void update() {
//        {
//            if (worldObj.isRemote)
//                return;
//
//            if (tick >= rate) {
//                tick = 0;
//                EntityPlayer player = worldObj.getClosestPlayer(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, range + 0.5D);
//                if (player != null) {
//                    if (!activated)
//                        setActivated(true);
//                } else {
//                    if (activated)
//                        setActivated(false);
//                }
//            } else
//                tick++;
//        }
//    }
//
//    private void updateBlocks() {
//        worldObj.notifyBlockOfStateChange(pos,worldObj.getBlockState(pos).getBlock());
//      /*  worldObj.notifyBlockOfStateChange(pos.getX() - 1, pos.getY(), pos.getZ(), pos,worldObj.getBlockState(pos).getBlock());
//        worldObj.notifyBlockOfStateChange(xCoord + 1, yCoord, zCoord, pos,worldObj.getBlockState(pos).getBlock());
//        worldObj.notifyBlockOfStateChange(xCoord, yCoord - 1, zCoord, pos,worldObj.getBlockState(pos).getBlock());
//        worldObj.notifyBlockOfStateChange(xCoord, yCoord + 1, zCoord, pos,worldObj.getBlockState(pos).getBlock());
//        worldObj.notifyBlockOfStateChange(xCoord, yCoord, zCoord - 1, pos,worldObj.getBlockState(pos).getBlock());
//        worldObj.notifyBlockOfStateChange(xCoord, yCoord, zCoord + 1, pos,worldObj.getBlockState(pos).getBlock());*/
//    }
//
//    public int getRange() {
//        return range;
//    }
//
//    public void setRange(int value) {
//        this.range = value;
//    }
//
//    public ItemStack getCamouflage() {
//        return camoStack;
//    }
//
//    public void setCamouflage(ItemStack stack) {
//        this.camoStack = stack;
//        worldObj.markBlockForUpdate(pos);
//    }
//
//    public Boolean getActivated() {
//        return activated;
//    }
//
//    private void setActivated(boolean output) {
//        activated = output;
//        worldObj.markBlockForUpdate(pos);
//        updateBlocks();
//    }
//
//    public void writeToPacket(ByteBuf buf) {
//        ByteBufUtils.writeItemStack(buf, camoStack);
//        buf.writeBoolean(activated);
//    }
//
//    public void readFromPacket(ByteBuf buf) {
//        camoStack = ByteBufUtils.readItemStack(buf);
//        activated = buf.readBoolean();
//        worldObj.markBlockForUpdate(pos);
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
//    public void writeToNBT(NBTTagCompound tag) {
//        tag.setBoolean("activated", activated);
//        tag.setInteger("range", range);
//        if (camoStack != null) {
//            NBTTagCompound t = new NBTTagCompound();
//            camoStack.writeToNBT(t);
//            tag.setTag("camoStack", t);
//        }
//        super.writeToNBT(tag);
//    }
//
//
//}