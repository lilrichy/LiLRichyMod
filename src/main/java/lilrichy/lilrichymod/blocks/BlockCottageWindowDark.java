package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockCottageWindowDark extends Block {
    public BlockCottageWindowDark() {
        super(Material.WOOD);
        setUnlocalizedName(Reference.ModBlocks.COTTAGE_WINDOW_DARK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.COTTAGE_WINDOW_DARK.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
