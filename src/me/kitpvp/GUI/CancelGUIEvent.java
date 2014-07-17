package me.kitpvp.GUI;

import me.kitpvp.SonicKit.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CancelGUIEvent implements Listener {
	
	public Main plugin;
	public CancelGUIEvent(Main plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onItemTake(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getWhoClicked().getOpenInventory().getTitle().equals(ChatColor.BLUE + "Select a kit!")) {
			if(e.getClick().equals(ClickType.NUMBER_KEY) || e.getClick().equals(ClickType.RIGHT) || e.getClick().equals(ClickType.DROP)
				|| e.getClick().equals(ClickType.SHIFT_RIGHT) || e.getClick().equals(ClickType.CONTROL_DROP)
				|| e.getClick().equals(ClickType.SHIFT_RIGHT)){
				 p.sendMessage(ChatColor.RED + "Wow, you would.");
				 e.setCancelled(true);
			}
		}
		
	}

}
