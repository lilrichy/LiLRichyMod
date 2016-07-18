package lilrichy.lilrichymod.init;


import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.items.ItemConcreteMix;
import lilrichy.lilrichymod.items.ItemCrushedConcrete;
import lilrichy.lilrichymod.items.ItemEssenceOfBeard;
import lilrichy.lilrichymod.items.ItemLampBase;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/19/2015.
 */

public class ModItems {

    public static Item concreteMix;
    public static Item beardedAzaleaSeed;
    public static Item crushedConcrete;
    public static Item essenceOfBeard;
    public static Item lampBase;

    public static void init() {

        concreteMix = new ItemConcreteMix();
        beardedAzaleaSeed = new ItemSeeds(ModBlocks.beardedAzalea, Blocks.FARMLAND).setCreativeTab(CreativeTabLiLRichyMod.LR_Tab).setUnlocalizedName(Reference.ModItems.BEARDED_AZALEA_SEED.getUnlocalizedName())
        .setRegistryName(Reference.ModItems.BEARDED_AZALEA_SEED.getRegistryName());
        crushedConcrete = new ItemCrushedConcrete();
        essenceOfBeard = new ItemEssenceOfBeard();
        lampBase = new ItemLampBase();
    }

    public static void register() {
        GameRegistry.register(concreteMix);
        GameRegistry.register(beardedAzaleaSeed);
        GameRegistry.register(crushedConcrete);
        GameRegistry.register(essenceOfBeard);
        GameRegistry.register(lampBase);

    }

    public static void registerRenders() {
        registerRender(concreteMix);
        registerRender(beardedAzaleaSeed);
        registerRender(crushedConcrete);
        registerRender(essenceOfBeard);
        registerRender(lampBase);

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}