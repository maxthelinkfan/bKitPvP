package me.kitpvp.Events;
 
import me.kitpvp.SonicKit.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillEvent implements Listener{
 
        public Main plugin;
       
        public KillEvent(Main instance){
                plugin = instance;
        }
       
        @EventHandler
        public void onPlayerKill(PlayerDeathEvent e) {
        	Player p = e.getEntity().getKiller();
        	Player d = e.getEntity();
        	String prefixmsg = plugin.getConfig().getString("prefixmsg");
        	Main.economy.depositPlayer(p.getName(), plugin.getConfig().getInt("cashonkill"));
        	p.sendMessage(ChatColor.GREEN + "You have received $" + plugin.getConfig().getInt("cashonkill") + " for killing " + d.getName() + ". Your new balance is " + Main.economy.getBalance(p.getName()));
        	e.setDeathMessage(null);
        	Bukkit.broadcastMessage(ChatColor.GRAY + "[" + prefixmsg + "] " + ChatColor.AQUA + p.getName() + " has slain " + d.getName());
        	
        }
}