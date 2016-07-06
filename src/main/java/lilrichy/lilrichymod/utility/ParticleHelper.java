package lilrichy.lilrichymod.utility;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by LiLRichy on 7/4/2016.
 */
public class ParticleHelper {
   private static Random rand = new Random();


    public static void surroundBlock(World world, BlockPos pos, int rate) {
        for (int i = 0; i < rate; i++) {
            double d0 = (double) pos.getX() + 0.5D;
            double d1 = (double) pos.getY() + 0.5D + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double) pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;
            world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
            world.spawnParticle(EnumParticleTypes.REDSTONE, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);

            world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
            world.spawnParticle(EnumParticleTypes.REDSTONE, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);

            world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
            world.spawnParticle(EnumParticleTypes.REDSTONE, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);

            world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
            world.spawnParticle(EnumParticleTypes.REDSTONE, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
        }
    }
}
