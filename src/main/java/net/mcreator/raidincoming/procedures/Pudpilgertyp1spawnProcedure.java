package net.mcreator.raidincoming.procedures;

import net.minecraft.world.entity.Entity;

public class Pudpilgertyp1spawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("isAttackmode", 0);
		entity.getPersistentData().putDouble("MotionMode", 0);
		entity.getPersistentData().putDouble("MotionDelay", 0);
	}
}
