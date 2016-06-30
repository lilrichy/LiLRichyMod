/*
package lilrichy.lilrichymod.blocks.advancedPlayerDetector;


import lilrichy.lilrichymod.inventory.ContainerLiLRichyMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

*/
/**
 * Created by Rich on 11/26/2015.
 *//*

public class ContainerAdvancedDetector extends ContainerLiLRichyMod {
    private final TileEntityAdvancedDetector te;

    public ContainerAdvancedDetector(InventoryPlayer playerInventory, TileEntityAdvancedDetector te) {
        //Inventory slot for Camo
        this.addSlotToContainer(new Slot(te, 0, 9, 11));
        this.addPlayerSlots(playerInventory, 8, 84);
        this.te = te;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return te.isUseableByPlayer(player);
    }

    //Shift Click Support
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot) this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (slotIndex < 1) {
                if (!this.mergeItemStack(itemstack1, 1, 37, true)) {
                    return null;
                }
            } else if (te.getCamouflage(0) == null && itemstack.getItem() instanceof
                    ItemBlock && itemstack.stackSize == 1 && !this.mergeItemStack(itemstack1, 0, 1, false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }
}
*/
