package lilrichy.lilrichymod.blocks.Lamps;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by LiLRichy on 7/23/2016.
 */
public class BlockHangingGlowstoneLamp extends BlockHanging {

    private static final AxisAlignedBB axisAlignedBB = new AxisAlignedBB(0.20D, 0.25D, 0.80D, 0.80D, 1.0D, 0.20D);

    public BlockHangingGlowstoneLamp(String unlocalizedName, String registryName) {
        super(unlocalizedName, registryName);
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn) {
        addCollisionBoxToList(pos, entityBox, collidingBoxes, axisAlignedBB);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return axisAlignedBB;
    }

}