package fr.quinoaa.chocolatemod.tab;

import fr.quinoaa.chocolatemod.ChocolateeMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabChocolate extends CreativeModeTab {
    public TabChocolate() {
        super("chocolateemod");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ChocolateeMod.ITEMchocolatetablet.get());
    }
}
