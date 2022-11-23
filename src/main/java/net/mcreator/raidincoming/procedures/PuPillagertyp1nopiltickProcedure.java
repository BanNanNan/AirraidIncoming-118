package net.mcreator.raidincoming.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PuPillagertyp1nopiltickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.8), (-0.3), (entity.getLookAngle().z * 0.8)));
		if (!world.isEmptyBlock(new BlockPos(x, y - 0.1, z))) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"particle minecraft:explosion ~ ~ ~ 1 0.1 1 1 5 normal @a");
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"particle campfire_cosy_smoke ~ ~ ~ 0 0 0 0.5 20 force @a");
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"particle lava ~ ~ ~ 0 0 0 0.5 6 force @a");
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.AMBIENT, 3,
							(float) 0.8);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
							SoundSource.AMBIENT, 3, (float) 0.8, false);
				}
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
		entity.getPersistentData().putDouble("Falling", (entity.getPersistentData().getDouble("Falling") + 0.002));
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"particle minecraft:flame ^ ^ ^-1.5 0.5 0.1 0.5 0.1 3 force @a");
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"particle minecraft:smoke ^ ^ ^-1.5 0 0.1 0 0.1 3 force @a");
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"particle minecraft:explosion ^ ^ ^-1.5 1 1 1 0.1 1 force @a");
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.didgeridoo")), SoundSource.AMBIENT, (float) 1.5,
						(float) entity.getPersistentData().getDouble("Falling"));
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.didgeridoo")),
						SoundSource.AMBIENT, (float) 1.5, (float) entity.getPersistentData().getDouble("Falling"), false);
			}
		}
	}
}
