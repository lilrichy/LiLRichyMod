package lilrichy.lilrichymod.blocks.decorativeBlocks.clearGlass;

import com.mojang.realmsclient.gui.ChatFormatting;
import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Names;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Created by richa on 6/30/2016.
 */
public class BlockClearGlassBlack extends Block {
    public BlockClearGlassBlack() {
        super(Material.GLASS);
        setUnlocalizedName(Reference.ModBlocks.CLEAR_GLASS_BLACK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CLEAR_GLASS_BLACK.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(0.3F);
        this.setSoundType(SoundType.GLASS);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, EnumFacing side) {
        Block block = world.getBlockState(pos.offset(side)).getBlock();
        return block != this && super.shouldSideBeRendered(state, world, pos, side);
    }

    @Nonnull
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        if (!GuiScreen.isShiftKeyDown()) {
            tooltip.add("Hold " + ChatFormatting.YELLOW + "Shift" + ChatFormatting.GRAY + " for Crafting.");
        } else {
            tooltip.add(Names.CraftingToolTips.CRAFT_WITH);
            tooltip.add(Names.CraftingToolTips.GLASS_CLEAR);
        }
    }
}
