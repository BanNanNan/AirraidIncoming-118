
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raidincoming.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.raidincoming.entity.EntPillagerplanetype2Entity;
import net.mcreator.raidincoming.entity.EntPillagerplanetype1npilEntity;
import net.mcreator.raidincoming.entity.EntPillagerplanetype1Entity;
import net.mcreator.raidincoming.entity.AahebulletEntity;
import net.mcreator.raidincoming.entity.Aa4headheadEntity;
import net.mcreator.raidincoming.entity.Aa4headbaseEntity;
import net.mcreator.raidincoming.RaidincomingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RaidincomingModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, RaidincomingMod.MODID);
	public static final RegistryObject<EntityType<Aa4headbaseEntity>> AA_4HEADBASE = register("aa_4headbase",
			EntityType.Builder.<Aa4headbaseEntity>of(Aa4headbaseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Aa4headbaseEntity::new)

					.sized(1f, 0.5f));
	public static final RegistryObject<EntityType<Aa4headheadEntity>> AA_4HEADHEAD = register("aa_4headhead",
			EntityType.Builder.<Aa4headheadEntity>of(Aa4headheadEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(Aa4headheadEntity::new)

					.sized(1f, 0.5f));
	public static final RegistryObject<EntityType<AahebulletEntity>> AAHEBULLET = register("aahebullet",
			EntityType.Builder.<AahebulletEntity>of(AahebulletEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AahebulletEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<EntPillagerplanetype1Entity>> PILLAGERPLANETYPE_1 = register("pillagerplanetype_1",
			EntityType.Builder.<EntPillagerplanetype1Entity>of(EntPillagerplanetype1Entity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EntPillagerplanetype1Entity::new)

					.sized(1.2f, 1f));
	public static final RegistryObject<EntityType<EntPillagerplanetype1npilEntity>> ENT_PILLAGERPLANETYPE_1NPIL = register(
			"ent_pillagerplanetype_1npil",
			EntityType.Builder.<EntPillagerplanetype1npilEntity>of(EntPillagerplanetype1npilEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EntPillagerplanetype1npilEntity::new)

					.sized(1.2f, 1f));
	public static final RegistryObject<EntityType<EntPillagerplanetype2Entity>> ENT_PILLAGERPLANETYPE_2 = register("ent_pillagerplanetype_2",
			EntityType.Builder.<EntPillagerplanetype2Entity>of(EntPillagerplanetype2Entity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EntPillagerplanetype2Entity::new)

					.sized(1.2f, 1.2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Aa4headbaseEntity.init();
			Aa4headheadEntity.init();
			AahebulletEntity.init();
			EntPillagerplanetype1Entity.init();
			EntPillagerplanetype1npilEntity.init();
			EntPillagerplanetype2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(AA_4HEADBASE.get(), Aa4headbaseEntity.createAttributes().build());
		event.put(AA_4HEADHEAD.get(), Aa4headheadEntity.createAttributes().build());
		event.put(AAHEBULLET.get(), AahebulletEntity.createAttributes().build());
		event.put(PILLAGERPLANETYPE_1.get(), EntPillagerplanetype1Entity.createAttributes().build());
		event.put(ENT_PILLAGERPLANETYPE_1NPIL.get(), EntPillagerplanetype1npilEntity.createAttributes().build());
		event.put(ENT_PILLAGERPLANETYPE_2.get(), EntPillagerplanetype2Entity.createAttributes().build());
	}
}
