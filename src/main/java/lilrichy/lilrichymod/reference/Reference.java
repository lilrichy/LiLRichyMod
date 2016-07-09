package lilrichy.lilrichymod.reference;

public class Reference {

    public static final String MOD_ID = "lilrichymod";
    public static final String MOD_NAME = "LiLRichyMod";

    //Version 1.x = 1.7.10
    //Version 2.x = 1.8.9
    //Version 3.x = 1.9.4
    public static final String MOD_VERSION = "3.0.1";

    public static final String ACCEPTED_VERSIONS = "[1.9.4]";

    public static final String CLIENT_PROXY_CLASS = "lilrichy.lilrichymod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "lilrichy.lilrichymod.proxy.ServerProxy";

    //Items
    public enum ModItems {

        CONCRETE_MIX("concreteMix", "ItemConcreteMix"),
        ESSENCE_OF_BEARD("essenceOfBeard", "ItemEssenceOfBeard"),
        BEARDED_AZALEA_SEED("beardedAzaleaSeed", "ItemBeardedAzaleaSeed"),
        CRUSHED_CONCRETE("crushedConcrete", "ItemCrushedConcrete");

        private String unlocalizedName;
        private String registryName;

        ModItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }

    //Blocks
    public enum ModBlocks {

        CONCRETE("concrete", "BlockConcrete"),
        CONCRETE_ARRANGED_BRICKS("concreteArrangedBricks", "BlockConcreteArrangedBricks"),
        CONCRETE_BRICKS("concreteBricks", "BlockConcreteBricks"),
        CONCRETE_BRICKS_DARK("concreteBricksDark", "BlockConcreteBricksDark"),
        CONCRETE_FANCY_BLOCKS("concreteFancyBlocks", "BlockConcreteFancyBlocks"),
        CONCRETE_OLD_SQUARES("concreteOldSquares", "BlockConcreteOldSquares"),
        CONCRETE_ROCKS("concreteRocks", "BlockConcreteRocks"),
        CONCRETE_SMALL_BRICKS("concreteSmallBricks", "BlockConcreteSmallBricks"),
        CONCRETE_SMALL_TEXTURED_SQUARES("concreteSmallTexturedSquares", "BlockConcreteSmallTexturedSquares"),
        CONCRETE_SQUARES("concreteSquares", "BlockConcreteSquares"),
        CONCRETE_TEXTURED_BLOCKS("concreteTexturedBlocks", "BlockConcreteTexturedBlocks"),

        COTTAGE_WALL("cottageWall", "BlockCottageWall"),
        COTTAGE_WALL_ARCHED_BEAM("cottageWallArchedBeam", "BlockCottageWallArchedBeam"),
        COTTAGE_WALL_ARCHED_BEAM_DARK("cottageWallArchedBeamDark", "BlockCottageWallArchedBeamDark"),
        COTTAGE_WALL_DARK("cottageWallDark", "BlockCottageWallDark"),
        COTTAGE_WALL_PANEL_DARK("cottageWallPanelDark", "BlockCottageWallPanelDark"),
        COTTAGE_WALL_PANEL_LIGHT("cottageWallPanelLight", "BlockCottageWallPanelLight"),
        COTTAGE_WALL_X_DARK("cottageWallXDark", "BlockCottageWallXDark"),
        COTTAGE_WALL_X_LIGHT("cottageWallXLight", "BlockCottageWallXLight"),
        COTTAGE_WINDOW_DARK("cottageWindowDark", "BlockCottageWindowDark"),
        COTTAGE_WINDOW_LIGHT("cottageWindowLight", "BlockCottageWindowLight"),

        LAVA_BOWL("lavaBowl", "BlockLavaBowl"),
        LAVA_BOWL_BLUE("lavaBowlBlue", "BlockLavaBowlBlue"),
        LAVA_BOWL_GREEN("lavaBowlGreen", "BlockLavaBowlGreen"),
        LAVA_BOWL_PURPLE("lavaBowlPurple", "BlockLavaBowlPurple"),
        LAVA_CRACKS("lavaCracks", "BlockLavaCracks"),
        LAVA_DEEP_FIRE("lavaDeepFire", "BlockLavaDeepFire"),
        LAVA_PELES_LAKE("lavaPelesLake", "BlockLavaPelesLake"),
        LAVA_SEARING_GORGE("lavaSearingGorge", "BlockLavaSearingGorge"),
        LAVA_SLUMBERING_VOLCANO("lavaSlumberingVolcano", "BlockLavaSlumberingVolcano"),

        MARBLE_BLACK("marbleBlack", "BlockMarbleBlack"),
        MARBLE_BLANCO_AURORA("marbleBlancoAurora", "BlockMarbleBlancoAurora"),
        MARBLE_BLANCO_NAFIN("marbleBlancoNafin", "BlockMarbleBlancoNafin"),
        MARBLE_SPOTTED_BIANCO("marbleSpottedBianco", "BlockMarbleSpottedBianco"),

        METAL_ARMOR("metalArmor", "BlockMetalArmor"),
        METAL_BATTERED_ROBOT("metalBatteredRobot", "BlockMetalBatteredRobot"),
        METAL_BATTERED_ROBOT_BLUE("metalBatteredRobotBlue", "BlockMetalBatteredRobotBlue"),
        METAL_BATTERED_ROBOT_ORANGE("metalBatteredRobotOrange", "BlockMetalBatteredRobotOrange"),
        METAL_BATTERED_ROBOT_PURPLE("metalBatteredRobotPurple", "BlockMetalBatteredRobotPurple"),
        METAL_BRUSHED_STEEL("metalBrushedSteel", "BlockMetalBrushedSteel"),
        METAL_BRUSHED_STEEL_DARK("metalBrushedSteelDark", "BlockMetalBrushedSteelDark"),
        METAL_BUBBLE_GRIP("metalBubbleGrip", "BlockMetalBubbleGrip"),
        METAL_LASER_ETCHED("metalLaserEtched", "BlockMetalLaserEtched"),
        METAL_NEEDLEPOINT_STEEL("metalNeedlepointSteel", "BlockMetalNeedlepointSteel"),
        METAL_PLATING("metalPlating", "BlockMetalPlating"),
        METAL_PLATING_DARK("metalPlatingDark", "BlockMetalPlatingDark"),
        METAL_RUSTED_IRON_GRIP("metalRustedIronGrip", "BlockMetalRustedIronGrip"),
        METAL_SEAFOAM_TARNISH("metalSeafoamTarnish", "BlockMetalSeafoamTarnish"),
        METAL_STAINED("metalStained", "BlockMetalStained"),

        STONE_ARRANGED_BRICKS("stoneArrangedBricks", "BlockStoneArrangedBricks"),
        STONE_BLOCKS("stoneBlocks", "BlockStoneBlocks"),
        STONE_BLOCKS_DARK("stoneBlocksDark", "BlockStoneBlocksDark"),
        STONE_CRACKED("stoneCracked", "BlockStoneCracked"),
        STONE_MINERALS("stoneMinerals", "BlockStoneMinerals"),
        STONE_MINERALS_BLUE("stoneMineralsBlue", "BlockStoneMineralsBlue"),
        STONE_MINERALS_ORANGE("stoneMineralsOrange", "BlockStoneMineralsOrange"),
        STONE_MINERALS_PURPLE("stoneMineralsPurple", "BlockStoneMineralsPurple"),

        CLEAR_GLASS("clearGlass", "BlockClearGlass"),
        CLEAR_GLASS_BLACK("clearGlassBlack", "BlockClearGlassBlack"),
        CLEAR_GLASS_BLUE("clearGlassBlue", "BlockClearGlassBlue"),
        CLEAR_GLASS_BROWN("clearGlassBrown", "BlockClearGlassBrown"),
        CLEAR_GLASS_CYAN("clearGlassCyan", "BlockClearGlassCyan"),
        CLEAR_GLASS_GRAY("clearGlassGray", "BlockClearGlassGray"),
        CLEAR_GLASS_GREEN("clearGlassGreen", "BlockClearGlassGreen"),
        CLEAR_GLASS_LIGHT_BLUE("clearGlassLightBlue", "BlockClearGlassLightBlue"),
        CLEAR_GLASS_LIME("clearGlassLime", "BlockClearGlassLime"),
        CLEAR_GLASS_MAGENTA("clearGlassMagenta", "BlockClearGlassMagenta"),
        CLEAR_GLASS_ORANGE("clearGlassOrange", "BlockClearGlassOrange"),
        CLEAR_GLASS_PINK("clearGlassPink", "BlockClearGlassPink"),
        CLEAR_GLASS_PURPLE("clearGlassPurple", "BlockClearGlassPurple"),
        CLEAR_GLASS_RED("clearGlassRed", "BlockClearGlassRed"),
        CLEAR_GLASS_SILVER("clearGlassSilver", "BlockClearGlassSilver"),
        CLEAR_GLASS_Yellow("clearGlassYellow", "BlockClearGlassYellow"),

        CHARCOAL_BLOCK("charcoalBlock", "BlockCharcoalBlock"),

        STONE_LEVER("stoneLever", "BlockStoneLever"),
        NETHER_BRICK_LEVER("netherBrickLever", "BlockNetherBrickLever"),
        IRON_LEVER("ironLever", "BlockIronLever"),
        OBSIDIAN_LEVER("obsidianLever", "BlockObsidianLever"),
        STONE_BRICK_LEVER("stoneBrickLever", "BlockStoneBrickLever"),


        ANIMAL_WARD("animalWard", "BlockAnimalWard"),
        MOB_WARD("mobWard", "BlockMobWard"),

        BLOCK_TABLE("blockTable", "BlockBlockTable"),

        BEARDED_AZALEA("beardedAzalea", "BlockBeardedAzalea"),

        PLAYER_DETECTOR("playerDetector", "BlockPlayerDetector"),
        PLAYER_DETECTOR_ACTIVATED("playerDetectorActivated", "BlockPlayerDetectorActivated");

        private String unlocalizedName;
        private String registryName;

        ModBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }
        public String getRegistryName() {
            return registryName;
        }
    }
}
