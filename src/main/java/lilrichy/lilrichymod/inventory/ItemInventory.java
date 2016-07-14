package lilrichy.lilrichymod.inventory;

import com.google.common.base.Preconditions;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by LiLRichy on 7/10/2016.
 */
public class ItemInventory extends GenericInventory {

    public static final String TAG_INVENTORY = "inventory";

    protected final ItemStack containerStack;

    public ItemInventory(ItemStack containerStack, int size) {
        super("", false, size);
        Preconditions.checkNotNull(containerStack);
        this.containerStack = containerStack;
        final NBTTagCompound tag = getItemTag(containerStack);
        readFromNBT(getInventoryTag(tag));

    }

    public static NBTTagCompound getInventoryTag(NBTTagCompound tag) {
        return tag.getCompoundTag(TAG_INVENTORY);
    }

    public static NBTTagCompound getItemTag(ItemStack stack) {
        NBTTagCompound result = stack.getTagCompound();
        if (result == null) {
            result = new NBTTagCompound();
            stack.setTagCompound(result);
        }
        return result;
    }

    @Override
    public void onInventoryChanged(int slotNumber) {
        super.onInventoryChanged(slotNumber);

        NBTTagCompound tag = getItemTag(containerStack);
        NBTTagCompound inventoryTag = getInventoryTag(tag);
        writeToNBT(inventoryTag);
        tag.setTag(TAG_INVENTORY, inventoryTag);
        containerStack.setTagCompound(tag);
    }

}