package me.dragontos.extramentals;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class EXAConfigManager {

    private Extramentals plugin = Extramentals.getPlugin(Extramentals.class);

    //Files & File Configs Here
    public FileConfiguration discordcfg;
    public File discord;
    //-------------------------------------

    public void setup() {
        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }

        discord = new File(plugin.getDataFolder(), "discord.yml");

        if (discord.exists()) {
            try {
                discord.createNewFile();
                Bukkit.getServer().getConsoleSender()
                        .sendMessage(ChatColor.GREEN + "The discord.yaml has been created");
            } catch (IOException e) {
                Bukkit.getServer().getConsoleSender()
                        .sendMessage(ChatColor.RED + "Could not create the discord.yml file");
            }
        }

        discordcfg = YamlConfiguration.loadConfiguration(discord);
    }

    public FileConfiguration getDiscordcfg() {
        return discordcfg;
    }

    public  void saveDiscord(){
        try{
            discordcfg.save(discord);
            Bukkit.getServer().getConsoleSender()
                    .sendMessage(ChatColor.GREEN + "The discord.yaml file been saved");
        }catch(IOException e){
            Bukkit.getServer().getConsoleSender()
                    .sendMessage(ChatColor.RED + "Could not save discord.yml file");

        }
    }

    public void reloadDiscord(){
        discordcfg = YamlConfiguration.loadConfiguration(discord);
        Bukkit.getServer().getConsoleSender()
                .sendMessage(ChatColor.GREEN + "The discord.yaml file been reloaded");

    }
}
