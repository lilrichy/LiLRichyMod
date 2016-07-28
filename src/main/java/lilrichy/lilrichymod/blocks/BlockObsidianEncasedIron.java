package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
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
public class BlockObsidianEncasedIron extends Block {
    public BlockObsidianEncasedIron() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.OBSIDIAN_ENCASED_IRON.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.OBSIDIAN_ENCASED_IRON.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setResistance(2000.0F);
        this.setHardness(50.0F);
        this.setSoundType(SoundType.STONE);
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
