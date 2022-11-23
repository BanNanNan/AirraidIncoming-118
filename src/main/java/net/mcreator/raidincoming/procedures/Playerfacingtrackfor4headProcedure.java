package net.mcreator.raidincoming.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.raidincoming.init.RaidincomingModEntities;
import net.mcreator.raidincoming.entity.AahebulletEntity;
import net.mcreator.raidincoming.entity.Aa4headheadEntity;
import net.mcreator.raidincoming.entity.Aa4headbaseEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Playerfacingtrackfor4headProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.5 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Aa4headbaseEntity) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
									"execute as @e[type=raidincoming:aa_4headbase] at @s if entity @e[type=raidincoming:aa_4headhead,limit=1,distance=..1,sort=nearest] run tp @e[type=raidincoming:aa_4headhead,sort=nearest,limit=1,distance=..1] ~ ~0.2 ~");
					}
				}
				if (entityiterator instanceof Aa4headheadEntity && entity.getPersistentData().getDouble("ShootDelay") >= 1) {
					entity.getPersistentData().putDouble("ShootDelay", (entity.getPersistentData().getDouble("ShootDelay") + 1));
					if (entity.getPersistentData().getDouble("ShootDelay") == 10) {
						for (int index0 = 0; index0 < (int) (1); index0++) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AahebulletEntity(RaidincomingModEntities.AAHEBULLET.get(), _level);
								entityToSpawn.moveTo((x + Math.cos((entity.getYRot() + 40) * (Math.PI / 180)) * 1.1), (y + 0.8),
										(z + Math.sin((entity.getYRot() + 40) * (Math.PI / 180)) * 1.1), entity.getYRot(),
										(float) (entity.getXRot() + -20));
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (entity.getPersistentData().getDouble("ShootDelay") == 20) {
						for (int index1 = 0; index1 < (int) (1); index1++) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AahebulletEntity(RaidincomingModEntities.AAHEBULLET.get(), _level);
								entityToSpawn.moveTo((x + Math.cos((entity.getYRot() + 140) * (Math.PI / 180)) * 1.1), (y + 0.8),
										(z + Math.sin((entity.getYRot() + 140) * (Math.PI / 180)) * 1.1), entity.getYRot(),
										(float) (entity.getXRot() + -20));
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (entity.getPersistentData().getDouble("ShootDelay") == 30) {
						for (int index2 = 0; index2 < (int) (1); index2++) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AahebulletEntity(RaidincomingModEntities.AAHEBULLET.get(), _level);
								entityToSpawn.moveTo((x + Math.cos((entity.getYRot() + 40) * (Math.PI / 180)) * 1.1), (y + 0.8),
										(z + Math.sin((entity.getYRot() + 40) * (Math.PI / 180)) * 1.1), entity.getYRot(),
										(float) (entity.getXRot() + -20));
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (entity.getPersistentData().getDouble("ShootDelay") == 40) {
						for (int index3 = 0; index3 < (int) (1); index3++) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS,
											(float) 0.1, 2, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AahebulletEntity(RaidincomingModEntities.AAHEBULLET.get(), _level);
								entityToSpawn.moveTo((x + Math.cos((entity.getYRot() + 140) * (Math.PI / 180)) * 1.1), (y + 0.8),
										(z + Math.sin((entity.getYRot() + 140) * (Math.PI / 180)) * 1.1), entity.getYRot(),
										(float) (entity.getXRot() + -20));
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (entity.getPersistentData().getDouble("ShootDelay") >= 41) {
						entity.getPersistentData().putDouble("ShootDelay", 1);
					}
				}
			}
		}
	}
}
