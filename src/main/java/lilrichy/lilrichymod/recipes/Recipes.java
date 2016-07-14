package lilrichy.lilrichymod.recipes;


import lilrichy.lilrichymod.handler.ConfigurationHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static lilrichy.lilrichymod.recipes.BlockRecipes.blockRecipes;
import static lilrichy.lilrichymod.recipes.Smelting.smeltingRecipes;
import static lilrichy.lilrichymod.recipes.TileEntityRecipes.tileEntityRecipes;

/**
 * Created by Rich on 11/20/2015.
 */
public class Recipes {
    public static void init() {

        //Load Recipes
        blockRecipes();
        tileEntityRecipes();
        //StairsRecipes.init();
        //PanesRecipes.init();

        if (ConfigurationHandler.smeltingRecipes) smeltingRecipes();
        if (ConfigurationHandler.itemRecipes) ItemRecipes.init();
        // if (ConfigurationHandler.panelRecipes) PanelsRecipes.init();
        if (ConfigurationHandler.thermalExpansionRecipes) ModCompatRecipes.thermalExpansionRecipesInit();
        if (ConfigurationHandler.enderIORecipies) ModCompatRecipes.enderIORecipesInit();



        //Make coal and charcoal dust into black dye
        if (ConfigurationHandler.coalDustRecipe) {
            if (OreDictionary.doesOreNameExist("dustCoal"))
                for (ItemStack aList : OreDictionary.getOres("dustCoal"))
                    OreDictionary.registerOre("dyeBlack", aList);
            if (OreDictionary.doesOreNameExist("dustCharcoal"))
                for (ItemStack bList : OreDictionary.getOres("dustCharcoal"))
                    OreDictionary.registerOre("dyeBlack", bList);
        }
    }




}