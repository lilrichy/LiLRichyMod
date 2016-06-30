package lilrichy.lilrichymod.blocks.lectern;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by LiLRichy on 1/27/2016.
 */
public class ModelLectern extends ModelBase {
    //fields
    ModelRenderer base;
    ModelRenderer pillar;
    ModelRenderer top;
    ModelRenderer bookRest;

    public ModelLectern() {
        textureWidth = 64;
        textureHeight = 64;

        top = new ModelRenderer(this, 0, 0);
        top.addBox(-7F, 0F, -7F, 14, 2, 14);
        top.setRotationPoint(0F, 2.3F, 0F);
        top.setTextureSize(64, 64);
        top.mirror = true;
        setRotation(top, -0.1745329F, 0F, 0F);
        bookRest = new ModelRenderer(this, 0, 17);
        bookRest.addBox(-6F, 0F, 0F, 12, 1, 1);
        bookRest.setRotationPoint(0F, 2.3F, 5.5F);
        bookRest.setTextureSize(64, 64);
        bookRest.mirror = true;
        setRotation(bookRest, -0.1745329F, 0F, 0F);
        pillar = new ModelRenderer(this, 0, 20);
        pillar.addBox(-2F, 0F, -2F, 4, 18, 4);
        pillar.setRotationPoint(0F, 4F, 0F);
        pillar.setTextureSize(64, 64);
        pillar.mirror = true;
        setRotation(pillar, 0F, 0F, 0F);
        base = new ModelRenderer(this, 0, 46);
        base.addBox(-6F, 0F, -6F, 12, 2, 12);
        base.setRotationPoint(0F, 22F, 0F);
        base.setTextureSize(64, 64);
        base.mirror = true;
        setRotation(base, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        base.render(f5);
        pillar.render(f5);
        top.render(f5);
        bookRest.render(f5);
    }

    public void renderModel(float f5) {
        base.render(f5);
        pillar.render(f5);
        top.render(f5);
        bookRest.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}