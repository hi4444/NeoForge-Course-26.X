
package net.capy.mccourse;

import net.capy.mccourse.datagen.ModLanguageProvider;
import net.capy.mccourse.datagen.ModModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MCCourse.MOD_ID)
public final class MCCourseDataGenerators {

    private MCCourseDataGenerators() {
    }

    // Block models
    // Item models
    // Blockstates
    // Languages
    // Sounds
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(true, new ModLanguageProvider(packOutput));
        generator.addProvider(true, new ModModelProvider(packOutput));
    }

    // Recipes
    // Loot tables
    // Block and item tags
    // Advancements
    // World generation
    @SubscribeEvent
    public static void gatherServerData(GatherDataEvent.Server event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

    }
}
