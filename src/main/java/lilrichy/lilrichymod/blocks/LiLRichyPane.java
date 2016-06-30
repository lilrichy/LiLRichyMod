package lilrichy.lilrichymod.blocks;


import lilrichy.lilrichymod.reference.Reference;
import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by LiLRichy on 1/28/2016.
 */
public class LiLRichyPane extends BlockPane {
    private String sideIcon;
    private String topIcon;

    @SideOnly(Side.CLIENT)
   // private IIcon blockIconTop;
//ToDo Rendering of blocks, item, block states, and models
    public LiLRichyPane(String Name, String sideBlockName, String topName, Material material, boolean canDrop) {
        super(/*sideBlockName, topName,*/ material, canDrop);
        this.sideIcon = sideBlockName;
        this.topIcon = topName;
        this.setUnlocalizedName(Name);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(.2f);
    }

    public int getRenderType() {
        return this.blockMaterial == Material.GLASS ? 41 : 18;
    }
/*
    @Override
    public int getRenderBlockPass() {
        return 1;
    }*/
/*
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean shouldSideBeRendered1(IBlockAccess blockAccess, int x, int y, int z, int side) {

        BlockPos pos = new BlockPos(x,y,z);
        Block block = blockAccess.getBlockState(pos).getBlock();

        return block == this ? false : super.shouldSideBeRendered(blockAccess, x, y, z, side);
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
        return shouldSideBeRendered1(blockAccess, x, y, z, 1 - side);
    }

    @SideOnly(Side.CLIENT)
    public IIcon func_150097_e() {
        return this.blockIconTop;
    }
*/
    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", "glass/" + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

   /* @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":glass/" + this.sideIcon);
        this.blockIconTop = iconRegister.registerIcon(Reference.MOD_ID + ":glass/" + this.topIcon);
    }*/
}
