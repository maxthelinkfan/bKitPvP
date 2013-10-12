package me.kitpvp.SonicKit;

import me.kitpvp.Events.HungerDisable;
import me.kitpvp.Events.JoinMessage;
import me.kitpvp.Events.Respawn;
import me.kitpvp.Help.Kits;
import me.kitpvp.Help.Main_Help;
import me.kitpvp.Help.Pl;
import me.kitpvp.Help.Pl2;
import me.kitpvp.Help.Rules;
import me.kitpvp.Kits.Archer;
import me.kitpvp.Kits.Blaze;
import me.kitpvp.Kits.Elite;
import me.kitpvp.Kits.Fisherman;
import me.kitpvp.Kits.Grandpa;
import me.kitpvp.Kits.Knight;
import me.kitpvp.Kits.PvP;
import me.kitpvp.Kits.Sniper;
import me.kitpvp.Kits.Sonic;
import me.kitpvp.Kits.Switcher;
import me.kitpvp.Kits.Tank;
import me.kitpvp.Kits.Viking;
import me.kitpvp.Kits.scout;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
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

	
	private HungerDisable PlayerListener = new HungerDisable(this);
	private JoinMessage PlayerListener4 = new JoinMessage(this);
	private Respawn PlayerListener7 = new Respawn(this);
	
	
	public void onEnable() {
		getConfig().options().copyDefaults(true);
        saveConfig();
		
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
	

	
	
	
	
	
	
	PluginManager event = getServer().getPluginManager();
    event.registerEvents(this.PlayerListener, this);
    
    
    
    PluginManager join = getServer().getPluginManager();
    join.registerEvents(this.PlayerListener4, this);
    
    PluginManager respawn = getServer().getPluginManager();
    respawn.registerEvents(this.PlayerListener7, this);
    
    
    

    
}
}
