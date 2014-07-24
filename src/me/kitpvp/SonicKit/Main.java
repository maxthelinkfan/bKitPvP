package me.kitpvp.SonicKit;

import java.util.ArrayList;

import me.kitpvp.Events.DeathEvent;
import me.kitpvp.Events.HungerDisable;
import me.kitpvp.Events.JoinMessage;
import me.kitpvp.Events.Respawn;
import me.kitpvp.Events.SlashSoup;
import me.kitpvp.Help.Events;
import me.kitpvp.Help.Kits;
import me.kitpvp.Help.Main_Help;
import me.kitpvp.Help.Pl;
import me.kitpvp.Help.Pl2;
import me.kitpvp.Help.Rules;
import me.kitpvp.Kits.Archer;
import me.kitpvp.Kits.Blaze;
import me.kitpvp.Kits.CBSpleef;
import me.kitpvp.Kits.CClear;
import me.kitpvp.Kits.CSpleef;
import me.kitpvp.Kits.Dwarf;
import me.kitpvp.Kits.Elite;
import me.kitpvp.Kits.Fisherman;
import me.kitpvp.Kits.Grandpa;
import me.kitpvp.Kits.Knight;
import me.kitpvp.Kits.PvP;
import me.kitpvp.Kits.Sniper;
import me.kitpvp.Kits.Sonic;
import me.kitpvp.Kits.Switcher;
import me.kitpvp.Kits.Tank;
import me.kitpvp.Kits.Urgal;
import me.kitpvp.Kits.Viking;
import me.kitpvp.Kits.Viper;
import me.kitpvp.Kits.Voter;
import me.kitpvp.Kits.scout;
import me.kitpvp.Mod.Invsee;
import net.milkbowl.vault.economy.Economy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;

public class Main extends JavaPlugin implements Listener {
	
	
	SettingsManager settings = SettingsManager.getInstance();
	
	
	
	public void playerDeathAddMoney(Player deather, Player killer) {
		  Main.economy.depositPlayer(killer.getName(), this.getConfig().getInt("cashonkill"));
		  Bukkit.broadcastMessage(ChatColor.GRAY + "[" + this.getConfig().getString("prefixmsg") + "] " + ChatColor.AQUA + killer.getName() + " has slain " + deather.getName());
			killer.sendMessage(ChatColor.GREEN + "You have received $" + this.getConfig().getInt("cashonkill") + ". Your new balance is $" + Main.economy.getBalance(killer.getName()));
	  }
	
	public void playerShotAddMoney(Player deather, Player killer) {
		Main.economy.depositPlayer(killer.getName(), this.getConfig().getInt("cashonkill"));
		  Bukkit.broadcastMessage(ChatColor.GRAY + "[" + this.getConfig().getString("prefixmsg") + "] " + ChatColor.AQUA + killer.getName() + " has shot " + deather.getName());
			killer.sendMessage(ChatColor.GREEN + "You have received $" + this.getConfig().getInt("cashonkill") + ". Your new balance is $" + Main.economy.getBalance(killer.getName()));
	}
	
	public void givePvP(Player p) {
		Inventory inv = p.getInventory();
		ItemStack PvPSword = new ItemStack(Material.DIAMOND_SWORD);
		ItemStack PvPSoup = new ItemStack(Material.MUSHROOM_SOUP);
		ItemStack PvPHead = new ItemStack(Material.IRON_HELMET);
		ItemStack PvPChest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack PvPLegs = new ItemStack(Material.IRON_LEGGINGS);
		ItemStack PvPBoots = new ItemStack(Material.IRON_BOOTS);
		String pvp = getConfig().getString("pvpmsg");
		String prefixmsg = getConfig().getString("prefixmsg");
		inv.clear();
		for (PotionEffect effect : p.getActivePotionEffects())
	        p.removePotionEffect(effect.getType());
		PvPSword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
		inv.addItem(PvPSword);
		for(int i=1; i <=35; i++)
         	inv.addItem(PvPSoup);
		p.getInventory().setHelmet(PvPHead);
		p.getInventory().setChestplate(PvPChest);
		p.getInventory().setLeggings(PvPLegs);
		p.getInventory().setBoots(PvPBoots);
		p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + pvp);			
	}
	
	public void giveArcher(Player p) {
		
	}
	
	public void giveElite(Player p) {
		Inventory inv = p.getInventory();
		ItemStack PvPSword = new ItemStack(Material.DIAMOND_SWORD);
		ItemStack PvPSoup = new ItemStack(Material.MUSHROOM_SOUP);
		ItemStack PvPHead = new ItemStack(Material.IRON_HELMET);
		ItemStack PvPChest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack PvPLegs = new ItemStack(Material.IRON_LEGGINGS);
		ItemStack PvPBoots = new ItemStack(Material.IRON_BOOTS);
		String pvp = getConfig().getString("elitemsg");
		String prefixmsg = getConfig().getString("prefixmsg");
		inv.clear();
		for (PotionEffect effect : p.getActivePotionEffects())
	        p.removePotionEffect(effect.getType());
		inv.addItem(PvPSword);
		for(int i=1; i <=35; i++)
         	inv.addItem(PvPSoup);
		p.getInventory().setHelmet(PvPHead);
		p.getInventory().setChestplate(PvPChest);
		p.getInventory().setLeggings(PvPLegs);
		p.getInventory().setBoots(PvPBoots);
		p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "" + prefixmsg + ChatColor.GOLD + "] " + ChatColor.GOLD + " " + pvp);
		
				
	}
	
	
	
	
	
	
	
	
	
	// Define Command Executors
	private PvP executor;
	private Archer executor1;
	private Elite executor2;
	private Knight executor3;
	private Blaze executor4;
	private Tank executor5;
	private Fisherman executor6;
	private Switcher executor7;
	private Sniper executor9;
	private Grandpa executor10;
	private scout executor11;
	private Viking executor12;
	private Main_Help executor13;
	private Pl executor14;
	private Pl2 executor15;
	private Rules executor18;
	private Kits executor19;
	private Sonic executor20;
	private Urgal executor21;
	private Dwarf executor22;
	private SlashSoup executor23;
	private Viper executor24;
	private Invsee executor25;
	private PotPvP executor26;
	
	//ARRAY LISTS//
	  public ArrayList<String> kit = new ArrayList<String>();
	   ArrayList<String> archer = new ArrayList<String>(); 
	   ArrayList<String> blaze = new ArrayList<String>();
	   ArrayList<String> dwarf = new ArrayList<String>();
	   ArrayList<String> elite = new ArrayList<String>();
	   ArrayList<String> fisherman = new ArrayList<String>();
	   ArrayList<String> grandpa = new ArrayList<String>();
	   
	   
	
	 public static Economy economy = null;
	
	  private boolean setupEconomy()
	    {
	        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
	        if (economyProvider != null) {
	            economy = economyProvider.getProvider();
	        }

	        return (economy != null);
	    }

	//Define Events
	private HungerDisable PlayerListener = new HungerDisable(this);
	private JoinMessage PlayerListener4 = new JoinMessage(this);
	private Respawn PlayerListener7 = new Respawn(this);
	private DeathEvent d = new DeathEvent(this);
	
	
	public void onEnable() {
		getConfig().options().copyDefaults(true);
        saveConfig();
        settings.setup(this);
        setupEconomy();
        
        
	//Register Commands	
	executor = new PvP(this);
	getCommand("pvp").setExecutor(executor);
	
	executor1 = new Archer(this);
	getCommand("archer").setExecutor(executor1);
	
	executor2 = new Elite(this);
	getCommand("elite").setExecutor(executor2);
	
	executor3 = new Knight(this);
	getCommand("knight").setExecutor(executor3);
	
	executor4 = new Blaze(this);
	getCommand("blaze").setExecutor(executor4);
	
	executor5 = new Tank(this);
	getCommand("tank").setExecutor(executor5);
	
	executor6 = new Fisherman(this);
	getCommand("fisherman").setExecutor(executor6);
	
	executor7 = new Switcher(this);
	getCommand("switcher").setExecutor(executor7);
	
	
	executor9 = new Sniper(this);
	getCommand("sniper").setExecutor(executor9);
	
	executor10 = new Grandpa(this);
	getCommand("grandpa").setExecutor(executor10);
	
	executor11 = new scout(this);
	getCommand("scout").setExecutor(executor11);
	
	executor12 = new Viking(this);
	getCommand("viking").setExecutor(executor12);
	
	executor13 = new Main_Help(this);
	getCommand("help").setExecutor(executor13);
	
	executor14 = new Pl(this);
	getCommand("pl").setExecutor(executor14);
	
	executor15 = new Pl2(this);
	getCommand("?").setExecutor(executor15);
	
	executor18 = new Rules(this);
	getCommand("rules").setExecutor(executor18);
	
	executor19 = new Kits(this);
	getCommand("kits").setExecutor(executor19);
	
	executor20 = new Sonic(this);
	getCommand("sonic").setExecutor(executor20);
	
	executor21 = new Urgal(this);
	getCommand("urgal").setExecutor(executor21);
	
	executor22 = new Dwarf(this);
	getCommand("dwarf").setExecutor(executor22);
	
	executor23 = new SlashSoup(this);
	getCommand("soup").setExecutor(executor23);
	
	executor24 = new Viper(this);
	getCommand("viper").setExecutor(executor24);
	
	executor25 = new Invsee(this);
	getCommand("seeinv").setExecutor(executor25);
	
	executor26 = new PotPvP(this);
	getCommand("potpvp").setExecutor(executor26);
	
	getCommand("voter").setExecutor(new Voter(this));
	
	getCommand("cspleef").setExecutor(new CSpleef(this));
	
	getCommand("cclear").setExecutor(new CClear(this));
	
	getCommand("cbspleef").setExecutor(new CBSpleef(this));
	
	getCommand("events").setExecutor(new Events(this));
	
	
	

	
	
	
	
	
	//Register Events
	PluginManager event = getServer().getPluginManager();
    event.registerEvents(this.PlayerListener, this);
    
    
    
    PluginManager join = getServer().getPluginManager();
    join.registerEvents(this.PlayerListener4, this);
    
    PluginManager respawn = getServer().getPluginManager();
    respawn.registerEvents(this.PlayerListener7, this);
    
    PluginManager d = getServer().getPluginManager();
    d.registerEvents(this.d, this);
    
    
    
    

    
}
}
