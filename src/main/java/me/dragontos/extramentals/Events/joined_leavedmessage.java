package me.dragontos.extramentals.Events;

import com.destroystokyo.paper.Title;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joined_leavedmessage implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Scoreboard.setupScoreboard(e.getPlayer());
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        e.setJoinMessage("§7[§a+§7]§6 " + p.getDisplayName() + " §6joined the server! ");
        p.playSound(loc, Sound.BLOCK_NOTE_BLOCK_CHIME, 5, 5);
        p.sendTitle(new Title(ChatColor.BLUE + "Welcome " + p.getDisplayName()));
    }
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player p = event.getPlayer();
        event.setQuitMessage("§7[§c-§7]§6 " + p.getDisplayName() + " §6leaved the server! ");
    }
}
