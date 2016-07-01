package lilrichy.lilrichymod.creativeTab;



import lilrichy.lilrichymod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static lilrichy.lilrichymod.reference.Reference.MOD_ID;

/**
 * Created by Rich on 11/20/2015.
 */
public class CreativeTabLiLRichyMod {
    public static final CreativeTabs LR_Tab = new CreativeTabs(MOD_ID.toLowerCase()) {
        @SideOnly(Side.CLIENT)
        @Override
      //todo
         public Item getTabIconItem() {
            return ModItems.essenceOfBeard;
                    //ModBlocks.concrete_block);
        }
    };
    //Todo Item not rendered in creative tab
}