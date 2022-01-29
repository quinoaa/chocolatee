package fr.quinoaa.chocolatemod.item;

import fr.quinoaa.chocolatemod.ChocolateeMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ItemChocolateTablet extends Item {
    public ItemChocolateTablet() {
        super(getProperties());
    }

    private static Properties getProperties(){
        Properties prop = new Properties();
        prop.food(new FoodProperties.Builder().nutrition(7).saturationMod(2.4f).build());
        prop.tab(ChocolateeMod.ChocolateTab);
        return prop;
    }
}
