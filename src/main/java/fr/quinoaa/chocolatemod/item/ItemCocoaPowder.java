package fr.quinoaa.chocolatemod.item;

import fr.quinoaa.chocolatemod.ChocolateeMod;
import net.minecraft.world.item.Item;

public class ItemCocoaPowder extends Item {
    public ItemCocoaPowder() {
        super(getProperties());
    }

    private static Properties getProperties(){
        Properties prop = new Properties();
        prop.tab(ChocolateeMod.ChocolateTab);
        return prop;
    }
}
