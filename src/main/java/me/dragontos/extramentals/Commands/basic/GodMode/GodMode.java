package me.dragontos.extramentals.Commands.basic.GodMode;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.ArrayList;

public class GodMode implements CommandExecutor, Listener {

    private ArrayList<String> gods = new ArrayList<String>();

    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {

        if (cmd.getName().equalsIgnoreCase("god")) {
            if (args.length == 0) {
            if (sdr instanceof Player) {
                Player player = (Player) sdr;
            if (player.hasPermission("cmd.god")) {
            if (gods.contains(player.getName())) {
                gods.remove(player.getName());
                player.sendMessage(("&aYou are no longer immortal!"));
            } else {
                gods.add(player.getName());
                 player.sendMessage(("&aYou are now immortal!"));
                 }
            } else {
                player.sendMessage("noPermsMessage");
                }
            } else {

                }
            } else if (args.length >= 1) {

            }
        }
        return true;
    }

    @EventHandler
    public void whenImmortal(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (gods.contains(player.getName())) {
                event.setCancelled(true);
            }
        }
    }
}
