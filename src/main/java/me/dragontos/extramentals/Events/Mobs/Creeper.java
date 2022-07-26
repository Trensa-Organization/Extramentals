package me.dragontos.extramentals.Events.Mobs;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.concurrent.DelayQueue;

public class Creeper implements Listener {
    @EventHandler
    public void creaperkill(EntityDeathEvent e) {
        if(e.getEntityType().equals(EntityType.CREEPER)) {
            Player p = e.getEntity().getKiller();
            Location loc = p.getLocation();
            p.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("creeperkill"));
            p.playSound(loc, Sound.BLOCK_NOTE_BLOCK_BASS, 5,  1);
            }
        }
    }
