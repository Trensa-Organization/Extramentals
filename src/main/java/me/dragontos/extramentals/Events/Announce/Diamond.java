package me.dragontos.extramentals.Events.Announce;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Diamond implements Listener {

    @EventHandler
    public boolean onBlockBreak(BlockBreakEvent event) {
        Player p = event.getPlayer();
        if (event.getBlock().getBlockData().getMaterial() == Material.DIAMOND_ORE) {
            if (p.getGameMode().equals(GameMode.CREATIVE)) {
                p.sendMessage(Extramentals.getPlugin().getConfig().getString("Diamond-Error"));
            }
            if (p.getGameMode().equals(GameMode.SURVIVAL)) {
                p.sendMessage(Extramentals.getPlugin().getConfig().getString("Diamond-Nice"));
            }


        }
        return false;
    }
}
