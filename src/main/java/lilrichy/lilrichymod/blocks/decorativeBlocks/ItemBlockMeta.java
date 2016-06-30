package lilrichy.lilrichymod.blocks.decorativeBlocks;

/**
 * Created by LiLRichy on 2/15/2016.
 */


import lilrichy.lilrichymod.handler.ConfigurationHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class ItemBlockMeta extends ItemBlock {
    public ItemBlockMeta(Block block) {
        super(block);
        if (!(block instanceof IMetaBlockName)) {
            throw new IllegalArgumentException(String.format("The given Block %s is not an instance of ISpecialBlockName!", block.getUnlocalizedName()));
        }
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + "." + ((IMetaBlockName) this.block).getSpecialName(stack);
    }

    //Adds tool tips to Blocks used for Crafting tips and Made By tips.
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean show) {
        //Decorative Blocks
        if (block != null && DecorativeBlocks.getToolTip(block) != null) list.add(DecorativeBlocks.getToolTip(block));
        if (block != null && DecorativeBlocks.getToolTip2(block) != null) list.add(DecorativeBlocks.getToolTip2(block));

        //Set to use for debugging - will show OreDictionary values in tool tips.
        if (ConfigurationHandler.debugMessages) {
            int[] l = OreDictionary.getOreIDs(stack);
            list.add("\u00a7a" + "Ore Dictionary Names:");
            for (int aL : l) list.add("  -" + OreDictionary.getOreName(aL));

            list.add("\u00a7a" + "Damage: " + stack.getItemDamage());
            list.add("\u00a7a" + "Meta: " + stack.getMetadata());
        }


    }
}
