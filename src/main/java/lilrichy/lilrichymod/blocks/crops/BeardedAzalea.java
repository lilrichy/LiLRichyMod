package lilrichy.lilrichymod.blocks.crops;


import lilrichy.lilrichymod.init.ModItems;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

/**
 *  Created by Rich on 12/2/2015.
 */

public class BeardedAzalea extends BlockCrops {
    public BeardedAzalea() {
        super();
        this.setUnlocalizedName(Reference.ModBlocks.BEARDED_AZALEA.getUnlocalizedName());
        this.setRegistryName(Reference.ModBlocks.BEARDED_AZALEA.getRegistryName());
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Crop;
    }

    @Override
    protected Item getSeed() {
        return ModItems.beardedAzaleaSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.essenceOfBeard;
    }
}
