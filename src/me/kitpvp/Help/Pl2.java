package me.kitpvp.Help;

import me.kitpvp.SonicKit.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pl2 implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	public Pl2(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("?")){
			
			//Defines Variables
			Player p = (Player) sender;
			
			//Send message
			p.sendMessage("Plugins (1): " + ChatColor.GREEN + "KitPvP");
		}
		return false;
	}
}
		