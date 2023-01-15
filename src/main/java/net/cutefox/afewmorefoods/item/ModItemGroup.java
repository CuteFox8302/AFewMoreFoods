package net.cutefox.afewmorefoods.item;

import net.cutefox.afewmorefoods.AFewMoreFoods;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MORE_FOODS = FabricItemGroupBuilder.build(
            new Identifier(AFewMoreFoods.MOD_ID, "more_foods"), () -> new ItemStack(ModItems.SAP));
}