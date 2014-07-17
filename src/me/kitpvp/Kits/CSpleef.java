package me.kitpvp.Kits;

import me.kitpvp.SonicKit.Main;

import org.bukkit.Bukkit;
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
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

public class CSpleef implements CommandExecutor{
	
	public Main plugin;
	public CSpleef(Main plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		if(cmd.getName().equalsIgnoreCase("cspleef")) {
			if(args.length <= 0) {
				sender.sendMessage(ChatColor.RED + "Invalid args. /cspleef [player]");
				return true;
			} 
			if(args.length > 0) {
				Player p = (Player) sender;
				Player t = Bukkit.getServer().getPlayer(args[0]);
				if(args[0].equalsIgnoreCase(t.getName())){
					Inventory inv = t.getInventory();
					ItemStack diamondshovel = new ItemStack(Material.DIAMOND_SPADE);
					ItemMeta mdiamondshovel = diamondshovel.getItemMeta();
					diamondshovel.addEnchantment(Enchantment.DURABILITY, 3);
					diamondshovel.addEnchantment(Enchantment.DIG_SPEED, 5);
					 ItemStack helm = new ItemStack(Material.AIR);
			            ItemStack chest = new ItemStack(Material.AIR);
			            ItemStack legs = new ItemStack(Material.AIR);
			            ItemStack boots = new ItemStack(Material.AIR);
			            ((PlayerInventory) inv).setHelmet(helm);
			            ((PlayerInventory)inv).setChestplate(chest);
			            ((PlayerInventory)inv).setLeggings(legs);
			            ((PlayerInventory)inv).setBoots(boots);
					t.getInventory().clear();
					t.getInventory().addItem(diamondshovel);
					for (PotionEffect effect : t.getActivePotionEffects())
				        t.removePotionEffect(effect.getType());
					t.sendMessage(ChatColor.GREEN + "You have received the Spleef kit!");
					p.sendMessage(ChatColor.GREEN + "Spleef kit has been sucessfully equipped on " + t.getName());
					
			
				
					
				}
			}
		}
		
		return false;
		
	}
	
}
