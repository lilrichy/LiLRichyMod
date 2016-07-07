package lilrichy.lilrichymod.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Names;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by richa on 6/29/2016.
 */
public class ItemCrushedConcrete extends Item {

    public ItemCrushedConcrete() {
        setUnlocalizedName(Reference.ModItems.CRUSHED_CONCRETE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.CRUSHED_CONCRETE.getRegistryName());
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        if (!GuiScreen.isShiftKeyDown()) {
            tooltip.add("Hold " + ChatFormatting.YELLOW + "Shift" + ChatFormatting.GRAY + " for Crafting.");
        } else {
            tooltip.add(Names.CraftingToolTips.CRUSHED_CONCRETE_TOOLTIP);
        }
    }
}
