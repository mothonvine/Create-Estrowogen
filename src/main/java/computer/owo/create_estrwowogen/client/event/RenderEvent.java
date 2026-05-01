package computer.owo.create_estrwowogen.client.event;

import computer.owo.create_estrwowogen.client.entities.renderers.RosyMapleMothRenderer;
import computer.owo.create_estrwowogen.common.entities.EstrowogenEntities;
import computer.owo.create_estrwowogen.common.entities.entity.RoseMapleMothEntity;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber
@OnlyIn(Dist.CLIENT)
public class RenderEvent {

    @SubscribeEvent
    public static void registerEntityRenderers(FMLClientSetupEvent event){
        EntityRenderers.register(EstrowogenEntities.ROSY_MAPLE_MOTH_ENTITY.get(), RosyMapleMothRenderer::new);
    }
}
