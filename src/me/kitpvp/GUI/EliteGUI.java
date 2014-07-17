package me.kitpvp.GUI;

import me.kitpvp.SonicKit.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EliteGUI implements Listener {
	
	private Main plugin;
	public EliteGUI(Main plugin) {
	this.plugin = plugin;
	}
	
	
	
	@EventHandler
	public void onGUISelect(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.isLeftClick()){
            
            if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Elite")){
           
           
            if(e.getCurrentItem().getType().equals(Material.IRON_SWORD)){
			
				if(plugin.kit.contains(p.getName())) {
					p.sendMessage(ChatColor.RED + "You can only use one kit per life!");
				} else {
					
				plugin.kit.add(p.getName());
				plugin.giveElite(p);
	                     p.getOpenInventory().close();
	                     
	                     
	            
				
			}
			
		}				
	}
	}
	}
}