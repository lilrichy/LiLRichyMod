package lilrichy.lilrichymod.init;

import lilrichy.lilrichymod.blocks.*;
import lilrichy.lilrichymod.blocks.blockTable.BlockTable;
import lilrichy.lilrichymod.reference.Names;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

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

//----------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------

    public static Block lavaBowl;
    public static Block lavaBowlBlue;
    public static Block lavaBowlGreen;
    public static Block lavaBowlPurple;
    public static Block lavaCracks;
    public static Block lavaDeepFire;
    public static Block lavaPelesLake;
    public static Block lavaSearingGorge;
    public static Block lavaSlumberingVolcano;

//----------------------------------------------------------------------------------------------------------------------

    public static Block marbleBlack;
    public static Block marbleBlancoAurora;
    public static Block marbleBlancoNafin;
    public static Block marbleSpottedBianco;

//----------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------

    public static Block stoneArrangedBricks;
    public static Block stoneBlocks;
    public static Block stoneBlocksDark;
    public static Block stoneCracked;
    public static Block stoneMinerals;
    public static Block stoneMineralsBlue;
    public static Block stoneMineralsOrange;
    public static Block stoneMineralsPurple;

//----------------------------------------------------------------------------------------------------------------------

    public static Block clearGlass;
    public static Block clearGlassBlack;
    public static Block clearGlassBlue;
    public static Block clearGlassBrown;
    public static Block clearGlassCyan;
    public static Block clearGlassGray;
    public static Block clearGlassGreen;
    public static Block clearGlassLightBlue;
    public static Block clearGlassLime;
    public static Block clearGlassMagenta;
    public static Block clearGlassOrange;
    public static Block clearGlassPink;
    public static Block clearGlassPurple;
    public static Block clearGlassRed;
    public static Block clearGlassSilver;
    public static Block clearGlassYellow;

//----------------------------------------------------------------------------------------------------------------------

    public static Block animalWard;
    public static Block mobWard;

    public static Block blockTable;


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

//----------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------

        lavaBowl = new BlockLavaBowl();
        lavaBowlBlue = new BlockLavaBowlBlue();
        lavaBowlGreen = new BlockLavaBowlGreen();
        lavaBowlPurple = new BlockLavaBowlPurple();
        lavaCracks = new BlockLavaCracks();
        lavaDeepFire = new BlockLavaDeepFire();
        lavaPelesLake = new BlockLavaPelesLake();
        lavaSearingGorge = new BlockLavaSearingGorge();
        lavaSlumberingVolcano = new BlockLavaSlumberingVolcano();

//----------------------------------------------------------------------------------------------------------------------

        marbleBlack = new BlockMarbleBlack();
        marbleBlancoAurora = new BlockMarbleBlancoAurora();
        marbleBlancoNafin = new BlockMarbleBlancoNafin();
        marbleSpottedBianco = new BlockMarbleSpottedBianco();

//----------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------

        stoneArrangedBricks = new BlockStoneArrangedBricks();
        stoneBlocks = new BlockStoneBlocks();
        stoneBlocksDark = new BlockStoneBlocksDark();
        stoneCracked = new BlockStoneCracked();
        stoneMinerals = new BlockStoneMinerals();
        stoneMineralsBlue = new BlockStoneMineralsBlue();
        stoneMineralsOrange = new BlockStoneMineralsOrange();
        stoneMineralsPurple = new BlockStoneMineralsPurple();

//----------------------------------------------------------------------------------------------------------------------

        clearGlass = new BlockClearGlass();
        clearGlassBlack = new BlockClearGlassBlack();
        clearGlassBlue = new BlockClearGlassBlue();
        clearGlassBrown = new BlockClearGlassBrown();
        clearGlassCyan = new BlockClearGlassCyan();
        clearGlassGray = new BlockClearGlassGray();
        clearGlassGreen = new BlockClearGlassGreen();
        clearGlassLightBlue = new BlockClearGlassLightBlue();
        clearGlassLime = new BlockClearGlassLime();
        clearGlassMagenta = new BlockClearGlassMagenta();
        clearGlassOrange = new BlockClearGlassOrange();
        clearGlassPink = new BlockClearGlassPink();
        clearGlassPurple = new BlockClearGlassPurple();
        clearGlassRed = new BlockClearGlassRed();
        clearGlassSilver = new BlockClearGlassSilver();
        clearGlassYellow = new BlockClearGlassYellow();

//----------------------------------------------------------------------------------------------------------------------

        animalWard = new BlockAnimalWard();
        mobWard = new BlockMobWard();

        blockTable = new BlockTable();

    }

    public static void register() {
        registerBlock(concrete);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE.getUnlocalizedName(), concrete);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concrete);

        registerBlock(concreteArrangedBricks);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_ARRANGED_BRICKS.getUnlocalizedName(), concreteArrangedBricks);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteArrangedBricks);


        registerBlock(concreteBricks);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_BRICKS.getUnlocalizedName(), concreteBricks);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteBricks);

        registerBlock(concreteBricksDark);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_BRICKS_DARK.getUnlocalizedName(), concreteBricksDark);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteBricksDark);

        registerBlock(concreteFancyBlocks);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_FANCY_BLOCKS.getUnlocalizedName(), concreteFancyBlocks);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteFancyBlocks);

        registerBlock(concreteOldSquares);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_OLD_SQUARES.getUnlocalizedName(), concreteOldSquares);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteOldSquares);

        registerBlock(concreteRocks);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_ROCKS.getUnlocalizedName(), concreteRocks);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteRocks);

        registerBlock(concreteSmallBricks);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_SMALL_BRICKS.getUnlocalizedName(), concreteSmallBricks);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteSmallBricks);

        registerBlock(concreteSmallTexturedSquares);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_SMALL_TEXTURED_SQUARES.getUnlocalizedName(), concreteSmallTexturedSquares);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteSmallTexturedSquares);

        registerBlock(concreteSquares);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_SQUARES.getUnlocalizedName(), concreteSquares);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteSquares);

        registerBlock(concreteTexturedBlocks);
        OreDictionary.registerOre(Reference.ModBlocks.CONCRETE_TEXTURED_BLOCKS.getUnlocalizedName(), concreteTexturedBlocks);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteTexturedBlocks);

//----------------------------------------------------------------------------------------------------------------------        registerBlock(cottageWall);

        registerBlock(cottageWall);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL.getUnlocalizedName(), cottageWall);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWall);

        registerBlock(cottageWallArchedBeam);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL_ARCHED_BEAM.getUnlocalizedName(), cottageWallArchedBeam);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallArchedBeam);

        registerBlock(cottageWallArchedBeamDark);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL_ARCHED_BEAM_DARK.getUnlocalizedName(), cottageWallArchedBeamDark);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallArchedBeamDark);

        registerBlock(cottageWallDark);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL_DARK.getUnlocalizedName(), cottageWallDark);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallDark);

        registerBlock(cottageWallPanelDark);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL_PANEL_DARK.getUnlocalizedName(), cottageWallPanelDark);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallPanelDark);

        registerBlock(cottageWallPanelLight);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL_PANEL_LIGHT.getUnlocalizedName(), cottageWallPanelLight);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallPanelLight);

        registerBlock(cottageWallXDark);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL_X_DARK.getUnlocalizedName(), cottageWallXDark);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallXDark);

        registerBlock(cottageWallXLight);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WALL_X_LIGHT.getUnlocalizedName(), cottageWallXLight);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallXLight);

        registerBlock(cottageWindowDark);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WINDOW_DARK.getUnlocalizedName(), cottageWindowDark);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWindowDark);

        registerBlock(cottageWindowLight);
        OreDictionary.registerOre(Reference.ModBlocks.COTTAGE_WINDOW_LIGHT.getUnlocalizedName(), cottageWindowLight);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWindowLight);

//----------------------------------------------------------------------------------------------------------------------
        registerBlock(lavaBowl);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_BOWL.getUnlocalizedName(), lavaBowl);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaBowl);

        registerBlock(lavaBowlBlue);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_BOWL_BLUE.getUnlocalizedName(), lavaBowlBlue);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaBowlBlue);

        registerBlock(lavaBowlGreen);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_BOWL_GREEN.getUnlocalizedName(), lavaBowlGreen);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaBowlGreen);

        registerBlock(lavaBowlPurple);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_BOWL_PURPLE.getUnlocalizedName(), lavaBowlPurple);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaBowlPurple);

        registerBlock(lavaCracks);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_CRACKS.getUnlocalizedName(), lavaCracks);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaCracks);

        registerBlock(lavaDeepFire);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_DEEP_FIRE.getUnlocalizedName(), lavaDeepFire);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaDeepFire);

        registerBlock(lavaPelesLake);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_PELES_LAKE.getUnlocalizedName(), lavaPelesLake);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaPelesLake);

        registerBlock(lavaSearingGorge);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_SEARING_GORGE.getUnlocalizedName(), lavaSearingGorge);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaSearingGorge);

        registerBlock(lavaSlumberingVolcano);
        OreDictionary.registerOre(Reference.ModBlocks.LAVA_SLUMBERING_VOLCANO.getUnlocalizedName(), lavaSlumberingVolcano);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaSlumberingVolcano);

//----------------------------------------------------------------------------------------------------------------------
        registerBlock(marbleBlack);
        OreDictionary.registerOre(Reference.ModBlocks.MARBLE_BLACK.getUnlocalizedName(), marbleBlack);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlack);

        registerBlock(marbleBlancoAurora);
        OreDictionary.registerOre(Reference.ModBlocks.MARBLE_BLANCO_AURORA.getUnlocalizedName(), marbleBlancoAurora);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlancoAurora);

        registerBlock(marbleBlancoNafin);
        OreDictionary.registerOre(Reference.ModBlocks.MARBLE_BLANCO_NAFIN.getUnlocalizedName(), marbleBlancoNafin);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlancoNafin);

        registerBlock(marbleSpottedBianco);
        OreDictionary.registerOre(Reference.ModBlocks.MARBLE_SPOTTED_BIANCO.getUnlocalizedName(), marbleSpottedBianco);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleSpottedBianco);

//----------------------------------------------------------------------------------------------------------------------
        registerBlock(metalArmor);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_ARMOR.getUnlocalizedName(), metalArmor);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalArmor);

        registerBlock(metalBatteredRobot);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_BATTERED_ROBOT.getUnlocalizedName(), metalBatteredRobot);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBatteredRobot);

        registerBlock(metalBatteredRobotBlue);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_BATTERED_ROBOT_BLUE.getUnlocalizedName(), metalBatteredRobotBlue);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBatteredRobotBlue);

        registerBlock(metalBatteredRobotOrange);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_BATTERED_ROBOT_ORANGE.getUnlocalizedName(), metalBatteredRobotOrange);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBatteredRobotOrange);

        registerBlock(metalBatteredRobotPurple);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_BATTERED_ROBOT_PURPLE.getUnlocalizedName(), metalBatteredRobotPurple);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBatteredRobotPurple);

        registerBlock(metalBrushedSteel);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_BRUSHED_STEEL.getUnlocalizedName(), metalBrushedSteel);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBrushedSteel);

        registerBlock(metalBrushedSteelDark);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_BRUSHED_STEEL_DARK.getUnlocalizedName(), metalBrushedSteelDark);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBrushedSteelDark);

        registerBlock(metalBubbleGrip);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_BUBBLE_GRIP.getUnlocalizedName(), metalBubbleGrip);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBubbleGrip);

        registerBlock(metalLaserEtched);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_LASER_ETCHED.getUnlocalizedName(), metalLaserEtched);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalLaserEtched);

        registerBlock(metalNeedlepointSteel);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_NEEDLEPOINT_STEEL.getUnlocalizedName(), metalNeedlepointSteel);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalNeedlepointSteel);

        registerBlock(metalPlating);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_PLATING.getUnlocalizedName(), metalPlating);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalPlating);

        registerBlock(metalPlatingDark);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_PLATING_DARK.getUnlocalizedName(), metalPlatingDark);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalPlatingDark);

        registerBlock(metalRustedIronGrip);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_RUSTED_IRON_GRIP.getUnlocalizedName(), metalRustedIronGrip);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalRustedIronGrip);

        registerBlock(metalSeafoamTarnish);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_SEAFOAM_TARNISH.getUnlocalizedName(), metalSeafoamTarnish);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalSeafoamTarnish);

        registerBlock(metalStained);
        OreDictionary.registerOre(Reference.ModBlocks.METAL_STAINED.getUnlocalizedName(), metalStained);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalStained);

//----------------------------------------------------------------------------------------------------------------------
        registerBlock(stoneArrangedBricks);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_ARRANGED_BRICKS.getUnlocalizedName(), stoneArrangedBricks);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneArrangedBricks);

        registerBlock(stoneBlocks);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_BLOCKS.getUnlocalizedName(), stoneBlocks);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneBlocks);

        registerBlock(stoneBlocksDark);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_BLOCKS_DARK.getUnlocalizedName(), stoneBlocksDark);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneBlocksDark);

        registerBlock(stoneCracked);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_CRACKED.getUnlocalizedName(), stoneCracked);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneCracked);

        registerBlock(stoneMinerals);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_MINERALS.getUnlocalizedName(), stoneMinerals);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneMinerals);

        registerBlock(stoneMineralsBlue);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_MINERALS_BLUE.getUnlocalizedName(), stoneMineralsBlue);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneMineralsBlue);

        registerBlock(stoneMineralsOrange);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_MINERALS_ORANGE.getUnlocalizedName(), stoneMineralsOrange);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneMineralsOrange);

        registerBlock(stoneMineralsPurple);
        OreDictionary.registerOre(Reference.ModBlocks.STONE_MINERALS_PURPLE.getUnlocalizedName(), stoneMineralsPurple);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneMineralsPurple);

//----------------------------------------------------------------------------------------------------------------------
        registerBlock(clearGlass);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS.getUnlocalizedName(), clearGlass);
        OreDictionary.registerOre("blockGlass", clearGlass);

        registerBlock(clearGlassBlack);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_BLACK.getUnlocalizedName(), clearGlassBlack);
        OreDictionary.registerOre("blockGlass", clearGlassBlack);

        registerBlock(clearGlassBlue);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_BLUE.getUnlocalizedName(), clearGlassBlue);
        OreDictionary.registerOre("blockGlass", clearGlassBlue);

        registerBlock(clearGlassBrown);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_BROWN.getUnlocalizedName(), clearGlassBrown);
        OreDictionary.registerOre("blockGlass", clearGlassBrown);

        registerBlock(clearGlassCyan);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_CYAN.getUnlocalizedName(), clearGlassCyan);
        OreDictionary.registerOre("blockGlass", clearGlassCyan);

        registerBlock(clearGlassGray);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_GRAY.getUnlocalizedName(), clearGlassGray);
        OreDictionary.registerOre("blockGlass", clearGlassGray);

        registerBlock(clearGlassGreen);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_GREEN.getUnlocalizedName(), clearGlassGreen);
        OreDictionary.registerOre("blockGlass", clearGlassGreen);

        registerBlock(clearGlassLightBlue);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_LIGHT_BLUE.getUnlocalizedName(), clearGlassLightBlue);
        OreDictionary.registerOre("blockGlass", clearGlassLightBlue);

        registerBlock(clearGlassLime);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_LIME.getUnlocalizedName(), clearGlassLime);
        OreDictionary.registerOre("blockGlass", clearGlassLime);

        registerBlock(clearGlassMagenta);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_MAGENTA.getUnlocalizedName(), clearGlassMagenta);
        OreDictionary.registerOre("blockGlass", clearGlassMagenta);

        registerBlock(clearGlassOrange);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_ORANGE.getUnlocalizedName(), clearGlassOrange);
        OreDictionary.registerOre("blockGlass", clearGlassOrange);

        registerBlock(clearGlassPink);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_PINK.getUnlocalizedName(), clearGlassPink);
        OreDictionary.registerOre("blockGlass", clearGlassPink);

        registerBlock(clearGlassPurple);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_PURPLE.getUnlocalizedName(), clearGlassPurple);
        OreDictionary.registerOre("blockGlass", clearGlassPurple);

        registerBlock(clearGlassRed);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_RED.getUnlocalizedName(), clearGlassRed);
        OreDictionary.registerOre("blockGlass", clearGlassRed);

        registerBlock(clearGlassSilver);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_SILVER.getUnlocalizedName(), clearGlassSilver);
        OreDictionary.registerOre("blockGlass", clearGlassSilver);

        registerBlock(clearGlassYellow);
        OreDictionary.registerOre(Reference.ModBlocks.CLEAR_GLASS_Yellow.getUnlocalizedName(), clearGlassYellow);
        OreDictionary.registerOre("blockGlass", clearGlassYellow);

//----------------------------------------------------------------------------------------------------------------------

        registerBlock(animalWard);
        registerBlock(mobWard);

        registerBlock(blockTable);
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

//----------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------

        registerRender(lavaBowl);
        registerRender(lavaBowlBlue);
        registerRender(lavaBowlGreen);
        registerRender(lavaBowlPurple);
        registerRender(lavaCracks);
        registerRender(lavaDeepFire);
        registerRender(lavaPelesLake);
        registerRender(lavaSearingGorge);
        registerRender(lavaSlumberingVolcano);

//----------------------------------------------------------------------------------------------------------------------

        registerRender(marbleBlack);
        registerRender(marbleBlancoAurora);
        registerRender(marbleBlancoNafin);
        registerRender(marbleSpottedBianco);

//----------------------------------------------------------------------------------------------------------------------

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

//----------------------------------------------------------------------------------------------------------------------

        registerRender(stoneArrangedBricks);
        registerRender(stoneBlocks);
        registerRender(stoneBlocksDark);
        registerRender(stoneCracked);
        registerRender(stoneMinerals);
        registerRender(stoneMineralsBlue);
        registerRender(stoneMineralsOrange);
        registerRender(stoneMineralsPurple);

//----------------------------------------------------------------------------------------------------------------------

        registerRender(clearGlass);
        registerRender(clearGlassBlack);
        registerRender(clearGlassBlue);
        registerRender(clearGlassBrown);
        registerRender(clearGlassCyan);
        registerRender(clearGlassGray);
        registerRender(clearGlassGreen);
        registerRender(clearGlassLightBlue);
        registerRender(clearGlassLime);
        registerRender(clearGlassMagenta);
        registerRender(clearGlassOrange);
        registerRender(clearGlassPink);
        registerRender(clearGlassPurple);
        registerRender(clearGlassRed);
        registerRender(clearGlassSilver);
        registerRender(clearGlassYellow);

//----------------------------------------------------------------------------------------------------------------------

        registerRender(animalWard);
        registerRender(mobWard);

        registerRender(blockTable);

    }

    public static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    private static void registerBlock(Block block) {
        GameRegistry.register(block);
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        GameRegistry.register(itemBlock);
    }
}