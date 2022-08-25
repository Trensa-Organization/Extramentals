package me.dragontos.extramentals.Events;

import com.destroystokyo.paper.Title;
import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.Extramentals;
import me.dragontos.extramentals.Timer.Scoreboard;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joined_message implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Scoreboard.setupScoreboard(e.getPlayer());
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        e.setJoinMessage(Color(PlaceholderAPI.setPlaceholders(p, Extramentals.getPlugin().getConfig().getString("Joinmsg"))));
        p.playSound(loc, Sound.BLOCK_NOTE_BLOCK_CHIME, 5, 5);
        p.sendTitle(new Title(Color(PlaceholderAPI.setPlaceholders(p, Extramentals.getPlugin().getConfig().getString("WelcomeTitle")))));
    }

    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
