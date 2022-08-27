package me.dragontos.extramentals.Events;

import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatSystem implements Listener {

    static Extramentals pl;
    public ChatSystem(Extramentals i) {
        pl = i;
    }

    @EventHandler
    public static void ChatSystem(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        //extra
        String player = EXAConfigManager.Messages.getString( "player");

        if(e.getPlayer().getName().equals(p.getDisplayName()));
        e.setFormat(Color(PlaceholderAPI.setPlaceholders(p, player
                + e.getMessage())));
    }
    private static String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}

