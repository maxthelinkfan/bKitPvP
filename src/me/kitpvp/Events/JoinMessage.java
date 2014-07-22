package me.kitpvp.Events;
 
import me.kitpvp.SonicKit.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessage implements Listener{
 
        public Main plugin;
       
        public JoinMessage(Main instance){
                plugin = instance;
        }
       
        @EventHandler
        public void onFoodLevelChange(PlayerJoinEvent e)
        {
        	// Define Variables
        	Player p = e.getPlayer();
        	p.sendMessage(ChatColor.AQUA + "Welcome to the Minecraft-Kits!");
        	p.sendMessage(ChatColor.AQUA + "Do " + ChatColor.RED + "/help " + ChatColor.AQUA + "for a list of commands.");
        	p.sendMessage(ChatColor.RED + "EXCLUSIVE! For only ONE WEEK we will be selling VIP/MVP/PRO, do /buy for more information.");
        	
        	
        	
        }
}