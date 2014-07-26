package net.sparkzz.supercraft;

import net.minecraft.item.Item;
import net.sparkzz.supercraft.item.Items;

/**
 * Created by Brendon on 7/23/2014.
 */
public class CreativeTabs {

	public static CreativeTabs tabSupercraft = new CreativeTabs("tabSupercraft") {

		@Override
		public Item getTabIconItem() {
			return Items.hyperdiamond;
		}
	};
}