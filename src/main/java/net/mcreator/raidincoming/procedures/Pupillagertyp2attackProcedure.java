package net.mcreator.raidincoming.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.raidincoming.init.RaidincomingModEntities;
import net.mcreator.raidincoming.entity.Pupillagertyp2bombEntity;

import java.util.Random;

public class Pupillagertyp2attackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("DropDelay", 20);
		entity.getPersistentData().putDouble("DropCount", (entity.getPersistentData().getDouble("DropCount") - 1));
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new Pupillagertyp2bombEntity(RaidincomingModEntities.PUPILLAGERTYP_2BOMB.get(), _level);
			entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + Mth.nextDouble(new Random(), -0.02, 0.02)), 0,
					(entity.getDeltaMovement().z() + Mth.nextDouble(new Random(), -0.02, 0.02)));
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
