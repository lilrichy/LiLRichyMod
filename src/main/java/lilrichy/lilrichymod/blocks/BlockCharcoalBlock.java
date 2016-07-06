package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by LiLRichy on 7/6/2016.
 */
public class BlockCharcoalBlock extends Block {
    public BlockCharcoalBlock() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.CHARCOAL_BLOCK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CHARCOAL_BLOCK.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}