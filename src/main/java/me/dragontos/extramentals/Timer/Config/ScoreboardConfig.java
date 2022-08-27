package me.dragontos.extramentals.Timer.Config;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class ScoreboardConfig {

    public static File ScoreboardFile;
    public static FileConfiguration Scoreboard;

    public static void baseScoreboard(Extramentals sc) {
        if(!sc.getDataFolder().exists()) {
            sc.getDataFolder().mkdirs();
        }

        ScoreboardFile = new File(sc.getDataFolder(), "data/Scoreboard.yml");
        if (!ScoreboardFile.exists()) {
            sc.saveResource("data/Scoreboard.yml",false);
        }
        Scoreboard = YamlConfiguration.loadConfiguration(ScoreboardFile);
    }


}
