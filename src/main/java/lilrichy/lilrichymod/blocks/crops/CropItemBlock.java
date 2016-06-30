package lilrichy.lilrichymod.blocks.crops;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Rich on 12/5/2015.
 */

public class CropItemBlock extends ItemBlock {
    public static Block block;

    public CropItemBlock(Block block) {
        super(block);
        CropItemBlock.block = block;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean show) {
      //todo  if (block != null && block instanceof BeardedAzalea) list.add("Designed By: Aaeos");
    }
}
