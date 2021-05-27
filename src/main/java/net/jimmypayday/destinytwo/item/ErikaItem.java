
package net.jimmypayday.destinytwo.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.jimmypayday.destinytwo.itemgroup.Destiny2ItemGroup;
import net.jimmypayday.destinytwo.DestinytwoModElements;

@DestinytwoModElements.ModElement.Tag
public class ErikaItem extends DestinytwoModElements.ModElement {
	@ObjectHolder("destinytwo:erika")
	public static final Item block = null;
	public ErikaItem(DestinytwoModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DestinytwoModElements.sounds.get(new ResourceLocation("destinytwo:erika")),
					new Item.Properties().group(Destiny2ItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("erika");
		}
	}
}
