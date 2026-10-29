
package net.capy.mccourse;

import com.mojang.logging.LogUtils;
import net.capy.mccourse.block.ModBlocks;
import net.capy.mccourse.creativetab.ModCreativeModeTabs;
import net.capy.mccourse.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(MCCourse.MOD_ID)
public class MCCourse {

    public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MCCourse(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            LOGGER.info("MCCourse common setup started");

            for (String itemName : Config.ITEM_STRINGS.get()) {
                Identifier itemId = Identifier.tryParse(itemName);

                if (itemId == null) {
                    LOGGER.warn("Invalid item identifier: {}", itemName);
                    continue;
                }

                if (BuiltInRegistries.ITEM.containsKey(itemId)) {
                    LOGGER.info("Configured item found: {}", itemId);
                } else {
                    LOGGER.warn("Configured item not found: {}", itemId);
                }
            }

            LOGGER.info("MCCourse common setup completed");
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("MCCourse server starting");
    }
}
