package computer.owo.create_estrwowogen.common.entities;

import computer.owo.create_estrwowogen.Estrowogen;
import computer.owo.create_estrwowogen.common.entities.entity.RoseMapleMothEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EstrowogenEntities {
    public static final DeferredRegister<EntityType<?>> ESTROWOGEN_ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, Estrowogen.MODID);

    public static final Supplier<EntityType<RoseMapleMothEntity>> ROSY_MAPLE_MOTH_ENTITY =
            ESTROWOGEN_ENTITY_TYPES.register(
                    "rosy_maple_moth",
                    ()-> EntityType.Builder.of(
                            RoseMapleMothEntity::new,
                            MobCategory.CREATURE
                    )
                            .sized(0.4f,0.4f)
                            .build(ResourceKey.create(
                                    Registries.ENTITY_TYPE,
                            ResourceLocation.fromNamespaceAndPath("examplemod", "my_entity")
                    ).toString())
            );



    public static void register(IEventBus eventBus){
        ESTROWOGEN_ENTITY_TYPES.register(eventBus);
    }
}
