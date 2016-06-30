package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockCottageWallXLight extends Block {
    public BlockCottageWallXLight() {
        super(Material.WOOD);
        setUnlocalizedName(Reference.ModBlocks.COTTAGE_WALL_X_LIGHT.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.COTTAGE_WALL_X_LIGHT.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
