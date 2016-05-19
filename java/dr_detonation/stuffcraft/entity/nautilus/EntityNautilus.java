package dr_detonation.stuffcraft.entity.nautilus;

import cpw.mods.fml.common.registry.EntityRegistry;
import dr_detonation.stuffcraft.StuffCraft;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityNautilus {

	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		createEntity(EntityNautilusMob.class, "Nautilus", 0xFFFF73, 0xFF91FD);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityRegistry.registerModEntity(entityClass, entityName, id, StuffCraft.instance, 16, 1, true);
		EntityRegistry.addSpawn(entityClass, 6, 0, 4, EnumCreatureType.waterCreature, new BiomeGenBase[]{BiomeGenBase.ocean, BiomeGenBase.deepOcean, BiomeGenBase.river});
		createEgg(id, solidColor, spotColor);
	}

	private static void createEgg(int id, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, solidColor, spotColor));
	}
	
}
