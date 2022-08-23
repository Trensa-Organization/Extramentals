package me.dragontos.extramentals;

import me.dragontos.extramentals.Commands.*;
import me.dragontos.extramentals.Commands.basic.*;
import me.dragontos.extramentals.Commands.basic.GodMode.GodMode;
import me.dragontos.extramentals.Events.Announce.Diamond;
import me.dragontos.extramentals.Events.Mobs.Creeper;
import me.dragontos.extramentals.Events.Scoreboard;
import me.dragontos.extramentals.Events.joined_leavedmessage;
import me.dragontos.extramentals.Events.joinmessage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
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
        Bukkit.getServer().getPluginManager().registerEvents(new joined_leavedmessage(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new joinmessage(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Diamond(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Creeper(), this);
//        Bukkit.getServer().getPluginManager().registerEvents(new EXAMenuEvents(),this);
//        Bukkit.getServer().getPluginManager().registerEvents(new grassinteractmessage(), this);
//        Bukkit.getServer().getPluginManager().registerEvents(new zombiekill(), this);
    }
    // = CMD
    private void SetupCommands() {
        this.getCommand("Extramentals").setExecutor(new ExtramentalsCommands());
        this.getCommand("discord").setExecutor(new Discord());
        this.getCommand("dc").setExecutor(new Discord());
        this.getCommand("gui").setExecutor(new ExtramentalsMenu());
        this.getCommand("gmc").setExecutor(new Gamemode());
        this.getCommand("gms").setExecutor(new Gamemode());
        this.getCommand("gma").setExecutor(new Gamemode());
        this.getCommand("gmsp").setExecutor(new Gamemode());
        this.getCommand("fly").setExecutor(new Fly());
        this.getCommand("heal").setExecutor(new Heal());
        this.getCommand("Feed").setExecutor(new Feed());
        this.getCommand("god").setExecutor(new GodMode());
        this.getCommand("day").setExecutor(new DayNight());
        this.getCommand("night").setExecutor(new DayNight());
        this.getCommand("ec").setExecutor(new Enderchest());
        this.getCommand("enderchest").setExecutor(new Enderchest());
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
