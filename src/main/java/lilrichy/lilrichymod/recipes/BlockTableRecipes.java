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

import static lilrichy.lilrichymod.init.ModBlocks.concrete;
import static net.minecraftforge.oredict.OreDictionary.getOres;

/**
 * Created by Rich on 12/10/2015.
 */

public class BlockTableRecipes {
    private static final BlockTableRecipes recipes = new BlockTableRecipes();
    private HashMap<List<Integer>, ItemStack[]> result = new HashMap<List<Integer>, ItemStack[]>();

    public BlockTableRecipes() {
        /**
         * ItemStack[] : The list of output items.
         * Recipe Lists: (output, slot 1 input, slot 2 input) this is the Main recipes for the Block table
         * Each Recipie Should have 2 parts the main recipe and the Ore Dictionary part.
         * Ore Dictionary Recipes - Allow blocks to convert between similar types.
         */
        //Concrete
        ItemStack[] concreteList = {new ItemStack(ModBlocks.concreteBricks),
                new ItemStack(ModBlocks.concreteRocks), new ItemStack(ModBlocks.concreteTexturedBlocks),
                new ItemStack(ModBlocks.concreteSquares), new ItemStack(ModBlocks.concreteBricksDark),
                new ItemStack(ModBlocks.concreteArrangedBricks), new ItemStack(ModBlocks.concreteFancyBlocks),
                new ItemStack(ModBlocks.concreteOldSquares), new ItemStack(ModBlocks.concreteSmallBricks),
                new ItemStack(ModBlocks.concreteSmallTexturedSquares)};

        this.addRecipe(concreteList, new ItemStack(concrete), new ItemStack(ModItems.crushedConcrete));
        for (ItemStack list : OreDictionary.getOres(Names.OreDicNames.CONCRETE))
            this.addRecipe(concreteList, new ItemStack(list.getItem()), new ItemStack(ModItems.crushedConcrete));

//        //Cottage
        ItemStack[] cottageList = {new ItemStack(ModBlocks.cottageWall), new ItemStack(ModBlocks.cottageWallArchedBeam),
                new ItemStack(ModBlocks.cottageWallArchedBeamDark), new ItemStack(ModBlocks.cottageWallDark),
                new ItemStack(ModBlocks.cottageWallPanelDark), new ItemStack(ModBlocks.cottageWallPanelLight),
                new ItemStack(ModBlocks.cottageWallXDark), new ItemStack(ModBlocks.cottageWallXLight),
                new ItemStack(ModBlocks.cottageWindowDark), new ItemStack(ModBlocks.cottageWindowLight)};

        this.addRecipe(cottageList, new ItemStack(concrete), new ItemStack(Blocks.PLANKS));
        for (ItemStack list : OreDictionary.getOres(Names.OreDicNames.COTTAGE))
            this.addRecipe(concreteList, new ItemStack(list.getItem()), new ItemStack(Blocks.PLANKS));

        //Lava
        ItemStack[] lavaList = {new ItemStack(ModBlocks.lavaBowl), new ItemStack(ModBlocks.lavaBowlBlue),
                new ItemStack(ModBlocks.lavaBowlGreen), new ItemStack(ModBlocks.lavaBowlPurple),
                new ItemStack(ModBlocks.lavaCracks), new ItemStack(ModBlocks.lavaDeepFire),
                new ItemStack(ModBlocks.lavaPelesLake), new ItemStack(ModBlocks.lavaSearingGorge),
                new ItemStack(ModBlocks.lavaSlumberingVolcano)};

        this.addRecipe(lavaList, new ItemStack(concrete), new ItemStack(Blocks.NETHERRACK));
        for (ItemStack list : OreDictionary.getOres(Names.OreDicNames.LAVA))
            this.addRecipe(lavaList, new ItemStack(list.getItem()), new ItemStack(Blocks.NETHERRACK));

        //Marble
        ItemStack[] marbleList = {new ItemStack(ModBlocks.marbleBlack), new ItemStack(ModBlocks.marbleBlancoAurora),
                new ItemStack(ModBlocks.marbleBlancoNafin), new ItemStack(ModBlocks.marbleSpottedBianco)};

        this.addRecipe(marbleList, new ItemStack(concrete), new ItemStack(Blocks.SANDSTONE));
        for (ItemStack list : OreDictionary.getOres(Names.OreDicNames.MARBLE))
            this.addRecipe(marbleList, new ItemStack(list.getItem()), new ItemStack(Blocks.SANDSTONE));

        //Metal
        ItemStack[] metalList = {new ItemStack(ModBlocks.metalArmor),
                new ItemStack(ModBlocks.metalBatteredRobot), new ItemStack(ModBlocks.metalBatteredRobotBlue),
                new ItemStack(ModBlocks.metalBatteredRobotOrange), new ItemStack(ModBlocks.metalBatteredRobotPurple),
                new ItemStack(ModBlocks.metalBrushedSteel), new ItemStack(ModBlocks.metalBrushedSteelDark),
                new ItemStack(ModBlocks.metalBubbleGrip), new ItemStack(ModBlocks.metalLaserEtched),
                new ItemStack(ModBlocks.metalNeedlepointSteel), new ItemStack(ModBlocks.metalPlating),
                new ItemStack(ModBlocks.metalPlatingDark), new ItemStack(ModBlocks.metalRustedIronGrip),
                new ItemStack(ModBlocks.metalSeafoamTarnish), new ItemStack(ModBlocks.metalStained)};

        this.addRecipe(metalList, new ItemStack(concrete), new ItemStack(Items.IRON_INGOT));
        for (ItemStack list : OreDictionary.getOres(Names.OreDicNames.METAL))
            this.addRecipe(metalList, new ItemStack(list.getItem()), new ItemStack(Items.IRON_INGOT));

        //Stone
        ItemStack[] stoneList = {new ItemStack(ModBlocks.stoneArrangedBricks),
                new ItemStack(ModBlocks.stoneBlocks), new ItemStack(ModBlocks.stoneBlocksDark),
                new ItemStack(ModBlocks.stoneCracked), new ItemStack(ModBlocks.stoneMinerals),
                new ItemStack(ModBlocks.stoneMineralsBlue), new ItemStack(ModBlocks.stoneMineralsOrange),
                new ItemStack(ModBlocks.stoneMineralsPurple)};

        this.addRecipe(stoneList, new ItemStack(concrete), new ItemStack(Blocks.STONE));
        for (ItemStack list : OreDictionary.getOres(Names.OreDicNames.STONE))
            this.addRecipe(stoneList, new ItemStack(list.getItem()), new ItemStack(Blocks.STONE));

        //Clear Glass
        ItemStack[] clearGlassList = {
                new ItemStack(ModBlocks.clearGlassBlack), new ItemStack(ModBlocks.clearGlassBlue),
                new ItemStack(ModBlocks.clearGlassBrown), new ItemStack(ModBlocks.clearGlassCyan),
                new ItemStack(ModBlocks.clearGlassGray), new ItemStack(ModBlocks.clearGlassGreen),
                new ItemStack(ModBlocks.clearGlassLightBlue), new ItemStack(ModBlocks.clearGlassLime),
                new ItemStack(ModBlocks.clearGlassMagenta), new ItemStack(ModBlocks.clearGlassOrange),
                new ItemStack(ModBlocks.clearGlassPink), new ItemStack(ModBlocks.clearGlassPurple),
                new ItemStack(ModBlocks.clearGlassRed), new ItemStack(ModBlocks.clearGlassSilver),
                new ItemStack(ModBlocks.clearGlassYellow)};

        this.addRecipe(clearGlassList, new ItemStack(Blocks.GLASS), new ItemStack(ModItems.essenceOfBeard));
        for (ItemStack list : OreDictionary.getOres("blockGlass"))
            this.addRecipe(clearGlassList, new ItemStack(list.getItem()), new ItemStack(ModItems.essenceOfBeard));

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
            if (stack.isItemEqual(new ItemStack(concrete))) return true;

            //Ore Dictionary usage
            for (ItemStack iStack : getOres("blockGlass"))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : getOres(Names.OreDicNames.STONE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : getOres(Names.OreDicNames.CONCRETE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : getOres(Names.OreDicNames.METAL))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : getOres(Names.OreDicNames.MARBLE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : getOres(Names.OreDicNames.COTTAGE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : getOres(Names.OreDicNames.LAVA))
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

        for (ItemStack aPlanks : getOres("plankWood"))
            if (stack.getItem() == aPlanks.getItem()) return true;

        return false;
    }

    public static final BlockTableRecipes recipes() {
        return recipes;
    }

    public void addRecipe(ItemStack[] output, ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }
        result.put(inputData, output);
    }

    public ItemStack[] getCraftingResult(ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }
//        LogHelper.info(result.get(inputData));
        return result.get(inputData);
    }
}