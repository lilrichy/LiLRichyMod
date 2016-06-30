package lilrichy.lilrichymod.blocks.advancedPlayerDetector;


import lilrichy.lilrichymod.reference.Reference;
import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Names;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 ** Created by Rich on 11/23/2015.
**/

public class BlockAdvancedDetector extends BlockContainer {
/* IIcon sideOff;
    IIcon sideOn;
    IIcon topBottom;*/


    public BlockAdvancedDetector(Material material) {
        super(material);
        //Todo this.setStepSound(soundTypeMetal);
        this.setUnlocalizedName(Names.Blocks.ADVANCED_DETECTOR);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(5f);
        this.setResistance(0.5f);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }



 /*@Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        sideOff = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "detector/advancedDetectorOFF");
        sideOn = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "detector/advancedDetectorON");
        topBottom = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "detector/advancedDetectorTopBottom");
    }


public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
        TileEntityAdvancedDetector te = (TileEntityAdvancedDetector) world.getTileEntity(x, y, z);
        ItemStack stack = te.getCamouflage(0);
        if (stack != null && stack.getItem() instanceof ItemBlock) {
            Block block = ((ItemBlock) stack.getItem()).field_150939_a;
            return block.getIcon(side, stack.getItemDamage());
        } else {
            IIcon side_icon;
            TileEntity tile = world.getTileEntity(x, y, z);
            if (tile instanceof TileEntityAdvancedDetector && ((TileEntityAdvancedDetector) tile).activated)
                side_icon = sideOn;
            else
                side_icon = sideOff;

            if (side == 0)
                return topBottom;
            else if (side == 1)
                return topBottom;
            else
                return side_icon;
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 0)
            return topBottom;
        else if (side == 1)
            return topBottom;
        else
            return sideOn;
    }
*/

//ToDo
@Override
public TileEntity createNewTileEntity(World worldIn, int meta) {
    return null;
}
/*
    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityAdvancedDetector();
    }

   */
/* @Override
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side) {
        return true;
    }
*//*

    @Override
    public boolean canProvidePower() {
        return true;
    }
*/

   /* @Override
    public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, int p_149747_5_) {
        return true;
    }

    @Override
    public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
        return true;
    }

    @Override
    public boolean hasTileEntity(int meta) {
        return true;
    }

    public int isProvidingWeakPower(IBlockAccess world, int x, int y, int z, int p_149709_5_) {
        TileEntity te = world.getTileEntity(pos);
        TileEntityAdvancedDetector detector = (te != null && te instanceof TileEntityAdvancedDetector) ? (TileEntityAdvancedDetector) te : null;
        if (detector != null)
            return detector.activated ? 15 : 0;
        else
            return 0;
    }

    @Override
    public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int meta) {
        TileEntity te = world.getTileEntity(x, y, z);
        TileEntityAdvancedDetector detector = (te != null && te instanceof TileEntityAdvancedDetector) ? (TileEntityAdvancedDetector) te : null;
        if (detector != null)
            return detector.activated ? 15 : 0;
        else
            return 0;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            player.openGui(lilrichymod.instance, GuiHandler.GuiIDs.ADVANCED_DETECTOR.ordinal(), world, x, y, z);
        }
        return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
        super.breakBlock(world, x, y, z, block, meta);
        world.notifyBlocksOfNeighborChange(x - 1, y, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x + 1, y, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y - 1, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y + 1, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y, z - 1, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y, z + 1, world.getBlock(x, y, z));
    }*/
}
