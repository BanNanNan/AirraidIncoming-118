package net.mcreator.raidincoming.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.raidincoming.entity.EntPillagerplanetype1Entity;
import net.mcreator.raidincoming.entity.AahebulletEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class AaheintickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("isFuseActive", (entity.getPersistentData().getDouble("isFuseActive") + 1));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.5 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof EntPillagerplanetype1Entity && !(entityiterator instanceof AahebulletEntity)
						&& entity.getPersistentData().getDouble("isFuseActive") >= 2) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"summon firework_rocket ~ ~ ~ {NoGravity:1b,Silent:1b,LifeTime:0,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Colors:[I;0]}]}}}}");
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (entity.getPersistentData().getDouble("isFuseActive") == 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"particle campfire_cosy_smoke ~ ~ ~ 0.01 0.01 0.01 0.01 3 normal");
		}
		if (entity.getPersistentData().getDouble("isFuseActive") <= 30) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
						"particle smoke ~ ~ ~ 0.01 0.01 0.01 0 3 normal");
		}
		if (entity.getPersistentData().getDouble("isFuseActive") == 60) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"summon firework_rocket ~ ~ ~ {NoGravity:1b,Silent:1b,LifeTime:0,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:0,Colors:[I;0]}]}}}}");
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
