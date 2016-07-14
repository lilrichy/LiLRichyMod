package lilrichy.lilrichymod.inventory;

/**
 * Created by LiLRichy on 7/10/2016.
 */

import net.minecraft.inventory.IInventory;

public interface IInventoryCallBack {
    void onInventoryChanged(IInventory inventory, int slotNumber);
}