package net.sparkzz.supercraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.sparkzz.supercraft.Supercraft;
import net.sparkzz.supercraft.tool.GenericSword;

import static net.minecraft.item.Item.ToolMaterial;

/**
 * Created by Brendon on 7/23/2014.
 */
public class Items {

	// materials
	public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 2, 500, 6.0f, 3.0f, 12);
	public static ToolMaterial HYPERDIAMOND = EnumHelper.addToolMaterial("HYPERDIAMOND", 4, 3200, 9.5f, 4.0f, 20);

	// icon
	public static Item icon = new GenericItem("icon").setTab(null).setMaxStackSize(0);

	// jewels
	public static Item hyperdiamond = new GenericItem("hyperdiamond");
	public static Item ruby = new GenericItem("ruby");
	public static Item sapphire = new GenericItem("sapphire");

	// sword parts
	public static Item wooden_blade = new GenericSword(ToolMaterial.WOOD);
	public static Item golden_blade = new GenericSword(ToolMaterial.GOLD);
	public static Item iron_blade = new GenericSword(ToolMaterial.IRON);

	public static Item diamond_blade = new GenericSword(ToolMaterial.EMERALD);
	public static Item hyperdiamond_blade = new GenericSword(HYPERDIAMOND);

	public static void registerItems() {
		GameRegistry.registerItem(hyperdiamond, "hyperdiamond");
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(icon, "icon");
	}
}