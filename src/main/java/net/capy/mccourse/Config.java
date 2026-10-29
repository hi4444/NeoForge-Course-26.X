package net.capy.mccourse;

import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.List;

public final class Config {

	private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

	public static final ModConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS =
			BUILDER.comment("A list of items to log on common setup.").defineListAllowEmpty(
					"items",
					List.of(
							"mccourse:zircon",
							"mccourse:raw_zircon",
							"mccourse:zircon_block",
							"mccourse:raw_zircon_block",
							"mccourse:zircon_ore",
							"mccourse:deepslate_zircon_ore",
							"mccourse:nether_zircon_ore",
							"mccourse:end_zircon_ore"
					),
					() -> "",
					Config::validateItemName
			);
	public static final ModConfigSpec SPEC = BUILDER.build();

	private Config() {
	}

	private static boolean validateItemName(final Object obj) {
		return obj instanceof String itemName && Identifier.tryParse(itemName) != null;
	}
}
