package lilrichy.lilrichymod.handler;


import lilrichy.lilrichymod.blocks.blockTable.ContainerBlockTable;
import lilrichy.lilrichymod.blocks.blockTable.GuiBlockTable;
import lilrichy.lilrichymod.blocks.blockTable.TileEntityBlockTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by Rich on 11/26/2015.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x,y,z);
        switch (GuiIDs.values()[ID]) {
//            case ADVANCED_DETECTOR:
//                return new ContainerAdvancedDetector(player.inventory, (TileEntityAdvancedDetector) world.getTileEntity(pos));
            case BLOCK_TABLE:
                return new ContainerBlockTable(player.inventory, (TileEntityBlockTable) world.getTileEntity(pos));
        }
        throw new IllegalArgumentException("No gui with id" + ID);
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x,y,z);
        switch (GuiIDs.values()[ID]) {
//            case ADVANCED_DETECTOR:
//                return new GuiAdvancedDetector(player.inventory, (TileEntityAdvancedDetector) world.getTileEntity(pos));
            case BLOCK_TABLE:
                return new GuiBlockTable(player.inventory, (TileEntityBlockTable) world.getTileEntity(pos));
        }
        throw new IllegalArgumentException("No gui with id" + ID);
    }

    public enum GuiIDs {
        ADVANCED_DETECTOR,
        BLOCK_TABLE
    }
}
