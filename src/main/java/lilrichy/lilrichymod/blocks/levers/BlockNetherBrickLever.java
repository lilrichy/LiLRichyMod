package lilrichy.lilrichymod.blocks.levers;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.BlockLever;

/**
 * Created by LiLRichy on 7/7/2016.
 */
public class BlockNetherBrickLever extends BlockLever {
    public BlockNetherBrickLever() {
        super();
        setUnlocalizedName(Reference.ModBlocks.NETHER_BRICK_LEVER.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.NETHER_BRICK_LEVER.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}