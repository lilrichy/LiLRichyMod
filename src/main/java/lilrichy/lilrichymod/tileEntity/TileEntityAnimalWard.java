package lilrichy.lilrichymod.tileEntity;

import lilrichy.lilrichymod.handler.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by LiLRichy on 6/30/2016.
 */
public class TileEntityAnimalWard extends TileEntity {
    public TileEntityAnimalWard() {
    }

    public boolean isInRange(Entity entity) {
        double dx = (double) this.getPos().getX() + 0.5D - entity.getPosition().getX();
        double dy = (double) this.getPos().getY() + 0.5D - entity.getPosition().getY();
        double dz = (double) this.getPos().getZ() + 0.5D - entity.getPosition().getZ();

        return (dx * dx + dz * dz) / 8384.0D + dy * dy / 1024.0D <= 1.0D;
    }

    public void onChunkUnload() {
        super.onChunkUnload();
        EventHandler.animalWards.remove(this);
    }

    @Override
    public void invalidate() {
        EventHandler.animalWards.remove(this);
        super.invalidate();
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        if (!EventHandler.animalWards.contains(this)) {
            EventHandler.animalWards.add(this);
        }
    }
}
