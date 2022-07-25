package me.dragontos.extramentals.Events.fun;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class zombiekill implements Listener {

    @EventHandler
    public void zombiekill(EntityDeathEvent e) {
        Entity dead = e.getEntity();
        Entity killer = e.getEntity().getKiller();
        if (dead.getLastDamageCause() instanceof Player) {
            Player p = (Player) e.getEntity().getKiller();
            if (dead.getType().equals(EntityType.ZOMBIE)) {
                p.sendMessage(ChatColor.GRAY + "You reviced " + ChatColor.GOLD + "5" + ChatColor.GRAY + " VC");
            }
            if (dead.getType().equals(EntityType.CREEPER)) {
                p.sendMessage(ChatColor.GRAY + "You reviced " + ChatColor.GOLD + "10" + ChatColor.GRAY + " VC");
            }
            if (dead.getType().equals(EntityType.SPIDER)) {
                p.sendMessage(ChatColor.GRAY + "You reviced " + ChatColor.GOLD + "8" + ChatColor.GRAY + " VC");
            }
            if (dead.getType().equals(EntityType.SKELETON)) {
                p.sendMessage(ChatColor.GRAY + "You reviced " + ChatColor.GOLD + "10" + ChatColor.GRAY + " VC");
            }
            if (dead.getType().equals(EntityType.ENDERMAN)) {
                p.sendMessage(ChatColor.GRAY + "You reviced " + ChatColor.GOLD + "20" + ChatColor.GRAY + " VC");
            }
            if (dead.getType().equals(EntityType.SLIME)) {
                p.sendMessage(ChatColor.GRAY + "You reviced " + ChatColor.GOLD + "1" + ChatColor.GRAY + " VC");
            }
        }
    }
}