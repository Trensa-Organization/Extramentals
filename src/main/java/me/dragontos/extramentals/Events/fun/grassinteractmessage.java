package me.dragontos.extramentals.Events.fun;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class grassinteractmessage implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if(event.getBlock().getBlockData().getMaterial() ==  Material.GRASS_BLOCK) {
            Player p = event.getPlayer();
            p.sendMessage("HEY DON'T BREAK GRASS");
            if (p.getGameMode().equals(GameMode.CREATIVE)) {
                p.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
                p.setGameMode(GameMode.SURVIVAL);
            }

        }
    }
}
