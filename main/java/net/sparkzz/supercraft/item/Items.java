package net.sparkzz.supercraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.sparkzz.supercraft.Supercraft;

/**
 * Created by Brendon on 7/23/2014.
 */
public class Items {

	public static Item hyperdiamond = new GenericItem("hyperdiamond").setMaxStackSize(16);
	public static Item sapphire = new GenericItem("sapphire");
	public static Item icon = new GenericItem("icon").setCreativeTab(null).setMaxStackSize(0);


	public static void registerItems() {
		GameRegistry.registerItem(hyperdiamond, "hyperdiamond");
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(icon, "icon");
	}
}