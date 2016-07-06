package lilrichy.lilrichymod.blocks.decorativeBlocks.concrete;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.init.ModItems;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockConcrete extends Block {
    public BlockConcrete() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.CONCRETE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CONCRETE.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }

    //Overrides to drop different item then block
    @Override
    public int quantityDropped(Random rand) {
        return 4;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.crushedConcrete;
    }
}
