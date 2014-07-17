package me.kitpvp.GUI;

import java.util.ArrayList;
import java.util.List;

import me.kitpvp.SonicKit.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainGUI implements Listener {
	
	private Main plugin;
	public MainGUI(Main plugin) {
	this.plugin = plugin;
	}
	
	
	
	List<String> aelite = new ArrayList<String>();
	
	
	@EventHandler
	public void onGUISelect(PlayerInteractEvent e) {
		// <Variables>
		Player p = e.getPlayer();
		Inventory inv = Bukkit.createInventory(p, 9, ChatColor.BLUE + "Select a kit!");
		ItemStack pvp = new ItemStack(Material.DIAMOND_SWORD);
		ItemStack archer = new ItemStack(Material.BOW);
		ItemStack elite = new ItemStack(Material.IRON_SWORD);
		ItemStack yesblaze = new ItemStack(Material.BLAZE_POWDER);
		ItemStack noblaze = new ItemStack(Material.BLAZE_POWDER);
		ItemStack yesdwarf = new ItemStack(Material.IRON_SWORD);
		ItemStack nodwarf = new ItemStack(Material.IRON_SWORD);
		// </Variables>
		
		// <ItemMeta>
		ItemMeta mpvp = pvp.getItemMeta();
		mpvp.setDisplayName(ChatColor.GREEN + "PvP");
		List<String> apvp = new ArrayList<String>();
		apvp.add("The default PvP kit!");
		mpvp.setLore(apvp);
		pvp.setItemMeta(mpvp);
		
		
		ItemMeta marcher = archer.getItemMeta();
		marcher.setDisplayName(ChatColor.GREEN + "Archer");	
		List<String> aarcher = new ArrayList<String>();
		aarcher.add("Shoot to the death!");
		marcher.setLore(aarcher);
		archer.setItemMeta(marcher);
		
		ItemMeta melite = elite.getItemMeta();
		melite.setDisplayName(ChatColor.GREEN + "Elite");
		List<String> aelite = new ArrayList<String>();
		aelite.add("Fight like a man!");
		melite.setLore(aelite);
		elite.setItemMeta(melite);
		
		ItemMeta myesblaze = yesblaze.getItemMeta();
		myesblaze.setDisplayName(ChatColor.GREEN + "Blaze");
		List<String> ayesblaze = new ArrayList<String>();
		ayesblaze.add("Burn your enemies!");
		myesblaze.setLore(ayesblaze);
		yesblaze.setItemMeta(myesblaze);
		
		ItemMeta mnoblaze = noblaze.getItemMeta();
		mnoblaze.setDisplayName(ChatColor.RED + "Blaze");
		List<String> anoblaze = new ArrayList<String>();
		anoblaze.add("You do not have access to this kit.");
		mnoblaze.setLore(anoblaze);
		noblaze.setItemMeta(mnoblaze);
		
		
		// </ItemMeta>
		
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(p.getItemInHand().getType().equals(Material.NETHER_STAR)) {
				inv.addItem(pvp);
				inv.addItem(archer);
				inv.addItem(elite);					
				if(p.hasPermission("kitpvp.blaze")) {
					inv.addItem(yesblaze);
				} else {
					inv.addItem(noblaze);
				}
				if(p.hasPermission("kitpvp.dwarf")) {
					inv.addItem(yesdwarf);
				} else {
					inv.addItem(nodwarf);
					
				
					
					
							}
				p.openInventory(inv);
						}						
					}	
		
				}
	
	 
				
			}
		
		
		
	
			

