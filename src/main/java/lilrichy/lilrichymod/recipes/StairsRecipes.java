package lilrichy.lilrichymod.recipes;

/**
 * Created by LiLRichy on 1/29/2016.
 */

//Todo Re add all stairs recipes
public class StairsRecipes {
    public static void init() {
 /*       //Lava
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaCracksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaCracks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaDeepFireStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaDeepFire));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaPelesLake, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaPelesLakeStairs));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaSearingGorgeStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaSearingGorge));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaVolcanoStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaVolcano));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaBowlStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaBowl));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaBowlBlueStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaBowlBlue));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaBowlGreenStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaBowlGreen));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaBowlPurpleStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.lavaBowlPurple));

        //Metal
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalBatteredRobotStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalBatteredRobot));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalBatteredRobotBlueStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalBatteredRobotBlue));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalBatteredRobotOrangeStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalBatteredRobotOrange));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalBatteredRobotPurpleStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalBatteredRobotPurple));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalBubbleGripStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalBubbleGrip));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalNeedlepointSteelStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalNeedlepointSteel));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalRustedIronGripStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalRustedIronGrip));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalSeafoamTarnishStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalSeafoamTarnish));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalStainedStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.metalStained));

        //Marble
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleBlackStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.marbleBlack));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleBlancoAuroraStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.marbleBlancoAurora));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleBlancoNafinStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.marbleBlancoNafin));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleSpottedBiancoStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.marbleSpottedBianco));

        //Concrete
        GameRegistry.addRecipe(new ItemStack(ModBlocks.fancyConcreteBlocksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.fancyConcreteBlocks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.concreteBricksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.concreteBricks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.concreteBricksDarkStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.concreteBricksDark));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.concreteRocksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.concreteRocks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.concreteTexturedBlocksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.concreteTexturedBlocks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.oldConcreteSquaresStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.oldConcreteSquares));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.concreteSquaresStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.concreteSquares));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.smallConcreteBricksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.smallConcreteBricks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.smallConcreteTexturedSquaresStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.smallConcreteTexturedSquares));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.arrangedConcreteBricksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.arrangedConcreteBricks));

        //Stone
        GameRegistry.addRecipe(new ItemStack(ModBlocks.crackedStoneStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.crackedStone));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.arrangedStoneBricksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.arrangedStoneBricks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneBlocksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.stoneBlocks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.darkStoneBlocksStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.darkStoneBlocks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneMineralsStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.stoneMinerals));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneMineralsBlueStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.stoneMineralsBlue));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneMineralsOrangeStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.stoneMineralsOrange));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneMineralsPurpleStairs, 4), "b  ", "bb ", "bbb",
                'b', new ItemStack(ModBlocks.stoneMineralsPurple));
    */}
}
