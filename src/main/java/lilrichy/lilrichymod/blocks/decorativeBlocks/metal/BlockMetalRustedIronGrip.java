package lilrichy.lilrichymod.blocks.decorativeBlocks.metal;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockMetalRustedIronGrip extends Block {
    public BlockMetalRustedIronGrip() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.METAL_RUSTED_IRON_GRIP.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.METAL_RUSTED_IRON_GRIP.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
