package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DayNight implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        //prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //extra
        String daymsg = EXAConfigManager.Messages.getString("daymsg");
        String nightmsg = EXAConfigManager.Messages.getString("nightmsg");

        if (cmd.getName().equalsIgnoreCase("day")) {
            p.getWorld().setTime(0);
            p.sendMessage(prefix
                    + daymsg);
        }
        if (cmd.getName().equalsIgnoreCase("night")) {
            p.getWorld().setTime(13000);
            p.sendMessage(prefix
                    + nightmsg);
        }
        return false;
    }
}
