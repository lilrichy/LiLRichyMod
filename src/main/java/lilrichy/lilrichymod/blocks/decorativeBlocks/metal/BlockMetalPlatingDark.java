package lilrichy.lilrichymod.blocks.decorativeBlocks.metal;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockMetalPlatingDark extends Block {
    public BlockMetalPlatingDark() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.METAL_PLATING_DARK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.METAL_PLATING_DARK.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
