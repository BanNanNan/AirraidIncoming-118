
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raidincoming.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.raidincoming.RaidincomingMod;

public class RaidincomingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RaidincomingMod.MODID);
	public static final RegistryObject<Item> AA_4HEADBASE = REGISTRY.register("aa_4headbase_spawn_egg",
			() -> new ForgeSpawnEggItem(RaidincomingModEntities.AA_4HEADBASE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> AA_4HEADHEAD = REGISTRY.register("aa_4headhead_spawn_egg",
			() -> new ForgeSpawnEggItem(RaidincomingModEntities.AA_4HEADHEAD, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> AAHEBULLET = REGISTRY.register("aahebullet_spawn_egg",
			() -> new ForgeSpawnEggItem(RaidincomingModEntities.AAHEBULLET, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PILLAGERPLANETYPE_1 = REGISTRY.register("pillagerplanetype_1_spawn_egg",
			() -> new ForgeSpawnEggItem(RaidincomingModEntities.PILLAGERPLANETYPE_1, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ENT_PILLAGERPLANETYPE_2 = REGISTRY.register("ent_pillagerplanetype_2_spawn_egg",
			() -> new ForgeSpawnEggItem(RaidincomingModEntities.ENT_PILLAGERPLANETYPE_2, -1, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
