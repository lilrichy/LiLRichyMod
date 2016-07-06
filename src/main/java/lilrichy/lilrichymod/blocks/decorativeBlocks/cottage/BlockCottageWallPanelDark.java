package lilrichy.lilrichymod.blocks.decorativeBlocks.cottage;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockCottageWallPanelDark extends Block {
    public BlockCottageWallPanelDark() {
        super(Material.WOOD);
        setUnlocalizedName(Reference.ModBlocks.COTTAGE_WALL_PANEL_DARK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.COTTAGE_WALL_PANEL_DARK.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
