package net.mcreator.raidincoming.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import java.util.Random;

public class Pudpilgertyp1tickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("MotionMode") == 1) {
			entity.getPersistentData().putDouble("MotionDelay", (entity.getPersistentData().getDouble("MotionDelay") + 1));
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + 5));
				_ent.setXRot((float) (entity.getXRot() + 0));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.3), (entity.getDeltaMovement().y()), (entity.getLookAngle().z * 0.3)));
			if (entity.getPersistentData().getDouble("MotionDelay") >= 36) {
				entity.getPersistentData().putDouble("MotionMode", 0);
				entity.getPersistentData().putDouble("MotionDelay", 0);
				entity.getPersistentData().putDouble("isAttackmode", 0);
			}
		}
		if (entity.getPersistentData().getDouble("MotionMode") == 2) {
			entity.getPersistentData().putDouble("MotionDelay", (entity.getPersistentData().getDouble("MotionDelay") + 1));
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() - 5));
				_ent.setXRot((float) (entity.getXRot() + 0));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.3), (entity.getDeltaMovement().y()), (entity.getLookAngle().z * 0.3)));
			if (entity.getPersistentData().getDouble("MotionDelay") >= 36) {
				entity.getPersistentData().putDouble("MotionMode", 0);
				entity.getPersistentData().putDouble("MotionDelay", 0);
				entity.getPersistentData().putDouble("isAttackmode", 0);
			}
		}
		if (entity.getPersistentData().getDouble("MotionMode") == 3) {
			entity.getPersistentData().putDouble("MotionDelay", (entity.getPersistentData().getDouble("MotionDelay") + 1));
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + 0.5));
				_ent.setXRot((float) (entity.getXRot() + 0));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.1), 0.12, (entity.getLookAngle().z * 1.1)));
			if (entity.getPersistentData().getDouble("MotionDelay") >= 60) {
				entity.getPersistentData().putDouble("MotionMode", (Mth.nextInt(new Random(), 1, 2)));
				entity.getPersistentData().putDouble("MotionDelay", 0);
			}
		}
		if (entity.getPersistentData().getDouble("MotionMode") == 4) {
			entity.getPersistentData().putDouble("MotionDelay", (entity.getPersistentData().getDouble("MotionDelay") + 1));
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() - 0.5));
				_ent.setXRot((float) (entity.getXRot() + 0));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.1), 0.12, (entity.getLookAngle().z * 1.1)));
			if (entity.getPersistentData().getDouble("MotionDelay") >= 60) {
				entity.getPersistentData().putDouble("MotionMode", (Mth.nextInt(new Random(), 1, 2)));
				entity.getPersistentData().putDouble("MotionDelay", 0);
			}
		}
		if (entity.getPersistentData().getDouble("MotionMode") == 0) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.3), (entity.getDeltaMovement().y()), (entity.getLookAngle().z * 0.3)));
		}
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()
				&& entity.getPersistentData().getDouble("MotionDelay") == 0) {
			entity.getPersistentData().putDouble("MotionMode", (Mth.nextInt(new Random(), 3, 4)));
		}
	}
}
