package lilrichy.lilrichymod.init;

import lilrichy.lilrichymod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by LiLRichy on 2/15/2016.
 */
public class ModBlocks {

    public static Block concrete;
    public static Block concreteArrangedBricks;
    public static Block concreteBricks;
    public static Block concreteBricksDark;
    public static Block concreteFancyBlocks;
    public static Block concreteOldSquares;
    public static Block concreteRocks;
    public static Block concreteSmallBricks;
    public static Block concreteSmallTexturedSquares;
    public static Block concreteSquares;
    public static Block concreteTexturedBlocks;

    public static Block cottageWall;
    public static Block cottageWallArchedBeam;
    public static Block cottageWallArchedBeamDark;
    public static Block cottageWallDark;
    public static Block cottageWallPanelDark;
    public static Block cottageWallPanelLight;
    public static Block cottageWallXDark;
    public static Block cottageWallXLight;
    public static Block cottageWindowDark;
    public static Block cottageWindowLight;

    public static Block lavaBowl;
    public static Block lavaBowlBlue;
    public static Block lavaBowlGreen;
    public static Block lavaBowlPurple;
    public static Block lavaCracks;
    public static Block lavaDeepFire;
    public static Block lavaPelesLake;
    public static Block lavaSearingGorge;
    public static Block lavaSlumberingVolcano;

    public static Block marbleBlack;
    public static Block marbleBlancoAurora;
    public static Block marbleBlancoNafin;
    public static Block marbleSpottedBianco;

    public static Block metalArmor;
    public static Block metalBatteredRobot;
    public static Block metalBatteredRobotBlue;
    public static Block metalBatteredRobotOrange;
    public static Block metalBatteredRobotPurple;
    public static Block metalBrushedSteel;
    public static Block metalBrushedSteelDark;
    public static Block metalBubbleGrip;
    public static Block metalLaserEtched;
    public static Block metalNeedlepointSteel;
    public static Block metalPlating;
    public static Block metalPlatingDark;
    public static Block metalRustedIronGrip;
    public static Block metalSeafoamTarnish;
    public static Block metalStained;

    public static Block stoneArrangedBricks;
    public static Block stoneBlocks;
    public static Block stoneBlocksDark;
    public static Block stoneCracked;
    public static Block stoneMinerals;
    public static Block stoneMineralsBlue;
    public static Block stoneMineralsOrange;
    public static Block stoneMineralsPurple;


    public static void init() {
        concrete = new BlockConcrete();
        concreteArrangedBricks = new BlockConcreteArrangedBricks();
        concreteBricks = new BlockConcreteBricks();
        concreteBricksDark = new BlockConcreteBricksDark();
        concreteFancyBlocks = new BlockConcreteFancyBlocks();
        concreteOldSquares = new BlockConcreteOldSquares();
        concreteRocks = new BlockConcreteRocks();
        concreteSmallBricks = new BlockConcreteSmallBricks();
        concreteSmallTexturedSquares = new BlockConcreteSmallTexturedSquares();
        concreteSquares = new BlockConcreteSquares();
        concreteTexturedBlocks = new BlockConcreteTexturedBlocks();

        cottageWall = new BlockCottageWall();
        cottageWallArchedBeam = new BlockCottageWallArchedBeam();
        cottageWallArchedBeamDark = new BlockCottageWallArchedBeamDark();
        cottageWallDark = new BlockCottageWallDark();
        cottageWallPanelDark = new BlockCottageWallPanelDark();
        cottageWallPanelLight = new BlockCottageWallPanelLight();
        cottageWallXDark = new BlockCottageWallXDark();
        cottageWallXLight = new BlockCottageWallXLight();
        cottageWindowDark = new BlockCottageWindowDark();
        cottageWindowLight = new BlockCottageWindowLight();

        lavaBowl = new BlockLavaBowl();
        lavaBowlBlue = new BlockLavaBowlBlue();
        lavaBowlGreen = new BlockLavaBowlGreen();
        lavaBowlPurple = new BlockLavaBowlPurple();
        lavaCracks = new BlockLavaCracks();
        lavaDeepFire = new BlockLavaDeepFire();
        lavaPelesLake = new BlockLavaPelesLake();
        lavaSearingGorge = new BlockLavaSearingGorge();
        lavaSlumberingVolcano = new BlockLavaSlumberingVolcano();

        marbleBlack = new BlockMarbleBlack();
        marbleBlancoAurora = new BlockMarbleBlancoAurora();
        marbleBlancoNafin = new BlockMarbleBlancoNafin();
        marbleSpottedBianco = new BlockMarbleSpottedBianco();

        metalArmor = new BlockMetalArmor();
        metalBatteredRobot = new BlockMetalBatteredRobot();
        metalBatteredRobotBlue = new BlockMetalBatteredRobotBlue();
        metalBatteredRobotOrange = new BlockMetalBatteredRobotOrange();
        metalBatteredRobotPurple = new BlockMetalBatteredRobotPurple();
        metalBrushedSteel = new BlockMetalBrushedSteel();
        metalBrushedSteelDark = new BlockMetalBrushedSteelDark();
        metalBubbleGrip = new BlockMetalBubbleGrip();
        metalLaserEtched = new BlockMetalLaserEtched();
        metalNeedlepointSteel = new BlockMetalNeedlepointSteel();
        metalPlating = new BlockMetalPlating();
        metalPlatingDark = new BlockMetalPlatingDark();
        metalRustedIronGrip = new BlockMetalRustedIronGrip();
        metalSeafoamTarnish = new BlockMetalSeafoamTarnish();
        metalStained = new BlockMetalStained();

        stoneArrangedBricks = new BlockStoneArrangedBricks();
        stoneBlocks = new BlockStoneBlocks();
        stoneBlocksDark = new BlockStoneBlocksDark();
        stoneCracked = new BlockStoneCracked();
        stoneMinerals = new BlockStoneMinerals();
        stoneMineralsBlue = new BlockStoneMineralsBlue();
        stoneMineralsOrange = new BlockStoneMineralsOrange();
        stoneMineralsPurple = new BlockStoneMineralsPurple();

    }

    public static void register() {
        registerBlock(concrete);
        registerBlock(concreteArrangedBricks);
        registerBlock(concreteBricks);
        registerBlock(concreteBricksDark);
        registerBlock(concreteFancyBlocks);
        registerBlock(concreteOldSquares);
        registerBlock(concreteRocks);
        registerBlock(concreteSmallBricks);
        registerBlock(concreteSmallTexturedSquares);
        registerBlock(concreteSquares);
        registerBlock(concreteTexturedBlocks);

        registerBlock(cottageWall);
        registerBlock(cottageWallArchedBeam);
        registerBlock(cottageWallArchedBeamDark);
        registerBlock(cottageWallDark);
        registerBlock(cottageWallPanelDark);
        registerBlock(cottageWallPanelLight);
        registerBlock(cottageWallXDark);
        registerBlock(cottageWallXLight);
        registerBlock(cottageWindowDark);
        registerBlock(cottageWindowLight);

        registerBlock(lavaBowl);
        registerBlock(lavaBowlBlue);
        registerBlock(lavaBowlGreen);
        registerBlock(lavaBowlPurple);
        registerBlock(lavaCracks);
        registerBlock(lavaDeepFire);
        registerBlock(lavaPelesLake);
        registerBlock(lavaSearingGorge);
        registerBlock(lavaSlumberingVolcano);

        registerBlock(marbleBlack);
        registerBlock(marbleBlancoAurora);
        registerBlock(marbleBlancoNafin);
        registerBlock(marbleSpottedBianco);
        registerBlock(metalArmor);
        registerBlock(metalBatteredRobot);
        registerBlock(metalBatteredRobotBlue);
        registerBlock(metalBatteredRobotOrange);
        registerBlock(metalBatteredRobotPurple);
        registerBlock(metalBrushedSteel);
        registerBlock(metalBrushedSteelDark);
        registerBlock(metalBubbleGrip);
        registerBlock(metalLaserEtched);
        registerBlock(metalNeedlepointSteel);
        registerBlock(metalPlating);
        registerBlock(metalPlatingDark);
        registerBlock(metalRustedIronGrip);
        registerBlock(metalSeafoamTarnish);
        registerBlock(metalStained);

        registerBlock(stoneArrangedBricks);
        registerBlock(stoneBlocks);
        registerBlock(stoneBlocksDark);
        registerBlock(stoneCracked);
        registerBlock(stoneMinerals);
        registerBlock(stoneMineralsBlue);
        registerBlock(stoneMineralsOrange);
        registerBlock(stoneMineralsPurple);
    }

    public static void registerRenders() {
        registerRender(concrete);
        registerRender(concreteArrangedBricks);
        registerRender(concreteBricks);
        registerRender(concreteBricksDark);
        registerRender(concreteFancyBlocks);
        registerRender(concreteOldSquares);
        registerRender(concreteRocks);
        registerRender(concreteSmallBricks);
        registerRender(concreteSmallTexturedSquares);
        registerRender(concreteSquares);
        registerRender(concreteTexturedBlocks);

        registerRender(cottageWall);
        registerRender(cottageWallArchedBeam);
        registerRender(cottageWallArchedBeamDark);
        registerRender(cottageWallDark);
        registerRender(cottageWallPanelDark);
        registerRender(cottageWallPanelLight);
        registerRender(cottageWallXDark);
        registerRender(cottageWallXLight);
        registerRender(cottageWindowDark);
        registerRender(cottageWindowLight);

        registerRender(lavaBowl);
        registerRender(lavaBowlBlue);
        registerRender(lavaBowlGreen);
        registerRender(lavaBowlPurple);
        registerRender(lavaCracks);
        registerRender(lavaDeepFire);
        registerRender(lavaPelesLake);
        registerRender(lavaSearingGorge);
        registerRender(lavaSlumberingVolcano);

        registerRender(marbleBlack);
        registerRender(marbleBlancoAurora);
        registerRender(marbleBlancoNafin);
        registerRender(marbleSpottedBianco);
        registerRender(metalArmor);
        registerRender(metalBatteredRobot);
        registerRender(metalBatteredRobotBlue);
        registerRender(metalBatteredRobotOrange);
        registerRender(metalBatteredRobotPurple);
        registerRender(metalBrushedSteel);
        registerRender(metalBrushedSteelDark);
        registerRender(metalBubbleGrip);
        registerRender(metalLaserEtched);
        registerRender(metalNeedlepointSteel);
        registerRender(metalPlating);
        registerRender(metalPlatingDark);
        registerRender(metalRustedIronGrip);
        registerRender(metalSeafoamTarnish);
        registerRender(metalStained);

        registerRender(stoneArrangedBricks);
        registerRender(stoneBlocks);
        registerRender(stoneBlocksDark);
        registerRender(stoneCracked);
        registerRender(stoneMinerals);
        registerRender(stoneMineralsBlue);
        registerRender(stoneMineralsOrange);
        registerRender(stoneMineralsPurple);
            }

    public static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        GameRegistry.register(itemBlock);
    }


//-------------------------------------Old Code---------------------------------------------------------------

   /* //Crops
 //todo public static final LiLRichyCrop beardedAzalea = new BeardedAzalea(Names.Crops.BEARDED_AZALEA);

    //Concrete
    public static Block concrete_block = new BlockConcrete(Names.Blocks.CONCRETE, Material.ROCK);

    public static Block deco_concrete = new DecoSubBlocks("DecoConcrete", Material.ROCK,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.CONCRETE_BLOCKS, DecoBlockVarStrings.concreteTypes, DecoBlockVarStrings.concreteTypes.length);
    //Cottage
    public static Block deco_cottage = new DecoSubBlocks("DecoCottage", Material.WOOD,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.COTTAGE_BLOCKS, DecoBlockVarStrings.cottageTypes, DecoBlockVarStrings.cottageTypes.length);

    //Lava
    public static Block deco_lava = new DecoSubBlocks("DecoLava", Material.ROCK,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.LAVA_BLOCKS, DecoBlockVarStrings.lavaTypes, DecoBlockVarStrings.lavaTypes.length);
    public static Block deco_lavaBowlColors = new DecoSubBlocks("DecoLavaBowlColors", Material.ROCK,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.LAVA_BOWL_COLORS, DecoBlockVarStrings.lavaBowlTypes, DecoBlockVarStrings.lavaBowlTypes.length);

    //Marble
    public static Block deco_marble = new DecoSubBlocks("DecoMarble", Material.ROCK,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.MARBLE_BLOCKS, DecoBlockVarStrings.marbleTypes, DecoBlockVarStrings.marbleTypes.length);

    //Metal
    public static Block deco_metal = new DecoSubBlocks("DecoMetal", Material.IRON,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.METAL_BLOCKS, DecoBlockVarStrings.metalTypes, DecoBlockVarStrings.metalTypes.length);
    public static Block deco_metalRobotColors = new DecoSubBlocks("DecoMetalRobotColors", Material.IRON,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.METAL_ROBOT_COLORS, DecoBlockVarStrings.metalRobotTypes, DecoBlockVarStrings.metalRobotTypes.length);

    //Stone
    public static Block deco_stone = new DecoSubBlocks("DecoStone", Material.ROCK,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.STONE_BLOCKS, DecoBlockVarStrings.stoneTypes, DecoBlockVarStrings.stoneTypes.length);
    public static Block deco_stoneMineralsColors = new DecoSubBlocks("DecoStoneMineralsColors", Material.ROCK,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.STONE_MINERALS_COLORS_CRAFT, DecoBlockVarStrings.stoneMineralsTypes, DecoBlockVarStrings.stoneMineralsTypes.length);

    //Glass
   //Todo
    *//* public static Block deco_ClearGlass = new GlassBlocks("DecoClearGlass", Material.glass,
            Names.CraftingToolTips.CRAFT_WITH, Names.CraftingToolTips.GLASS_CLEAR, DecoBlockVarStrings.clearGlassTypes, DecoBlockVarStrings.clearGlassTypes.length);*//*

    //Panels
    public static Block deco_paneling = new LiLRichyPanel("DecoPaneling", Material.WOOD, true,
            DecoBlockVarStrings.panelingTypes,DecoBlockVarStrings.panelingTypes.length);

    *//**
     * Initial Registry
     * Register the blocks to the game and to ore dictionary
     * if block has sub blocks then use registerOreDicMeta toregister to Ore Dictionary
     * Decorative blocks should also register Ore Dictionary - SmeltToConcrete to allow them to be
     * smelted back into concrete blocks.
     * Color Versions of Blocks should also Ore Dictionary there main version.
     *//*
    public static void register() {
        //Crops
      //todo  GameRegistry.registerBlock(beardedAzalea, CropItemBlock.class, beardedAzalea.getUnlocalizedName().substring(5));

        //Concrete
        GameRegistry.registerBlock(concrete_block, concrete_block.getUnlocalizedName().substring(5));
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concrete_block);

        GameRegistry.registerBlock(deco_concrete, ItemBlockMeta.class, "DecoConcrete");
        registerOreDicMeta(deco_concrete, Names.OreDicNames.CONCRETE);
        registerOreDicMeta(deco_concrete, Names.OreDicNames.SMELT_TO_CONCRETE);

        //Cottage
        GameRegistry.registerBlock(deco_cottage, ItemBlockMeta.class, "DecoCottage");
        registerOreDicMeta(deco_cottage, Names.OreDicNames.COTTAGE);
        registerOreDicMeta(deco_cottage, Names.OreDicNames.SMELT_TO_CONCRETE);

        //Lava
        GameRegistry.registerBlock(deco_lava, ItemBlockMeta.class, "DecoLava");
        registerOreDicMeta(deco_lava, Names.OreDicNames.LAVA);
        registerOreDicMeta(deco_lava, Names.OreDicNames.SMELT_TO_CONCRETE);
        GameRegistry.registerBlock(deco_lavaBowlColors, ItemBlockMeta.class, "DecoLavaBowlColors");
        registerOreDicMeta(deco_lavaBowlColors, Names.OreDicNames.LAVA_BOWL);
        registerOreDicMeta(deco_lavaBowlColors, Names.OreDicNames.LAVA);
        registerOreDicMeta(deco_lavaBowlColors, Names.OreDicNames.SMELT_TO_CONCRETE);

        //Marble
        GameRegistry.registerBlock(deco_marble, ItemBlockMeta.class, "DecoMarble");
        registerOreDicMeta(deco_marble, Names.OreDicNames.MARBLE);
        registerOreDicMeta(deco_marble, Names.OreDicNames.SMELT_TO_CONCRETE);

        //Metal
        GameRegistry.registerBlock(deco_metal, ItemBlockMeta.class, "DecoMetal");
        registerOreDicMeta(deco_metal, Names.OreDicNames.METAL);
        registerOreDicMeta(deco_metal, Names.OreDicNames.SMELT_TO_CONCRETE);
        GameRegistry.registerBlock(deco_metalRobotColors, ItemBlockMeta.class, "DecoMetalRobotColors");
        registerOreDicMeta(deco_metalRobotColors, Names.OreDicNames.METAL_ROBOT);
        registerOreDicMeta(deco_metalRobotColors, Names.OreDicNames.METAL);
        registerOreDicMeta(deco_metalRobotColors, Names.OreDicNames.SMELT_TO_CONCRETE);

        //Stone
        GameRegistry.registerBlock(deco_stone, ItemBlockMeta.class, "DecoStone");
        registerOreDicMeta(deco_stone, Names.OreDicNames.STONE);
        registerOreDicMeta(deco_stone, Names.OreDicNames.SMELT_TO_CONCRETE);
        GameRegistry.registerBlock(deco_stoneMineralsColors, ItemBlockMeta.class, "DecoStoneMineralsColors");
        registerOreDicMeta(deco_stoneMineralsColors, Names.OreDicNames.STONE_MINERALS);
        registerOreDicMeta(deco_stoneMineralsColors, Names.OreDicNames.STONE);
        registerOreDicMeta(deco_stoneMineralsColors, Names.OreDicNames.SMELT_TO_CONCRETE);

//// TODO: 6/29/2016
      *//*  //Glass
        GameRegistry.registerBlock(deco_ClearGlass, ItemBlockMeta.class, "DecoClearGlass");
        registerOreDicMeta(deco_ClearGlass, Names.OreDicNames.GLASS_CLEAR);
        registerOreDicMeta(deco_ClearGlass, "blockGlass");*//*

        //Paneling
        GameRegistry.registerBlock(deco_paneling, ItemBlockMeta.class, "DecoPaneling");
    }

    *//**
     * Register the block to be rendered as an item.
     *//*
    public static void registerRenders() {

        //Crops
    //todo    registerRender(beardedAzalea);

        //Concrete
        registerRender(concrete_block);
        for (int i = 0; i < DecoBlockVarStrings.concreteTypes.length; i++) registerRender(deco_concrete, i);

        //Cottage
        for (int i = 0; i < DecoBlockVarStrings.cottageTypes.length; i++) registerRender(deco_cottage, i);

        //Lava
        for (int i = 0; i < DecoBlockVarStrings.lavaTypes.length; i++) registerRender(deco_lava, i);
        for (int i = 0; i < DecoBlockVarStrings.lavaBowlTypes.length; i++) registerRender(deco_lavaBowlColors, i);

        //Marble
        for (int i = 0; i < DecoBlockVarStrings.marbleTypes.length; i++) registerRender(deco_marble, i);

        //Metal
        for (int i = 0; i < DecoBlockVarStrings.metalTypes.length; i++) registerRender(deco_metal, i);
        for (int i = 0; i < DecoBlockVarStrings.metalRobotTypes.length; i++) registerRender(deco_metalRobotColors, i);

        //Stone
        for (int i = 0; i < DecoBlockVarStrings.stoneTypes.length; i++) registerRender(deco_stone, i);
        for (int i = 0; i < DecoBlockVarStrings.stoneMineralsTypes.length; i++)
            registerRender(deco_stoneMineralsColors, i);

        //Glass
     //todo   for (int i = 0; i < DecoBlockVarStrings.clearGlassTypes.length; i++) registerRender(deco_ClearGlass, i);

        //Paneling
       for (int i =0; i<DecoBlockVarStrings.panelingTypes.length; i++) registerRender(deco_paneling, i);
    }

    *//**
     *  -------------------------------------------Do Not Change Below-----------------------------------------------
     *//*

    *//**
     * Register the Item Renderer for a normal Block
     *
     * @param block The block to render as an Item.
     *//*
    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
                Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5)));
    }

    *//**
     * Register a Block with meta Data / Sub Blocks to be rendered as an Item
     * This uses "type=decovar" in the .json files this can be changed to anything as
     * long as it matches the sub block values and the json files.
     *
     * @param block The block to render as an item.
     * @param meta  The meta value of the block.
     *//*
    public static void registerRender(Block block, int meta) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(
                Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "type="+meta));
    }

    *//**
     * Register a block's Sub blocks to the Ore Dictionary
     *
     * @param block The Main Block that has the sub types.
     * @param name  The string of the Ore Dictionary Value.
     *//*
    public static void registerOreDicMeta(Block block, String name) {

        Item item = Item.getItemFromBlock(block);
        ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        block.getSubBlocks(item, null, list);

        for (ItemStack aList : list) OreDictionary.registerOre(name, aList);
    }*/
}
