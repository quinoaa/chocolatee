package fr.quinoaa.chocolatemod;

import fr.quinoaa.chocolatemod.event.ItemEvent;
import fr.quinoaa.chocolatemod.item.ItemChocolateTablet;
import fr.quinoaa.chocolatemod.item.ItemCocoaPowder;
import fr.quinoaa.chocolatemod.item.ItemFermentedCocoa;
import fr.quinoaa.chocolatemod.tab.TabChocolate;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ChocolateeMod.MODID)
public class ChocolateeMod {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "chocolateemod";


    public static TabChocolate ChocolateTab = new TabChocolate();


    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static RegistryObject<Item> ITEMfermentedcocoa = ITEMS.register("fermentedcocoa", ItemFermentedCocoa::new);
    public static RegistryObject<Item> ITEMcocoapowder = ITEMS.register("cocoapowder", ItemCocoaPowder::new);
    public static RegistryObject<Item> ITEMchocolatetablet = ITEMS.register("chocolatetablet", ItemChocolateTablet::new);




    public ChocolateeMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(new ItemEvent());

        // Register ourselves for server and other game events we are interested in
        //MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}
