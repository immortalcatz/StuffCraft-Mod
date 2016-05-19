package dr_detonation.stuffcraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dr_detonation.stuffcraft.emerald.ItemEmeraldAxe;
import dr_detonation.stuffcraft.emerald.ItemEmeraldHoe;
import dr_detonation.stuffcraft.emerald.ItemEmeraldPickaxe;
import dr_detonation.stuffcraft.emerald.ItemEmeraldShovel;
import dr_detonation.stuffcraft.emerald.ItemEmeraldSword;
import dr_detonation.stuffcraft.entity.bee.EntityBee;
import dr_detonation.stuffcraft.entity.ghost.EntityGhost;
import dr_detonation.stuffcraft.entity.nautilus.EntityNautilus;
import dr_detonation.stuffcraft.entity.whale.EntityWhale;
import dr_detonation.stuffcraft.kevlar.ItemKevlarArmor;
import dr_detonation.stuffcraft.nightVision.ItemNightVisionArmor;
import dr_detonation.stuffcraft.proxy.ServerProxy;
import dr_detonation.stuffcraft.scuba.ItemScuba;
import dr_detonation.stuffcraft.silver.ItemSilverAxe;
import dr_detonation.stuffcraft.silver.ItemSilverHoe;
import dr_detonation.stuffcraft.silver.ItemSilverPickaxe;
import dr_detonation.stuffcraft.silver.ItemSilverShovel;
import dr_detonation.stuffcraft.silver.ItemSilverSword;
import dr_detonation.stuffcraft.steel.ItemCrowbar;
import dr_detonation.stuffcraft.steel.ItemSteelArmor;
import dr_detonation.stuffcraft.steel.ItemSteelAxe;
import dr_detonation.stuffcraft.steel.ItemSteelHoe;
import dr_detonation.stuffcraft.steel.ItemSteelPickaxe;
import dr_detonation.stuffcraft.steel.ItemSteelShovel;
import dr_detonation.stuffcraft.steel.ItemSteelSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "sc", name = "StuffCraft Mod", version = "1.2.2")
public class StuffCraft {

	public static Item donut;
	public static Item powderedSugar;
	public static Item compressor;
	public static Item liquidOxygen;
	public static Item gatherOxygen;
	public static Item liquidCarbon;
	public static Item gatherCarbon;
	public static Item dryIce;
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldHoe;
	public static Item emeraldShovel;
	public static Item emeraldSword;
	public static Item steelIngot;
	public static Block steelBlock;
	public static Item steelPickaxe;
	public static Item steelAxe;
	public static Item steelHoe;
	public static Item steelShovel;
	public static Item steelSword;
	public static Item steelHelmet;
	public static Item steelChestplate;
	public static Item steelLeggings;
	public static Item steelBoots;
	public static Item hotdog;
	public static Item carbonIngot;
	public static Block copperOre;
	public static Item copperIngot;
	public static Block kevlarOreSurface;
	public static Block kevlarOreNether;
	public static Item kevlarIngot;
	public static Item kevlarVest;
	public static Item loom;
	public static Item kevlarFiber;
	public static Achievement achievementKevlar;
	public static Achievement bulletproof;
	public static Enchantment superSpeed;
	public static Achievement mineCopper;
	public static Item crowbar;
	public static Achievement murderStick;
	public static Achievement gotSteel;
	public static Item cup;
	public static Item iformer;
	public static Item coffeeGrounds;
	public static Item coffee;
	public static Item copperWire;
	public static Achievement wiresMeanPower;
	public static Block copperBlock;
	public static Item silverIngot;
	public static Block silverOre;
	public static Item silverPickaxe;
	public static Item silverAxe;
	public static Item silverShovel;
	public static Item silverHoe;
	public static Item silverSword;
	public static Block cheeseOre;
	public static Item cheese;
	public static Achievement getCheese;
	public static Enchantment invisibility;
	public static Item kevlarHelmet;
	public static Achievement breathe;
	public static Item scuba;
	public static Item rubber;
	public static Enchantment scubaMask;
	public static Item lettuce;
	public static Item dressing;
	public static Item salad;
	public static Achievement eatGreen;
	public static Block rubberBlock;
	public static Block cheeseBlock;
	public static Block xray;
	public static Achievement invisible;
	public static Block asphalt;
	public static Item pizza;
	public static Achievement toldYa;
	public static Item nightVisionHelmet;
	public static Enchantment nvision;
	public static Item nautilusShell;
	public static Item cement;
	public static Block concrete;
	public static Block reConcrete;
	public static Achievement shell;
	public static Item honeycomb;
	public static Item honey;
	
	public static final ItemArmor.ArmorMaterial nightHelmetMat = EnumHelper.addArmorMaterial("nightHelmet", 50, new int[]{1,0,0,0}, 33);
	public static final ItemArmor.ArmorMaterial scubaMat = EnumHelper.addArmorMaterial("scubaMat", 1324, new int[]{3,0,0,0}, 13);
	public static final Item.ToolMaterial silverToolMat = EnumHelper.addToolMaterial("silverToolMat", 1, 766, 3.4F, 3.5F, 18);
	public static final Item.ToolMaterial crowbarMat = EnumHelper.addToolMaterial("crowbarMat", 2, 1377, 7.5F, 9.0F, 6);
	public static final ItemArmor.ArmorMaterial kevlarArmorMat = EnumHelper.addArmorMaterial("kevlarArmorMat", 4540, new int[]{2,18,0,0}, 9);
	public static final ItemArmor.ArmorMaterial steelArmorMat = EnumHelper.addArmorMaterial("steelArmorMat", 1745, new int[]{5,11,9,5}, 11);
	public static final Item.ToolMaterial steelToolMat = EnumHelper.addToolMaterial("steelToolMat", 3, 1431, 7.875F, 6.5F, 11);
	public static final Item.ToolMaterial emeraldToolMat = EnumHelper.addToolMaterial("emeraldToolMat", 3, 1356, 8.0F, 8.0F, 17);
		
	@SidedProxy(clientSide = "dr_detonation.stuffcraft.proxy.ClientProxy", serverSide = "dr_detonation.stuffcraft.proxy.ServerProxy")
	public static ServerProxy serverProxy;
	
	@Instance("sc")
	public static StuffCraft instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		donut = new ItemFood(3, 4, false).setUnlocalizedName("Donut").setTextureName("sc:donut").setCreativeTab(tabStuffCraftFood);
		powderedSugar = new ItemPowderedSugar().setUnlocalizedName("PowderedSugar").setTextureName("sc:powderedsugar").setCreativeTab(tabStuffCraftItems);
		compressor = new ItemCompressor().setUnlocalizedName("Compressor").setTextureName("sc:compressor").setCreativeTab(tabStuffCraftItems);
		liquidOxygen = new ItemLiquidOxygen().setUnlocalizedName("LiquidOxygen").setTextureName("sc:liquidoxygen").setCreativeTab(tabStuffCraftItems).setContainerItem(Items.bucket).setMaxStackSize(1);
		gatherOxygen = new ItemGather().setUnlocalizedName("GatherOxygen").setTextureName("sc:gather").setCreativeTab(tabStuffCraftItems).setMaxStackSize(1);
		liquidCarbon = new ItemLiquidCarbon().setUnlocalizedName("LiquidCarbon").setTextureName("sc:liquidcarbon").setCreativeTab(tabStuffCraftItems).setContainerItem(Items.bucket).setMaxStackSize(1);
		gatherCarbon = new ItemGatherCarbon().setUnlocalizedName("GatherCarbon").setTextureName("sc:gathercarbon").setCreativeTab(tabStuffCraftItems).setMaxStackSize(1);
		dryIce = new ItemDryIce().setUnlocalizedName("DryIce").setTextureName("sc:dryice").setCreativeTab(tabStuffCraftItems);
		emeraldPickaxe = new ItemEmeraldPickaxe(emeraldToolMat).setUnlocalizedName("EmeraldPickaxe").setTextureName("sc:emeraldpickaxe").setCreativeTab(tabStuffCraftItems);
		emeraldAxe = new ItemEmeraldAxe(emeraldToolMat).setUnlocalizedName("EmeraldAxe").setTextureName("sc:emeraldaxe").setCreativeTab(tabStuffCraftItems);
		emeraldHoe = new ItemEmeraldHoe(emeraldToolMat).setUnlocalizedName("EmeraldHoe").setTextureName("sc:emeraldhoe").setCreativeTab(tabStuffCraftItems);
		emeraldShovel = new ItemEmeraldShovel(emeraldToolMat).setUnlocalizedName("EmeraldShovel").setTextureName("sc:emeraldshovel").setCreativeTab(tabStuffCraftItems);
		emeraldSword = new ItemEmeraldSword(emeraldToolMat).setUnlocalizedName("EmeraldSword").setTextureName("sc:emeraldsword").setCreativeTab(tabStuffCraftItems);
		steelIngot = new ItemSteelIngot().setUnlocalizedName("SteelIngot").setTextureName("sc:steelingot").setCreativeTab(tabStuffCraftItems);
		steelBlock = new BlockSteelBlock(Material.iron).setBlockName("SteelBlock").setBlockTextureName("sc:steelblock").setCreativeTab(tabStuffCraftBlocks);
		steelPickaxe = new ItemSteelPickaxe(steelToolMat).setUnlocalizedName("SteelPickaxe").setTextureName("sc:steelpickaxe").setCreativeTab(tabStuffCraftItems);
		steelAxe = new ItemSteelAxe(steelToolMat).setUnlocalizedName("SteelAxe").setTextureName("sc:steelaxe").setCreativeTab(tabStuffCraftItems);
		steelHoe = new ItemSteelHoe(steelToolMat).setUnlocalizedName("SteelHoe").setTextureName("sc:steelhoe").setCreativeTab(tabStuffCraftItems);
		steelShovel = new ItemSteelShovel(steelToolMat).setUnlocalizedName("SteelShovel").setTextureName("sc:steelshovel").setCreativeTab(tabStuffCraftItems);
		steelSword = new ItemSteelSword(steelToolMat).setUnlocalizedName("SteelSword").setTextureName("sc:steelsword").setCreativeTab(tabStuffCraftItems);
		steelHelmet = new ItemSteelArmor(steelArmorMat, 0, 0).setUnlocalizedName("SteelHelmet").setTextureName("sc:steelhelmet").setCreativeTab(tabStuffCraftItems);
		steelChestplate = new ItemSteelArmor(steelArmorMat, 0, 1).setUnlocalizedName("SteelChestplate").setTextureName("sc:steelchestplate").setCreativeTab(tabStuffCraftItems);
		steelLeggings = new ItemSteelArmor(steelArmorMat, 0, 2).setUnlocalizedName("SteelLeggings").setTextureName("sc:steelleggings").setCreativeTab(tabStuffCraftItems);
		steelBoots = new ItemSteelArmor(steelArmorMat, 0, 3).setUnlocalizedName("SteelBoots").setTextureName("sc:steelboots").setCreativeTab(tabStuffCraftItems);
		hotdog = new ItemFood(5, 5, true).setUnlocalizedName("Hotdog").setTextureName("sc:hotdog").setCreativeTab(tabStuffCraftFood);
		carbonIngot = new ItemCarbonIngot().setUnlocalizedName("CarbonIngot").setTextureName("sc:carboningot").setCreativeTab(tabStuffCraftItems);		
		copperOre = new BlockCopperOre(Material.rock).setBlockName("CopperOre").setBlockTextureName("sc:copperore").setCreativeTab(tabStuffCraftBlocks);
		copperIngot = new ItemCopperIngot().setUnlocalizedName("CopperIngot").setTextureName("sc:copperingot").setCreativeTab(tabStuffCraftItems);
		kevlarOreSurface = new BlockKevlarOreSurface(Material.iron).setBlockName("KevlarOreSurface").setBlockTextureName("sc:kevlaroresurface").setCreativeTab(tabStuffCraftBlocks);
		kevlarOreNether = new BlockKevlarOreNether(Material.iron).setBlockName("KevlarOreNether").setBlockTextureName("sc:kevlarorenether").setCreativeTab(tabStuffCraftBlocks);
		kevlarIngot = new ItemKevlarIngot().setUnlocalizedName("KevlarIngot").setTextureName("sc:kevlaringot").setCreativeTab(tabStuffCraftItems);
		kevlarVest = new ItemKevlarArmor(kevlarArmorMat, 1, 1).setUnlocalizedName("KevlarVest").setTextureName("sc:kevlarvest").setCreativeTab(tabStuffCraftItems);
		loom = new ItemLoom().setUnlocalizedName("Loom").setTextureName("sc:loom").setCreativeTab(tabStuffCraftItems);
		kevlarFiber = new ItemKevlarFiber().setUnlocalizedName("KevlarFiber").setTextureName("sc:kevlarfiber").setCreativeTab(tabStuffCraftItems);
		crowbar = new ItemCrowbar(crowbarMat).setUnlocalizedName("Crowbar").setTextureName("sc:crowbar").setCreativeTab(tabStuffCraftItems);
		cup = new ItemCup().setUnlocalizedName("Cup").setTextureName("sc:cup").setCreativeTab(tabStuffCraftItems);
		iformer = new ItemIFormer().setUnlocalizedName("IFormer").setTextureName("sc:iformer").setCreativeTab(tabStuffCraftItems);
		coffeeGrounds = new ItemCoffeeGrounds().setUnlocalizedName("CoffeeGrounds").setTextureName("sc:coffeegrounds").setCreativeTab(tabStuffCraftItems);
		coffee = new ItemFood(4, 6, false).setUnlocalizedName("Coffee").setTextureName("sc:cupofcoffee").setCreativeTab(tabStuffCraftFood).setContainerItem(cup).setMaxStackSize(1);
		copperWire = new ItemCopperWire().setUnlocalizedName("CopperWire").setTextureName("sc:copperwire").setCreativeTab(tabStuffCraftItems);
		copperBlock = new BlockCopperBlock(Material.rock).setBlockName("CopperBlock").setBlockTextureName("sc:copperblock").setCreativeTab(tabStuffCraftBlocks);
		silverIngot = new ItemSilverIngot().setUnlocalizedName("SilverIngot").setTextureName("sc:silveringot").setCreativeTab(tabStuffCraftItems);		
		silverOre = new BlockSilverOre(Material.rock).setBlockName("SilverOre").setBlockTextureName("sc:silverore").setCreativeTab(tabStuffCraftBlocks);
		silverPickaxe = new ItemSilverPickaxe(silverToolMat).setUnlocalizedName("SilverPickaxe").setTextureName("sc:silverpickaxe").setCreativeTab(tabStuffCraftItems);
		silverAxe = new ItemSilverAxe(silverToolMat).setUnlocalizedName("SilverAxe").setTextureName("sc:silveraxe").setCreativeTab(tabStuffCraftItems);
		silverHoe = new ItemSilverHoe(silverToolMat).setUnlocalizedName("SilverHoe").setTextureName("sc:silverhoe").setCreativeTab(tabStuffCraftItems);
		silverShovel = new ItemSilverShovel(silverToolMat).setUnlocalizedName("SilverShovel").setTextureName("sc:silvershovel").setCreativeTab(tabStuffCraftItems);
		silverSword = new ItemSilverSword(silverToolMat).setUnlocalizedName("SilverSword").setTextureName("sc:silversword").setCreativeTab(tabStuffCraftItems);
		cheeseOre = new BlockCheeseOre(Material.rock).setBlockName("CheeseOre").setBlockTextureName("sc:cheeseore").setCreativeTab(tabStuffCraftBlocks);
		cheese = new ItemFood(3, 4, false).setUnlocalizedName("Cheese").setTextureName("sc:cheese").setCreativeTab(tabStuffCraftFood);
		kevlarHelmet = new ItemKevlarArmor(kevlarArmorMat, 0, 0).setUnlocalizedName("KevlarHelmet").setTextureName("sc:kevlarhelmet").setCreativeTab(tabStuffCraftItems);
		scuba = new ItemScuba(scubaMat, 0, 0).setUnlocalizedName("Scuba").setTextureName("sc:scuba").setCreativeTab(tabStuffCraftItems);		
		rubber = new ItemRubber().setUnlocalizedName("Rubber").setTextureName("sc:rubber").setCreativeTab(tabStuffCraftItems);
		lettuce = new ItemFood(2, 4, false).setUnlocalizedName("Lettuce").setTextureName("sc:lettuce").setCreativeTab(tabStuffCraftFood);
		dressing = new ItemDressing().setUnlocalizedName("Dressing").setTextureName("sc:saladdressing").setCreativeTab(tabStuffCraftItems);
		salad = new ItemFood(7, 5, false).setUnlocalizedName("Salad").setTextureName("sc:salad").setCreativeTab(tabStuffCraftFood).setContainerItem(Items.bowl).setMaxStackSize(1);
		rubberBlock = new BlockRubber(Material.leaves).setBlockName("RubberBlock").setBlockTextureName("sc:rubberblock").setCreativeTab(tabStuffCraftBlocks);
		cheeseBlock = new BlockCheese(Material.cloth).setBlockName("CheeseBlock").setBlockTextureName("sc:cheeseblock").setCreativeTab(tabStuffCraftBlocks);		
		xray = new BlockXray(Material.rock).setBlockName("Xray").setCreativeTab(tabStuffCraftBlocks);
		asphalt = new BlockAsphalt(Material.rock).setBlockName("Asphalt").setBlockTextureName("sc:asphalt").setCreativeTab(tabStuffCraftBlocks);
		pizza = new ItemFood(12, 6, true).setUnlocalizedName("Pizza").setTextureName("sc:pizza").setCreativeTab(tabStuffCraftFood).setMaxStackSize(1);
		nightVisionHelmet = new ItemNightVisionArmor(nightHelmetMat, 0, 0).setUnlocalizedName("NightVisionHelmet").setTextureName("sc:nvhelmet").setCreativeTab(tabStuffCraftItems); 
		nautilusShell = new ItemNautilusShell().setUnlocalizedName("NautilusShell").setTextureName("sc:nautilusshell").setCreativeTab(tabStuffCraftItems);
		cement = new ItemCement().setUnlocalizedName("Cement").setTextureName("sc:cement").setCreativeTab(tabStuffCraftItems);
		concrete = new BlockConcrete(Material.rock).setBlockName("Concrete").setBlockTextureName("sc:concrete").setCreativeTab(tabStuffCraftBlocks);
		reConcrete = new BlockReConcrete(Material.rock).setBlockName("ReConcrete").setBlockTextureName("sc:reconcrete").setCreativeTab(tabStuffCraftBlocks);
		honeycomb = new ItemFood(2, 3.0F, false).setUnlocalizedName("Honeycomb").setTextureName("sc:honeycomb").setCreativeTab(tabStuffCraftFood);
		honey = new ItemHoney().setUnlocalizedName("Honey").setTextureName("sc:honey").setCreativeTab(tabStuffCraftItems);
		
		toldYa = new Achievement("achievement.toldYa", "toldYa", 4, 4, new ItemStack(pizza), getCheese);
		eatGreen = new Achievement("achievement.eatGreen", "eatGreen", 4, 6, new ItemStack(salad), getCheese);
		achievementKevlar = new Achievement("achievement.mineKevlar", "mineKevlar", 0, 0, new ItemStack(kevlarIngot), (Achievement)null).initIndependentStat().registerStat();
		bulletproof = new Achievement("achievement.bulletproof", "bulletproof", 2, 1, new ItemStack(kevlarVest), achievementKevlar).registerStat();
		mineCopper = new Achievement("achievement.mineCopper", "mineCopper", 4, 2, new ItemStack(copperIngot), achievementKevlar).registerStat();
		gotSteel = new Achievement("achievement.gotSteel", "gotSteel", 6, 4, new ItemStack(steelIngot), achievementKevlar).registerStat();
		murderStick = new Achievement("achievement.murderStick", "murderStick", 2, 3, new ItemStack(crowbar), gotSteel).registerStat();
		wiresMeanPower = new Achievement("achievement.wiresMeanPower", "wiresMeanPower", 7, 2, new ItemStack(copperWire), mineCopper).registerStat();
		getCheese = new Achievement("achievement.getCheese", "getCheese", 0, 4, new ItemStack(cheese), (Achievement)null).initIndependentStat().registerStat();
		breathe = new Achievement("achievement.breathe", "breathe", 0, 2, new ItemStack(liquidOxygen), AchievementList.buildBetterPickaxe).registerStat();
		invisible = new Achievement("achievement.invisible", "invisible", 2, 5, new ItemStack(kevlarHelmet), achievementKevlar).registerStat();
		shell = new Achievement("achievement.shell", "shell", 3, 1, new ItemStack(nautilusShell), (Achievement)null).initIndependentStat().registerStat();
		
		scubaMask = new EnchantmentScubaMask(65, 1, EnumEnchantmentType.armor_head).setName("scubaMask");
		nvision = new EnchantmentNVision(66, 1, EnumEnchantmentType.armor_head).setName("nvision");
		
		GameRegistry.registerItem(honey, "Honey");
		GameRegistry.registerItem(honeycomb, "Honeycomb");
		GameRegistry.registerBlock(reConcrete, "ReConcrete");
		GameRegistry.registerBlock(concrete, "Concrete");
		GameRegistry.registerItem(cement, "Cement");
		GameRegistry.registerItem(nautilusShell, "NautilusShell");
		GameRegistry.registerItem(nightVisionHelmet, "NightVisionHelmet");
		GameRegistry.registerItem(pizza, "Pizza");
		GameRegistry.registerBlock(asphalt, "Asphalt");
		GameRegistry.registerBlock(xray, "Xray");
		GameRegistry.registerBlock(cheeseBlock, "CheeseBlock");
		GameRegistry.registerBlock(rubberBlock, "RubberBlock");
		GameRegistry.registerItem(salad, "Salad");
		GameRegistry.registerItem(dressing, "Dressing");
		GameRegistry.registerItem(lettuce, "Lettuce");
		GameRegistry.registerItem(rubber, "Rubber");
		GameRegistry.registerItem(scuba, "Scuba");
		GameRegistry.registerItem(kevlarHelmet, "KevlarHelmet");
		GameRegistry.registerItem(cheese, "Cheese");
		GameRegistry.registerBlock(cheeseOre, "CheeseOre");
		GameRegistry.registerItem(silverSword, "SilverSword");
		GameRegistry.registerItem(silverShovel, "SilverShovel");
		GameRegistry.registerItem(silverHoe, "SilverHoe");
		GameRegistry.registerItem(silverAxe, "SilverAxe");
		GameRegistry.registerItem(silverPickaxe, "SilverPickaxe");
		GameRegistry.registerBlock(silverOre, "SilverOre");
		GameRegistry.registerItem(silverIngot, "SilverIngot");
		GameRegistry.registerBlock(copperBlock, "CopperBlock");
		GameRegistry.registerItem(copperWire, "CopperWire");
		GameRegistry.registerItem(coffee, "Coffee");
		GameRegistry.registerItem(coffeeGrounds, "CoffeeGrounds");
		GameRegistry.registerItem(iformer, "IFormer");
		GameRegistry.registerItem(cup, "Cup");
		GameRegistry.registerItem(crowbar, "Crowbar");
		GameRegistry.registerItem(kevlarFiber, "KevlarFiber");
		GameRegistry.registerItem(loom, "Loom");
		GameRegistry.registerItem(kevlarVest, "KevlarVest");
		GameRegistry.registerItem(kevlarIngot, "KevlarIngot");
		GameRegistry.registerBlock(kevlarOreNether, "KevlarOreNether");
		GameRegistry.registerBlock(kevlarOreSurface, "KevlarOreSurface");
		GameRegistry.registerItem(copperIngot, "CopperIngot");
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonIngot, carbonIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hotdog, hotdog.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelBoots, steelBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelLeggings, steelLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelChestplate, steelChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelHelmet, steelHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelSword, steelSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelShovel, steelShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelHoe, steelHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelAxe, steelAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelPickaxe, steelPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldSword, emeraldSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldShovel, emeraldShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHoe, emeraldHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldAxe, emeraldAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldPickaxe, emeraldPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dryIce, dryIce.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gatherCarbon, gatherCarbon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(liquidCarbon, liquidCarbon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gatherOxygen, gatherOxygen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(liquidOxygen, liquidOxygen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(compressor, compressor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(powderedSugar, powderedSugar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(donut, donut.getUnlocalizedName().substring(5));
		
		EntityGhost.mainRegistry();
		EntityNautilus.mainRegistry();
		EntityBee.mainRegistry();
		EntityWhale.mainRegistry();
		
		GameRegistry.registerWorldGenerator(new KevlarNetherOreGen(), 0);
		GameRegistry.registerWorldGenerator(new CopperOreGen(), 0);
		GameRegistry.registerWorldGenerator(new KevlarOreGen(), 0);
		GameRegistry.registerWorldGenerator(new SilverOreGen(), 0);
		GameRegistry.registerWorldGenerator(new CheeseOreGen(), 0);
		
		AchievementPage.registerAchievementPage(new AchievementPage("StuffCraft", new Achievement[]{achievementKevlar, bulletproof, mineCopper, gotSteel, murderStick, wiresMeanPower, getCheese, breathe, eatGreen, invisible, toldYa, shell}));
		
		FMLCommonHandler.instance().bus().register(new OxygenOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new WiresOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new SteelOnSmeltEvent());
		FMLCommonHandler.instance().bus().register(new CopperOnMineEvent());
		FMLCommonHandler.instance().bus().register(new KevlarOnMineEvent());
		FMLCommonHandler.instance().bus().register(new KevlarVestOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new CrowbarOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new CheeseOnMineEvent());
		FMLCommonHandler.instance().bus().register(new SaladEatEvent());
		FMLCommonHandler.instance().bus().register(new PizzaOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new NautilusOnKillEvent());
		
		serverProxy.registerRenderThings();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(honey), new Object[]{"h", "i", "b", 'h', honeycomb, 'i', iformer, 'b', Items.glass_bottle});
		GameRegistry.addRecipe(new ItemStack(reConcrete, 8), new Object[]{"ccc", "csc", "ccc", 'c', concrete, 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(concrete, 4), new Object[]{"cg", 'c', cement, 'g', Blocks.gravel});
		GameRegistry.addRecipe(new ItemStack(cement), new Object[]{"ci", "gb", 'c', Items.clay_ball, 'i', Blocks.iron_ore, 'g', Blocks.gravel, 'b', Items.bucket});
		GameRegistry.addRecipe(new ItemStack(pizza), new Object[]{"sss", "ccc", "www", 's', Items.cooked_beef, 'c', cheese, 'w', Items.wheat});
		GameRegistry.addRecipe(new ItemStack(asphalt, 3), new Object[]{"ss", "st", 's', Blocks.stone, 't', Items.clay_ball});
		GameRegistry.addRecipe(new ItemStack(xray), new Object[]{"ggg", "g g", "sgs", 'g', Blocks.glass, 's', Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(cheese, 4), new Object[]{"c", 'c', cheeseBlock});
		GameRegistry.addRecipe(new ItemStack(rubber, 4), new Object[]{"r", 'r', rubberBlock});
		GameRegistry.addRecipe(new ItemStack(cheeseBlock), new Object[]{"cc", "cc", 'c', cheese});
		GameRegistry.addRecipe(new ItemStack(rubberBlock), new Object[]{"rr", "rr", 'r', rubber});
		GameRegistry.addRecipe(new ItemStack(salad), new Object[]{"cdc", "lll", " b ", 'c', cheese, 'd', dressing, 'l', lettuce, 'b', Items.bowl});
		GameRegistry.addRecipe(new ItemStack(dressing), new Object[]{"ewm", " b ", 'e', Items.egg, 'w', Items.wheat, 'm', Items.milk_bucket, 'b', Items.glass_bottle});
		GameRegistry.addRecipe(new ItemStack(lettuce, 4), new Object[]{"l", 'l', Blocks.leaves});
		GameRegistry.addRecipe(new ItemStack(scuba), new Object[]{"rrr", "ror", " r ", 'r', rubber, 'o', liquidOxygen});
		GameRegistry.addRecipe(new ItemStack(rubber, 4), new Object[]{"il", 'i', iformer, 'l', cheese});
		GameRegistry.addRecipe(new ItemStack(kevlarHelmet), new Object[]{"kkk", "k k", 'k', kevlarFiber});
		GameRegistry.addRecipe(new ItemStack(cheese, 3), new Object[]{"c", 'c', cheeseOre});
		GameRegistry.addRecipe(new ItemStack(silverSword), new Object[]{"s", "s", "t", 's', silverIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(silverShovel), new Object[]{"s", "t", "t", 's', silverIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(silverHoe), new Object[]{"ss ", " t ", " t ", 's', silverIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(silverAxe), new Object[]{"ss ", "st ", " t ", 's', silverIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(silverPickaxe), new Object[]{"sss", " i ", " i ", 's', silverIngot, 'i', Items.stick});
		GameRegistry.addRecipe(new ItemStack(silverIngot), new Object[]{"s", 's', silverOre});
		GameRegistry.addRecipe(new ItemStack(copperBlock), new Object[]{"ccc", "ccc", "ccc", 'c', copperIngot});
		GameRegistry.addRecipe(new ItemStack(copperWire, 3), new Object[]{"cc", "c ", 'c', copperIngot});
		GameRegistry.addRecipe(new ItemStack(coffee), new Object[]{"cc", "bm", 'c', coffeeGrounds, 'b', Items.bucket, 'm', cup});
		GameRegistry.addRecipe(new ItemStack(coffeeGrounds, 16), new Object[]{"ic", 'i', iformer, 'c', Items.wheat_seeds});
		GameRegistry.addRecipe(new ItemStack(iformer, 4), new Object[]{"sps", "rcr", "sps", 's', steelIngot, 'c', Blocks.chest, 'r', Items.redstone, 'p', Blocks.piston});
		GameRegistry.addRecipe(new ItemStack(cup, 3), new Object[]{"s s", "s s", "sts", 's', Blocks.cobblestone, 't', steelIngot});
		GameRegistry.addRecipe(new ItemStack(crowbar), new Object[]{"  i", " i ", "i  ", 'i', steelIngot});
		GameRegistry.addRecipe(new ItemStack(kevlarVest), new Object[]{"k k", "kkk", "kkk", 'k', kevlarFiber});
		GameRegistry.addRecipe(new ItemStack(kevlarFiber, 4), new Object[]{"lk", 'l', loom, 'k', kevlarIngot});
		GameRegistry.addRecipe(new ItemStack(loom, 4), new Object[]{"sss", "ttt", 's', Items.stick, 't', Items.string});
		GameRegistry.addRecipe(new ItemStack(copperIngot), new Object[]{"c", 'c', copperOre});
		GameRegistry.addRecipe(new ItemStack(kevlarIngot), new Object[]{"k", 'k', kevlarOreSurface});
		GameRegistry.addRecipe(new ItemStack(kevlarIngot), new Object[]{"k", 'k', kevlarOreNether});
		GameRegistry.addRecipe(new ItemStack(carbonIngot, 4), new Object[]{"c", 'c', liquidCarbon});
		GameRegistry.addRecipe(new ItemStack(hotdog), new Object[]{"b", "m", "b", 'b', Items.bread, 'm', Items.cooked_beef});;
		GameRegistry.addRecipe(new ItemStack(steelBoots), new Object[]{"s s", "s s", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelLeggings), new Object[]{"sss", "s s", "s s", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelChestplate), new Object[]{"s s", "sss", "sss", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelHelmet), new Object[]{"sss", "s s", 's', steelIngot});
		GameRegistry.addRecipe(new ItemStack(steelSword), new Object[]{"s", "s", "t", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelShovel), new Object[]{"s", "t", "t", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelHoe), new Object[]{"ss ", " t ", " t ", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelAxe), new Object[]{"ss ", "st ", " t ", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelPickaxe), new Object[]{"sss", " t ", " t ", 's', steelIngot, 't', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelBlock), new Object[]{"sss", "sss", "sss", 's', steelIngot});
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(steelIngot), 2.5F);
		GameRegistry.addRecipe(new ItemStack(emeraldSword), new Object[]{"e", "e", "s", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldShovel), new Object[]{"e", "s", "s", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldHoe), new Object[]{"ee ", " s ", " s ", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldAxe), new Object[]{"ee ", "es ", " s ", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(emeraldPickaxe), new Object[]{"eee", " s ", " s ", 'e', Items.emerald, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(dryIce, 4), new Object[]{"ici", 'i', Blocks.ice, 'c', liquidCarbon});
		GameRegistry.addRecipe(new ItemStack(liquidCarbon), new Object[]{"g", 'g', gatherCarbon});
		GameRegistry.addRecipe(new ItemStack(gatherCarbon), new Object[]{"ccc", " b ", 'c', Items.coal, 'b', Items.bucket});
		GameRegistry.addRecipe(new ItemStack(liquidOxygen), new Object[]{"g", 'g', gatherOxygen});
		GameRegistry.addRecipe(new ItemStack(gatherOxygen), new Object[]{"cic", " b ", 'c', Items.coal, 'i', Items.iron_ingot, 'b', Items.bucket});
		GameRegistry.addRecipe(new ItemStack(Items.diamond), new Object[]{"cd", 'c', compressor, 'd', Items.coal});
		GameRegistry.addRecipe(new ItemStack(compressor, 4), new Object[]{"rpr", "p p", "rpr", 'r', Items.redstone, 'p', Blocks.piston});
		GameRegistry.addRecipe(new ItemStack(powderedSugar), new Object[]{"s", 's', Items.sugar});
		GameRegistry.addRecipe(new ItemStack(donut, 3), new Object[]{" w ", "w s", " m ", 'w', Items.wheat, 's', powderedSugar, 'm', Items.milk_bucket});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabStuffCraftBlocks = new CreativeTabs("tabStuffCraftBlocks") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(cheeseBlock).getItem();
		}
	};
	
	public static CreativeTabs tabStuffCraftItems = new CreativeTabs("tabStuffCraftItems") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(emeraldPickaxe).getItem();
		}
	};
	
	public static CreativeTabs tabStuffCraftFood = new CreativeTabs("tabStuffCraftFood") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(pizza).getItem();
		}
	};
	
}
