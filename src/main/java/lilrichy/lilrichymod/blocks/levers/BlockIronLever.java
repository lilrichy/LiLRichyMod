package lilrichy.lilrichymod.blocks.levers;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.BlockLever;

/**
 * Created by LiLRichy on 7/7/2016.
 */
public class BlockIronLever extends BlockLever {
    public BlockIronLever() {
        super();
        setUnlocalizedName(Reference.ModBlocks.IRON_LEVER.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.IRON_LEVER.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}