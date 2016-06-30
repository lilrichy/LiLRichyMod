package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.item.Item;

/**
 * Created by richa on 6/29/2016.
 */
public class ItemConcreteMix extends Item {

    public ItemConcreteMix() {
        setUnlocalizedName(Reference.ModItems.CONCRETE_MIX.getUnlocalizedName());
        setRegistryName(Reference.ModItems.CONCRETE_MIX.getRegistryName());
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }
}
