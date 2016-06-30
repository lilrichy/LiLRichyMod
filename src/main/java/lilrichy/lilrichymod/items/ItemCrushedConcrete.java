package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.item.Item;

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
}
