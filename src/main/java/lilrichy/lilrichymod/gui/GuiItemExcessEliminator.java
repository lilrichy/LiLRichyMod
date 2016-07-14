package lilrichy.lilrichymod.gui;

import lilrichy.lilrichymod.inventory.ContainerItemExcessEliminator;

/**
 * Created by LiLRichy on 7/10/2016.
 */
public class GuiItemExcessEliminator extends BaseGuiContainer<ContainerItemExcessEliminator> {

    public GuiItemExcessEliminator(ContainerItemExcessEliminator container) {
        super(container, 176, 137, "item.lilrichymod.ItemExcessEliminator.name");
    }

    @Override
    protected BaseComposite createRoot() {
        GuiComponentPanel panel = new GuiComponentPanel(0, 0, xSize, ySize, getContainer());
        panel.setSlotRenderer(0, GuiComponentPanel.bigSlot);
        return panel;
    }

}