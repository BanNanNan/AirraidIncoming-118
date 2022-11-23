
package net.mcreator.raidincoming.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.raidincoming.entity.EntPillagerplanetype1npilEntity;
import net.mcreator.raidincoming.client.model.Modelpillagerplanetype1v2nopilot;

public class EntPillagerplanetype1npilRenderer
		extends
			MobRenderer<EntPillagerplanetype1npilEntity, Modelpillagerplanetype1v2nopilot<EntPillagerplanetype1npilEntity>> {
	public EntPillagerplanetype1npilRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpillagerplanetype1v2nopilot(context.bakeLayer(Modelpillagerplanetype1v2nopilot.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(EntPillagerplanetype1npilEntity entity) {
		return new ResourceLocation("raidincoming:textures/entities/texture_pillagerplanetype1_v2.png");
	}
}
