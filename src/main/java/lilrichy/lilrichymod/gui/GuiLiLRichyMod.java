package lilrichy.lilrichymod.gui;

import lilrichy.lilrichymod.reference.Reference;
import lilrichy.lilrichymod.reference.Colors;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Rich on 11/27/2015.
 */
public abstract class GuiLiLRichyMod extends GuiContainer {
    private final ResourceLocation guiTexture;
    private final IInventory inventory;

    public GuiLiLRichyMod(Container container, String guiTextureName, IInventory inventory) {
        super(container);
        this.guiTexture = new ResourceLocation(Reference.MOD_ID + ":textures/gui/" + guiTextureName + ".png");
        this.inventory = inventory;
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        if (inventory != null) {
            String s = this.inventory.hasCustomName() ? this.inventory.getName() : I18n.format(this.inventory.getName());
            this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, Colors.COLOR_BLACK_GUI_TEXT);
            this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, Colors.COLOR_BLACK_GUI_TEXT);
        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(guiTexture);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}