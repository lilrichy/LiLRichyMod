package lilrichy.lilrichymod.items;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by LiLRichy on 7/23/2016.
 */
public class ItemTapeMeasure extends Item {
    private int firstMeasurex = 0;
    private int firstMeasurey = 0;
    private int firstMeasurez = 0;
    private int oldx = 0;
    private int oldy = 0;
    private int oldz = 0;
    private int oldface = 0;
    private boolean markerPlaced = false;
    private int mode = 1;
    private int ticktime = 0;

    public ItemTapeMeasure() {
        setUnlocalizedName(Reference.ModItems.TAPE_MEASURE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TAPE_MEASURE.getRegistryName());
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing face, float i, float j, float k) {
        if (world.isRemote) {
            if (this.firstMeasurex == 0 && this.firstMeasurey == 0 && this.firstMeasurez == 0) {
                player.addChatComponentMessage(new TextComponentString("Starting Measure"));
                this.firstMeasurex = pos.getX();
                this.firstMeasurey = pos.getY();
                this.firstMeasurez = pos.getZ();
                this.oldface = face.getFrontOffsetY();
                this.sendPacket(true, this.firstMeasurex, this.firstMeasurey, this.firstMeasurez, face.ordinal());
            } else {
                int xdist = Math.abs(this.firstMeasurex - pos.getX());
                int ydist = Math.abs(this.firstMeasurey - pos.getY());
                int zdist = Math.abs(this.firstMeasurez - pos.getZ());
                ++xdist;
                ++zdist;
                if (face.getFrontOffsetY() != 0 && face.getFrontOffsetY() != 1) {
                    ++ydist;
                }

                int measurmentxz = (int) Math.sqrt((double) (xdist * xdist + zdist * zdist));
                int measurmentxy = (int) Math.sqrt((double) (xdist * xdist + ydist * ydist));
                int measurmentyz = (int) Math.sqrt((double) (ydist * ydist + zdist * zdist));
                if (this.mode == 1) {
                    if (zdist != 1) {
                        player.addChatComponentMessage(new TextComponentString("South =" + zdist));
                    }

                    if (xdist != 1) {
                        player.addChatComponentMessage(new TextComponentString("West =" + xdist));
                    }

                    if (ydist != 0) {
                        player.addChatComponentMessage(new TextComponentString("Height =" + ydist));
                    }

                    if (xdist == 1 && zdist == 1 && ydist == 0) {
                        player.addChatComponentMessage(new TextComponentString("No Measurement"));
                    }
                }

                if (this.mode == 0) {
                    if (ydist == 0) {
                        player.addChatComponentMessage(new TextComponentString("Measurement = " + measurmentxz));
                    } else if (xdist == 0) {
                        player.addChatComponentMessage(new TextComponentString("Measurement = " + measurmentyz));
                    } else if (zdist == 0) {
                        player.addChatComponentMessage(new TextComponentString("Measurement = " + measurmentxy));
                    } else {
                        int euclideon = (int) Math.sqrt((double) (xdist * xdist + ydist * ydist + zdist * zdist));
                        player.addChatComponentMessage(new TextComponentString("Measurement = " + euclideon));
                    }
                }

                this.oldx = this.firstMeasurex;
                this.oldy = this.firstMeasurey;
                this.oldz = this.firstMeasurez;
                this.firstMeasurex = 0;
                this.firstMeasurey = 0;
                this.firstMeasurez = 0;
                this.sendPacket(false, this.oldx, this.oldy, this.oldz, this.oldface);
            }
        }

        return EnumActionResult.PASS;
    }

    public void sendPacket(boolean newOrOld, float i, float j, float k, int direction) {
        ByteBuf buffer = Unpooled.buffer();

        try {
            buffer.writeFloat(i);
            buffer.writeFloat(j);
            buffer.writeFloat(k);
            buffer.writeBoolean(newOrOld);
            buffer.writeInt(direction);
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }

    public void setMeasurments(boolean newOrOld, int i, int j, int k) {
        if (newOrOld) {
            this.firstMeasurex = i;
            this.firstMeasurey = j;
            this.firstMeasurez = k;
        } else {
            this.oldx = i;
            this.oldy = j;
            this.oldz = k;
        }

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World world, EntityPlayer player, EnumHand hand) {
        if (player.isSneaking()) {
            if (world.isRemote) {
                if (this.mode == 0) {
                    player.addChatComponentMessage(new TextComponentString("Switching mode to North/South, East/West, and height."));
                    this.mode = 1;
                } else if (this.mode == 1) {
                    player.addChatComponentMessage(new TextComponentString("Switching mode to absolute measurement."));
                    this.mode = 0;
                }
            }
        }
        return new ActionResult(EnumActionResult.PASS, itemStackIn);
    }


    @Override
    public void onUpdate(ItemStack itemstack, World worldIn, Entity entity, int itemSlot, boolean isSelected) {
        if (this.ticktime > 19) {
            NBTTagCompound tapem = itemstack.getTagCompound();
            if (tapem == null) {
                tapem = new NBTTagCompound();
                tapem.setInteger("distance", 0);
            }

            if (this.firstMeasurex == 0 && this.firstMeasurey == 0 && this.firstMeasurez == 0) {
                tapem.setInteger("distance", 0);
                itemstack.setTagCompound(tapem);
            } else {
                int currentx = entity.getPosition().getX();
                int currenty = entity.getPosition().getY();
                int currentz = entity.getPosition().getZ();
                if (currentx < 0) {
                    --currentx;
                }

                if (currentz < 0) {
                    --currentz;
                }

                int xdist;
                if (this.firstMeasurex > currentx) {
                    xdist = Math.abs(this.firstMeasurex - currentx);
                } else {
                    xdist = Math.abs(currentx - this.firstMeasurex);
                }

                int ydist;
                if (this.firstMeasurey > currenty) {
                    ydist = Math.abs(this.firstMeasurey - currenty);
                } else {
                    ydist = Math.abs(currenty - this.firstMeasurey);
                }

                int zdist;
                if (this.firstMeasurez > currentz) {
                    zdist = Math.abs(this.firstMeasurez - currentz);
                } else {
                    zdist = Math.abs(currentz - this.firstMeasurez);
                }

                ++xdist;
                ++zdist;
                int euclideon = (int) Math.sqrt((double) (xdist * xdist + ydist * ydist + zdist * zdist));
                tapem.setInteger("distance", euclideon);
                itemstack.setTagCompound(tapem);
            }

            this.ticktime = 0;
        } else {
            ++this.ticktime;
        }

    }
}
