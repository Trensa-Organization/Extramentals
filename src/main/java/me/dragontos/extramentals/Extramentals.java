package me.dragontos.extramentals;

import me.dragontos.extramentals.Commands.*;
import me.dragontos.extramentals.Commands.basic.*;
import me.dragontos.extramentals.Commands.basic.GodMode.GodMode;
import me.dragontos.extramentals.Events.*;
import me.dragontos.extramentals.Events.Announce.Diamond;
import me.dragontos.extramentals.Timer.Scoreboard;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Extramentals extends JavaPlugin {

    private static Extramentals plugin;

    //ChatColor's
    ChatColor GREEN = ChatColor.GREEN;
    ChatColor WHITE = ChatColor.WHITE;
    ChatColor GRAY = ChatColor.GRAY;
    ChatColor RED = ChatColor.RED;


    public void onEnable() {
        plugin = this;
        //Set's up Config = CFG
        SetupConfig();
        //Set's up Commands = CMD
        SetupCommands();
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new SimplePoints(this), this);
        //set's up Listeners = LTR
        SetupTimer();
        SetupListeners();
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7[§fTR§7] §a§lExtramentals enabled! §f|§r §6Coded by DRAGONTOS §f| §6Version " + this.getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("");
        // Plugin startup logic

    }

    // = CFG
    public void SetupConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    // = LTR
    private void SetupListeners() {
        Bukkit.getServer().getPluginManager().registerEvents(new joined_message(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new quit_message(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new joinmessage(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Diamond(), this);
    }
    // = CMD
    private void SetupCommands() {
        new Enderchest(this);
        new Discord(this);
        new Gm(this);
        new Heal(this);
        new Feed(this);
        new Fly(this);
        this.getCommand("Extramentals").setExecutor(new ExtramentalsCommands());
        this.getCommand("gms").setExecutor(new gms());
        this.getCommand("gmc").setExecutor(new gms());
        this.getCommand("gma").setExecutor(new gms());
        this.getCommand("gmsp").setExecutor(new gms());
        this.getCommand("god").setExecutor(new GodMode());
        this.getCommand("day").setExecutor(new DayNight());
        this.getCommand("night").setExecutor(new DayNight());
    }

    private void SetupTimer() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            Scoreboard.setupScoreboard(p);
        }
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7[§fTR§7] §c§lExtramentals disabled! §f|§r §6Coded by DRAGONTOS §f| §6Version " + this.getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("");

        // Plugin shutdown logic
    }
    public static Extramentals getPlugin() {
        return plugin;
    }
}
