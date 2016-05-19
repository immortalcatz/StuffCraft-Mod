package dr_detonation.stuffcraft.entity.whale;

import cpw.mods.fml.common.registry.EntityRegistry;
import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityWhale {
	
	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		createEntity(EntityWhaleMob.class, "Whale", 0xADADAD, 0x00BAF7);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityRegistry.registerModEntity(entityClass, entityName, id, StuffCraft.instance, 24, 1, true);
		EntityRegistry.addSpawn(entityClass, 3, 0, 5, EnumCreatureType.waterCreature, new BiomeGenBase[]{BiomeGenBase.ocean, BiomeGenBase.deepOcean});
		createEgg(id, solidColor, spotColor);
	}

	private static void createEgg(int id, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, solidColor, spotColor));
	}
	
}
