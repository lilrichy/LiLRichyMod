//package lilrichy.lilrichymod.recipes;
//
//
//import lilrichy.lilrichymod.handler.ConfigurationHandler;
//import lilrichy.lilrichymod.init.ModBlocks;
//import lilrichy.lilrichymod.init.ModItems;
//import lilrichy.lilrichymod.reference.Names;
//import net.minecraft.init.Blocks;
//import net.minecraft.init.Items;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//import net.minecraftforge.oredict.OreDictionary;
//
///**
// * Created by Rich on 11/20/2015.
// */
//public class Recipes {
//    public static void init() {
//
//        blockRecipes();
//        tileRecipes();
//        //StairsRecipes.init();
//        //PanesRecipes.init();
//
//        if (ConfigurationHandler.smeltingRecipes) smeltingRecipes();
//        if (ConfigurationHandler.itemRecipes) ItemRecipes.init();
//        // if (ConfigurationHandler.panelRecipes) PanelsRecipes.init();
//        if (ConfigurationHandler.thermalExpansionRecipes) ModCompatRecipes.thermalExpansionRecipesInit();
//        if (ConfigurationHandler.enderIORecipies) ModCompatRecipes.enderIORecipesInit();
//
//
//        // Adds recipe for leaver from stone and stick.
//        if (ConfigurationHandler.leaverRecipe) {
//            for (ItemStack stack : OreDictionary.getOres("stone")) {
//                GameRegistry.addRecipe(new ItemStack(Blocks.LEVER, 1), "s", "b", 'b',
//                        new ItemStack(stack.getItem(), 1, stack.getItem().getDamage(stack)), 's', new ItemStack(Items.STICK));
//            }
//        }
//    }
//
//    public static void blockRecipes() {
//        //Concrete
//        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concrete_block),
//                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete),
//                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete));
//    }
//
//    public static void smeltingRecipes() {
//        //Concrete
//        GameRegistry.addSmelting(new ItemStack(ModItems.concreteMix), new ItemStack(ModBlocks.concrete_block), 0.1f);
//
//        //Smelt Blocks back to Concrete
//        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.SMELT_TO_CONCRETE)) {
//            GameRegistry.addSmelting(new ItemStack(aList.getItem(), 1, aList.getItem().getDamage(aList)), new ItemStack(ModBlocks.concrete_block), 0.1f);
//        }
//    }
//
//    public static void tileRecipes() {
//        //// TODO: 6/29/2016
//     /*   //Player Detector
//        GameRegistry.addRecipe(new ItemStack(ModTileEntity.playerDetector, 1), "ici", "ctc", "ici",
//                'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Items.comparator), 't', new ItemStack(Blocks.redstone_torch));
//
//        //Advanced Detector
//        GameRegistry.addRecipe(new ItemStack(ModTileEntity.advancedDetector, 1), "idi", "dtd", "idi",
//                'i', new ItemStack(Items.gold_ingot), 'd', new ItemStack(Items.diamond), 't', new ItemStack(ModTileEntity.playerDetector));
//
//        //Block Table
//        GameRegistry.addRecipe(new ItemStack(ModTileEntity.blockTable, 1), "www", "pwp", "p p",
//                'w', new ItemStack(Blocks.heavy_weighted_pressure_plate), 'p', new ItemStack(Blocks.planks));
//
//        //Lectern
//        GameRegistry.addRecipe(new ItemStack(ModTileEntity.lectern, 1), "sss", " p ", " s ",
//                's', new ItemStack(Blocks.wooden_slab), 'p', new ItemStack(Blocks.planks));*/
//    }
//}
