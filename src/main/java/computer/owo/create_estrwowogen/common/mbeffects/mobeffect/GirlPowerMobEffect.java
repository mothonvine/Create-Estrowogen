package computer.owo.create_estrwowogen.common.mbeffects.mobeffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class GirlPowerMobEffect extends MobEffect {
    public GirlPowerMobEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void onEffectStarted(LivingEntity entity, int amplifier) {
        entity.heal(amplifier*2);
    }
}
