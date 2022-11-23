package net.mcreator.raidincoming.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.raidincoming.entity.Aa4headheadEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Aa4headplayershootcancelProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.5 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Aa4headheadEntity) {
					entityiterator.getPersistentData().putDouble("ShootDelay", 0);
				}
			}
		}
	}
}
