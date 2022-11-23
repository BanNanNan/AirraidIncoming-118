package net.mcreator.raidincoming.procedures;

import net.minecraft.world.entity.Entity;

public class Pupillagertyp2attackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("DropDelay", 20);
		entity.getPersistentData().putDouble("DropCount", (entity.getPersistentData().getDouble("DropCount") + 1));
	}
}
