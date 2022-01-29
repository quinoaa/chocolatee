package fr.quinoaa.chocolatemod.item;

import fr.quinoaa.chocolatemod.ChocolateeMod;
import net.minecraft.world.item.Item;

public class ItemFermentedCocoa extends Item{
    public ItemFermentedCocoa() {
        super(getProperties());
    }

    private static Item.Properties getProperties(){
        Item.Properties prop = new Item.Properties();
        prop.tab(ChocolateeMod.ChocolateTab);
        return prop;
    }
}
