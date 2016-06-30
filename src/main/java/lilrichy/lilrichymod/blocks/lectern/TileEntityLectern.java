/*
package lilrichy.lilrichymod.blocks.lectern;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;

import net.minecraft.tileentity.TileEntityEnchantmentTable;

import net.minecraft.util.ITickable;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

*/
/**
 * Created by LiLRichy on 1/26/2016.
 *//*

public class TileEntityLectern extends TileEntityEnchantmentTable implements ITickable {
    public ItemStack stack;

    public TileEntityLectern() {
    }

    @Override
    public void update() {
        if (worldObj.isRemote) updateBookRender();
    }

    private void updateBookRender() {
        this.bookSpreadPrev = this.bookSpread;
        this.bookRotationPrev = this.bookRotation;
        this.bookSpread += 0.1F;

        if (this.bookSpread < 0.5F || worldObj.rand.nextInt(20) == 0) {
            float f1 = this.field_145932_k;

            do {
                this.field_145932_k += (float) (worldObj.rand.nextInt(4) - worldObj.rand.nextInt(4));
            }
            while (f1 == this.field_145932_k);
        }

        while (this.bookRotation >= (float) Math.PI) {
            this.bookRotation -= ((float) Math.PI * 2F);
        }

        while (this.bookRotation < -(float) Math.PI) {
            this.bookRotation += ((float) Math.PI * 2F);
        }

        while (this.field_145924_q >= (float) Math.PI) {
            this.field_145924_q -= ((float) Math.PI * 2F);
        }

        while (this.field_145924_q < -(float) Math.PI) {
            this.field_145924_q += ((float) Math.PI * 2F);
        }

        float f2;

        for (f2 = this.field_145924_q - this.bookRotation; f2 >= (float) Math.PI; f2 -= ((float) Math.PI * 2F)) {

        }
        while (f2 < -(float) Math.PI) {
            f2 += ((float) Math.PI * 2F);
        }

        this.bookRotation += f2 * 0.4F;

        if (this.bookSpread < 0.0F) this.bookSpread = 0.0F;
        if (this.bookSpread > 1.0F) this.bookSpread = 1.0F;

        ++this.tickCount;
        this.pageFlipPrev = this.pageFlip;
        float f = (this.field_145932_k - this.pageFlip) * 0.4F;
        float f3 = 0.2F;

        if (f < -f3) f = -f3;
        if (f > f3) f = f3;

        this.field_145929_l += (f - this.field_145929_l) * 0.9F;
        this.pageFlip += this.field_145929_l;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        // if your render should always be performed regardless of where the player is looking, use infinite
        AxisAlignedBB infiniteExample = INFINITE_EXTENT_AABB;
        return infiniteExample;
    }


    public ItemStack getStack() {
        return stack;
    }

    public boolean setStack(ItemStack itemStack) {
        if (itemStack == null || getValidItems().contains(itemStack.getItem())) {
            this.stack = itemStack;
            if (itemStack == null) {
                stack = null;
            }
            return true;
        }
        return false;
    }

    public boolean hasStack() {
        return stack != null;
    }

    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound compound = new NBTTagCompound();
        writeToNBT(compound);
        S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(pos,
                worldObj.getBlockState(pos).getBlock().getMetaFromState(
                worldObj.getBlockState(pos)), compound);
        return packet;
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.getNbtCompound());
    }

    private ArrayList<Item> getValidItems() {
        ArrayList<Item> validItems = new ArrayList<Item>();

        //List of books that can be put into the Lectern
        validItems.add(Items.written_book);

        if (Loader.isModLoaded("Thaumcraft")) {//Todo reimplement Thaumcraft api
          */
/*  ItemStack item = ItemApi.getItem("itemThaumonomicon", 0);
            if (item != null) {
                validItems.add(item.getItem());
            }*//*

        }
        if (Loader.isModLoaded("Botania")) {
            for (ItemStack aLexList : OreDictionary.getOres("lexicaBotania")) {
                validItems.add(aLexList.getItem());
            }
        }
        //ToDo Add Tinkers Construct books.

        //Immersive Engineering book would not open the gui in testing.
        */
/*if (Loader.isModLoaded("ImmersiveEngineering")) {
            ItemStack item = new ItemStack(IEContent.itemTool, 1, 3);
            validItems.add(item.getItem());
        }*//*

        return validItems;
    }

    @Override
    public void readFromNBT(NBTTagCompound comp) {
        super.readFromNBT(comp);
        if (comp.hasKey("placedBook")) {
            NBTTagCompound tag = comp.getCompoundTag("placedBook");
            stack = ItemStack.loadItemStackFromNBT(tag);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound comp) {
        super.writeToNBT(comp);
        if (stack != null) {
            NBTTagCompound tag = new NBTTagCompound();
            stack.writeToNBT(tag);
            comp.setTag("placedBook", tag);
        }
    }
}
*/
