package me.kitpvp.Kits;

import me.kitpvp.SonicKit.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;

public class CClear implements CommandExecutor{
	
	public Main plugin;
	public CClear(Main plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		if(cmd.getName().equalsIgnoreCase("cclear")) {
			if(args.length <= 0) {
				sender.sendMessage(ChatColor.RED + "Invalid args. /cclear [player]");
				return true;
			} 
			if(args.length > 0) {
				Player t = Bukkit.getServer().getPlayer(args[0]);
				if(args[0].equalsIgnoreCase(t.getName())){
					Inventory inv = t.getInventory();
					inv.clear();
					for (PotionEffect effect : t.getActivePotionEffects())
				        t.removePotionEffect(effect.getType());
					t.sendMessage(ChatColor.GREEN + "Buffs and inventory cleared.");
				}
			}
		}
		return false;
	}
}