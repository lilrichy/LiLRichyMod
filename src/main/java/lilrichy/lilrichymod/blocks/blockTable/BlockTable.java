//package lilrichy.lilrichymod.blocks.blockTable;
//
//
//import lilrichy.lilrichymod.LiLRichyMod;
//import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
//
//import lilrichy.lilrichymod.reference.Names;
//import net.minecraft.block.BlockContainer;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.entity.item.EntityItem;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.inventory.IInventory;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//
///**
// * Created by Rich on 12/8/2015.
// */
//
//public class BlockTable extends BlockContainer {
//    public BlockTable(Material material) {
//        super(material);
//        this.setUnlocalizedName(Names.Models.BLOCK_TABLE);
//        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
//        this.setHardness(5f);
//        this.setResistance(0.5f);
//    }
//
//
//    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
//        if (!worldIn.isRemote) {
//            playerIn.openGui(LiLRichyMod.instance, GuiHandler.GuiIDs.BLOCK_TABLE.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
//        }
//        return true;
//    }
//
//    @Override
//    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
//        TileEntity tileEntityBlockTable = worldIn.getTileEntity(pos);
//        if (tileEntityBlockTable instanceof IInventory) {
//
//            // For each slot in the inventory
//            for (int i = TileEntityBlockTable.FIRST_INPUT_SLOT; i < TileEntityBlockTable.FIRST_INPUT_SLOT + 2; i++) {
//                // If the slot is not empty
//                if (((IInventory) tileEntityBlockTable).getStackInSlot(i) != null) {
//                    // Create a new entity item with the item stack in the slot
//                    EntityItem item = new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
//                            ((IInventory) tileEntityBlockTable).getStackInSlot(i));
//
//                    // Apply some random motion to the item
//                    float multiplier = 0.1f;
//                    float motionX = worldIn.rand.nextFloat() - 0.5f;
//                    float motionY = worldIn.rand.nextFloat() - 0.5f;
//                    float motionZ = worldIn.rand.nextFloat() - 0.5f;
//
//                    item.motionX = motionX * multiplier;
//                    item.motionY = motionY * multiplier;
//                    item.motionZ = motionZ * multiplier;
//
//                    // Spawn the item in the world
//                    worldIn.spawnEntityInWorld(item);
//                }
//            }
//        }
//        super.breakBlock(worldIn, pos, state);
//    }
//
//    //Todo
//
//    @Override
//    public TileEntity createNewTileEntity(World worldIn, int meta) {
//        return null;
//    }
//
//   /* @Override
//    public int getRenderType() {
//        return 3;
//    }
//
//    @Override
//    public boolean isOpaqueCube() {
//        return false;
//    }
//
//    @Override
//    public TileEntity createNewTileEntity(World world, int p_149915_2_) {
//        return new TileEntityBlockTable();
//    }*/
//}
