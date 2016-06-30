//package lilrichy.lilrichymod.blocks.lectern;
//
//import com.blogspot.richardreigens.lilrichymod.reference.Names;
//import com.blogspot.richardreigens.lilrichymod.reference.Reference;
//import net.minecraft.client.model.ModelBook;
//import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.MathHelper;
//import net.minecraft.util.ResourceLocation;
//import org.lwjgl.opengl.GL11;
//
///**
// * Created by LiLRichy on 1/26/2016.
// */
//public class LecternRender extends TileEntitySpecialRenderer {
//
//    private final ResourceLocation texture;
//    private final ResourceLocation book;
//    private final ModelLectern modelLectern = new ModelLectern();
//    private final ModelBook enchantmentBook = new ModelBook();
//
//    public LecternRender() {
//        texture = new ResourceLocation(Reference.MOD_ID + ":textures/models/" + Names.Models.LECTERN + ".png");
//        book = new ResourceLocation("minecraft:textures/entity/enchanting_table_book.png");
//    }
//
//    @Override
//    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTicks, int destroyStage) {
//        renderTileEntityLecternAt((TileEntityLectern) tileEntity, x, y, z, partialTicks);
//    }
//
//    public void renderTileEntityLecternAt(TileEntityLectern tileEntityLectern, double x, double y, double z, float f1) {
//        int meta = 0;
//        if (tileEntityLectern != null)
//            meta = tileEntityLectern.getBlockMetadata();
//
//        //  LogHelper.info(meta);
//        int i = 0;
//        if (tileEntityLectern != null) i = tileEntityLectern.getBlockMetadata();
//
//        int p = 3;
//
//        if (i == 0) p = 4;
//        if (i == 1) p = 3;
//        if (i == 2) p = 2;
//        if (i == 3) p = 1;
//
//        int j = p * 90;
//
//        bindTexture(texture);
//        GL11.glPushMatrix();
//        GL11.glTranslatef((float) x + 0.5F, (float) y + 0.9F, (float) z + 0.5F);
//        GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);
//        GL11.glScalef(1.0F, -1F, -1F);
//        GL11.glScalef(1.0F, 0.6F, 1.0F);
//        modelLectern.renderModel(0.0625F);
//        GL11.glPopMatrix();
//
//        if (tileEntityLectern.hasStack()) {
//            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
//            RenderBook(tileEntityLectern, x, y, z, f1, meta);
//        }
//
//    }
//
//    private void RenderBook(TileEntityLectern tileEntityLectern, double x, double y, double z, float f1, int meta) {
//        GL11.glPushMatrix();
//        GL11.glTranslatef((float) x + 0.5F, (float) y + 0.75F, (float) z + 0.5F);
//        float var9 = (float) tileEntityLectern.tickCount + f1;
//        GL11.glTranslatef(0.0F, 0.1F + MathHelper.sin(var9 * 0.01F) * 0.01F, 0.0F);
//        float f2;
//
//        for (f2 = tileEntityLectern.bookRotation - tileEntityLectern.bookRotationPrev; f2 >= (float) Math.PI; f2 -= ((float) Math.PI * 2F))
//            while (f2 < -(float) Math.PI) f2 += ((float) Math.PI * 2F);
//        //LogHelper.info(meta);
//        if (meta == 1) GL11.glRotatef(0 , 0.0F, 1.0F, 0.0F);
//        else if (meta == 2) GL11.glRotatef(-90, 0.0F, 1.0F, 0.0F);
//        else if (meta == 3) GL11.glRotatef(180, 0.0F, 1.0F, 0.0F);
//        else GL11.glRotatef(90, 0.0F, 1.0F, 0.0F);
//
//        GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
//
//        bindTexture(book);
//        float var12 = tileEntityLectern.pageFlipPrev + (tileEntityLectern.pageFlip - tileEntityLectern.pageFlipPrev) * f1 + 0.25F;
//        float var13 = tileEntityLectern.pageFlipPrev + (tileEntityLectern.pageFlip - tileEntityLectern.pageFlipPrev) * f1 + 0.75F;
//        var12 = (var12 - MathHelper.truncateDoubleToInt(var12)) * 1.6F - 0.3F;
//        var13 = (var13 - MathHelper.truncateDoubleToInt(var13)) * 1.6F - 0.3F;
//
//        if (var12 < 0.0F) var12 = 0.0F;
//        if (var13 < 0.0F) var13 = 0.0F;
//        if (var12 > 1.0F) var12 = 1.0F;
//        if (var13 > 1.0F) var13 = 1.0F;
//
//        this.enchantmentBook.setRotationAngles(var9, var12, var13, 1f, 0.0F, 0.0625F, null);
//        this.enchantmentBook.coverRight.render(0.0625F);
//        this.enchantmentBook.coverLeft.render(0.0625F);
//        this.enchantmentBook.bookSpine.render(0.0625F);
//        this.enchantmentBook.pagesRight.render(0.0625F);
//        this.enchantmentBook.pagesLeft.render(0.0625F);
//        this.enchantmentBook.flippingPageRight.render(0.0625F);
//        this.enchantmentBook.flippingPageLeft.render(0.0625F);
//        GL11.glPopMatrix();
//    }
//}