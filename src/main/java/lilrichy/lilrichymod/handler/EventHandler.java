package lilrichy.lilrichymod.handler;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;

/**
 * Created by Rich on 12/4/2015.
 */
public class EventHandler
{
    @SubscribeEvent
    public void playerRenderPre(RenderPlayerEvent.Pre e)
    {
        GL11.glPushMatrix();

        //Flip Player Render
        // if (e.entityPlayer.getDisplayName().equals(Reference.LILRICHY)) {
        if (ConfigurationHandler.flipPlayers) {
            GL11.glTranslatef(0f, e.getEntityPlayer().height - 3F, 0.0F);
            GL11.glRotatef(180f, 0f, 0f, 1f);
        }
    }

    @SubscribeEvent
    public void playerRenderPost(RenderPlayerEvent.Post e)
    {
        GL11.glPopMatrix();
    }
}
