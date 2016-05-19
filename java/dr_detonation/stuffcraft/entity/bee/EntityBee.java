package dr_detonation.stuffcraft.entity.bee;

import cpw.mods.fml.common.registry.EntityRegistry;
import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityBee {
	
	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		createEntity(EntityBeeMob.class, "Bee", 0x1F1F1F, 0xECFF17);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityRegistry.registerModEntity(entityClass, entityName, id, StuffCraft.instance, 24, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 20, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills});
		createEgg(id, solidColor, spotColor);
	}

	private static void createEgg(int id, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, solidColor, spotColor));
	}
	
}
