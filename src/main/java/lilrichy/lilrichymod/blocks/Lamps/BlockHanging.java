package lilrichy.lilrichymod.blocks.Lamps;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

/**
 * Created by LiLRichy on 7/23/2016.
 * This is for blocks that can only be hung from the bottom of another block.
 * The block will drop if the block it is attached to is broken.
 */
public class BlockHanging extends Block {

    public BlockHanging(String unlocalizedName, String registryName) {
        super(Material.GLASS);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(registryName);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.GLASS);
        this.setLightLevel(0.9375F);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Nonnull
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {

        EnumFacing enumfacing = EnumFacing.DOWN;
        return (worldIn.isSideSolid(pos.offset(enumfacing.getOpposite()), enumfacing, true));
    }


    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        this.checkForDrop(worldIn, pos, state);
    }

    /**
     * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
     * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
     * block, etc.
     */
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
        this.onNeighborChangeInternal(worldIn, pos, state);
    }

    private boolean onNeighborChangeInternal(World worldIn, BlockPos pos, IBlockState state) {
        return !this.checkForDrop(worldIn, pos, state);
    }

    private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state) {
        if (state.getBlock() == this && this.canPlaceBlockAt(worldIn, pos)) {
            return true;
        } else {
            if (worldIn.getBlockState(pos).getBlock() == this) {
                this.dropBlockAsItem(worldIn, pos, state, 0);
                worldIn.setBlockToAir(pos);
            }
            return false;
        }
    }

}