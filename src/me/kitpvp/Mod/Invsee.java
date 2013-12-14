package me.kitpvp.Mod;

import me.kitpvp.SonicKit.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Invsee implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	public Invsee(Main plugin) {
		this.plugin = plugin;
	}
	
	  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		    if (cmd.getName().equalsIgnoreCase("seeinv")) {
		      if (args.length <= 0) {
		        sender.sendMessage(ChatColor.RED + "LMS Commands:");
		        sender.sendMessage(ChatColor.GOLD + "/lms host - Host an LMS!");
		        sender.sendMessage(ChatColor.GOLD + "/lms set - Set LMS Location!");
		        sender.sendMessage(ChatColor.GOLD + "/lms join - Join LMS!");
		        sender.sendMessage(ChatColor.GOLD + "/lms leave - WIP");
		        return true;
		      }

		      if (args.length > 0) {
		    	  Player t = Bukkit.getServer().getPlayer(args[0]);
		        if (args[0].equalsIgnoreCase(t.getName())) {
		            Player p = (Player)sender;
		            @SuppressWarnings("unused")
					Inventory inv = Bukkit.createInventory(p, 35, ChatColor.BLUE + t.getName() + "'s inventory!");
		            Inventory tinv = t.getInventory();
		            
		            p.openInventory(tinv);
		            
		            
		            return true;
		          }
		        }
		      }
		    
			return false;
	  }
	  
}