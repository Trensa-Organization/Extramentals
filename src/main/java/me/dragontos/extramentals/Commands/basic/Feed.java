package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        if(cmd.getName().equalsIgnoreCase("feed"))
            p.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("feed"));
            p.setFoodLevel(20);
        return false;
    }
}
