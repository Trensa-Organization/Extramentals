package me.dragontos.extramentals.Events.SimplePoints.Config;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class SimplePointsConfig {

    public static File MobPointsFile;
    public static FileConfiguration MobPoints;

    public static void baseMobPoints(@NotNull Extramentals mp) {
        if(!mp.getDataFolder().exists()) {
            mp.getDataFolder().mkdirs();
        }

        MobPointsFile = new File(mp.getDataFolder(), "data/MobPoints.yml");
        if (!MobPointsFile.exists()) {
            mp.saveResource("data/MobPoints.yml",false);
        }
        MobPoints = YamlConfiguration.loadConfiguration(MobPointsFile);
    }
}
