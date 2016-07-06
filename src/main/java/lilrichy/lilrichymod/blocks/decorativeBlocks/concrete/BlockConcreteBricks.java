package lilrichy.lilrichymod.blocks.decorativeBlocks.concrete;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockConcreteBricks extends Block {
    public BlockConcreteBricks() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.CONCRETE_BRICKS.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CONCRETE_BRICKS.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
