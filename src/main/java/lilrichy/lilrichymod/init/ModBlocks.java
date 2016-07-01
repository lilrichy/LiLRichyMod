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

    public static Block animalWard;
    public static Block mobWard;


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

        animalWard = new BlockAnimalWard();
        mobWard = new BlockMobWard();

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

        registerBlock(clearGlass);
        registerBlock(clearGlassBlack);
        registerBlock(clearGlassBlue);
        registerBlock(clearGlassBrown);
        registerBlock(clearGlassCyan);
        registerBlock(clearGlassGray);
        registerBlock(clearGlassGreen);
        registerBlock(clearGlassLightBlue);
        registerBlock(clearGlassLime);
        registerBlock(clearGlassMagenta);
        registerBlock(clearGlassOrange);
        registerBlock(clearGlassPink);
        registerBlock(clearGlassPurple);
        registerBlock(clearGlassRed);
        registerBlock(clearGlassSilver);
        registerBlock(clearGlassYellow);

        registerBlock(animalWard);
        registerBlock(mobWard);
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

        registerRender(animalWard);
        registerRender(mobWard);

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