package lilrichy.lilrichymod.blocks.lectern;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by LiLRichy on 1/27/2016.
 */
public class ItemRenderLectern  {
    @SideOnly(Side.CLIENT)
    TileEntitySpecialRenderer render;
    private TileEntity entity;

    public ItemRenderLectern(TileEntitySpecialRenderer render, TileEntity entity) {
        this.entity = entity;
        this.render = render;
    }

  /*  @SideOnly(Side.CLIENT)
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (type == ItemRenderType.ENTITY) {
            GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }

        if (type == ItemRenderType.INVENTORY) {
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }
        if (type == ItemRenderType.EQUIPPED) {
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }
        if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }
    }*/
}