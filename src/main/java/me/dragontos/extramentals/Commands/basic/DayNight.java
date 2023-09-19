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
        // Day control
        String daymsg = EXAConfigManager.Messages.getString("daymsg");
        String nightmsg = EXAConfigManager.Messages.getString("nightmsg");
        //Weather control
        String sunmsg = EXAConfigManager.Messages.getString("sunmsg");
        String rainmsg = EXAConfigManager.Messages.getString("rainmsg");
        String thundermsg = EXAConfigManager.Messages.getString("thundermsg");

        // Day/Night Command
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

        // weather clear etc Command
        if (cmd.getName().equalsIgnoreCase("sun")) {
            p.getWorld().setStorm(false);
            p.getWorld().setThundering(false);
            p.sendMessage(prefix
                    + sunmsg);
        }
        if (cmd.getName().equalsIgnoreCase("rain")) {
            p.getWorld().setStorm(true);
            p.getWorld().setThundering(false);
            p.sendMessage(prefix
                    + rainmsg);
        }
        if (cmd.getName().equalsIgnoreCase("thunder")) {
            p.getWorld().setThundering(true);
            p.getWorld().setStorm(false);
            p.sendMessage(prefix
                    + thundermsg);
        }
        return false;
    }
}
