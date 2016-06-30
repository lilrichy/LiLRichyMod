//package lilrichy.lilrichymod.blocks.playerDetector;
//
//import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
//import com.blogspot.richardreigens.lilrichymod.reference.Names;
//import com.blogspot.richardreigens.lilrichymod.reference.Reference;
//import net.minecraft.block.BlockContainer;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.entity.item.EntityItem;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemBlock;
//import net.minecraft.item.ItemStack;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.BlockPos;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.world.IBlockAccess;
//import net.minecraft.world.World;
//
///**
// * Created by Rich on 11/23/2015.
// */
//public class BlockPlayerDetector extends BlockContainer {
// /*   IIcon sideOff;
//    IIcon sideOn;
//    IIcon topBottom;*/
//
//    public BlockPlayerDetector(Material material) {
//        super(material);
//        this.setStepSound(soundTypeMetal);
//        this.setUnlocalizedName(Names.Blocks.PLAYER_DETECTOR);
//        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
//        this.setHardness(5f);
//        this.setResistance(0.5f);
//    }
//
//    @Override
//    public String getUnlocalizedName() {
//        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
//    }
//
//    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
//        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
//    }
//
//   /* @Override
//    public void registerBlockIcons(IIconRegister iconRegister) {
//        sideOff = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "detector/playerDetectorOFF");
//        sideOn = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "detector/playerDetectorON");
//        topBottom = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "detector/playerDetectorTopBottom");
//    }
//
//    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
//        TEPlayerDetector te = (TEPlayerDetector) world.getTileEntity(x, y, z);
//        ItemStack stack = te.getCamouflage();
//        if (stack != null && stack.getItem() instanceof ItemBlock) {
//            Block block = ((ItemBlock) stack.getItem()).field_150939_a;
//            return block.getIcon(side, stack.getItemDamage());
//        } else {
//            IIcon side_icon;
//            TileEntity tile = world.getTileEntity(x, y, z);
//            if (tile instanceof TEPlayerDetector && ((TEPlayerDetector) tile).activated)
//                side_icon = sideOn;
//            else
//                side_icon = sideOff;
//
//            if (side == 0)
//                return topBottom;
//            else if (side == 1)
//                return topBottom;
//            else
//                return side_icon;
//        }
//    }
//
//    @Override
//    public IIcon getIcon(int side, int meta) {
//        if (side == 0)
//            return topBottom;
//        else if (side == 1)
//            return topBottom;
//        else
//            return sideOn;
//    }
//*/
//    @Override
//    public TileEntity createNewTileEntity(World world, int metadata) {
//        return new TEPlayerDetector();
//    }
//
//    @Override
//    public boolean canConnectRedstone(IBlockAccess world, BlockPos pos, EnumFacing side) {
//        return true;
//    }
//
//    @Override
//    public boolean canProvidePower() {
//        return true;
//    }
//
//    @Override
//    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
//        return true;
//    }
//
//    @Override
//    public boolean isSideSolid(IBlockAccess world, BlockPos pos, EnumFacing side) {
//        return true;
//    }
//
//    @Override
//    public boolean hasTileEntity() {
//        return true;
//    }
//
//    @Override
//    public int getWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side) {
//        TileEntity te = worldIn.getTileEntity(pos);
//        TEPlayerDetector detector = (te != null && te instanceof TEPlayerDetector) ? (TEPlayerDetector) te : null;
//        if (detector != null)
//            return detector.activated ? 15 : 0;
//        else
//            return 0;
//    }
//
//    @Override
//    public int getStrongPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side) {
//        TileEntity te = worldIn.getTileEntity(pos);
//        TEPlayerDetector detector = (te != null && te instanceof TEPlayerDetector) ? (TEPlayerDetector) te : null;
//        if (detector != null)
//            return detector.activated ? 15 : 0;
//        else
//            return 0;
//    }
//
//    @Override
//    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
//        if (!world.isRemote) {
//            TEPlayerDetector te = (TEPlayerDetector) world.getTileEntity(pos);
//            //check if sneaking and if using empty hand and if block has camo then remove camo
//            if (player.isSneaking() && player.getCurrentEquippedItem() == null) {
//                if (te.getCamouflage() != null) {
//                    ItemStack camoItemStack = te.getCamouflage();
//                    te.setCamouflage(null);
//                    world.playSoundEffect((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, "random.click", 0.3F, .1f);
//                    EntityItem itemEntity = new EntityItem(world,pos.getX(),pos.getY(),pos.getZ(), camoItemStack);
//                    world.spawnEntityInWorld(itemEntity);
//                }
//            } else {
//                //check if player has item in hand that is a BLOCK and then set camo
//                ItemStack playerItem = player.getCurrentEquippedItem();
//                if (playerItem != null && te.getCamouflage() == null) {
//                    if (playerItem.getItem() instanceof ItemBlock) {
//                        ItemStack camoStack = playerItem.splitStack(1);
//                        te.setCamouflage(camoStack);
//                        world.playSoundEffect((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, "random.click", 0.3F, 1f);
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
//      /*  world.notifyBlocksOfNeighborChange(x + 1, y, z, world.getBlock(x, y, z));
//        world.notifyBlocksOfNeighborChange(x, y - 1, z, world.getBlock(x, y, z));
//        world.notifyBlocksOfNeighborChange(x, y + 1, z, world.getBlock(x, y, z));
//        world.notifyBlocksOfNeighborChange(x, y, z - 1, world.getBlock(x, y, z));
//        world.notifyBlocksOfNeighborChange(x, y, z + 1, world.getBlock(x, y, z));*/
//    }
//}
