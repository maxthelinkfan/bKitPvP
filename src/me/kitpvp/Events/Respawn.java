package me.kitpvp.Events;
 
import java.util.ArrayList;

import me.kitpvp.SonicKit.Main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;

public class Respawn implements Listener{
	
	ArrayList<String> life = new ArrayList<String>();
	


        public Main plugin;
       
        public Respawn(Main instance){
                plugin = instance;
        }
       
        @EventHandler
        public void onFoodLevelChange(PlayerRespawnEvent e){
        	Player p = e.getPlayer();
        	
        	for (PotionEffect effect : p.getActivePotionEffects())
		        p.removePotionEffect(effect.getType());
        	
      
        			
        }
}
       