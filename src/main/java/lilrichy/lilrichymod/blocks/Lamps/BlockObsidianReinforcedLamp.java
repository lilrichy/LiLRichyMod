package lilrichy.lilrichymod.blocks.Lamps;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by LiLRichy on 7/28/2016.
 */
public class BlockObsidianReinforcedLamp extends BlockLamp {
    public BlockObsidianReinforcedLamp(String unlocalizedName, String registryName) {
        super(Material.ROCK, unlocalizedName, registryName);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setSoundType(SoundType.STONE);
        this.setLightLevel(0.5375F);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return true;
    }

    @Override
    public boolean isSideSolid(IBlockState base_state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        tooltip.add("This block is explosion resistant and can not be destroyed by the Wither Boss");
        tooltip.add("This block only emits half as much light compared to other lamps due to its obsidian reinforcement. ");
    }

    @Override
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
        return !(entity instanceof EntityWither);
    }

    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {
    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn) {
        return false;
    }
}
