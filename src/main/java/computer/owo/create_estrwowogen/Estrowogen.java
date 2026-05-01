package computer.owo.create_estrwowogen;

import com.mojang.logging.LogUtils;
import computer.owo.create_estrwowogen.client.entities.renderers.RosyMapleMothRenderer;
import computer.owo.create_estrwowogen.common.blocks.EstrowogenBlocks;
import computer.owo.create_estrwowogen.common.creative.EstrowogenCreativeTabs;
import computer.owo.create_estrwowogen.common.entities.EstrowogenEntities;
import computer.owo.create_estrwowogen.common.items.EstrowogenItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderers;import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(Estrowogen.MODID)
public class Estrowogen {
    public static final String MODID = "create_estrwowogen";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Estrowogen(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        EstrowogenBlocks.register(modEventBus);
        EstrowogenItems.register(modEventBus);
        EstrowogenCreativeTabs.register(modEventBus);
        EstrowogenEntities.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

            EntityRenderers.register(EstrowogenEntities.ROSY_MAPLE_MOTH_ENTITY.get(), RosyMapleMothRenderer::new );
        }
    }
}
