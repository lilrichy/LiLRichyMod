package lilrichy.lilrichymod.init;

import lilrichy.lilrichymod.blocks.BlockCharcoalBlock;
import lilrichy.lilrichymod.blocks.BlockStoneLever;
import lilrichy.lilrichymod.blocks.blockTable.BlockTable;
import lilrichy.lilrichymod.blocks.blockTable.TileEntityBlockTable;
import lilrichy.lilrichymod.blocks.crops.BeardedAzalea;
import lilrichy.lilrichymod.blocks.decorativeBlocks.clearGlass.*;
import lilrichy.lilrichymod.blocks.decorativeBlocks.concrete.*;
import lilrichy.lilrichymod.blocks.decorativeBlocks.cottage.*;
import lilrichy.lilrichymod.blocks.decorativeBlocks.lava.*;
import lilrichy.lilrichymod.blocks.decorativeBlocks.marble.BlockMarbleBlack;
import lilrichy.lilrichymod.blocks.decorativeBlocks.marble.BlockMarbleBlancoAurora;
import lilrichy.lilrichymod.blocks.decorativeBlocks.marble.BlockMarbleBlancoNafin;
import lilrichy.lilrichymod.blocks.decorativeBlocks.marble.BlockMarbleSpottedBianco;
import lilrichy.lilrichymod.blocks.decorativeBlocks.metal.*;
import lilrichy.lilrichymod.blocks.decorativeBlocks.stone.*;
import lilrichy.lilrichymod.blocks.playerDetector.BlockPlayerDetector;
import lilrichy.lilrichymod.blocks.playerDetector.TileEntityPlayerDetector;
import lilrichy.lilrichymod.blocks.wards.BlockAnimalWard;
import lilrichy.lilrichymod.blocks.wards.BlockMobWard;
import lilrichy.lilrichymod.blocks.wards.TileEntityAnimalWard;
import lilrichy.lilrichymod.blocks.wards.TileEntityMobWard;
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

    public static Block concrete = new BlockConcrete();
    public static Block concreteArrangedBricks = new BlockConcreteArrangedBricks();
    public static Block concreteBricks = new BlockConcreteBricks();
    public static Block concreteBricksDark = new BlockConcreteBricksDark();
    public static Block concreteFancyBlocks = new BlockConcreteFancyBlocks();
    public static Block concreteOldSquares = new BlockConcreteOldSquares();
    public static Block concreteRocks = new BlockConcreteRocks();
    public static Block concreteSmallBricks = new BlockConcreteSmallBricks();
    public static Block concreteSmallTexturedSquares = new BlockConcreteSmallTexturedSquares();
    public static Block concreteSquares = new BlockConcreteSquares();
    public static Block concreteTexturedBlocks = new BlockConcreteTexturedBlocks();

//----------------------------------------------------------------------------------------------------------------------

    public static Block cottageWall = new BlockCottageWall();
    public static Block cottageWallArchedBeam = new BlockCottageWallArchedBeam();
    public static Block cottageWallArchedBeamDark = new BlockCottageWallArchedBeamDark();
    public static Block cottageWallDark = new BlockCottageWallDark();
    public static Block cottageWallPanelDark = new BlockCottageWallPanelDark();
    public static Block cottageWallPanelLight = new BlockCottageWallPanelLight();
    public static Block cottageWallXDark = new BlockCottageWallXDark();
    public static Block cottageWallXLight = new BlockCottageWallXLight();
    public static Block cottageWindowDark = new BlockCottageWindowDark();
    public static Block cottageWindowLight = new BlockCottageWindowLight();
//----------------------------------------------------------------------------------------------------------------------


    public static Block lavaBowl = new BlockLavaBowl();
    public static Block lavaBowlBlue = new BlockLavaBowlBlue();
    public static Block lavaBowlGreen = new BlockLavaBowlGreen();
    public static Block lavaBowlPurple = new BlockLavaBowlPurple();
    public static Block lavaCracks = new BlockLavaCracks();
    public static Block lavaDeepFire = new BlockLavaDeepFire();
    public static Block lavaPelesLake = new BlockLavaPelesLake();
    public static Block lavaSearingGorge = new BlockLavaSearingGorge();
    public static Block lavaSlumberingVolcano = new BlockLavaSlumberingVolcano();

//----------------------------------------------------------------------------------------------------------------------

    public static Block marbleBlack = new BlockMarbleBlack();
    public static Block marbleBlancoAurora = new BlockMarbleBlancoAurora();
    public static Block marbleBlancoNafin = new BlockMarbleBlancoNafin();
    public static Block marbleSpottedBianco = new BlockMarbleSpottedBianco();

//----------------------------------------------------------------------------------------------------------------------

    public static Block metalArmor = new BlockMetalArmor();
    public static Block metalBatteredRobot = new BlockMetalBatteredRobot();
    public static Block metalBatteredRobotBlue = new BlockMetalBatteredRobotBlue();
    public static Block metalBatteredRobotOrange = new BlockMetalBatteredRobotOrange();
    public static Block metalBatteredRobotPurple = new BlockMetalBatteredRobotPurple();
    public static Block metalBrushedSteel = new BlockMetalBrushedSteel();
    public static Block metalBrushedSteelDark = new BlockMetalBrushedSteelDark();
    public static Block metalBubbleGrip = new BlockMetalBubbleGrip();
    public static Block metalLaserEtched = new BlockMetalLaserEtched();
    public static Block metalNeedlepointSteel = new BlockMetalNeedlepointSteel();
    public static Block metalPlating = new BlockMetalPlating();
    public static Block metalPlatingDark = new BlockMetalPlatingDark();
    public static Block metalRustedIronGrip = new BlockMetalRustedIronGrip();
    public static Block metalSeafoamTarnish = new BlockMetalSeafoamTarnish();
    public static Block metalStained = new BlockMetalStained();

//----------------------------------------------------------------------------------------------------------------------

    public static Block stoneArrangedBricks = new BlockStoneArrangedBricks();
    public static Block stoneBlocks = new BlockStoneBlocks();
    public static Block stoneBlocksDark = new BlockStoneBlocksDark();
    public static Block stoneCracked = new BlockStoneCracked();
    public static Block stoneMinerals = new BlockStoneMinerals();
    public static Block stoneMineralsBlue = new BlockStoneMineralsBlue();
    public static Block stoneMineralsOrange = new BlockStoneMineralsOrange();
    public static Block stoneMineralsPurple = new BlockStoneMineralsPurple();

//----------------------------------------------------------------------------------------------------------------------

    public static Block clearGlass = new BlockClearGlass();
    public static Block clearGlassBlack = new BlockClearGlassBlack();
    public static Block clearGlassBlue = new BlockClearGlassBlue();
    public static Block clearGlassBrown = new BlockClearGlassBrown();
    public static Block clearGlassCyan = new BlockClearGlassCyan();
    public static Block clearGlassGray = new BlockClearGlassGray();
    public static Block clearGlassGreen = new BlockClearGlassGreen();
    public static Block clearGlassLightBlue = new BlockClearGlassLightBlue();
    public static Block clearGlassLime = new BlockClearGlassLime();
    public static Block clearGlassMagenta = new BlockClearGlassMagenta();
    public static Block clearGlassOrange = new BlockClearGlassOrange();
    public static Block clearGlassPink = new BlockClearGlassPink();
    public static Block clearGlassPurple = new BlockClearGlassPurple();
    public static Block clearGlassRed = new BlockClearGlassRed();
    public static Block clearGlassSilver = new BlockClearGlassSilver();
    public static Block clearGlassYellow = new BlockClearGlassYellow();

//----------------------------------------------------------------------------------------------------------------------

    public static Block charcoalBlock = new BlockCharcoalBlock();
    public static Block stoneLever = new BlockStoneLever().setHardness(0.5F);

    public static Block animalWard = new BlockAnimalWard();
    public static Block mobWard = new BlockMobWard();
    public static Block blockTable = new BlockTable();
    public static Block playerDetector = new BlockPlayerDetector();
//    public static Block playerDetectorActivated = new BlockPlayerDetector(true,Reference.ModBlocks.PLAYER_DETECTOR_ACTIVATED.getUnlocalizedName(),
//            Reference.ModBlocks.PLAYER_DETECTOR_ACTIVATED.getRegistryName());
//----------------------------------------------------------------------------------------------------------------------

    public static BeardedAzalea beardedAzalea = new BeardedAzalea();

//----------------------------------------------------------------------------------------------------------------------


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

//----------------------------------------------------------------------------------------------------------------------        

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

        registerBlock(charcoalBlock);
        OreDictionary.registerOre("blockCharcoal", charcoalBlock);

        registerBlock(stoneLever);
        OreDictionary.registerOre("blockLever", stoneLever);

        registerBlock(animalWard);
        GameRegistry.registerTileEntity(TileEntityAnimalWard.class, "lilrichymod:TileEntityAnimalWard");

        registerBlock(mobWard);
        GameRegistry.registerTileEntity(TileEntityMobWard.class, "lilrichymod:TileEntityMobWard");

        registerBlock(blockTable);
        GameRegistry.registerTileEntity(TileEntityBlockTable.class, "lilrichymod:TileEntityBlockTable");

        registerBlock(playerDetector);
//        registerBlock(playerDetectorActivated);
        GameRegistry.registerTileEntity(TileEntityPlayerDetector.class, "lilrichy:TileEntityPlayerDetector");

//----------------------------------------------------------------------------------------------------------------------

        registerBlock(beardedAzalea);

    }

//----------------------------------------------------------------------------------------------------------------------

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

        registerRender(charcoalBlock);
        registerRender(stoneLever);

        registerRender(animalWard);
        registerRender(mobWard);
        registerRender(blockTable);
        registerRender(playerDetector);
//        registerRender(playerDetectorActivated);

//----------------------------------------------------------------------------------------------------------------------

        registerRender(beardedAzalea);

    }

//----------------------------------------------------------------------------------------------------------------------

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