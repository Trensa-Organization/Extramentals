package me.dragontos.extramentals.Events;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinmessage implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        ChatColor BLUE = ChatColor.BLUE;

        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row1"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row2"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row3"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row4"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row5"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row6"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row7"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row8"));
        p.sendMessage(Extramentals.getPlugin().getConfig().getString("Jm-Row9"));
    }
}
