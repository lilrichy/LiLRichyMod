//package lilrichy.lilrichymod.blocks.decorativeBlocks;
//
//
//import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//
//import net.minecraft.util.EnumFacing;
//
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.IBlockAccess;
//
///**
// * Created by LiLRichy on 1/26/2016.
// */
//public class GlassBlocks extends DecoSubBlocks {
//    //Constructor with Tool tip
//    public GlassBlocks(String name, Material material, String toolTip, String toolTip2, String[] types, int typesLength) {
//        super(name, material, toolTip, toolTip2, types, typesLength);
//        this.setHardness(0.5f);
//        this.setLightLevel(1.0F);
//   //todo     this.setStepSound(soundTypeGlass);
//        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
//        this.setUnlocalizedName(name);
//    }
//
//    public boolean isOpaqueCube() {
//        return false;
//    }
//
//    public boolean shouldSideBeRendered1(IBlockAccess world, BlockPos pos, EnumFacing side) {
//        Block block = world.getBlockState(pos).getBlock();
//
//        return block == this ? false : super.shouldSideBeRendered(world, pos, side);
//    }
//
//
//    public boolean shouldSideBeRendered(IBlockAccess world, BlockPos pos, EnumFacing side) {
//        return shouldSideBeRendered1(world, pos, side.getOpposite());
//    }
//
//  //// TODO: 6/29/2016
//   /* @Override
//    public EnumWorldBlockLayer getBlockLayer() {
//        return EnumWorldBlockLayer.TRANSLUCENT;
//    }
//    */
//}
