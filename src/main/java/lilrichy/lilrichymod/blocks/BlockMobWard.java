package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import lilrichy.lilrichymod.tileEntity.TileEntityMobWard;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by LiLRichy on 6/30/2016.
 */
public class BlockMobWard extends Block {
    public BlockMobWard() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.MOB_WARD.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.MOB_WARD.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);
    }
    @Override
    public boolean hasTileEntity(IBlockState state)
    {
        return true;
    }

    public TileEntity createTileEntity(World world, IBlockState state)
    {
        return new TileEntityMobWard();
    }

}
