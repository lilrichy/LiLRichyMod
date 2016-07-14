package lilrichy.lilrichymod.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemStack;

/**
 * Created by LiLRichy on 7/10/2016.
 */
public interface ICustomSlot {

    ItemStack onClick(EntityPlayer player, ClickType clickType);

    boolean canDrag();

    boolean canTransferItemsOut();

    boolean canTransferItemsIn();
}