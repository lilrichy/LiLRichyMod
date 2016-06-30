package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.item.Item;

/**
 * Created by richa on 6/29/2016.
 */
public class ItemEssenceOfBeard extends Item {

    public ItemEssenceOfBeard() {
        setUnlocalizedName(Reference.ModItems.ESSENCE_OF_BEARD.getUnlocalizedName());
        setRegistryName(Reference.ModItems.ESSENCE_OF_BEARD.getRegistryName());
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }
}
