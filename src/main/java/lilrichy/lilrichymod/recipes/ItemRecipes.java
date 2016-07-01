package lilrichy.lilrichymod.recipes;


import lilrichy.lilrichymod.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 12/7/2015.
 */
public class ItemRecipes {
    public static void init() {

        //Concrete Mix
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.concreteMix, 4),
                new ItemStack(Blocks.SAND), new ItemStack(Blocks.GRAVEL), new ItemStack(Blocks.GRAVEL),
                new ItemStack(Blocks.COBBLESTONE));

        //Seed of Beared Azailia
        GameRegistry.addRecipe(new ItemStack(ModItems.beardedAzaleaSeed, 1), " r ", "ese", " r ",
                'r', new ItemStack(Items.ROTTEN_FLESH), 'e', new ItemStack(Items.SPIDER_EYE),
                's', new ItemStack(Items.WHEAT_SEEDS));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.beardedAzaleaSeed), new ItemStack(ModItems.essenceOfBeard));
    }
}
