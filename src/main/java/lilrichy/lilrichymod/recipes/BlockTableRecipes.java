package lilrichy.lilrichymod.recipes;

import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.init.ModItems;
import lilrichy.lilrichymod.reference.Names;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rich on 12/10/2015.
 */

public class BlockTableRecipes {
    private static final BlockTableRecipes recipes = new BlockTableRecipes();
    private HashMap<List<Integer>, ItemStack> result = new HashMap<List<Integer>, ItemStack>();

    public BlockTableRecipes() {
        /**
         * Recipe Lists: (output, slot 1 input, slot 2 input) this is the Main recipes for the Block table
         * Each Recipie Should have 2 parts the main recipe and the Ore Dictionary part.
         * Ore Dictionary Recipes - Allow blocks to convert between similar types.
         */
        //Concrete
//        this.addRecipe(new ItemStack(ModBlocks.deco_concrete), new ItemStack(ModBlocks.concrete_block), new ItemStack(ModItems.crushedConcrete));
//        for (ItemStack aConcrete : OreDictionary.getOres(Names.OreDicNames.CONCRETE))
//            this.addRecipe(new ItemStack(ModBlocks.deco_concrete), new ItemStack(aConcrete.getItem()), new ItemStack(ModItems.crushedConcrete));
//
//        //Metal
//        this.addRecipe(new ItemStack(ModBlocks.deco_metal), new ItemStack(ModBlocks.concrete_block), new ItemStack(Items.IRON_INGOT));
//        for (ItemStack aMetal : OreDictionary.getOres(Names.OreDicNames.METAL))
//            this.addRecipe(new ItemStack(ModBlocks.deco_metal), new ItemStack(aMetal.getItem()), new ItemStack(Items.IRON_INGOT));
//
//        this.addRecipe(new ItemStack(ModBlocks.deco_metalRobotColors), new ItemStack(ModBlocks.deco_metal.getStateFromMeta(1).getBlock()), new ItemStack(ModItems.essanceOfBeared));
//        for (ItemStack aMetalRobot : OreDictionary.getOres(Names.OreDicNames.METAL_ROBOT))
//            this.addRecipe(new ItemStack(ModBlocks.deco_metalRobotColors), new ItemStack(aMetalRobot.getItem()), new ItemStack(ModItems.essanceOfBeared));
//
//        //Marble
//        this.addRecipe(new ItemStack(ModBlocks.deco_marble), new ItemStack(ModBlocks.concrete_block), new ItemStack(Blocks.SANDSTONE));
//        for (ItemStack aMarble : OreDictionary.getOres(Names.OreDicNames.MARBLE))
//            this.addRecipe(new ItemStack(ModBlocks.deco_marble), new ItemStack(aMarble.getItem()), new ItemStack(Blocks.SANDSTONE));
//
//        //Lava
//        this.addRecipe(new ItemStack(ModBlocks.deco_lava), new ItemStack(ModBlocks.concrete_block), new ItemStack(Blocks.NETHERRACK));
//        for (ItemStack aLava : OreDictionary.getOres(Names.OreDicNames.LAVA))
//            this.addRecipe(new ItemStack(ModBlocks.deco_lava), new ItemStack(aLava.getItem()), new ItemStack(Blocks.NETHERRACK));
//
//        this.addRecipe(new ItemStack(ModBlocks.deco_lavaBowlColors), new ItemStack(ModBlocks.deco_lava.getStateFromMeta(0).getBlock()), new ItemStack(ModItems.essanceOfBeared));
//        for (ItemStack aLavaBowl : OreDictionary.getOres(Names.OreDicNames.LAVA_BOWL))
//            this.addRecipe(new ItemStack(ModBlocks.deco_lavaBowlColors), new ItemStack(aLavaBowl.getItem()), new ItemStack(ModItems.essanceOfBeared));
//
//        //Stone
//        this.addRecipe(new ItemStack(ModBlocks.deco_stone), new ItemStack(ModBlocks.concrete_block), new ItemStack(Blocks.STONE));
//        for (ItemStack aStone : OreDictionary.getOres(Names.OreDicNames.STONE))
//            this.addRecipe(new ItemStack(ModBlocks.deco_stone), new ItemStack(aStone.getItem()), new ItemStack(Blocks.STONE));
//
//        this.addRecipe(new ItemStack(ModBlocks.deco_stoneMineralsColors), new ItemStack(ModBlocks.deco_stone.getStateFromMeta(5).getBlock()), new ItemStack(ModItems.essanceOfBeared));
//        for (ItemStack aMinerals : OreDictionary.getOres(Names.OreDicNames.STONE_MINERALS))
//            this.addRecipe(new ItemStack(ModBlocks.deco_stoneMineralsColors), new ItemStack(aMinerals.getItem()), new ItemStack(ModItems.essanceOfBeared));
//
//        //Cottage
//        for (ItemStack aPlanks : OreDictionary.getOres("plankWood"))
//            this.addRecipe(new ItemStack(ModBlocks.deco_cottage), new ItemStack(ModBlocks.concrete_block), new ItemStack(aPlanks.getItem()));
//        for (ItemStack aCottage : OreDictionary.getOres(Names.OreDicNames.COTTAGE)) {
//            for (ItemStack aPlanks : OreDictionary.getOres("plankWood"))
//                this.addRecipe(new ItemStack(ModBlocks.deco_cottage), new ItemStack(aCottage.getItem()), new ItemStack(aPlanks.getItem()));
//        }

  //// TODO: 6/29/2016
       /* for (ItemStack aGlass : OreDictionary.getOres("blockGlass"))
            this.addRecipe(new ItemStack(ModBlocks.deco_ClearGlass), new ItemStack(aGlass.getItem()), new ItemStack(ModItems.essanceOfBeared));
*/


    }


    /**
     * This is used to check if the block can be placed in the first slot.
     *
     * @param stack the block trying to be placed into the slot
     * @return True if the block matches and can be placed in the slot
     */
    public static boolean isCraftableBlock(ItemStack stack) {
        //Check if valid block
        if (stack != null) {
            if (stack.isItemEqual(new ItemStack(ModBlocks.concrete))) return true;

            //Ore Dictionary usage
            for (ItemStack iStack : OreDictionary.getOres("blockGlass"))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.STONE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.STONE_MINERALS))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.CONCRETE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.METAL))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.MARBLE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.COTTAGE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.LAVA))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.LAVA_BOWL))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.METAL_ROBOT))
                if (iStack.isItemEqual(stack)) return true;
        }
        return false;
    }

    /**
     * Checks if a block can be placed into the 2nd slot
     *
     * @param stack the block trying to be placed into the slot
     * @return True if the block matches and can be placed in the slot
     */
    public static boolean isMaterial(ItemStack stack) {
        //Lists of Materials that can be used in the 2nd Slot of the Block Table
        ItemStack[] materialList = {new ItemStack(ModItems.crushedConcrete), new ItemStack(Items.IRON_INGOT),
                new ItemStack(Blocks.SANDSTONE), new ItemStack(Blocks.NETHERRACK),
                new ItemStack(Blocks.STONE), new ItemStack(ModItems.essenceOfBeard)};

        for (ItemStack aMatsList : materialList) if (stack.isItemEqual(aMatsList)) return true;

        for (ItemStack aPlanks : OreDictionary.getOres("plankWood"))
            if (stack.getItem() == aPlanks.getItem()) return true;

        return false;
    }

    public static final BlockTableRecipes recipes() {
        return recipes;
    }

    public void addRecipe(ItemStack output, ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }
        result.put(inputData, output);
    }

    public ItemStack getCraftingResult(ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }
        return result.get(inputData);
    }
}