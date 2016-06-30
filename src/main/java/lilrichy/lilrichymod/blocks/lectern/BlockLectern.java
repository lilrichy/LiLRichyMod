//package lilrichy.lilrichymod.blocks.lectern;
//
//import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
//import com.blogspot.richardreigens.lilrichymod.reference.Names;
//import net.minecraft.block.BlockContainer;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.properties.IProperty;
//import net.minecraft.block.properties.PropertyDirection;
//import net.minecraft.block.state.BlockState;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.entity.item.EntityItem;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemStack;
//import net.minecraft.nbt.NBTTagCompound;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.BlockPos;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.world.World;
//
///**
// * Created by LiLRichy on 1/26/2016.
// */
//public class BlockLectern extends BlockContainer {
////Todo Item Model, Book Renderer, On right click not working rotation not working also
//
//    public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
//
//    public BlockLectern() {
//        super(Material.wood);
//        setHardness(2.0f);
//        setResistance(2.0f);
//        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
//        this.setUnlocalizedName(Names.Models.LECTERN);
//    }
//
//    @Override
//    public TileEntity createNewTileEntity(World world, int i) {
//        return new TileEntityLectern();
//    }
//
//    @Override
//    public int getRenderType() {
//        return 2;
//    }
//
//    @Override
//    public boolean isOpaqueCube() {
//        return false;
//    }
//
//    @Override
//    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
//        super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
//
//        TileEntityLectern te = getTileEntity(worldIn, pos);
//        if (te == null) {
//            return true;
//        }
//
//        if (te.hasStack()) {
//            if (playerIn.isSneaking()) {
//                if (!worldIn.isRemote) {
//                    float f = worldIn.rand.nextFloat() * 0.8F + 0.1F;
//                    float f1 = worldIn.rand.nextFloat() * 0.8F + 0.1F;
//                    float f2 = worldIn.rand.nextFloat() * 0.8F + 0.1F;
//                    ItemStack newItem = new ItemStack(te.getStack().getItem(), 1, te.getStack().getItemDamage());
//                    if (te.getStack().getTagCompound() != null)
//                        newItem.setTagCompound((NBTTagCompound) te.getStack().getTagCompound().copy());
//                    EntityItem entityitem = new EntityItem(worldIn, pos.getX() + f, pos.getY() + f1, pos.getZ() + f2, newItem);
//                    float f3 = 0.05F;
//                    entityitem.motionX = (float) worldIn.rand.nextGaussian() * f3;
//                    entityitem.motionY = (float) worldIn.rand.nextGaussian() * f3 + 0.2F;
//                    entityitem.motionZ = (float) worldIn.rand.nextGaussian() * f3;
//                    worldIn.spawnEntityInWorld(entityitem);
//                }
//                te.setStack(null);
//            } else {
//                //Open Book
//
//                //ToDo This was not working in testing with wrtitten books, need to test Thaumcraft/botania books
//                te.getStack().getItem().onItemRightClick(getTileEntity(worldIn,pos).getStack(), worldIn, playerIn);
//
//            }
//        } else {
//            if (playerIn.getCurrentEquippedItem() != null) {
//                if (te.setStack(playerIn.getCurrentEquippedItem())) {
//                    playerIn.getCurrentEquippedItem().stackSize--;
//                    if (playerIn.getCurrentEquippedItem().stackSize <= 0) {
//                        playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, null);
//                    }
//                }
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
//
//        TileEntityLectern te = getTileEntity(worldIn, pos);
//        if (te == null) return;
//
//        if (!worldIn.isRemote) {
//            if (te.hasStack()) {
//                float f = worldIn.rand.nextFloat() * 0.8F + 0.1F;
//                float f1 = worldIn.rand.nextFloat() * 0.8F + 0.1F;
//                float f2 = worldIn.rand.nextFloat() * 0.8F + 0.1F;
//                ItemStack newItem = new ItemStack(te.getStack().getItem(), 1, te.getStack().getItemDamage());
//                if (te.getStack().getTagCompound() != null)
//                    newItem.setTagCompound((NBTTagCompound) te.getStack().getTagCompound().copy());
//                EntityItem entityitem = new EntityItem(worldIn, pos.getX() + f, pos.getY() + f1, pos.getZ() + f2, newItem);
//                float f3 = 0.05F;
//                entityitem.motionX = (float) worldIn.rand.nextGaussian() * f3;
//                entityitem.motionY = (float) worldIn.rand.nextGaussian() * f3 + 0.2F;
//                entityitem.motionZ = (float) worldIn.rand.nextGaussian() * f3;
//                worldIn.spawnEntityInWorld(entityitem);
//            }
//        }
//        super.breakBlock(worldIn, pos, state);
//    }
//
//    public TileEntityLectern getTileEntity(World world, BlockPos pos) {
//        TileEntity te = world.getTileEntity(pos);
//        if (te != null && te instanceof TileEntityLectern) {
//            return (TileEntityLectern) te;
//        }
//        return null;
//    }
//
//    @Override
//    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
//        EnumFacing enumfacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);
//
//        return this.getDefaultState().withProperty(PROPERTYFACING, enumfacing);
//    }
//
//    @Override
//    public IBlockState getStateFromMeta(int meta) {
//        EnumFacing facing = EnumFacing.getHorizontal(meta);
//        return this.getDefaultState().withProperty(PROPERTYFACING, facing);
//    }
//
//    @Override
//    public int getMetaFromState(IBlockState state) {
//        EnumFacing facing = (EnumFacing) state.getValue(PROPERTYFACING);
//        int facingbits = facing.getHorizontalIndex();
//
//        return facingbits;
//    }
//
//    @Override
//    protected BlockState createBlockState() {
//        return new BlockState(this, new IProperty[]{PROPERTYFACING});
//    }
//
//    @Override
//    public boolean isFullBlock() {
//        return false;
//    }
//}
