package lilrichy.lilrichymod.blocks.decorativeBlocks.concrete;

import com.mojang.realmsclient.gui.ChatFormatting;
import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Names;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockConcreteFancyBlocks extends Block {
    public BlockConcreteFancyBlocks() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.CONCRETE_FANCY_BLOCKS.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CONCRETE_FANCY_BLOCKS.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        if (!GuiScreen.isShiftKeyDown()) {
            tooltip.add("Hold " + ChatFormatting.YELLOW + "Shift" + ChatFormatting.GRAY + " for Crafting.");
        } else {
            tooltip.add(Names.CraftingToolTips.CRAFT_WITH);
            tooltip.add(Names.CraftingToolTips.CONCRETE_BLOCKS);
        }
    }
}
