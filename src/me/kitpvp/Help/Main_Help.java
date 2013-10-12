package me.kitpvp.Help;

import me.kitpvp.SonicKit.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Main_Help implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	public Main_Help(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("help")){
			
			//Defines Variables
			Player p = (Player) sender;
			
			//Send message
			p.sendMessage(ChatColor.GOLD + "SonicKitPvP" + ChatColor.WHITE + " Help");
			p.sendMessage(ChatColor.GRAY + "====================================================");
			p.sendMessage(ChatColor.GOLD + "/kits" + ChatColor.WHITE + " - Find out what kits you have!");
			p.sendMessage(ChatColor.GOLD + "/who" + ChatColor.WHITE + " - List all the online players!");
			p.sendMessage(ChatColor.GOLD + "/rules" + ChatColor.WHITE + " - Lists all the rules!");
			p.sendMessage(ChatColor.GOLD + "/kit" + ChatColor.WHITE + " - Opens the kit selector!");
		}
		return false;
	}
}
		