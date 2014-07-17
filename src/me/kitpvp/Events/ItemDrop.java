package me.kitpvp.Events;

import me.kitpvp.SonicKit.Main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ItemDrop implements Listener {
	
	private Main plugin;
	public ItemDrop(Main plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onDeniedItemDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
	//	p.sendMessage(ChatColor.RED + "Item Thrown!");
		//	e.setCancelled(true);
		//	p.sendMessage(ChatColor.RED + "You cannot drop this item!");
		}
	}


