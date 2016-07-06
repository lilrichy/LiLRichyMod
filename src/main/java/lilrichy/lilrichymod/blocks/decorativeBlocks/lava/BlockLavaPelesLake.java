package lilrichy.lilrichymod.blocks.decorativeBlocks.lava;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockLavaPelesLake extends Block {
    public BlockLavaPelesLake() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.LAVA_PELES_LAKE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.LAVA_PELES_LAKE.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
