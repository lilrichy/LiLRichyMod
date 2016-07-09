package lilrichy.lilrichymod.blocks.levers;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.BlockLever;

/**
 * Created by LiLRichy on 7/7/2016.
 */
public class BlockObsidianLever extends BlockLever {
    public BlockObsidianLever() {
        super();
        setUnlocalizedName(Reference.ModBlocks.OBSIDIAN_LEVER.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.OBSIDIAN_LEVER.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}