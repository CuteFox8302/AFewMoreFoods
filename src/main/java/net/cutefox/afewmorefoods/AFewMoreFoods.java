package net.cutefox.afewmorefoods;

import net.cutefox.afewmorefoods.item.ModItems;
import net.cutefox.afewmorefoods.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AFewMoreFoods implements ModInitializer {
	public static final String MOD_ID = "afewmorefoods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
	}
}
