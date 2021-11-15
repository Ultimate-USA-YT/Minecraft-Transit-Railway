package mtr;

import mtr.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;

public interface Blocks {

	Block APG_DOOR = new BlockAPGDoor();
	Block APG_GLASS = new BlockAPGGlass();
	Block APG_GLASS_END = new BlockAPGGlassEnd();
	Block ARRIVAL_PROJECTOR_1_SMALL = new BlockArrivalProjector1Small();
	Block ARRIVAL_PROJECTOR_1_MEDIUM = new BlockArrivalProjector1Medium();
	Block ARRIVAL_PROJECTOR_1_LARGE = new BlockArrivalProjector1Large();
	Block CEILING = new BlockCeiling(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).luminance(15));
	Block CLOCK = new BlockClock(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).luminance(5));
	Block ESCALATOR_SIDE = new BlockEscalatorSide();
	Block ESCALATOR_STEP = new BlockEscalatorStep();
	Block GLASS_FENCE_CIO = new BlockGlassFence();
	Block GLASS_FENCE_CKT = new BlockGlassFence();
	Block GLASS_FENCE_HEO = new BlockGlassFence();
	Block GLASS_FENCE_MOS = new BlockGlassFence();
	Block GLASS_FENCE_PLAIN = new BlockGlassFence();
	Block GLASS_FENCE_SHM = new BlockGlassFence();
	Block GLASS_FENCE_STAINED = new BlockGlassFence();
	Block GLASS_FENCE_STW = new BlockGlassFence();
	Block GLASS_FENCE_TSH = new BlockGlassFence();
	Block GLASS_FENCE_WKS = new BlockGlassFence();
	Block LOGO = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().hardness(2).luminance(10));
	Block MARBLE_BLUE = new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_LIGHT_BLUE).requiresTool().hardness(1));
	Block MARBLE_SANDY = new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_YELLOW).requiresTool().hardness(1));
	Block PIDS_1 = new BlockPIDS1();
	Block PIDS_2 = new BlockPIDS2();
	Block PIDS_3 = new BlockPIDS3();
	Block PLATFORM = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2), false);
	Block PLATFORM_INDENTED = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2).nonOpaque(), true);
	Block PLATFORM_NA_1 = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2), false);
	Block PLATFORM_NA_1_INDENTED = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2).nonOpaque(), true);
	Block PLATFORM_NA_2 = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2), false);
	Block PLATFORM_NA_2_INDENTED = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2).nonOpaque(), true);
	Block PLATFORM_UK_1 = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2), false);
	Block PLATFORM_UK_1_INDENTED = new BlockPlatform(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).requiresTool().hardness(2).nonOpaque(), true);
	Block POLE_CLOCK = new BlockPoleClock(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1));
	Block POLE_PIDS = new BlockPolePIDS(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1));
	Block POLE_SIGN_EVEN = new BlockPoleSignEven(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1).nonOpaque());
	Block POLE_SIGN_ODD = new BlockPoleSignOdd(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1));
	Block PSD_DOOR_1 = new BlockPSDDoor(0);
	Block PSD_GLASS_1 = new BlockPSDGlass(0);
	Block PSD_GLASS_END_1 = new BlockPSDGlassEnd(0);
	Block PSD_DOOR_2 = new BlockPSDDoor(1);
	Block PSD_GLASS_2 = new BlockPSDGlass(1);
	Block PSD_GLASS_END_2 = new BlockPSDGlassEnd(1);
	Block PSD_TOP = new BlockPSDTop();
	Block RAIL = new BlockRail(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).hardness(2).nonOpaque());
	Block RAILWAY_SIGN_2_EVEN = new BlockRailwaySign(2, false);
	Block RAILWAY_SIGN_2_ODD = new BlockRailwaySign(2, true);
	Block RAILWAY_SIGN_3_EVEN = new BlockRailwaySign(3, false);
	Block RAILWAY_SIGN_3_ODD = new BlockRailwaySign(3, true);
	Block RAILWAY_SIGN_4_EVEN = new BlockRailwaySign(4, false);
	Block RAILWAY_SIGN_4_ODD = new BlockRailwaySign(4, true);
	Block RAILWAY_SIGN_5_EVEN = new BlockRailwaySign(5, false);
	Block RAILWAY_SIGN_5_ODD = new BlockRailwaySign(5, true);
	Block RAILWAY_SIGN_6_EVEN = new BlockRailwaySign(6, false);
	Block RAILWAY_SIGN_6_ODD = new BlockRailwaySign(6, true);
	Block RAILWAY_SIGN_7_EVEN = new BlockRailwaySign(7, false);
	Block RAILWAY_SIGN_7_ODD = new BlockRailwaySign(7, true);
	Block RAILWAY_SIGN_MIDDLE = new BlockRailwaySign(0, false);
	Block ROUTE_SIGN_STANDING_LIGHT = new BlockRouteSignStandingLight();
	Block ROUTE_SIGN_STANDING_METAL = new BlockRouteSignStandingMetal();
	Block ROUTE_SIGN_WALL_LIGHT = new BlockRouteSignWallLight();
	Block ROUTE_SIGN_WALL_METAL = new BlockRouteSignWallMetal();
	Block RUBBISH_BIN_1 = new BlockRubbishBin(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).hardness(4));
	Block SIGNAL_LIGHT_1 = new BlockSignalLight1(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).hardness(4));
	Block SIGNAL_LIGHT_2 = new BlockSignalLight2(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).hardness(4));
	Block SIGNAL_LIGHT_3 = new BlockSignalLight3(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).hardness(4));
	Block SIGNAL_LIGHT_4 = new BlockSignalLight4(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).hardness(4));
	Block SIGNAL_SEMAPHORE_1 = new BlockSignalSemaphore1(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).hardness(4));
	Block SIGNAL_SEMAPHORE_2 = new BlockSignalSemaphore2(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).hardness(4));
	Block SIGNAL_POLE = new BlockPole(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().hardness(2).nonOpaque(), false);
	Block STATION_COLOR_ANDESITE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ANDESITE));
	Block STATION_COLOR_BEDROCK = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.STONE));
	Block STATION_COLOR_BIRCH_WOOD = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BIRCH_WOOD));
	Block STATION_COLOR_BONE_BLOCK = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BONE_BLOCK));
	Block STATION_COLOR_CHISELED_QUARTZ_BLOCK = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CHISELED_QUARTZ_BLOCK));
	Block STATION_COLOR_CHISELED_STONE_BRICKS = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CHISELED_STONE_BRICKS));
	Block STATION_COLOR_CLAY = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CLAY));
	Block STATION_COLOR_COAL_ORE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.COAL_ORE));
	Block STATION_COLOR_COBBLESTONE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.COBBLESTONE));
	Block STATION_COLOR_CONCRETE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE));
	Block STATION_COLOR_CONCRETE_POWDER = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE_POWDER));
	Block STATION_COLOR_CRACKED_STONE_BRICKS = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CRACKED_STONE_BRICKS));
	Block STATION_COLOR_DARK_PRISMARINE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DARK_PRISMARINE));
	Block STATION_COLOR_DIORITE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DIORITE));
	Block STATION_COLOR_GRAVEL = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAVEL));
	Block STATION_COLOR_IRON_BLOCK = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.IRON_BLOCK));
	Block STATION_COLOR_METAL = new BlockStationColor(AbstractBlock.Settings.copy(LOGO));
	Block STATION_COLOR_PLANKS = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.OAK_PLANKS));
	Block STATION_COLOR_POLISHED_ANDESITE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.POLISHED_ANDESITE));
	Block STATION_COLOR_POLISHED_DIORITE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.POLISHED_DIORITE));
	Block STATION_COLOR_PURPUR_BLOCK = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPUR_BLOCK));
	Block STATION_COLOR_PURPUR_PILLAR = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPUR_PILLAR));
	Block STATION_COLOR_QUARTZ_BLOCK = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.QUARTZ_BLOCK));
	Block STATION_COLOR_QUARTZ_BRICKS = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.QUARTZ_BRICKS));
	Block STATION_COLOR_QUARTZ_PILLAR = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.QUARTZ_PILLAR));
	Block STATION_COLOR_SMOOTH_QUARTZ = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.SMOOTH_QUARTZ));
	Block STATION_COLOR_SMOOTH_STONE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.SMOOTH_STONE));
	Block STATION_COLOR_SNOW_BLOCK = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_WOOL));
	Block STATION_COLOR_STAINED_GLASS = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_STAINED_GLASS));
	Block STATION_COLOR_STONE = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.STONE));
	Block STATION_COLOR_STONE_BRICKS = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.STONE_BRICKS));
	Block STATION_COLOR_WOOL = new BlockStationColor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_WOOL));
	Block STATION_NAME_ENTRANCE = new BlockStationNameEntrance(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().hardness(2).nonOpaque());
	Block STATION_NAME_TALL_BLOCK = new BlockStationNameTallBlock();
	Block STATION_NAME_TALL_WALL = new BlockStationNameTallWall();
	Block STATION_NAME_WALL = new BlockStationNameWall(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().hardness(2).nonOpaque());
	Block STATION_POLE = new BlockPole(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().hardness(2).nonOpaque(), true);
	Block TACTILE_MAP = new BlockTactileMap(FabricBlockSettings.of(Material.METAL, MapColor.OFF_WHITE).requiresTool().hardness(2).nonOpaque());
	Block TICKET_BARRIER_ENTRANCE_1 = new BlockTicketBarrier(true);
	Block TICKET_BARRIER_EXIT_1 = new BlockTicketBarrier(false);
	Block TICKET_MACHINE = new BlockTicketMachine(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().hardness(2).luminance(5).nonOpaque());
	Block TICKET_PROCESSOR = new BlockTicketProcessor(true, true, true);
	Block TICKET_PROCESSOR_ENTRANCE = new BlockTicketProcessor(true, true, false);
	Block TICKET_PROCESSOR_EXIT = new BlockTicketProcessor(true, false, true);
	Block TICKET_PROCESSOR_ENQUIRY = new BlockTicketProcessorEnquiry();
	Block TRAIN_ANNOUNCER = new BlockTrainAnnouncer(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.SMOOTH_STONE));
	Block TRAIN_SENSOR = new BlockTrainSensor(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.SMOOTH_STONE));
}
