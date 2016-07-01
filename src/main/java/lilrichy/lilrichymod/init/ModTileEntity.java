package lilrichy.lilrichymod.init;


import lilrichy.lilrichymod.blocks.blockTable.TileEntityBlockTable;
import lilrichy.lilrichymod.reference.Names;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/23/2015.
 */

public class ModTileEntity {

  //  public static final BlockPlayerDetector playerDetector = new BlockPlayerDetector(Material.ANVIL);
  //  public static final BlockAdvancedDetector advancedDetector = new BlockAdvancedDetector(Material.ANVIL);
  //  public static final BlockTable blockTable = new BlockTable(Material.ROCK);
  //  public static final BlockLectern lectern = new BlockLectern();

    public static void Init() {
//        if (ConfigurationHandler.loadPlayerDetector) {
//            GameRegistry.registerBlock(playerDetector, Names.Blocks.PLAYER_DETECTOR);
//            GameRegistry.registerTileEntity(TEPlayerDetector.class, Names.TileEntities.PLAYER_DETECTOR);
//        }
//
//        if (ConfigurationHandler.loadAdvancedDetector) {
//            GameRegistry.registerBlock(advancedDetector, Names.Blocks.ADVANCED_DETECTOR);
//            GameRegistry.registerTileEntity(TileEntityAdvancedDetector.class, Names.TileEntities.ADVANCED_DETECTOR);
//        }
//
//
//        GameRegistry.registerBlock(lectern, Names.Models.LECTERN);
//        GameRegistry.registerTileEntity(TileEntityLectern.class, Names.Models.LECTERN);


       // GameRegistry.registerBlock(blockTable, blockTable.getUnlocalizedName().substring(5));
        GameRegistry.registerTileEntity(TileEntityBlockTable.class, Names.Models.BLOCK_TABLE);

        //Lectern
//        GameRegistry.registerBlock(lectern, Names.Models.LECTERN);
//        GameRegistry.registerTileEntity(TileEntityLectern.class, Names.Models.LECTERN);


    }

    public static void registerRenders() {
     //   registerRender(blockTable);
        //registerRender(lectern);
      //  TileEntitySpecialRenderer renderLectern = new LecternRender();
      //  ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLectern.class, renderLectern);
        //MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModTileEntity.lectern), new ItemRenderLectern(renderLectern, new TileEntityLectern()));

    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
                Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5)));
    }
}
