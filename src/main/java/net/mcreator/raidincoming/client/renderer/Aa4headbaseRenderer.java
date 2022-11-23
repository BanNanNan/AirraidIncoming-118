
package net.mcreator.raidincoming.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.raidincoming.entity.Aa4headbaseEntity;
import net.mcreator.raidincoming.client.model.Modelaa4headbase;

public class Aa4headbaseRenderer extends MobRenderer<Aa4headbaseEntity, Modelaa4headbase<Aa4headbaseEntity>> {
	public Aa4headbaseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaa4headbase(context.bakeLayer(Modelaa4headbase.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(Aa4headbaseEntity entity) {
		return new ResourceLocation("raidincoming:textures/entities/texture_aa4head_base.png");
	}
}
