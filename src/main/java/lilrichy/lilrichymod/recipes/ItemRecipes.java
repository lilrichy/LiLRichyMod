package lilrichy.lilrichymod.recipes;


import lilrichy.lilrichymod.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 12/7/2015.
 */
public class ItemRecipes {
    public static void init() {
        //DeathSock
      //  GameRegistry.addRecipe(new ItemStack(ModItems.deathSock), "  w", "  w", "www", 'w', new ItemStack(Blocks.wool));
    //    GameRegistry.addRecipe(new ItemStack(ModItems.deathSock), "w  ", "w  ", "www", 'w', new ItemStack(Blocks.wool));

        //Concrete Mix
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.concreteMix, 4),
                new ItemStack(Blocks.SAND), new ItemStack(Blocks.GRAVEL), new ItemStack(Blocks.GRAVEL),
                new ItemStack(Blocks.COBBLESTONE));

     /*   //Seed of Beared Azailia
        GameRegistry.addRecipe(new ItemStack(ModItems.seedBearedAzailia, 1), " r ", "ese", " r ",
                'r', new ItemStack(Items.rotten_flesh), 'e', new ItemStack(Items.spider_eye),
                's', new ItemStack(Items.wheat_seeds));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.seedBearedAzailia), new ItemStack(ModItems.essanceOfBeared));*/
    }
}
