package fr.quinoaa.chocolatemod.event;

import fr.quinoaa.chocolatemod.ChocolateeMod;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
public class ItemEvent {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public void onItem(ItemExpireEvent event){
        if(event.getEntityItem().getItem().getItem()==Items.COCOA_BEANS){
            Vec3 pos = event.getEntity().position();
            Level world = event.getEntity().getLevel();

            ItemStack is = new ItemStack(ChocolateeMod.ITEMfermentedcocoa.get());
            LOGGER.warn(world);
            is.setCount(event.getEntityItem().getItem().getCount());
            ItemEntity e = new ItemEntity(world, pos.x, pos.y, pos.z, is);
            world.addFreshEntity(e);
        }
    }
}
