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
public class Modelaa4headbase<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("raidincoming", "modelaa_4headbase"), "main");
	public final ModelPart base;

	public Modelaa4headbase(ModelPart root) {
		this.base = root.getChild("base");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -3.0F, -9.0F, 18.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-7.0F, -4.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(50, 30)
						.addBox(-24.0F, -2.0F, -3.0F, 15.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 21)
						.addBox(9.0F, -2.0F, -3.0F, 15.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(27, 38)
						.addBox(-3.0F, -2.0F, -24.0F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
						.addBox(-1.0F, -3.0F, -23.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.0F, 21.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(21.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-23.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -2.0F, 9.0F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
