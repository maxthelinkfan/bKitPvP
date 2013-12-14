package me.kitpvp.Kits;

import me.kitpvp.SonicKit.Main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Blaze implements CommandExecutor {
	
	private Main plugin;
	public Blaze(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("blaze") && sender.hasPermission("KitPvP.blaze")){
			
			// Create variables
			Player p = (Player) sender;
			Inventory inv = p.getInventory();
			if(plugin.kit.contains(p.getName())) {
				p.sendMessage(ChatColor.RED + "You can only use one kit per life!");
			} else {
			plugin.kit.add(p.getName());
			// Clear Inventory
			inv.clear();
			
			//Remove Potion Effects
			for (PotionEffect effect : p.getActivePotionEffects())
		        p.removePotionEffect(effect.getType());
			
			// Send the player a message
			String blazemsg = plugin.getConfig().getString("blazemsg");
			String prefixmsg = plugin.getConfig().getString("prefixmsg");
			
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + blazemsg);
			
			// List Items
			ItemStack sword = new ItemStack(Material.BLAZE_POWDER);
			
			
			
            // List armor
            ItemStack helm = new ItemStack(Material.GOLD_HELMET);
            ItemStack chest = new ItemStack(Material.GOLD_CHESTPLATE);
            ItemStack legs = new ItemStack(Material.GOLD_LEGGINGS);
            ItemStack boots = new ItemStack(Material.GOLD_BOOTS);
            
            // Enchant any items 
            sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
            sword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
            helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            
            // Add any potion effects
            p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000000, 1));
            
            // Add items to inventory (weapons first.)
            inv.addItem(sword);
            
         // List & add Soup (Make the "<=35>" less if you have more than 1 item)
         			ItemStack getSoup = new ItemStack(Material.MUSHROOM_SOUP, 1);		    
                     for(int i=1; i <=35; i++)
                     	inv.addItem(getSoup);
                     
            
            //Put armor on player
            ((PlayerInventory) inv).setHelmet(helm);
            ((PlayerInventory)inv).setChestplate(chest);
            ((PlayerInventory)inv).setLeggings(legs);
            ((PlayerInventory)inv).setBoots(boots);
            
            
            
            
         
			
			

		
		
		}
		}
		return false;
}
}