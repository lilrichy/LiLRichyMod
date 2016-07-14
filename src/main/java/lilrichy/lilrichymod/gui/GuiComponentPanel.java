package lilrichy.lilrichymod.gui;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

import java.util.Map;

/**
 * Created by LiLRichy on 7/11/2016.
 */
public class GuiComponentPanel extends GuiComponentResizableComposite {

    public static final ISlotBackgroundRenderer normalSlot = new ISlotBackgroundRenderer() {
        @Override
        public void render(Gui gui, Slot slot) {
            gui.drawTexturedModalRect(slot.xDisplayPosition - 1, slot.yDisplayPosition - 1, 0, 20, 18, 18);
        }
    };
    public static final ISlotBackgroundRenderer bigSlot = new ISlotBackgroundRenderer() {
        @Override
        public void render(Gui gui, Slot slot) {
            gui.drawTexturedModalRect(slot.xDisplayPosition - 5, slot.yDisplayPosition - 5, 29, 20, 26, 26);
        }
    };
    public static final ISlotBackgroundRenderer noRenderSlot = new ISlotBackgroundRenderer() {
        @Override
        public void render(Gui gui, Slot slot) {
        }
    };
    private static final BoxRenderer BOX_RENDERER = new BoxRenderer(0, 5);
    private final Map<Integer, ISlotBackgroundRenderer> slotRenderers = Maps.newHashMap();
    private final Container container;

    public GuiComponentPanel(int x, int y, int width, int height, Container container) {
        super(x, y, width, height);
        this.container = container;
    }

    public static ISlotBackgroundRenderer coloredSlot(final int color) {
        return new ISlotBackgroundRenderer() {
            @Override
            public void render(Gui gui, Slot slot) {
                RenderUtils.setColor(color);
                gui.drawTexturedModalRect(slot.xDisplayPosition - 1, slot.yDisplayPosition - 1, 0, 20, 18, 18);
                GlStateManager.color(1, 1, 1);
            }
        };
    }

    public void setSlotRenderer(int slotId, ISlotBackgroundRenderer renderer) {
        slotRenderers.put(slotId, renderer);
    }

    @Override
    protected void renderComponentBackground(int x, int y, int mouseX, int mouseY) {
        GlStateManager.color(1, 1, 1);
        bindComponentsSheet();
        BOX_RENDERER.render(this, this.x + x, this.y + y, width, height, 0xFFFFFFFF);
    }

    @Override
    protected void renderComponentForeground(int x, int y, int mouseX, int mouseY) {
        GlStateManager.color(1, 1, 1);
        bindComponentsSheet();

        if (container != null) {
            for (Slot slot : container.inventorySlots) {
                Objects.firstNonNull(slotRenderers.get(slot.slotNumber), normalSlot).render(this, slot);
            }
        }
    }

}