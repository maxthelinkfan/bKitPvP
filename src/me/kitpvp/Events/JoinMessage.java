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
        	// p.sendMessage(ChatColor.AQUA + "Visit " + ChatColor.BLUE + "www.sonicpvp.enjin.com" + ChatColor.AQUA + " for news and information.");
        	p.sendMessage(ChatColor.AQUA + "Use " + ChatColor.WHITE + "/help " + ChatColor.AQUA + "for a list of commands.");
        	p.sendMessage(ChatColor.GREEN + "VIP" + ChatColor.AQUA + ", " + ChatColor.AQUA + "MVP" + ChatColor.AQUA + ", " + ChatColor.DARK_RED + "PRO " + ChatColor.AQUA + "&" + ChatColor.DARK_PURPLE + " Titan " + ChatColor.AQUA + "Packages now availble. See bit.ly/BrawlBuy for details.");
        	p.sendMessage(ChatColor.RED + "NO CHEATING! FLYING/XRAY/ETC = BAN! YOU HAVE BEEN WARNED!");
        	
        	
        	
        }
}