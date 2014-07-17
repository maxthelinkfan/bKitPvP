package me.kitpvp.GUI;

import me.kitpvp.SonicKit.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PvPGUI implements Listener {
	
	private Main plugin;
	public PvPGUI(Main plugin) {
	this.plugin = plugin;
	}
	
	
	
	@EventHandler
	public void onGUISelect(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.isLeftClick()){
            
            if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "PvP")){
           
           
            if(e.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)){
			
				if(plugin.kit.contains(p.getName())) {
					p.sendMessage(ChatColor.RED + "You can only use one kit per life!");
				} else {
					
				plugin.kit.add(p.getName());
				plugin.givePvP(p);
	                     p.getOpenInventory().close();
	                     
	                     
	            
				
			}
			
		}				
	}
	}
	}
}