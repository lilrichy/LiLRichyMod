package lilrichy.lilrichymod.blocks.Lamps;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by LiLRichy on 7/28/2016.
 */
public class BlockReinforcedGlowstone extends BlockLamp {
    public BlockReinforcedGlowstone(String unlocalizedName, String registryName) {
        super(Material.GLASS, unlocalizedName, registryName);
        this.setResistance(2000.0F);
        this.setHardness(50.0F);
        this.setSoundType(SoundType.METAL);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        tooltip.add("This block is explosion resistant.");
    }

    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {
    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn) {
        return false;
    }
}
