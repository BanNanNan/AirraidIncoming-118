package net.mcreator.raidincoming.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

public class Pupillagertyp2tickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("DropDelay") != 0) {
			entity.getPersistentData().putDouble("DropDelay", (entity.getPersistentData().getDouble("DropDelay") - 1));
		}
		{
			Entity _ent = entity;
			_ent.setYRot(entity.getYRot());
			_ent.setXRot(75);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		if (!((world.getBlockState(new BlockPos(
				entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
				entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
				entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
				.getBlock() == Blocks.AIR)) {
			if (!((world.getBlockState(new BlockPos(
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
					.getBlock() == Blocks.AIR)) {
				entity.setDeltaMovement(
						new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.01), (entity.getDeltaMovement().z())));
			}
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.018), (entity.getDeltaMovement().z())));
		} else {
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - 0.008), (entity.getDeltaMovement().z())));
		}
		if (!world
				.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(
						(entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getX()),
						(entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getY()),
						(entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getZ())),
						4, 4, 4), e -> true)
				.isEmpty() && entity.getPersistentData().getDouble("DropDelay") == 0 && entity.getPersistentData().getDouble("DropCount") != 4) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("PlayerDetect"), ChatType.SYSTEM, Util.NIL_UUID);
			}
			Pupillagertyp2attackProcedure.execute(world, entity);
		}
		entity.setDeltaMovement(new Vec3((entity.getLookAngle().x), (entity.getDeltaMovement().y()), (entity.getLookAngle().z)));
	}
}
