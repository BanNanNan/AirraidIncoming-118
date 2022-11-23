package net.mcreator.raidincoming.procedures;

import net.minecraft.world.entity.Entity;

public class AiconditiontestProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("MotionMode") == 0) {
			return true;
		}
		return false;
	}
}
