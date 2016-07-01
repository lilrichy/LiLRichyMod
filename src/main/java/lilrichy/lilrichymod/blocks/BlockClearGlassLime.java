package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

/**
 * Created by richa on 6/30/2016.
 */
public class BlockClearGlassLime extends Block {
    public BlockClearGlassLime() {
        super(Material.GLASS);
        setUnlocalizedName(Reference.ModBlocks.CLEAR_GLASS_LIME.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CLEAR_GLASS_LIME.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(0.3F);
        this.setSoundType(SoundType.GLASS);
    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, EnumFacing side) {
        Block block = world.getBlockState(pos.offset(side)).getBlock();
        return block == this ? false : super.shouldSideBeRendered(state, world, pos, side);
    }

    @Nonnull
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
