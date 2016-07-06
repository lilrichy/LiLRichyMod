package lilrichy.lilrichymod.blocks.decorativeBlocks.metal;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockMetalSeafoamTarnish extends Block {
    public BlockMetalSeafoamTarnish() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.METAL_SEAFOAM_TARNISH.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.METAL_SEAFOAM_TARNISH.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
