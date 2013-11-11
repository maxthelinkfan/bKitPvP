package me.kitpvp.Help;

import me.kitpvp.SonicKit.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kits implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	public Kits(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("kits") && sender.hasPermission("KitPvP.kits")){
		
			//Define Variables
			Player p = (Player) sender;
			if(p.hasPermission("KitPvP.pvp")){
				p.sendMessage(ChatColor.GREEN + "You have access to /pvp!"); 
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /pvp!");
			}
				
			if(p.hasPermission("KitPvP.archer")){
				p.sendMessage(ChatColor.GREEN + "You have access to /archer!"); 
			
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /archer!");
			}
					
			if(p.hasPermission("KitPvP.elite")){
				p.sendMessage(ChatColor.GREEN + "You have access to /elite!"); 
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /elite!");
			}
				
			if(p.hasPermission("KitPvP.fisherman")){
				p.sendMessage(ChatColor.GREEN + "You have access to /fisherman!");
				
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /fisherman!");
			}
				
			if(p.hasPermission("KitPvP.blaze")){
				p.sendMessage(ChatColor.GREEN + "You have access to /blaze!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /blaze!");
			}
				
			if(p.hasPermission("KitPvP.switcher")){
				p.sendMessage(ChatColor.GREEN + "You have access to /switcher!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /switcher!");
			}
				
			if(p.hasPermission("KitPvP.sniper")){
				p.sendMessage(ChatColor.GREEN + "You have access to /sniper!");	
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /sniper!");
			}
				
			if(p.hasPermission("KitPvP.viking")){
				p.sendMessage(ChatColor.GREEN + "You have access to /viking!");	
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /viking!");
			}
				
			if(p.hasPermission("KitPvP.tank")){
				p.sendMessage(ChatColor.GREEN + "You have access to /tank!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /tank!");
			}
			if(p.hasPermission("KitPvP.knight")){
				p.sendMessage(ChatColor.GREEN + "You have access to /knight!");	
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /knight!");
			}
			if(p.hasPermission("KitPvP.scout")){
				p.sendMessage(ChatColor.GREEN + "You have access to /scout!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /scout!");
			}
			if(p.hasPermission("KitPvP.grandpa")){
				p.sendMessage(ChatColor.GREEN + "You have access to /grandpa!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /grandpa!");
			}
			if(p.hasPermission("KitPvP.sonic")){
				p.sendMessage(ChatColor.GREEN + "You have access to /sonic!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /sonic!");
			}
			if(p.hasPermission("KitPvP.urgal")){
				p.sendMessage(ChatColor.GREEN + "You have access to /urgal!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /urgal!");
			}
			if(p.hasPermission("KitPvP.dwarf")){
				p.sendMessage(ChatColor.GREEN + "You have access to /dwarf!");
			} else {
				p.sendMessage(ChatColor.RED + "You don't have access to /dwarf!");
			}
			}
		return false;			
	}
}
		