package lilrichy.lilrichymod.blocks.decorativeBlocks;


import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by LiLRichy on 2/15/2016.
 */
public class DecoSubBlocks extends DecorativeBlocks implements IMetaBlockName {
    public String[] types;
    public int MAX_TYPES;

    public final static PropertyInteger TYPE = PropertyInteger.create("type", 0, 15);

    public DecoSubBlocks(String name, Material material, String toolTip, String[] types, int typesLength) {
        super(name, material, toolTip);
        this.setHardness(2f);
//todo        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setUnlocalizedName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, Integer.valueOf(0)));
        this.types = types;
        this.MAX_TYPES = typesLength;
    }

    public DecoSubBlocks(String name, Material material, String toolTip, String toolTip2, String[] types, int typesLength) {
        super(name, material, toolTip, toolTip2);
        this.setHardness(2f);
 //todo        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setUnlocalizedName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, Integer.valueOf(0)));
        this.types = types;
        this.MAX_TYPES = typesLength;
    }

    /**
     * Returns the Blockstate based on the Meta Data
     * Must be Accurate with getMetaFromState
     *
     * @param meta int to get the blockstate from.
     * @return This should be a if/switch with the Enum type.
     */
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, Integer.valueOf(meta));
    }

    /**
     * Used to get the meta data from a block this must be
     * accurate with getStateFromMeta
     *
     * @param state the block state to get the meta value from
     * @return the Meta value based on the current state.
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(TYPE);
    }

    /**
     * Creates the block states / sub blocks.
     *
     * @return
     */
   //todo
    /*@Override
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[]{TYPE});
    }*/

    /**
     * Override to make sure the block drops the correct meta block
     *
     * @param state the state the block is in
     * @return the meta data of the block state.
     */
    @Override
    public int damageDropped(IBlockState state) {

        int type = state.getValue(TYPE);

        if (type != 0 && type < types.length)
            return type;
        else
            return 0;
    }

    /**
     * Returns the types of blocks in a string should use types[] from variables in this class
     *
     * @param stack The stack to compare the meta from the types[]
     * @return
     */
    @Override
    public String getSpecialName(ItemStack stack) {
        return types[stack.getItemDamage()];
    }

    /**
     * Used to get the subBlocks of the main block
     * For loop of the types returning a itemstack with meta from the int of the loop.
     *
     * @param itemIn The Item to get the sub blocks from - I think this should be a block or an item but that;s just me.
     * @param tab    Can be null.
     * @param list   is a Itemstack list with the sub blocks
     */
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i < types.length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    /**
     * Used to pick the items when in creative mode.
     * Override this to make The block pick the correct block based on meta data.
     */
   //// TODO: 6/29/2016
    /* @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }*/
}