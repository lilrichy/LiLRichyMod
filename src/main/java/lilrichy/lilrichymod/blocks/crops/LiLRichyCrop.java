//package lilrichy.lilrichymod.blocks.crops;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockCrops;
//import net.minecraft.block.IGrowable;
//import net.minecraft.block.properties.IProperty;
//import net.minecraft.block.properties.PropertyInteger;
//
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.init.Blocks;
//
//import net.minecraft.world.World;
//
///**
// * Created by Rich on 12/1/2015.
//*/
//
//
//public class LiLRichyCrop extends BlockCrops implements IGrowable {
//    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);
//
//    public LiLRichyCrop(String name) {
//        this.setUnlocalizedName(name);
//        this.setTickRandomly(true);
//        float f = 0.5F;
//        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
//        this.setCreativeTab((CreativeTabs) null);
//        this.setHardness(0.0F);
//        this.setStepSound(soundTypeGrass);
//        this.disableStats();
//    }
//
//    //is the block grass, dirt or farmland
//    @Override
//    protected boolean canPlaceBlockOn(Block blockThatCanBePlantedOn) {
//        return blockThatCanBePlantedOn == Blocks.farmland;
//    }
//
//    @Override
//    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
//        return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && worldIn.getBlockState(pos.down()).getBlock().canSustainPlant(worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
//    }
//
//*
//     * Convert the given metadata into a BlockState for this Block
//
//
//    public IBlockState getStateFromMeta(int meta)
//    {
//        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
//    }
//
//    protected BlockState createBlockState()
//    {
//        return new BlockState(this, new IProperty[] {AGE});
//    }
//}
