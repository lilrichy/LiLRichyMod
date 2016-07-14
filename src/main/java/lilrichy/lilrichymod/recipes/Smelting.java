package lilrichy.lilrichymod.recipes;

import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.init.ModItems;
import lilrichy.lilrichymod.reference.Names;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class Smelting {
    public static void smeltingRecipes() {
        //Concrete
        GameRegistry.addSmelting(new ItemStack(ModItems.concreteMix), new ItemStack(ModBlocks.concrete), 0.1f);

        //Smelt Blocks back to Concrete
        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.CONCRETE)) {
            GameRegistry.addSmelting(new ItemStack(aList.getItem(), 1, aList.getItem().getDamage(aList)), new ItemStack(ModBlocks.concrete), 0.1f);
        }
        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.COTTAGE)) {
            GameRegistry.addSmelting(new ItemStack(aList.getItem(), 1, aList.getItem().getDamage(aList)), new ItemStack(ModBlocks.concrete), 0.1f);
        }
        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.LAVA)) {
            GameRegistry.addSmelting(new ItemStack(aList.getItem(), 1, aList.getItem().getDamage(aList)), new ItemStack(ModBlocks.concrete), 0.1f);
        }
        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.MARBLE)) {
            GameRegistry.addSmelting(new ItemStack(aList.getItem(), 1, aList.getItem().getDamage(aList)), new ItemStack(ModBlocks.concrete), 0.1f);
        }
        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.METAL)) {
            GameRegistry.addSmelting(new ItemStack(aList.getItem(), 1, aList.getItem().getDamage(aList)), new ItemStack(ModBlocks.concrete), 0.1f);
        }
        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.STONE)) {
            GameRegistry.addSmelting(new ItemStack(aList.getItem(), 1, aList.getItem().getDamage(aList)), new ItemStack(ModBlocks.concrete), 0.1f);
        }
    }
}
