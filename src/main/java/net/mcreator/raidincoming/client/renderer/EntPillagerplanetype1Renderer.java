
package net.mcreator.raidincoming.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.raidincoming.entity.EntPillagerplanetype1Entity;
import net.mcreator.raidincoming.client.model.Modelpillagerplanetype1v2;

public class EntPillagerplanetype1Renderer extends MobRenderer<EntPillagerplanetype1Entity, Modelpillagerplanetype1v2<EntPillagerplanetype1Entity>> {
	public EntPillagerplanetype1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelpillagerplanetype1v2(context.bakeLayer(Modelpillagerplanetype1v2.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(EntPillagerplanetype1Entity entity) {
		return new ResourceLocation("raidincoming:textures/entities/texture_pillagerplanetype1_v2.png");
	}
}
