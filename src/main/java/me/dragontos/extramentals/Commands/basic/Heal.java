package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        if(cmd.getName().equalsIgnoreCase("heal"))
            p.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("heal"));
            p.setHealth(20);
        return false;
    }
}
