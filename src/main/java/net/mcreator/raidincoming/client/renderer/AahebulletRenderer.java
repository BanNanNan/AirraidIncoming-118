
package net.mcreator.raidincoming.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.raidincoming.entity.AahebulletEntity;
import net.mcreator.raidincoming.client.model.Modelaa4headhe;

public class AahebulletRenderer extends MobRenderer<AahebulletEntity, Modelaa4headhe<AahebulletEntity>> {
	public AahebulletRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaa4headhe(context.bakeLayer(Modelaa4headhe.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(AahebulletEntity entity) {
		return new ResourceLocation("raidincoming:textures/entities/texture_aahe.png");
	}
}
