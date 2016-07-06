package lilrichy.lilrichymod.blocks.decorativeBlocks.concrete;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockConcreteRocks extends Block {
    public BlockConcreteRocks() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.CONCRETE_ROCKS.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CONCRETE_ROCKS.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
