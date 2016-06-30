package lilrichy.lilrichymod.handler;



import io.netty.buffer.ByteBuf;
import lilrichy.lilrichymod.handler.network.MessageBase;
import lilrichy.lilrichymod.tileEntity.TileEntityLiLRichyMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

/**
 * Created by Rich on 11/30/2015.
 */
public class MessageHandleGuiButtonPress extends MessageBase<MessageHandleGuiButtonPress> {
    private int x, y, z, id;
    private BlockPos pos;

    public MessageHandleGuiButtonPress() {
    }

    public MessageHandleGuiButtonPress(TileEntityLiLRichyMod te, int id) {
        x = te.getPos().getX();
        y = te.getPos().getY();
        z = te.getPos().getZ();
        this.id = id;
        pos.add(x,y,z);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
        id = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeInt(id);
    }

    @Override
    public void handleClientSide(MessageHandleGuiButtonPress message, EntityPlayer player) {
    }

    @Override
    public void handleServerSide(MessageHandleGuiButtonPress message, EntityPlayer player) {
        TileEntity te = player.worldObj.getTileEntity(pos);
        if (te instanceof TileEntityLiLRichyMod) {
            ((TileEntityLiLRichyMod) te).onGuiButtonPress(id);
        }
    }
}