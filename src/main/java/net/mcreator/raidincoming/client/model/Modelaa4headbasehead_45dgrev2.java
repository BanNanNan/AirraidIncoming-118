package net.mcreator.raidincoming.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelaa4headbasehead_45dgrev2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("raidincoming", "modelaa_4headbasehead_45dgrev_2"), "main");
	public final ModelPart base;
	public final ModelPart cannon;

	public Modelaa4headbasehead_45dgrev2(ModelPart root) {
		this.base = root.getChild("base");
		this.cannon = root.getChild("cannon");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 28).addBox(-8.0F, -8.0F, -14.0F, 16.0F, 8.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -7.0F, -13.0F, 20.0F, 6.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(83, 0)
						.addBox(-6.0F, -9.0F, -5.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(54, 28)
						.addBox(-8.0F, -16.0F, -16.0F, 16.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(70, 73)
						.addBox(-8.0F, -22.0F, -16.0F, 16.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(21, 58).addBox(-6.0F, -11.0359F, -3.134F, 12.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 6.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cannon = partdefinition.addOrReplaceChild("cannon", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -14.0F));
		PartDefinition cube_r2 = cannon.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(36, 79).addBox(9.0F, -6.0F, -8.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 79)
						.addBox(9.0F, 0.0F, -8.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(38, 58)
						.addBox(10.0F, 1.0F, -25.0F, 2.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(10.0F, -5.0F, -25.0F, 2.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
						.addBox(-12.0F, 1.0F, -25.0F, 2.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(59, 45)
						.addBox(-12.0F, -5.0F, -25.0F, 2.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(83, 52)
						.addBox(-13.0F, 0.0F, -8.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(9.0F, -4.0F, 6.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
						.addBox(-13.0F, -4.0F, 6.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 85)
						.addBox(-13.0F, -6.0F, -8.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(94, 85)
						.addBox(13.0F, -6.0F, -4.0F, 1.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(8.0F, -6.0F, -4.0F, 1.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -6.0F, -4.0F, 1.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(95, 13).addBox(-9.0F, -6.0F, -4.0F, 1.0F,
								12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7071F, 0.7071F, -0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cannon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.cannon.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.cannon.xRot = headPitch / (180F / (float) Math.PI);
		this.base.yRot = netHeadYaw / (180F / (float) Math.PI);

	}
}
