package me.kitpvp.Events;

import me.kitpvp.SonicKit.Main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener{
 
       
        public DeathEvent(Main instance){
                @SuppressWarnings("unused")
				Main plugin = instance;
        }
        @EventHandler
        public void onPlayerInteract(PlayerDeathEvent e){
        	
        	e.getDrops().clear();
        }
}

       