package lilrichy.lilrichymod.blocks.decorativeBlocks;


import lilrichy.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Rich on 12/2/2015.
 */
public class DecorativeBlocks extends Block {
    private final String blockToolTip;
    private final String blockCraftTip;

    //Todo All Blocks need textures, blockstates, models, and item textures
    //Constructor with Tool tip and Crafting tip string
    public DecorativeBlocks(String name, Material material, String toolTip, String craftTip) {
        super(material);
        this.setHardness(2f);
       //todo this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setUnlocalizedName(name);
        this.blockToolTip = toolTip;
        this.blockCraftTip = craftTip;
    }

    //Constructor with Tool tip
    public DecorativeBlocks(String name, Material material, String toolTip) {
        super(material);
        this.setHardness(2f);
        //todo this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setUnlocalizedName(name);
        this.blockToolTip = toolTip;
        this.blockCraftTip = null;
    }

    //Constructor with no tool tips
    public DecorativeBlocks(String name, Material material) {
        super(material);
        this.setHardness(2f);
        //todo this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setUnlocalizedName(name);
        this.blockToolTip = null;
        this.blockCraftTip = null;
    }



    public static String getToolTip(Block block) {
        if (block instanceof DecorativeBlocks) {
            DecorativeBlocks n = (DecorativeBlocks) block;
            return n.blockToolTip;
        } else return null;
    }

    public static Object getToolTip2(Block block) {
        if (block instanceof DecorativeBlocks) {
            DecorativeBlocks n = (DecorativeBlocks) block;
            return n.blockCraftTip;
        } else return null;
    }
}
