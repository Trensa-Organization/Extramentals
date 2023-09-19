package me.dragontos.extramentals.Events.Announce;

import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.GameMode;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Diamond implements Listener {

    @EventHandler
    public boolean onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        String dderror = EXAConfigManager.Messages.getString("gmsp");

        if (e.getBlock().getBlockData().getMaterial() == Material.DIAMOND_ORE || e.getBlock().getBlockData().getMaterial() == Material.DEEPSLATE_DIAMOND_ORE ) {
            if (p.getGameMode().equals(GameMode.CREATIVE)) {
                p.sendMessage(EXAConfigManager.Prefix.getString("prefix")
                        + EXAConfigManager.Messages.getString("Diamond-Error"));


                p.playSound(loc, Sound.BLOCK_NOTE_BLOCK_BASS, 5, 1);
            }
            if (p.getGameMode().equals(GameMode.SURVIVAL)) {
                p.sendMessage(EXAConfigManager.Prefix.getString("prefix")
                        + EXAConfigManager.Messages.getString("Diamond-Nice"));

                p.playSound(loc, Sound.BLOCK_NOTE_BLOCK_CHIME, 5, 5);
            }
        }
        return false;
    }
}
