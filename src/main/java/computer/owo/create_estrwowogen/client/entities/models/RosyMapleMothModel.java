package computer.owo.create_estrwowogen.client.entities.models;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import computer.owo.create_estrwowogen.Estrowogen;
import computer.owo.create_estrwowogen.common.entities.entity.RoseMapleMothEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class RosyMapleMothModel<T extends RoseMapleMothEntity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Estrowogen.MODID, "rosy_maple_moth"), "main");
    private final ModelPart bone;
    private final ModelPart wings;
    private final ModelPart lower_wings;
    private final ModelPart left_lower_wing;
    private final ModelPart right_lower_wing;
    private final ModelPart upper_wings;
    private final ModelPart left_upper_wing;
    private final ModelPart right_upper_wing;
    private final ModelPart seg1_left_leg;
    private final ModelPart seg1_right_leg;
    private final ModelPart head;
    private final ModelPart antennae;
    private final ModelPart right_antenna;
    private final ModelPart right_antenna_seg2;
    private final ModelPart right_antenna_seg3;
    private final ModelPart left_antenna;
    private final ModelPart left_antenna_seg2;
    private final ModelPart left_antenna_seg3;
    private final ModelPart body_seg2;
    private final ModelPart seg2_right_front_leg;
    private final ModelPart seg2_right_rear_leg;
    private final ModelPart seg2_left_front_leg;
    private final ModelPart seg2_left_rear_leg;
    private final ModelPart body_seg3;
    private final ModelPart body_seg4;
    private final ModelPart body_seg5;

    public RosyMapleMothModel(ModelPart root) {
        this.bone = root.getChild("bone");
        this.wings = this.bone.getChild("wings");
        this.lower_wings = this.wings.getChild("lower_wings");
        this.left_lower_wing = this.lower_wings.getChild("left_lower_wing");
        this.right_lower_wing = this.lower_wings.getChild("right_lower_wing");
        this.upper_wings = this.wings.getChild("upper_wings");
        this.left_upper_wing = this.upper_wings.getChild("left_upper_wing");
        this.right_upper_wing = this.upper_wings.getChild("right_upper_wing");
        this.seg1_left_leg = this.bone.getChild("seg1_left_leg");
        this.seg1_right_leg = this.bone.getChild("seg1_right_leg");
        this.head = this.bone.getChild("head");
        this.antennae = this.head.getChild("antennae");
        this.right_antenna = this.antennae.getChild("right_antenna");
        this.right_antenna_seg2 = this.right_antenna.getChild("right_antenna_seg2");
        this.right_antenna_seg3 = this.right_antenna_seg2.getChild("right_antenna_seg3");
        this.left_antenna = this.antennae.getChild("left_antenna");
        this.left_antenna_seg2 = this.left_antenna.getChild("left_antenna_seg2");
        this.left_antenna_seg3 = this.left_antenna_seg2.getChild("left_antenna_seg3");
        this.body_seg2 = this.bone.getChild("body_seg2");
        this.seg2_right_front_leg = this.body_seg2.getChild("seg2_right_front_leg");
        this.seg2_right_rear_leg = this.body_seg2.getChild("seg2_right_rear_leg");
        this.seg2_left_front_leg = this.body_seg2.getChild("seg2_left_front_leg");
        this.seg2_left_rear_leg = this.body_seg2.getChild("seg2_left_rear_leg");
        this.body_seg3 = this.body_seg2.getChild("body_seg3");
        this.body_seg4 = this.body_seg3.getChild("body_seg4");
        this.body_seg5 = this.body_seg4.getChild("body_seg5");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(13, 5).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition wings = bone.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition lower_wings = wings.addOrReplaceChild("lower_wings", CubeListBuilder.create(), PartPose.offset(0.0F, -0.25F, 0.0F));

        PartDefinition left_lower_wing = lower_wings.addOrReplaceChild("left_lower_wing", CubeListBuilder.create().texOffs(-8, 10).addBox(0.0F, -4.0F, -3.0F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_lower_wing = lower_wings.addOrReplaceChild("right_lower_wing", CubeListBuilder.create().texOffs(-8, 10).mirror().addBox(-5.0F, -4.0F, -3.0F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition upper_wings = wings.addOrReplaceChild("upper_wings", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 0.0F));

        PartDefinition left_upper_wing = upper_wings.addOrReplaceChild("left_upper_wing", CubeListBuilder.create().texOffs(-10, 0).addBox(0.0F, -4.25F, -3.0F, 5.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_upper_wing = upper_wings.addOrReplaceChild("right_upper_wing", CubeListBuilder.create().texOffs(-10, 0).mirror().addBox(-5.0F, -4.25F, -3.0F, 5.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition seg1_left_leg = bone.addOrReplaceChild("seg1_left_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 0.0F, -3.25F));

        PartDefinition cube_r1 = seg1_left_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition seg1_right_leg = bone.addOrReplaceChild("seg1_right_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, -3.25F));

        PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(15, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.0F));

        PartDefinition antennae = head.addOrReplaceChild("antennae", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 4.0F));

        PartDefinition right_antenna = antennae.addOrReplaceChild("right_antenna", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r2 = right_antenna.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.0F, -6.0F, 0.0F, -0.0436F, 0.0F));

        PartDefinition right_antenna_seg2 = right_antenna.addOrReplaceChild("right_antenna_seg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r3 = right_antenna_seg2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -4.0F, -6.0F, 0.0F, -0.0436F, 0.0F));

        PartDefinition right_antenna_seg3 = right_antenna_seg2.addOrReplaceChild("right_antenna_seg3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = right_antenna_seg3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -6.0F, -6.0F, 0.0F, -0.0436F, 0.0F));

        PartDefinition left_antenna = antennae.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(0, 24).addBox(1.0F, -4.0F, -5.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition left_antenna_seg2 = left_antenna.addOrReplaceChild("left_antenna_seg2", CubeListBuilder.create().texOffs(0, 22).addBox(2.0F, -6.0F, -5.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition left_antenna_seg3 = left_antenna_seg2.addOrReplaceChild("left_antenna_seg3", CubeListBuilder.create().texOffs(0, 20).addBox(3.0F, -8.0F, -5.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_seg2 = bone.addOrReplaceChild("body_seg2", CubeListBuilder.create().texOffs(12, 11).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -2.0F));

        PartDefinition seg2_right_front_leg = body_seg2.addOrReplaceChild("seg2_right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 2.0F, 0.5F));

        PartDefinition seg2_right_rear_leg = body_seg2.addOrReplaceChild("seg2_right_rear_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 2.0F, 2.25F));

        PartDefinition seg2_left_front_leg = body_seg2.addOrReplaceChild("seg2_left_front_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 2.0F, 0.5F));

        PartDefinition cube_r5 = seg2_left_front_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition seg2_left_rear_leg = body_seg2.addOrReplaceChild("seg2_left_rear_leg", CubeListBuilder.create(), PartPose.offset(2.5F, 2.0F, 2.25F));

        PartDefinition cube_r6 = seg2_left_rear_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition body_seg3 = body_seg2.addOrReplaceChild("body_seg3", CubeListBuilder.create().texOffs(14, 18).addBox(-2.0F, -3.0F, 1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 2.0F));

        PartDefinition body_seg4 = body_seg3.addOrReplaceChild("body_seg4", CubeListBuilder.create().texOffs(14, 24).addBox(-2.0F, -3.0F, 4.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_seg5 = body_seg4.addOrReplaceChild("body_seg5", CubeListBuilder.create().texOffs(3, 27).addBox(-1.0F, -2.0F, 6.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }


    @Override
    public ModelPart root() {
        return bone;
    }

    @Override
    public void setupAnim(T p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
}