package lilrichy.lilrichymod.utility;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.List;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class RecipeRemover {

    /**
     * Used to remove recipes from the crafting matrix .
     *
     * @param toRemove the item that the recipe creates.
     *                 Ex: Recipes.removeRecipe(ITEM));
     *                 To remove a BLOCK just get the Item from it.
     *                 Ex:  Recipes.removeRecipe(Item.getItemFromBlock(BLOCK));
     */
    public static int removeRecipe(Item toRemove) {
        int recipesRemoved = 0;
        List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();

        java.util.Iterator<IRecipe> recipeEntry = recipeList.iterator();
        while (recipeEntry.hasNext()) {
            ItemStack outputItem = recipeEntry.next().getRecipeOutput();
            if (outputItem != null && outputItem.getItem() == toRemove) {
                recipeEntry.remove();
                recipesRemoved++;
            }
        }
        return recipesRemoved;
    }
}
