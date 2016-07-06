package lilrichy.lilrichymod.blocks.decorativeBlocks.metal;

import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import lilrichy.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by richa on 6/29/2016.
 */
public class BlockMetalBatteredRobotBlue extends Block {
    public BlockMetalBatteredRobotBlue() {
        super(Material.ROCK);
        setUnlocalizedName(Reference.ModBlocks.METAL_BATTERED_ROBOT_BLUE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.METAL_BATTERED_ROBOT_BLUE.getRegistryName());
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2f);
        this.setSoundType(SoundType.STONE);

    }
}
