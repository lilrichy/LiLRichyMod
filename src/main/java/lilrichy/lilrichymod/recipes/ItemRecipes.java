package lilrichy.lilrichymod.recipes;


import lilrichy.lilrichymod.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Rich on 12/7/2015.
 */
public class ItemRecipes {
    public static void init() {

        //Concrete Mix
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.concreteMix, 4),
                "sand", "gravel", "gravel", "cobblestone"));

        //Seed of Beared Azailia
        GameRegistry.addRecipe(new ItemStack(ModItems.beardedAzaleaSeed, 1), " r ", "ese", " r ",
                'r', new ItemStack(Items.ROTTEN_FLESH), 'e', new ItemStack(Items.SPIDER_EYE),
                's', new ItemStack(Items.WHEAT_SEEDS));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.beardedAzaleaSeed), new ItemStack(ModItems.essenceOfBeard));

        //Lamp Base
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lampBase, 6), "   ", "   ", "ccc",
                'c', "blockCharcoal"));

        //Tape Measure
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tape), "   ", " y ", "sss",
                'y', "dyeYellow", 's', "string"));

        GameRegistry.addRecipe(new ItemStack(ModItems.tapeMeasure), "iii", "iti", "iii",
                'i', new ItemStack(Items.IRON_INGOT), 't', new ItemStack(ModItems.tape));
    }
}
