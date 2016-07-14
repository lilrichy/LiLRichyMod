package lilrichy.lilrichymod.gui;

import net.minecraft.client.gui.Gui;
import net.minecraft.inventory.Slot;

/**
 * Created by LiLRichy on 7/11/2016.
 */
public interface ISlotBackgroundRenderer {
    void render(Gui gui, Slot slot);
}