package net.capy.mccourse.datagen;

import net.capy.mccourse.MCCourse;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public final class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, MCCourse.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Item names
        add("item.mccourse.zircon", "Zircon");
        add("item.mccourse.raw_zircon", "Raw Zircon");

        // Block names
        add("block.mccourse.zircon_block", "Block Of Zircon");
        add("block.mccourse.raw_zircon_block", "Block Of Raw Zircon");

        // Ore Blocks
        add("block.mccourse.zircon_ore", "Zircon Ore");
        add("block.mccourse.zircon_deepslate_ore", "Zircon Deepslate Ore");
        add("block.mccourse.zircon_nether_ore", "Zircon Nether Ore");
        add("block.mccourse.zircon_end_ore", "Zircon End Ore");

        // Creative mode tabs
        add("creativetab.mccourse.zircon_items", "Zircon Course Items");
        add("creativetab.mccourse.zircon_blocks", "Zircon Course Blocks");

        // Mod Configs
        add("mccourse.configuration.items", "Configuration Items");
    }
}