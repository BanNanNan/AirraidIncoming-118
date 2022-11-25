
package net.mcreator.raidincoming.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.raidincoming.entity.Pupillagertyp2bombEntity;
import net.mcreator.raidincoming.client.model.Modelaa4headhe;

public class Pupillagertyp2bombRenderer extends MobRenderer<Pupillagertyp2bombEntity, Modelaa4headhe<Pupillagertyp2bombEntity>> {
	public Pupillagertyp2bombRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaa4headhe(context.bakeLayer(Modelaa4headhe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Pupillagertyp2bombEntity entity) {
		return new ResourceLocation("raidincoming:textures/entities/texture_aahe.png");
	}
}
