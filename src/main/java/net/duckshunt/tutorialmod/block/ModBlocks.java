package net.duckshunt.tutorialmod.block;

import net.duckshunt.tutorialmod.TutorialMod;
import net.duckshunt.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));
    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
            UniformIntProvider.create(3,7)));
    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3,7)));
    public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3,7)));
    public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3,7)));

    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem (String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    /*

    public static final ItemGroup MOD_BLOCKS = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID))
            .displayName(Text.literal("Modded Blocks"))
            .icon(() -> new ItemStack(ModBlocks.TANZANITE_BLOCK))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ModBlocks.TANZANITE_BLOCK);
                entries.add(ModBlocks.TANZANITE_ORE);
                entries.add(ModBlocks.DEEPSLATE_TANZANITE_ORE);


            })
            .build();

     */

    public static void registerModBlocks()  {
        TutorialMod.LOGGER.debug("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
