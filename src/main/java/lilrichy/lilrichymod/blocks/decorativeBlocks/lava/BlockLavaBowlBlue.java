package lilrichy.lilrichymod.blocks.decorativeBlocks.lava;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockLavaBowlBlue extends Block {
    public BlockLavaBowlBlue() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.LAVA_BOWL_BLUE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.LAVA_BOWL_BLUE.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
