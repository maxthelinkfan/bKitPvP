package me.kitpvp.SonicKit;

import me.kitpvp.Events.DeathEvent;
import me.kitpvp.Events.HungerDisable;
import me.kitpvp.Events.JoinMessage;
import me.kitpvp.Events.KillEvent;
import me.kitpvp.Events.Respawn;
import me.kitpvp.Events.SlashSoup;
import me.kitpvp.Help.Kits;
import me.kitpvp.Help.Main_Help;
import me.kitpvp.Help.Pl;
import me.kitpvp.Help.Pl2;
import me.kitpvp.Help.Rules;
import me.kitpvp.Kits.Archer;
import me.kitpvp.Kits.Blaze;
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
import me.kitpvp.Kits.scout;
import net.milkbowl.vault.economy.Economy;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	
	SettingsManager settings = SettingsManager.getInstance();
	
	
	
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
	private KillEvent kill = new KillEvent(this);
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
	
	

	
	
	
	
	
	//Register Events
	PluginManager event = getServer().getPluginManager();
    event.registerEvents(this.PlayerListener, this);
    
    
    
    PluginManager join = getServer().getPluginManager();
    join.registerEvents(this.PlayerListener4, this);
    
    PluginManager respawn = getServer().getPluginManager();
    respawn.registerEvents(this.PlayerListener7, this);
    
    PluginManager kill = getServer().getPluginManager();
    kill.registerEvents(this.kill, this);
    
    PluginManager d = getServer().getPluginManager();
    d.registerEvents(this.d, this);
    
    
    

    
}
}
