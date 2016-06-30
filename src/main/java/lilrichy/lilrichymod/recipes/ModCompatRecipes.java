package lilrichy.lilrichymod.recipes;


import lilrichy.lilrichymod.handler.ConfigurationHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by LiLRichy on 1/25/2016.
 */
public class ModCompatRecipes {

    public static void thermalExpansionRecipesInit() {
        if (Loader.isModLoaded("ThermalExpansion")) {
            //Thermal Expansion Pulverizer recipe for Crushed Concrete
          //Todo  ThermalExpansionHelper.addPulverizerRecipe(2400, new ItemStack(ModBlocks.concrete), new ItemStack(ModItems.crushedConcrete, 4));

            //Recipe to make coal and charcoal dust into black dye
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

    public static void enderIORecipesInit() {
        if (Loader.isModLoaded("EnderIO")) {
            //Ender IO Sag Mill Recipie
            String recipe =
                    "<recipeGroup name=\"LiLRichyMod\" >" +
                            "<recipe name=\"Crushed Concrete\" energyCost=\"2400\" >" +
                            "<input>" +
                            "<itemStack modID=\"lilrichymod\" itemName=\"concrete\" />" +
                            "</input>" +
                            "<output>" +
                            "<itemStack modID=\"lilrichymod\" itemName=\"crushedConcrete\" number=\"4\" />" +
                            "<itemStack modID=\"lilrichymod\" itemName=\"concreteMix\" chance=\"0.015\" />" +
                            "</output>" +
                            "</recipe>" +
                            "</recipeGroup>";
            FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
        }
    }
}
