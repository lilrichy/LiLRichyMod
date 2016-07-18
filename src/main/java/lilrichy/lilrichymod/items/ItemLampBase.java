package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.item.Item;

/**
 * Created by richa on 6/29/2016.
 */
public class ItemLampBase extends Item {

    public ItemLampBase() {
        setUnlocalizedName(Reference.ModItems.LAMP_BASE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.LAMP_BASE.getRegistryName());
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }
}
