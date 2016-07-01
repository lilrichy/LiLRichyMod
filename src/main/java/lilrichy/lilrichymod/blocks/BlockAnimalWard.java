package lilrichy.lilrichymod.blocks;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import lilrichy.lilrichymod.tileEntity.TileEntityAnimalWard;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by LiLRichy on 6/30/2016.
 */
public class BlockAnimalWard extends Block {
    public BlockAnimalWard() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.ANIMAL_WARD.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.ANIMAL_WARD.getRegistryName());
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
        return new TileEntityAnimalWard();
    }
}
