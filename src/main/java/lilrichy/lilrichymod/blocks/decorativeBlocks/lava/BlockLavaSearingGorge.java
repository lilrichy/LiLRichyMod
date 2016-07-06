package lilrichy.lilrichymod.blocks.decorativeBlocks.lava;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockLavaSearingGorge extends Block {
    public BlockLavaSearingGorge() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.LAVA_SEARING_GORGE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.LAVA_SEARING_GORGE.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
