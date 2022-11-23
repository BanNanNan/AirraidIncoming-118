
package net.mcreator.raidincoming.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.raidincoming.entity.Aa4headheadEntity;
import net.mcreator.raidincoming.client.model.Modelaa4headbasehead_45dgrev2;

public class Aa4headheadRenderer extends MobRenderer<Aa4headheadEntity, Modelaa4headbasehead_45dgrev2<Aa4headheadEntity>> {
	public Aa4headheadRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaa4headbasehead_45dgrev2(context.bakeLayer(Modelaa4headbasehead_45dgrev2.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(Aa4headheadEntity entity) {
		return new ResourceLocation("raidincoming:textures/entities/texture_4head_head.png");
	}
}
