
package net.mcreator.raidincoming.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.raidincoming.procedures.Pupillagertyp1dieProcedure;
import net.mcreator.raidincoming.procedures.Pudpilgertyp1tickProcedure;
import net.mcreator.raidincoming.procedures.Pudpilgertyp1spawnProcedure;
import net.mcreator.raidincoming.procedures.AiconditiontestProcedure;
import net.mcreator.raidincoming.init.RaidincomingModEntities;

import javax.annotation.Nullable;

import java.util.EnumSet;

public class EntPillagerplanetype1Entity extends Monster implements RangedAttackMob {
	public EntPillagerplanetype1Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(RaidincomingModEntities.PILLAGERPLANETYPE_1.get(), world);
	}

	public EntPillagerplanetype1Entity(EntityType<EntPillagerplanetype1Entity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, true) {
			@Override
			public boolean canUse() {
				double x = EntPillagerplanetype1Entity.this.getX();
				double y = EntPillagerplanetype1Entity.this.getY();
				double z = EntPillagerplanetype1Entity.this.getZ();
				Entity entity = EntPillagerplanetype1Entity.this;
				Level world = EntPillagerplanetype1Entity.this.level;
				return super.canUse() && AiconditiontestProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EntPillagerplanetype1Entity.this.getX();
				double y = EntPillagerplanetype1Entity.this.getY();
				double z = EntPillagerplanetype1Entity.this.getZ();
				Entity entity = EntPillagerplanetype1Entity.this;
				Level world = EntPillagerplanetype1Entity.this.level;
				return super.canContinueToUse() && AiconditiontestProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (EntPillagerplanetype1Entity.this.getTarget() != null && !EntPillagerplanetype1Entity.this.getMoveControl().hasWanted()) {
					double x = EntPillagerplanetype1Entity.this.getX();
					double y = EntPillagerplanetype1Entity.this.getY();
					double z = EntPillagerplanetype1Entity.this.getZ();
					Entity entity = EntPillagerplanetype1Entity.this;
					return AiconditiontestProcedure.execute(entity);
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				double x = EntPillagerplanetype1Entity.this.getX();
				double y = EntPillagerplanetype1Entity.this.getY();
				double z = EntPillagerplanetype1Entity.this.getZ();
				Entity entity = EntPillagerplanetype1Entity.this;
				return AiconditiontestProcedure.execute(entity) && EntPillagerplanetype1Entity.this.getMoveControl().hasWanted()
						&& EntPillagerplanetype1Entity.this.getTarget() != null && EntPillagerplanetype1Entity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = EntPillagerplanetype1Entity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				EntPillagerplanetype1Entity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.2);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = EntPillagerplanetype1Entity.this.getTarget();
				if (EntPillagerplanetype1Entity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					EntPillagerplanetype1Entity.this.doHurtTarget(livingentity);
				} else {
					double d0 = EntPillagerplanetype1Entity.this.distanceToSqr(livingentity);
					if (d0 < 25) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						EntPillagerplanetype1Entity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.2);
					}
				}
			}
		});
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}

			@Override
			public boolean canUse() {
				double x = EntPillagerplanetype1Entity.this.getX();
				double y = EntPillagerplanetype1Entity.this.getY();
				double z = EntPillagerplanetype1Entity.this.getZ();
				Entity entity = EntPillagerplanetype1Entity.this;
				Level world = EntPillagerplanetype1Entity.this.level;
				return super.canUse() && AiconditiontestProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = EntPillagerplanetype1Entity.this.getX();
				double y = EntPillagerplanetype1Entity.this.getY();
				double z = EntPillagerplanetype1Entity.this.getZ();
				Entity entity = EntPillagerplanetype1Entity.this;
				Level world = EntPillagerplanetype1Entity.this.level;
				return super.canContinueToUse() && AiconditiontestProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.ILLAGER;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public double getPassengersRidingOffset() {
		return super.getPassengersRidingOffset() + -0.3;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.celebrate"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		Pupillagertyp1dieProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		Pudpilgertyp1spawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		Pudpilgertyp1tickProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		Arrow entityarrow = new Arrow(this.level, this);
		double d0 = target.getY() + target.getEyeHeight() - 1.1;
		double d1 = target.getX() - this.getX();
		double d3 = target.getZ() - this.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1.6F, 12.0F);
		level.addFreshEntity(entityarrow);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 24);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 35);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}
}
