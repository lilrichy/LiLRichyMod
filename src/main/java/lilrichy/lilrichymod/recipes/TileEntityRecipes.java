package lilrichy.lilrichymod.recipes;

import lilrichy.lilrichymod.init.ModBlocks;
import lilrichy.lilrichymod.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class TileEntityRecipes {
    public static void tileEntityRecipes() {

        //Wards
        GameRegistry.addRecipe(new ItemStack(ModBlocks.animalWard, 1), "cwb", "wew", "mwp",
                'c', new ItemStack(Items.CHICKEN), 'w', new ItemStack(Blocks.WOOL), 'b', new ItemStack(Items.BEEF),
                'e', new ItemStack(ModItems.essenceOfBeard), 'm', new ItemStack(Items.MUTTON), 'p', new ItemStack(Items.PORKCHOP));

        GameRegistry.addRecipe(new ItemStack(ModBlocks.mobWard, 1), "pmg", "ded", "sfb",
                'p', new ItemStack(Items.ENDER_PEARL), 'm', new ItemStack(Items.EMERALD),
                'd', new ItemStack(Blocks.DIAMOND_BLOCK), 'g', new ItemStack(Items.GUNPOWDER),
                'e', new ItemStack(ModItems.essenceOfBeard), 's', new ItemStack(Items.SPIDER_EYE),
                'f', new ItemStack(Items.ROTTEN_FLESH), 'b', new ItemStack(Items.BONE));

        //Block Table
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTable, 1), " c ", "iei", "ppp",
                'p', new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE), 'c', new ItemStack(ModBlocks.concrete),
                'e', new ItemStack(ModItems.essenceOfBeard), 'i', new ItemStack(Items.IRON_INGOT));


        //Player Detector
        GameRegistry.addRecipe(new ItemStack(ModBlocks.playerDetector, 1), "ici", "ctc", "ici",
                'i', new ItemStack(Items.IRON_INGOT), 'c', new ItemStack(Items.COMPARATOR), 't', new ItemStack(Blocks.REDSTONE_TORCH));

        // TODO: 6/29/2016
        /*
        //Advanced Detector
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.advancedDetector, 1), "idi", "dtd", "idi",
                'i', new ItemStack(Items.gold_ingot), 'd', new ItemStack(Items.diamond), 't', new ItemStack(ModTileEntity.playerDetector));


        //Lectern
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.lectern, 1), "sss", " p ", " s ",
                's', new ItemStack(Blocks.wooden_slab), 'p', new ItemStack(Blocks.planks));*/
    }
}
