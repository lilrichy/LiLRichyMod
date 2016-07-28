package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.init.ModItems;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by LiLRichy on 7/28/2016.
 */
public class BlockReinforcedObsidianDoor extends BlockDoor {
    public BlockReinforcedObsidianDoor() {
        super(Material.ROCK);
        this.setUnlocalizedName(Reference.ModBlocks.REINFORCED_OBSIDIAN_DOOR.getUnlocalizedName());
        this.setRegistryName(Reference.ModBlocks.REINFORCED_OBSIDIAN_DOOR.getRegistryName());
        this.setResistance(2000.0F);
        this.setHardness(50.0F);
        this.setSoundType(SoundType.STONE);
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

    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.reinforcedObsidianDoor;
    }

}
