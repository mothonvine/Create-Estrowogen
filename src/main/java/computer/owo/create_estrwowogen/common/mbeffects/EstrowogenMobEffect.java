package computer.owo.create_estrwowogen.common.mbeffects;

import computer.owo.create_estrwowogen.Estrowogen;
import computer.owo.create_estrwowogen.common.mbeffects.mobeffect.GirlPowerMobEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EstrowogenMobEffect {
    public static final DeferredRegister<MobEffect>  ESTROWOGEN_MOB_EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, Estrowogen.MODID);

    public static final Supplier<GirlPowerMobEffect> GIRL_POWER_MOB_EFFECT =
            ESTROWOGEN_MOB_EFFECTS.register("girl_power", ()-> new GirlPowerMobEffect(MobEffectCategory.BENEFICIAL, 0xAA00AA));

    public static void register(IEventBus eventBus){
        ESTROWOGEN_MOB_EFFECTS.register(eventBus);
    }
}
