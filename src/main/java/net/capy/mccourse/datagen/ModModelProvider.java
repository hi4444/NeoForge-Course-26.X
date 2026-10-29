package net.capy.mccourse.datagen;

import net.capy.mccourse.MCCourse;
import net.capy.mccourse.block.ModBlocks;
import net.capy.mccourse.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, MCCourse.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* ITEMS */
        itemModels.generateFlatItem(ModItems.ZIRCON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_ZIRCON.get(), ModelTemplates.FLAT_ITEM);


        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.ZIRCON_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_ZIRCON_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.ZIRCON_ORE.get());
        blockModels.createTrivialCube(ModBlocks.ZIRCON_DEEPSLATE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.ZIRCON_NETHER_ORE.get());
        blockModels.createTrivialCube(ModBlocks.ZIRCON_END_ORE.get());
    }


    /*
    private void generateArmorSet(ItemModelGenerators itemModels, Item helmet, Item chestplate, Item leggings, Item boots) {
        itemModels.createFlatItemModel(helmet, ModelTemplates.FLAT_ITEM);
        itemModels.createFlatItemModel(chestplate, ModelTemplates.FLAT_ITEM);
        itemModels.createFlatItemModel(leggings, ModelTemplates.FLAT_ITEM);
        itemModels.createFlatItemModel(boots, ModelTemplates.FLAT_ITEM);

        itemModels.generateDynamicTrimmableArmorSet( helmet, chestplate, leggings, boots, null);
    }
    */
}
