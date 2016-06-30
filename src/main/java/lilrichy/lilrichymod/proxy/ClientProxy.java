package lilrichy.lilrichymod.proxy;


import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.init.ModItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Rich on 11/19/2015.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void init() {

        //Item Renderer
        ModItems.registerRenders();

        //Block Renderer
        ModBlocks.registerRenders();
    }
}
