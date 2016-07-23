package lilrichy.lilrichymod.recipes;

import lilrichy.lilrichymod.handler.ConfigurationHandler;
import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.init.ModItems;
import lilrichy.lilrichymod.utility.RecipeRemover;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class BlockRecipes {
    public static void blockRecipes() {
        //Concrete
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete));

        //Clear Glass
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clearGlass, 8), "ggg", "geg", "ggg",
                'g', "blockGlass", 'e', new ItemStack(ModItems.essenceOfBeard)));

        //Charcoal Block
        if (ConfigurationHandler.charcoalBlockRecipe) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.charcoalBlock),
                    new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1),
                    new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1),
                    new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.COAL, 1, 1));

            GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1),
                    new ItemStack(ModBlocks.charcoalBlock));
        }

        //Lamp
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lamp, 6), "ggg", "gtg", "bbb",
                'g', "blockGlass", 't', "torch", 'b', new ItemStack(ModItems.lampBase)));

        //Glowstone Lamp
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.glowstoneLamp, 6), "ggg", "gdg", "bbb",
                'g', "blockGlass", 'd', "glowstone", 'b', new ItemStack(ModItems.lampBase)));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.glowstoneLamp),
                new ItemStack(ModBlocks.tinyGlowstoneLamp), new ItemStack(ModBlocks.tinyGlowstoneLamp),
                new ItemStack(ModBlocks.tinyGlowstoneLamp), new ItemStack(ModBlocks.tinyGlowstoneLamp));

        //Tiny Glowstone Lamp
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tinyGlowstoneLamp, 4),
                new ItemStack(ModBlocks.glowstoneLamp));

        //Hanging Glowstone Lamp
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.hangingGlowstoneLamp, 4), " b ", "gsg", "ggg",
                'g', "blockGlass", 'b', new ItemStack(ModItems.lampBase), 's', "glowstone"));

        //Walls
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ironWall, 6), "   ", "bbb", "bbb",
                'b', new ItemStack(Blocks.IRON_BLOCK));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.netherBrickWall, 6), "   ", "bbb", "bbb",
                'b', new ItemStack(Blocks.NETHER_BRICK));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.stoneBrickWall, 6), "   ", "bbb", "bbb",
                'b', new ItemStack(Blocks.STONEBRICK));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.stoneWall, 6), "   ", "bbb", "bbb",
                'b', new ItemStack(Blocks.STONE));

        //Remove vanilla nether brick fence due to conflict with wall recipe.
        RecipeRemover.removeRecipe(Item.getItemFromBlock(Blocks.NETHER_BRICK_FENCE));
        //Alt recipe for nether brick fence due.
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.NETHER_BRICK_FENCE, 6), "bbb", "bbb", "   ",
                'b', new ItemStack(Blocks.NETHER_BRICK));

        // Lever Recipes.
        if (ConfigurationHandler.leaverRecipe) {

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.ironLever), "s", "b",
                    'b', new ItemStack(Blocks.IRON_BLOCK), 's', "stickWood"));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherBrickLever), "s", "b",
                    'b', new ItemStack(Blocks.NETHER_BRICK), 's', "stickWood"));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidianLever), "s", "b",
                    'b', new ItemStack(Blocks.OBSIDIAN), 's', "stickWood"));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stoneBrickLever), "s", "b",
                    'b', new ItemStack(Blocks.STONEBRICK), 's', "stickWood"));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stoneLever), "s", "b",
                    'b', "stone", 's', "stickWood"));

        }
    }
}