package net.duckshunt.tutorialmod.item;

import net.duckshunt.tutorialmod.TutorialMod;
import net.duckshunt.tutorialmod.block.ModBlocks;
import net.duckshunt.tutorialmod.item.custom.EightBallItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item){//, ItemGroup group) {
        //ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(MY_ITEM));
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    /*
    public static final ItemGroup MOD_ITEMS = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID))
            .displayName(Text.literal("Modded Items"))
            .icon(() -> new ItemStack(ModItems.RAW_TANZANITE))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .build();

     */

    public static final ItemGroup MOD_ITEMS = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID))
            .displayName(Text.literal("Modded Items"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ModItems.TANZANITE);
                entries.add(ModItems.RAW_TANZANITE);
                entries.add(ModBlocks.TANZANITE_BLOCK);
                entries.add(ModBlocks.TANZANITE_ORE);
                entries.add(ModBlocks.DEEPSLATE_TANZANITE_ORE);
                entries.add(ModBlocks.ENDSTONE_TANZANITE_ORE);
                entries.add(ModBlocks.NETHERRACK_TANZANITE_ORE);
                entries.add(ModItems.EIGHT_BALL);

            })
            .build();

    
    public static final Item RAW_TANZANITE = registerItem(
            "raw_tanzanite",
            new Item(new Item.Settings())
            //ItemGroups.INGREDIENTS
    );
    public static final Item TANZANITE = registerItem(
            "tanzanite",
            new Item(new Item.Settings())
            //ItemGroups.INGREDIENTS
    );
    public static final Item EIGHT_BALL = registerItem(
            "eight_ball",
            new EightBallItem(new FabricItemSettings().maxCount(1))
            //ItemGroups.INGREDIENTS
    );


    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
