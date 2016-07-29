package lilrichy.lilrichymod.proxy;


import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.init.ModItems;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Rich on 11/19/2015.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        ModelLoader.setCustomStateMapper(ModBlocks.reinforcedObsidianDoor,
                (new StateMap.Builder()).ignore(new IProperty[]{BlockDoor.POWERED}).build());
    }

    @Override
    public void init() {

        //Item Renderer
        ModItems.registerRenders();

        //Block Renderer
        ModBlocks.registerRenders();
    }
}
