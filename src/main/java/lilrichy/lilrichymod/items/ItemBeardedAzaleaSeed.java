package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.item.Item;

/**
 * Created by richa on 6/29/2016.
 */
public class ItemBeardedAzaleaSeed extends Item {

    public ItemBeardedAzaleaSeed() {
        setUnlocalizedName(Reference.ModItems.BEARDED_AZALEA_SEED.getUnlocalizedName());
        setRegistryName(Reference.ModItems.BEARDED_AZALEA_SEED.getRegistryName());
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }
}
