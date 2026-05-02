package computer.owo.create_estrwowogen.common.creative;

import computer.owo.create_estrwowogen.Estrowogen;
import computer.owo.create_estrwowogen.common.blocks.EstrowogenBlocks;
import computer.owo.create_estrwowogen.common.items.EstrowogenItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EstrowogenCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> ESTROWOGEN_CREATIVE_MODE_TABS
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Estrowogen.MODID);

    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> ESTROWOGEN_INV_TAB =
            ESTROWOGEN_CREATIVE_MODE_TABS.register(
                    "estrowogen",
                    ()-> CreativeModeTab
                            .builder()
                            .title(Component.translatable("itemGroup.estrowogen"))
                            .displayItems((parameters, output) -> {
                                // Add Block Items
                                output.accept(EstrowogenBlocks.BASE.asItem());

                                // Add Items
                                output.accept(EstrowogenItems.ITEM.get());
                            })
                            .build()
            );





    public static void register(IEventBus eventBus){
        ESTROWOGEN_CREATIVE_MODE_TABS.register(eventBus);
    }
}
