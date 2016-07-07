package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.BlockLever;

/**
 * Created by LiLRichy on 7/7/2016.
 */
public class BlockStoneLever extends BlockLever {
    public BlockStoneLever() {
        super();
        setUnlocalizedName(Reference.ModBlocks.STONE_LEVER.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.STONE_LEVER.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }

}
