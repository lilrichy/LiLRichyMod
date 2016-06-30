package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockLavaBowlPurple extends Block {
    public BlockLavaBowlPurple() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.LAVA_BOWL_PURPLE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.LAVA_BOWL_PURPLE.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
