package lilrichy.lilrichymod.recipes;


import lilrichy.lilrichymod.handler.ConfigurationHandler;
import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.init.ModItems;
import lilrichy.lilrichymod.reference.Names;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Rich on 11/20/2015.
 */
public class Recipes {
    public static void init() {

        blockRecipes();
        tileEntityRecipes();
        //StairsRecipes.init();
        //PanesRecipes.init();

        if (ConfigurationHandler.smeltingRecipes) smeltingRecipes();
        if (ConfigurationHandler.itemRecipes) ItemRecipes.init();
        // if (ConfigurationHandler.panelRecipes) PanelsRecipes.init();
        if (ConfigurationHandler.thermalExpansionRecipes) ModCompatRecipes.thermalExpansionRecipesInit();
        if (ConfigurationHandler.enderIORecipies) ModCompatRecipes.enderIORecipesInit();

        // Adds recipe for leaver from stone and stick.
        if (ConfigurationHandler.leaverRecipe) {
            for (ItemStack stack : OreDictionary.getOres("stone")) {
                GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneLever), "s", "b",
                        'b', new ItemStack(stack.getItem(), 1, stack.getItem().getDamage(stack)), 's', new ItemStack(Items.STICK));
            }
        }

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

    public static void blockRecipes() {
        //Concrete
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete));

        //Clear Glass
        for (ItemStack aList : OreDictionary.getOres("blockGlass")) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.clearGlass, 8), "ggg", "geg", "ggg",
                    'g', new ItemStack(aList.getItem()), 'e', new ItemStack(ModItems.essenceOfBeard));
        }

        //Charcoal Block
        if (ConfigurationHandler.charcoalBlockRecipe) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.charcoalBlock),
                    new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1),
                    new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1),
                    new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1));

            GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1),
                    new ItemStack(ModBlocks.charcoalBlock));
        }
    }

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

    public static void tileEntityRecipes() {

        //Wards
        GameRegistry.addRecipe(new ItemStack(ModBlocks.animalWard, 1), "cwb", "wew", "mwp",
                'c', new ItemStack(Items.CHICKEN), 'w', new ItemStack(Blocks.WOOL), 'b', new ItemStack(Items.BEEF),
                'e', new ItemStack(ModItems.essenceOfBeard), 'm', new ItemStack(Items.MUTTON), 'p', new ItemStack(Items.PORKCHOP));

        GameRegistry.addRecipe(new ItemStack(ModBlocks.mobWard, 1), "pmg", "ded", "sfb",
                'p', new ItemStack(Items.ENDER_PEARL), 'm', new ItemStack(Items.EMERALD),
                'd', new ItemStack(Blocks.DIAMOND_BLOCK), 'g', new ItemStack(Items.GUNPOWDER),
                'e', new ItemStack(ModItems.essenceOfBeard), 's', new ItemStack(Items.SPIDER_EYE),
                'f', new ItemStack(Items.ROTTEN_FLESH), 'b', new ItemStack(Items.BONE));

        //Block Table
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTable, 1), " c ", "iei", "ppp",
                'p', new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE), 'c', new ItemStack(ModBlocks.concrete),
                'e', new ItemStack(ModItems.essenceOfBeard), 'i', new ItemStack(Items.IRON_INGOT));


        //// TODO: 6/29/2016
     /*   //Player Detector
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.playerDetector, 1), "ici", "ctc", "ici",
                'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Items.comparator), 't', new ItemStack(Blocks.redstone_torch));

        //Advanced Detector
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.advancedDetector, 1), "idi", "dtd", "idi",
                'i', new ItemStack(Items.gold_ingot), 'd', new ItemStack(Items.diamond), 't', new ItemStack(ModTileEntity.playerDetector));


        //Lectern
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.lectern, 1), "sss", " p ", " s ",
                's', new ItemStack(Blocks.wooden_slab), 'p', new ItemStack(Blocks.planks));*/
    }
}
