package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.item.Item;

/**
 * Created by richa on 6/29/2016.
 */
public class ItemTape extends Item {

    public ItemTape() {
        setUnlocalizedName(Reference.ModItems.TAPE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TAPE.getRegistryName());
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }
}
