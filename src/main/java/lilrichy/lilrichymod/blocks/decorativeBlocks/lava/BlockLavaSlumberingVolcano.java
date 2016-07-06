package lilrichy.lilrichymod.blocks.decorativeBlocks.lava;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockLavaSlumberingVolcano extends Block {
    public BlockLavaSlumberingVolcano() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.LAVA_SLUMBERING_VOLCANO.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.LAVA_SLUMBERING_VOLCANO.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
