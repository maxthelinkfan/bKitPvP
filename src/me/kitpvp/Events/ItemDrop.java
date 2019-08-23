package me.kitpvp.Events;

import me.kitpvp.SonicKit.Main;
//import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ItemDrop implements Listener {
	
	public ItemDrop(Main plugin) {
	}
	
	@EventHandler
	public void onDeniedItemDrop(PlayerDropItemEvent e) {
	//	Player p = e.getPlayer();
	//	p.sendMessage(ChatColor.RED + "Item Thrown!");
			e.setCancelled(true);
		//	p.sendMessage(ChatColor.RED + "You cannot drop this item!");
		}
	}


