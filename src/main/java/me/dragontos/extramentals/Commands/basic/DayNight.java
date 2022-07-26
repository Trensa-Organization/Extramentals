package me.dragontos.extramentals.Commands.basic;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DayNight implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        if (cmd.getName().equalsIgnoreCase("day")) {
            p.getServer().dispatchCommand(p.getPlayer(), "time set day");
        }
        if (cmd.getName().equalsIgnoreCase("night"))
            p.getServer().dispatchCommand(p.getPlayer(), "time set night");
        return false;
    }
}
