package me.dragontos.extramentals.Timer;

import com.destroystokyo.paper.event.profile.PreLookupProfileEvent;
import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.Events.SimplePoints.Config.SimplePointsConfig;
import me.dragontos.extramentals.Extramentals;
import me.dragontos.extramentals.Timer.Config.ScoreboardConfig;
import me.dragontos.extramentals.Timer.Config.TablistConfig;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Objects;

import static me.clip.placeholderapi.PlaceholderAPI.setPlaceholders;

public class Tablist {

    public static void setupTablist(Player p) {
        new BukkitRunnable() {
            String pname = p.getName();

            @Override
            public void run() {
                if (Bukkit.getOfflinePlayer(pname).isOnline()) {
                    TabList2(p);
                } else {
                    cancel();
                }
            }
        }.runTaskTimer(Extramentals.getPlugin(), 0L, 20L);
    }
    private static void TabList2(Player p) {
        String S = PlaceholderAPI.setPlaceholders(p, Objects.requireNonNull(TablistConfig.Tablist.getString("Suffix")));
        int HT = TablistConfig.Tablist.getInt("Header-Total");
        String H1 = TablistConfig.Tablist.getString("Header1");
        String H2 = TablistConfig.Tablist.getString("Header2");
        String H3 = TablistConfig.Tablist.getString("Header3");
        String H4 = TablistConfig.Tablist.getString("Header4");
        String H5 = TablistConfig.Tablist.getString("Header5");
        String H6 = TablistConfig.Tablist.getString("Header6");
        String H7 = TablistConfig.Tablist.getString("Header7");
        String H8 = TablistConfig.Tablist.getString("Header8");
        String H9 = TablistConfig.Tablist.getString("Header9");
        String H = "owo";
        int FT = TablistConfig.Tablist.getInt("Footer-Total");
        String F1 = TablistConfig.Tablist.getString("Footer1");
        String F2 = TablistConfig.Tablist.getString("Footer2");
        String F3 = TablistConfig.Tablist.getString("Footer3");
        String F4 = TablistConfig.Tablist.getString("Footer4");
        String F5 = TablistConfig.Tablist.getString("Footer5");
        String F6 = TablistConfig.Tablist.getString("Footer6");
        String F7 = TablistConfig.Tablist.getString("Footer7");
        String F8 = TablistConfig.Tablist.getString("Footer8");
        String F9 = TablistConfig.Tablist.getString("Footer9");

        p.setPlayerListName(S);

        // If statements for the header
        if (HT == 1) {
            p.setPlayerListHeader(H1);
        }

        if (HT == 2) {
            p.setPlayerListHeader(H1 + "\n" + H2);
        }

        if (HT == 3) {
            p.setPlayerListHeader(H1 + "\n" + H2 + "\n" + H3);
        }

        if (HT == 4) {
            p.setPlayerListHeader(H1 + "\n" + H2 + "\n" + H3 + "\n" + H4);
        }

        if (HT == 5) {
            p.setPlayerListHeader(H1 + "\n" + H2 + "\n" + H3 + "\n" + H4 + "\n" + H5);
        }

        if (HT == 6) {
            p.setPlayerListHeader(H1 + "\n" + H2 + "\n" + H3 + "\n" + H4 + "\n" + H5 + "\n" + H6);
        }

        if (HT == 7) {
            p.setPlayerListHeader(H1 + "\n" + H2 + "\n" + H3 + "\n" + H4 + "\n" + H5 + "\n" + H6 + "\n" + H7);
        }

        if (HT == 8) {
            p.setPlayerListHeader(H1 + "\n" + H2 + "\n" + H3 + "\n" + H4 + "\n" + H5 + "\n" + H6 + "\n" + H7 + "\n" + H8);
        }

        if (HT == 9) {
            p.setPlayerListHeader(H1 + "\n" + H2 + "\n" + H3 + "\n" + H4 + "\n" + H5 + "\n" + H6 + "\n" + H7 + "\n" + H8 + "\n" + H9);
        }

        // If statements for the Footer
        if (FT == 1) {
            p.setPlayerListFooter(F1);
        }

        if (FT == 2) {
            p.setPlayerListFooter(F1 + "\n" + F2);
        }

        if (FT == 3) {
            p.setPlayerListFooter(F1 + "\n" + F2 + "\n" + F3);
        }

        if (FT == 4) {
            p.setPlayerListFooter(F1 + "\n" + F2 + "\n" + F3 + "\n" + F4);
        }

        if (FT == 5) {
            p.setPlayerListFooter(F1 + "\n" + F2 + "\n" + F3 + "\n" + F4 + "\n" + F5);
        }

        if (FT == 6) {
            p.setPlayerListFooter(F1 + "\n" + F2 + "\n" + F3 + "\n" + F4 + "\n" + F5 + "\n" + F6);
        }

        if (FT == 7) {
            p.setPlayerListFooter(F1 + "\n" + F2 + "\n" + F3 + "\n" + F4 + "\n" + F5 + "\n" + F6 + "\n" + F7);
        }

        if (FT == 8) {
            p.setPlayerListFooter(F1 + "\n" + F2 + "\n" + F3 + "\n" + F4 + "\n" + F5 + "\n" + F6 + "\n" + F7 + "\n" + F8);
        }

        if (FT == 9) {
            p.setPlayerListFooter(F1 + "\n" + F2 + "\n" + F3 + "\n" + F4 + "\n" + F5 + "\n" + F6 + "\n" + F7 + "\n" + F8 + "\n" + F9);
        }
    }
    private static String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
