// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpillagerplanetype2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pillagerplanetype2"), "main");
	private final ModelPart body;

	public Modelpillagerplanetype2(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, 3.0F, -20.0F, 14.0F, 1.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(134, 36)
						.addBox(-4.0F, -19.0F, -16.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(62, 23)
						.addBox(-1.0F, -14.0F, -18.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(128, 141)
						.addBox(-4.0F, -9.0F, -15.0F, 8.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(96, 45)
						.addBox(-6.0F, 3.0F, -34.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(98, 93)
						.addBox(-6.0F, -8.0F, -34.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
						.addBox(-5.0F, -8.0F, 7.0F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(120, 123)
						.addBox(14.0F, 1.0F, -20.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(62, 14)
						.addBox(13.0F, 1.0F, -21.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 133)
						.addBox(14.0F, 0.0F, -20.0F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(132, 0)
						.addBox(14.0F, 7.0F, -20.0F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(78, 141)
						.addBox(20.0F, 1.0F, -20.0F, 1.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(140, 54)
						.addBox(13.0F, 1.0F, -20.0F, 1.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(113, 73)
						.addBox(-17.0F, -7.0F, 29.0F, 12.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(106, 141)
						.addBox(-18.0F, -15.0F, 29.0F, 1.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(17.0F, -15.0F, 29.0F, 1.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(96, 60)
						.addBox(5.0F, -7.0F, 29.0F, 12.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(7.0F, -7.0F, -20.0F, 1.0F, 10.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(67, 46)
						.addBox(-8.0F, -7.0F, -20.0F, 1.0F, 10.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-38.0F, -3.0F, -20.0F, 30.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(8.0F, -3.0F, -20.0F, 30.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(56, 83)
						.addBox(-7.0F, -7.0F, -34.0F, 14.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(82, 23)
						.addBox(-6.0F, -7.0F, 15.0F, 12.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
						.addBox(-5.0F, -9.0F, 29.0F, 10.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(96, 108)
						.addBox(-5.0F, 1.0F, 15.0F, 10.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(48, 107)
						.addBox(-8.0F, -7.0F, 7.0F, 16.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(31, 125)
						.addBox(-6.0F, -7.0F, -5.0F, 5.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(29, 73)
						.addBox(-2.0F, 4.0F, -17.0F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-3.0F, 5.0F, -17.0F, 6.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(12, 73)
						.addBox(-2.0F, 6.0F, -18.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(-2.0F, 6.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -7.0F, -5.0F, 5.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(37, 73)
						.addBox(-5.0F, -6.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 73)
						.addBox(2.0F, -6.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -2.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 73)
						.addBox(2.0F, -2.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-7.0F, -7.0F, -8.0F, 14.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 71)
						.addBox(14.0F, 1.0F, -7.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 32)
						.addBox(14.0F, 7.0F, -7.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(14.0F, 1.0F, -7.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 90)
						.addBox(-6.0F, -9.0F, -26.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 23)
						.addBox(-4.0F, -9.0F, -34.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(30, 25)
						.addBox(20.0F, 1.0F, -7.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 123)
						.addBox(-19.0F, 1.0F, -20.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(63, 128)
						.addBox(-13.0F, 1.0F, -20.0F, 1.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(136, 84)
						.addBox(-20.0F, 1.0F, -20.0F, 1.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(120, 22)
						.addBox(-19.0F, 0.0F, -20.0F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(130, 108)
						.addBox(-19.0F, 7.0F, -20.0F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(62, 7)
						.addBox(-20.0F, 1.0F, -21.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 2)
						.addBox(-19.0F, 1.0F, -7.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 19)
						.addBox(-13.0F, 1.0F, -7.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-19.0F, 7.0F, -7.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 2)
						.addBox(-19.0F, 1.0F, -7.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(108, 123)
				.addBox(-2.0F, -30.0447F, 15.4433F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(144, 122)
				.addBox(31.0F, -30.0447F, 15.4433F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, 19.0F, -44.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(62, 0).addBox(-5.0F, -8.6508F, -16.9197F, 10.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 0.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r4 = body
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(21, 0).addBox(2.5F, -3.0F, 0.0F, 0.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(3.0F, -6.2426F, -7.6569F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-7.0F, -6.2426F, -7.6569F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.body.yRot = netHeadYaw / (180F / (float) Math.PI);
		
	}
}