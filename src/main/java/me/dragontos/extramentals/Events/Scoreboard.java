package me.dragontos.extramentals.Events;

import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;

public class Scoreboard {

    public static void setupScoreboard(Player p) {
        new BukkitRunnable() {
            String pname = p.getName();

            @Override
            public void run() {
                if (Bukkit.getOfflinePlayer(pname).isOnline()) {
                    updateBoard(p);
                } else {
                    cancel();
                }
            }
        }.runTaskTimer(Extramentals.getPlugin(), 0L, 20L);
    }

    private static void updateBoard(Player p) {
        ScoreboardManager m = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard b = m.getNewScoreboard();
        Objective o = b.registerNewObjective("test", "dummy", Extramentals.getPlugin().getConfig().getString("Scoreboard-title"));
        o.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score sc = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line1")));
        Score sc2 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line2")));
        Score sc3 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line3")));
        Score sc4 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line4")));
        Score sc5 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line5")));
        Score sc6 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line6")));
        Score sc7 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line7")));
        Score sc8 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line8")));
        Score sc9 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line9")));
        Score sc10 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line10")));
        Score sc11 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line11")));
        Score sc12 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line12")));
        Score sc13 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line13")));
        Score sc14 = o.getScore(PlaceholderAPI.setPlaceholders(
                p, Extramentals.getPlugin().getConfig().getString("Line14")));

        sc.setScore(14);
        sc2.setScore(13);
        sc3.setScore(12);
        sc4.setScore(11);
        sc5.setScore(10);
        sc6.setScore(9);
        sc7.setScore(8);
        sc8.setScore(7);
        sc9.setScore(6);
        sc10.setScore(5);
        sc11.setScore(4);
        sc12.setScore(3);
        sc13.setScore(2);
        sc14.setScore(1);

        p.setScoreboard(b);
    }
}