
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raidincoming.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.raidincoming.client.renderer.Pupillagertyp2bombRenderer;
import net.mcreator.raidincoming.client.renderer.EntPillagerplanetype2Renderer;
import net.mcreator.raidincoming.client.renderer.EntPillagerplanetype1npilRenderer;
import net.mcreator.raidincoming.client.renderer.EntPillagerplanetype1Renderer;
import net.mcreator.raidincoming.client.renderer.AahebulletRenderer;
import net.mcreator.raidincoming.client.renderer.Aa4headheadRenderer;
import net.mcreator.raidincoming.client.renderer.Aa4headbaseRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RaidincomingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RaidincomingModEntities.AA_4HEADBASE.get(), Aa4headbaseRenderer::new);
		event.registerEntityRenderer(RaidincomingModEntities.AA_4HEADHEAD.get(), Aa4headheadRenderer::new);
		event.registerEntityRenderer(RaidincomingModEntities.AAHEBULLET.get(), AahebulletRenderer::new);
		event.registerEntityRenderer(RaidincomingModEntities.PILLAGERPLANETYPE_1.get(), EntPillagerplanetype1Renderer::new);
		event.registerEntityRenderer(RaidincomingModEntities.ENT_PILLAGERPLANETYPE_1NPIL.get(), EntPillagerplanetype1npilRenderer::new);
		event.registerEntityRenderer(RaidincomingModEntities.ENT_PILLAGERPLANETYPE_2.get(), EntPillagerplanetype2Renderer::new);
		event.registerEntityRenderer(RaidincomingModEntities.PUPILLAGERTYP_2BOMB.get(), Pupillagertyp2bombRenderer::new);
	}
}
