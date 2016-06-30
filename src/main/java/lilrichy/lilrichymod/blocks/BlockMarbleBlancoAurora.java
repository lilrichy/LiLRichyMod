package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockMarbleBlancoAurora extends Block {
    public BlockMarbleBlancoAurora() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.MARBLE_BLANCO_AURORA.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.MARBLE_BLANCO_AURORA.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
