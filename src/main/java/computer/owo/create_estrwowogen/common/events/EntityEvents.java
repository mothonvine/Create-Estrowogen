package computer.owo.create_estrwowogen.common.events;

import computer.owo.create_estrwowogen.common.entities.EstrowogenEntities;
import computer.owo.create_estrwowogen.common.entities.entity.RoseMapleMothEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber
public class EntityEvents {

    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event){
        event.put(EstrowogenEntities.ROSY_MAPLE_MOTH_ENTITY.get(),
                RoseMapleMothEntity.createAttributes().build());
    }
}
