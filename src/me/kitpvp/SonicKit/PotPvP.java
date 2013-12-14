package me.kitpvp.SonicKit;


import me.kitpvp.SonicKit.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.scheduler.BukkitRunnable;

public class PotPvP implements CommandExecutor, Listener {
	SettingsManager settings = SettingsManager.getInstance();
	
 	   
 	   
    

	
	private Main plugin;
	public PotPvP(Main plugin) {
		this.plugin = plugin;
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("potpvp")) {
			if(args.length <= 0){
				final Player p = (Player) sender;
				final Inventory inv = p.getInventory();				
		          		  p.sendMessage(ChatColor.RED + "Teleporting to PotPvP in 3..");
		          	new BukkitRunnable() {
			          	  public void run() {
			          		  p.sendMessage(ChatColor.RED + "2..");
			          	  }
			          	}.runTaskLater(plugin, 40);
			          	new BukkitRunnable() {
				          	  public void run() {
				          		  p.sendMessage(ChatColor.RED + "1..");
				          	  }
				          	}.runTaskLater(plugin, 60);
				          	new BukkitRunnable() {
					          	  public void run() {
					          		  p.sendMessage(ChatColor.RED + "Teleported to PotPvP!");
					          		inv.clear();			
									// Clear Inventor		
									//Remove Potion Effects
									for (PotionEffect effect : p.getActivePotionEffects())
								        p.removePotionEffect(effect.getType());
									
									// Send the player a message
			
									
									
									ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);	
						            // List armor
						            ItemStack helm = new ItemStack(Material.IRON_HELMET);
						            ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
						            ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
						            ItemStack boots = new ItemStack(Material.IRON_BOOTS);
						            
						            // Enchant any items 
						            sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
						            // Add any potion effects
						            
						            // Add items to inventory (weapons first.)
						            inv.addItem(sword);
						            
						         // List & add Soup (Make the "<=35>" less if you have more than 1 item)
						            
						         			ItemStack getSoup = new ItemStack(Material.POTION, 1, (short)16421);		    
						                     for(int i=1; i <=35; i++)
						                     	inv.addItem(getSoup);
						                     
						                     
						            
						            //Put armor on player
						            ((PlayerInventory) inv).setHelmet(helm);
						            ((PlayerInventory)inv).setChestplate(chest);
						            ((PlayerInventory)inv).setLeggings(legs);
						            ((PlayerInventory)inv).setBoots(boots);
						            World w = Bukkit.getServer().getWorld(settings.getData().getString("potpvp" + ".world"));
					                double x = settings.getData().getDouble("potpvp." + ".x");
					                double y = settings.getData().getDouble("potpvp." + ".y");
					                double z = settings.getData().getDouble("potpvp." + ".z");
					                  p.teleport(new Location(w, x, y, z));
						            
					          	  }
					          	}.runTaskLater(plugin, 80);
				return true;		
					}
				if(args.length > 0){
				if(args[0].equalsIgnoreCase("set")){
					Player p = (Player) sender;					
					settings.getData().set("potpvp." + ".world", p.getLocation().getWorld().getName());
		            settings.getData().set("potpvp." + ".x", Double.valueOf(p.getLocation().getX()));
		            settings.getData().set("potpvp." + ".y", Double.valueOf(p.getLocation().getY()));
		            settings.getData().set("potpvp." + ".z", Double.valueOf(p.getLocation().getZ()));
		            settings.saveData();
		            p.sendMessage(ChatColor.GREEN + "Set PotPvP Location!");
					return true;
					
				}
			}
		
	}

		return false;
}
}
