//package lilrichy.lilrichymod.blocks.playerDetector;
//
//import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
//import lilrichy.lilrichymod.init.ModBlocks;
//import net.minecraft.block.BlockContainer;
//import net.minecraft.block.SoundType;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.entity.item.EntityItem;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.init.SoundEvents;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemBlock;
//import net.minecraft.item.ItemStack;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.EnumHand;
//import net.minecraft.util.EnumParticleTypes;
//import net.minecraft.util.SoundCategory;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.IBlockAccess;
//import net.minecraft.world.World;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//
//import javax.annotation.Nullable;
//import java.util.Random;
//
//
///**
// * Created by Rich on 11/23/2015.
// */
//public class BlockPlayerDetector extends BlockContainer {
//    /*   IIcon sideOff;
//       IIcon sideOn;
//       IIcon topBottom;*/
//    private final boolean isActivated;
//
//
//    public BlockPlayerDetector(boolean isActivated, String name, String rName) {
//        super(Material.ROCK);
//        setUnlocalizedName(name);
//        setRegistryName(rName);
//        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
//        this.setHardness(2f);
//        this.setSoundType(SoundType.STONE);
//        this.isActivated = isActivated;
//    }
//
//
//    @Nullable
//    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
//        return Item.getItemFromBlock(ModBlocks.playerDetector);
//    }
//
//    @SideOnly(Side.CLIENT)
//    @SuppressWarnings("incomplete-switch")
//    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
//        if (this.isActivated) {
//            double d0 = (double) pos.getX() + 0.5D;
//            double d1 = (double) pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
//            double d2 = (double) pos.getZ() + 0.5D;
//            double d3 = 0.52D;
//            double d4 = rand.nextDouble() * 0.6D - 0.3D;
//
//            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
//            worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
//
//            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
//            worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
//
//            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
//            worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
//
//            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
//            worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
//        }
//    }
//
//    public static void setState(boolean active, World worldIn, BlockPos pos)
//    {
//        IBlockState iblockstate = worldIn.getBlockState(pos);
//        TileEntity tileentity = worldIn.getTileEntity(pos);
//
//        if (active)
//        {
//            worldIn.setBlockState(pos, ModBlocks.playerDetectorActivated.getDefaultState(), 3);
//            worldIn.setBlockState(pos, ModBlocks.playerDetectorActivated.getDefaultState(), 3);
//
//        }
//        else
//        {
//            worldIn.setBlockState(pos, ModBlocks.playerDetector.getDefaultState(), 3);
//            worldIn.setBlockState(pos, ModBlocks.playerDetector.getDefaultState(), 3);
//        }
//
//
//        if (tileentity != null)
//        {
//            tileentity.validate();
//            worldIn.setTileEntity(pos, tileentity);
//        }
//    }
//
//
//    @Override
//    public TileEntity createNewTileEntity(World world, int metadata) {
//        return new TileEntityPlayerDetector();
//    }
//
//    @Override
//    public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
//        return true;
//    }
//
//    @Override
//    public boolean canProvidePower(IBlockState state) {
//        return true;
//    }
//
//    @Override
//    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
//        return true;
//    }
//
//    @Override
//    public boolean isSideSolid(IBlockState base_state, IBlockAccess world, BlockPos pos, EnumFacing side) {
//        return true;
//    }
//
//    @Override
//    public boolean hasTileEntity() {
//        return true;
//    }
//
//    @Override
//    public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
//        TileEntity te = blockAccess.getTileEntity(pos);
//        TileEntityPlayerDetector detector = (te != null && te instanceof TileEntityPlayerDetector) ? (TileEntityPlayerDetector) te : null;
//        if (detector != null)
//            return detector.activated ? 15 : 0;
//        else
//            return 0;
//    }
//
//    @Override
//    public int getStrongPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
//        TileEntity te = blockAccess.getTileEntity(pos);
//        TileEntityPlayerDetector detector = (te != null && te instanceof TileEntityPlayerDetector) ? (TileEntityPlayerDetector) te : null;
//        if (detector != null)
//            return detector.activated ? 15 : 0;
//        else
//            return 0;
//    }
//
//    @Override
//    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
//        if (!world.isRemote) {
//            TileEntityPlayerDetector te = (TileEntityPlayerDetector) world.getTileEntity(pos);
//            //check if sneaking and if using empty hand and if block has camo then remove camo
//            if (player.isSneaking() && player.getActiveItemStack() == null) {
//                if (te.getCamouflage() != null) {
//                    ItemStack camoItemStack = te.getCamouflage();
//                    te.setCamouflage(null);
//                    world.playSound(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, SoundEvents.UI_BUTTON_CLICK, SoundCategory.BLOCKS, 0.3F, .1f, false);
//                    EntityItem itemEntity = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), camoItemStack);
//                    world.spawnEntityInWorld(itemEntity);
//                }
//            } else {
//                //check if player has item in hand that is a BLOCK and then set camo
//                ItemStack playerItem = player.getActiveItemStack();
//                if (playerItem != null && te.getCamouflage() == null) {
//                    if (playerItem.getItem() instanceof ItemBlock) {
//                        ItemStack camoStack = playerItem.splitStack(1);
//                        te.setCamouflage(camoStack);
//                        world.playSound(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, SoundEvents.UI_BUTTON_CLICK, SoundCategory.BLOCKS, 0.3F, .1f, false);
//                    }
//                }
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public void breakBlock(World world, BlockPos pos, IBlockState state) {
//        super.breakBlock(world, pos, state);
//        world.notifyBlockOfStateChange(pos, world.getBlockState(pos).getBlock());
//    }
//}
