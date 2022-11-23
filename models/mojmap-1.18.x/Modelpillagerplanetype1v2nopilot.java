// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpillagerplanetype1v2nopilot<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pillagerplanetype1v2nopilot"), "main");
	private final ModelPart body;

	public Modelpillagerplanetype1v2nopilot(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 2)
						.addBox(3.0F, -18.0F, 26.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 115)
						.addBox(-4.0F, -9.0F, -21.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 78)
						.addBox(-6.0F, -9.0F, -13.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -18.0F, 26.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-3.0F, -12.0F, 26.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-3.0F, -18.0F, 26.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 77)
						.addBox(-8.0F, -7.0F, 7.0F, 16.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-5.0F, 1.0F, 15.0F, 10.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(90, 32)
						.addBox(-5.0F, -7.0F, 29.0F, 10.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(42, 77)
						.addBox(-4.0F, -6.0F, -22.0F, 8.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 55)
						.addBox(-6.0F, -7.0F, 15.0F, 12.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-7.0F, -7.0F, -21.0F, 14.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, -3.0F, -7.0F, 24.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-32.0F, -3.0F, -7.0F, 24.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(34, 99)
						.addBox(-8.0F, -7.0F, -7.0F, 1.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(96, 99)
						.addBox(7.0F, -7.0F, -7.0F, 1.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(19, 110)
						.addBox(-4.0F, -18.0F, 13.0F, 1.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(51, 110)
						.addBox(3.0F, -18.0F, 13.0F, 1.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(94, 55)
						.addBox(-3.0F, -12.0F, 13.0F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(100, 0)
						.addBox(-3.0F, -19.0F, 13.0F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(49, 46)
						.addBox(-4.0F, -18.0F, 12.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 95)
						.addBox(-3.0F, -18.0F, 13.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-5.0F, -8.0F, 7.0F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(76, 17)
						.addBox(-6.0F, -8.0F, -21.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(62, 2)
						.addBox(-6.0F, 3.0F, -21.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-7.0F, 3.0F, -7.0F, 14.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 46).addBox(-5.0F, -9.4162F, -15.0719F, 10.0F, 7.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(112, 95).addBox(6.4567F, -4.3233F, 29.0F, 12.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3655F, 0.147F, -0.3655F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(112, 104).addBox(-18.4567F, -4.3233F, 29.0F, 12.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3655F, -0.147F, 0.3655F));

		PartDefinition cube_r5 = body
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(62, 17).addBox(-2.0F, 1.0F, 12.3137F, 4.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(42, 55).addBox(-2.0F, -25.8352F, 5.2806F, 4.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.body.zRot = ageInTicks / 20.f;
	}
}