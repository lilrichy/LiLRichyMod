package lilrichy.lilrichymod.items;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

/**
 * Created by LiLRichy on 6/29/2016.
 */
public class ItemBeardedAzaleaSeed extends ItemSeeds {

    public ItemBeardedAzaleaSeed() {
        super(Blocks.WHEAT, Blocks.FARMLAND);
        setUnlocalizedName(Reference.ModItems.BEARDED_AZALEA_SEED.getUnlocalizedName());
        setRegistryName(Reference.ModItems.BEARDED_AZALEA_SEED.getRegistryName());
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setNoRepair();
    }
}
