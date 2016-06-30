package lilrichy.lilrichymod.tileEntity;


import lilrichy.lilrichymod.handler.PacketDescriptionHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Rich on 11/24/2015.
 */
public abstract class TileEntityLiLRichyMod extends TileEntity {
    public Packet getDescriptionPacket() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(pos.getX());
        buf.writeInt(pos.getY());
        buf.writeInt(pos.getZ());
        writeToPacket(buf);
        return new FMLProxyPacket((PacketBuffer) buf, PacketDescriptionHandler.CHANNEL);
    }

    public void writeToPacket(ByteBuf buf) {
    }

    public void readFromPacket(ByteBuf buf) {
    }

    public void onGuiButtonPress(int id) {
    }
}
