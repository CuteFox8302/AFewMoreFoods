package net.cutefox.afewmorefoods.item;

import net.cutefox.afewmorefoods.AFewMoreFoods;
import net.cutefox.afewmorefoods.item.custom.MapleSyrupItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Ingredients
    public static final Item MAPLE_SUGAR = registerItem("maple_sugar",
            new Item(new FabricItemSettings().food(ModFoodComponents.MAPLE_SUGAR).group(ModItemGroup.MORE_FOODS)));

    public static final Item WAFFLE_BATTER = registerItem("waffle_batter",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE_BATTER).group(ModItemGroup.MORE_FOODS)));

    public static final Item MAPLE_SYRUP = registerItem("maple_syrup",
            new MapleSyrupItem(new FabricItemSettings().food(ModFoodComponents.MAPLE_SYRUP).group(ModItemGroup.MORE_FOODS)));

    public static final Item SAP = registerItem("sap",
            new Item(new FabricItemSettings().food(ModFoodComponents.SAP).group(ModItemGroup.MORE_FOODS)));

    public static final Item BLUEBERRY = registerItem("blueberry",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY).group(ModItemGroup.MORE_FOODS)));

    public static final Item CHOCOLATE_CHIP = registerItem("chocolate_chip",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_CHIP).group(ModItemGroup.MORE_FOODS)));
    //Waffle Waffle
    public static final Item WAFFLE_WAFFLE = registerItem("waffle_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE_WAFFLE)));
    //Plain Waffle
    public static final Item WAFFLE = registerItem("waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE).group(ModItemGroup.MORE_FOODS)));
    public static final Item FROZEN_WAFFLE = registerItem("frozen_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_WAFFLE).group(ModItemGroup.MORE_FOODS)));
    public static final Item WAFFLE_WITH_SYRUP = registerItem("waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE_WITH_SYRUP).group(ModItemGroup.MORE_FOODS)));
    public static final Item FROZEN_WAFFLE_WITH_SYRUP = registerItem("frozen_waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_WAFFLE_WITH_SYRUP).group(ModItemGroup.MORE_FOODS)));
    //Blueberry Waffle
    public static final Item BLUEBERRY_WAFFLE = registerItem("blueberry_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY_WAFFLE).group(ModItemGroup.MORE_FOODS)));
    public static final Item FROZEN_BLUEBERRY_WAFFLE = registerItem("frozen_blueberry_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_BLUEBERRY_WAFFLE).group(ModItemGroup.MORE_FOODS)));
    public static final Item BLUEBERRY_WAFFLE_WITH_SYRUP = registerItem("blueberry_waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY_WAFFLE_WITH_SYRUP).group(ModItemGroup.MORE_FOODS)));
    public static final Item FROZEN_BLUEBERRY_WAFFLE_WITH_SYRUP = registerItem("frozen_blueberry_waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_BLUEBERRY_WAFFLE_WITH_SYRUP).group(ModItemGroup.MORE_FOODS)));
    //Chocolate Chip Waffle
    public static final Item CHOCOLATE_CHIP_WAFFLE = registerItem("chocolate_chip_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_CHIP_WAFFLE).group(ModItemGroup.MORE_FOODS)));
    public static final Item FROZEN_CHOCOLATE_CHIP_WAFFLE = registerItem("frozen_chocolate_chip_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_CHOCOLATE_CHIP_WAFFLE).group(ModItemGroup.MORE_FOODS)));
    public static final Item CHOCOLATE_CHIP_WAFFLE_WITH_SYRUP = registerItem("chocolate_chip_waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_CHIP_WAFFLE_WITH_SYRUP).group(ModItemGroup.MORE_FOODS)));
    public static final Item FROZEN_CHOCOLATE_CHIP_WAFFLE_WITH_SYRUP = registerItem("frozen_chocolate_chip_waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_CHOCOLATE_CHIP_WAFFLE_WITH_SYRUP).group(ModItemGroup.MORE_FOODS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AFewMoreFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AFewMoreFoods.LOGGER.debug("Registering Mod Items for " + AFewMoreFoods.MOD_ID);
    }
}
