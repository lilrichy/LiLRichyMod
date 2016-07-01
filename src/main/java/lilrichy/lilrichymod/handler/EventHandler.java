package lilrichy.lilrichymod.handler;

import lilrichy.lilrichymod.tileEntity.TileEntityAnimalWard;
import lilrichy.lilrichymod.tileEntity.TileEntityMobWard;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Rich on 12/4/2015.
 */
public class EventHandler {
    public static List<TileEntityAnimalWard> animalWards = new ArrayList();
    public static List<TileEntityMobWard> mobWards = new ArrayList();

    public EventHandler() {
    }

    //Animal Ward
    public static boolean isInRangeOfAnimalWard(Entity entity) {
        Iterator i$ = animalWards.iterator();
        TileEntityAnimalWard ward;
        do {
            if (!i$.hasNext()) {
                return false;
            }
            ward = (TileEntityAnimalWard) i$.next();
        } while (!ward.isInRange(entity));
        return true;
    }

    @SubscribeEvent
    public void spawnAnimalCheck(LivingSpawnEvent.CheckSpawn event) {
        if (event.getResult() != Event.Result.ALLOW) {
            if (event.getEntityLiving().isCreatureType(EnumCreatureType.AMBIENT, false) && isInRangeOfAnimalWard(event.getEntity())) {
                event.setResult(Event.Result.DENY);
            }
        }
    }

    //Mob Ward
    public static boolean isInRangeOfMobWard(Entity entity) {
        Iterator i$ = mobWards.iterator();
        TileEntityMobWard ward;
        do {
            if (!i$.hasNext()) {
                return false;
            }
            ward = (TileEntityMobWard) i$.next();
        } while (!ward.isInRange(entity));
        return true;
    }

    @SubscribeEvent
    public void spawnMobCheck(LivingSpawnEvent.CheckSpawn event) {
        if (event.getResult() != Event.Result.ALLOW) {
            if (event.getEntityLiving().isCreatureType(EnumCreatureType.MONSTER, false) && isInRangeOfMobWard(event.getEntity())) {
                event.setResult(Event.Result.DENY);
            }
        }
    }
}