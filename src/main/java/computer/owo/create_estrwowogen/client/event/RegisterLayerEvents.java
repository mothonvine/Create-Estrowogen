package computer.owo.create_estrwowogen.client.event;

import computer.owo.create_estrwowogen.client.entities.models.RosyMapleMothModel;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(value = Dist.CLIENT)
public class RegisterLayerEvents {

    @SubscribeEvent
    public static void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(RosyMapleMothModel.LAYER_LOCATION, RosyMapleMothModel::createBodyLayer);
    }
}
