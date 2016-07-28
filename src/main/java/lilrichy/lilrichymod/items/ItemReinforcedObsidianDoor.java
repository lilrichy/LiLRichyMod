package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by LiLRichy on 7/28/2016.
 */
public class ItemReinforcedObsidianDoor extends ItemDoor {
    public ItemReinforcedObsidianDoor() {
        super(ModBlocks.reinforcedObsidianDoor);
        this.setUnlocalizedName(Reference.ModItems.REINFORCED_OBSIDIAN_DOOR.getUnlocalizedName());
        this.setRegistryName(Reference.ModItems.REINFORCED_OBSIDIAN_DOOR.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        tooltip.add("This block is explosion resistant and can not be destroyed by the Wither Boss");
    }
}
