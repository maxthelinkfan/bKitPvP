package me.kitpvp.Events;
 
import me.kitpvp.SonicKit.Main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class HungerDisable implements Listener{
 
        public Main plugin;
       
        public HungerDisable(Main instance){
                plugin = instance;
        }
       
        @EventHandler
        public void onFoodLevelChange(FoodLevelChangeEvent food)
        {
          food.setCancelled(true);
        }
}

