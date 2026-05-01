package computer.owo.create_estrwowogen.client.entities.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import computer.owo.create_estrwowogen.Estrowogen;
import computer.owo.create_estrwowogen.client.entities.models.RosyMapleMothModel;
import computer.owo.create_estrwowogen.common.entities.entity.RoseMapleMothEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RosyMapleMothRenderer extends MobRenderer<RoseMapleMothEntity, RosyMapleMothModel<RoseMapleMothEntity>> {
    public RosyMapleMothRenderer(EntityRendererProvider.Context context) {
        super(context, new RosyMapleMothModel<>(context.bakeLayer(RosyMapleMothModel.LAYER_LOCATION)), .3f);
    }

    @Override
    public ResourceLocation getTextureLocation(RoseMapleMothEntity p_114482_) {
        return ResourceLocation.fromNamespaceAndPath(Estrowogen.MODID, "textures/entity/rosy_maple_moth/rosy_maple_moth.png");
    }

    @Override
    public void render(RoseMapleMothEntity p_115308_, float p_115309_, float p_115310_, PoseStack p_115311_, MultiBufferSource p_115312_, int p_115313_) {
        super.render(p_115308_, p_115309_, p_115310_, p_115311_, p_115312_, p_115313_);
    }


}
