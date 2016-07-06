package lilrichy.lilrichymod.handler;

import lilrichy.lilrichymod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

/**
 * Created by LiLRichy on 7/6/2016.
 */
public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        Block blockFuel = Block.getBlockFromItem(fuel.getItem());
        if (blockFuel == ModBlocks.charcoalBlock) {
            return 16000;
        } else return 0;
    }
}