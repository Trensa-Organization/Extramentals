package me.dragontos.extramentals.Events;

import me.dragontos.extramentals.EXAConfigManager;
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
        //extra
        String jmrow1 = EXAConfigManager.Welcomemsg.getString("Jm-Row1");
        String jmrow2 = EXAConfigManager.Welcomemsg.getString("Jm-Row2");
        String jmrow3 = EXAConfigManager.Welcomemsg.getString("Jm-Row3");
        String jmrow4 = EXAConfigManager.Welcomemsg.getString("Jm-Row4");
        String jmrow5 = EXAConfigManager.Welcomemsg.getString("Jm-Row5");
        String jmrow6 = EXAConfigManager.Welcomemsg.getString("Jm-Row6");
        String jmrow7 = EXAConfigManager.Welcomemsg.getString("Jm-Row7");
        String jmrow8 = EXAConfigManager.Welcomemsg.getString("Jm-Row8");
        String jmrow9 = EXAConfigManager.Welcomemsg.getString("Jm-Row9");

        p.sendMessage(Color(jmrow1));
        p.sendMessage(Color(jmrow2));
        p.sendMessage(Color(jmrow3));
        p.sendMessage(Color(jmrow4));
        p.sendMessage(Color(jmrow5));
        p.sendMessage(Color(jmrow6));
        p.sendMessage(Color(jmrow7));
        p.sendMessage(Color(jmrow8));
        p.sendMessage(Color(jmrow9));
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&',str);
    }
}
