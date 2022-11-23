
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raidincoming.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.raidincoming.network.KeyshootMessage;
import net.mcreator.raidincoming.RaidincomingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RaidincomingModKeyMappings {
	public static final KeyMapping KEYSHOOT = new KeyMapping("key.raidincoming.keyshoot", GLFW.GLFW_KEY_LEFT_CONTROL,
			"key.categories.airraidincoming");
	private static long KEYSHOOT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(KEYSHOOT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == KEYSHOOT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						RaidincomingMod.PACKET_HANDLER.sendToServer(new KeyshootMessage(0, 0));
						KeyshootMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						KEYSHOOT_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - KEYSHOOT_LASTPRESS);
						RaidincomingMod.PACKET_HANDLER.sendToServer(new KeyshootMessage(1, dt));
						KeyshootMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
