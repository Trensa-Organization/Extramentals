package me.dragontos.extramentals.Timer.Config;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class TablistConfig {

    public static File TablistFile;
    public static FileConfiguration Tablist;

    public static void baseTablist(Extramentals sc) {
        if(!sc.getDataFolder().exists()) {
            sc.getDataFolder().mkdirs();
        }

        TablistFile = new File(sc.getDataFolder(), "data/Tablist.yml");
        if (!TablistFile.exists()) {
            sc.saveResource("data/Tablist.yml",false);
        }
        Tablist = YamlConfiguration.loadConfiguration(TablistFile);
    }


}
