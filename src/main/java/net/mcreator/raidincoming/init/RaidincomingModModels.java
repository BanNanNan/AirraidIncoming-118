
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raidincoming.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.raidincoming.client.model.Modelpillagerplanetype2;
import net.mcreator.raidincoming.client.model.Modelpillagerplanetype1v2nopilot;
import net.mcreator.raidincoming.client.model.Modelpillagerplanetype1v2;
import net.mcreator.raidincoming.client.model.Modelaa4headhe;
import net.mcreator.raidincoming.client.model.Modelaa4headbasehead_45dgrev2;
import net.mcreator.raidincoming.client.model.Modelaa4headbase;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RaidincomingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpillagerplanetype2.LAYER_LOCATION, Modelpillagerplanetype2::createBodyLayer);
		event.registerLayerDefinition(Modelaa4headhe.LAYER_LOCATION, Modelaa4headhe::createBodyLayer);
		event.registerLayerDefinition(Modelpillagerplanetype1v2.LAYER_LOCATION, Modelpillagerplanetype1v2::createBodyLayer);
		event.registerLayerDefinition(Modelaa4headbase.LAYER_LOCATION, Modelaa4headbase::createBodyLayer);
		event.registerLayerDefinition(Modelpillagerplanetype1v2nopilot.LAYER_LOCATION, Modelpillagerplanetype1v2nopilot::createBodyLayer);
		event.registerLayerDefinition(Modelaa4headbasehead_45dgrev2.LAYER_LOCATION, Modelaa4headbasehead_45dgrev2::createBodyLayer);
	}
}
