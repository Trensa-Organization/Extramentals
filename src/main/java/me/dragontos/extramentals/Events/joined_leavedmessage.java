package me.dragontos.extramentals.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joined_leavedmessage implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        event.setJoinMessage("§7[§a+§7]§6 " + p.getDisplayName() + " §6joined the server! ");
    }
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player p = event.getPlayer();
        event.setQuitMessage("§7[§c-§7]§6 " + p.getDisplayName() + " §6leaved the server! ");
    }
}
