
package net.mcreator.raidincoming.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.raidincoming.entity.EntPillagerplanetype2Entity;
import net.mcreator.raidincoming.client.model.Modelpillagerplanetype2;

public class EntPillagerplanetype2Renderer extends MobRenderer<EntPillagerplanetype2Entity, Modelpillagerplanetype2<EntPillagerplanetype2Entity>> {
	public EntPillagerplanetype2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelpillagerplanetype2(context.bakeLayer(Modelpillagerplanetype2.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(EntPillagerplanetype2Entity entity) {
		return new ResourceLocation("raidincoming:textures/entities/texture_pillagerplanetype2.png");
	}
}
