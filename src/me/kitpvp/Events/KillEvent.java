package me.kitpvp.Events;
 
import me.kitpvp.SonicKit.Main;

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
        	
        	Main.economy.bankDeposit(p.getName(), 30);
        	p.sendMessage(ChatColor.GREEN + "You have received $30.00! Your new balance is " + Main.economy.getBalance(p.getName()));
        	
        	
        	
        }
}