package me.dragontos.extramentals.Commands;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

public class Discord implements CommandExecutor {

    @Override
    public boolean onCommand( CommandSender sdr,  Command cmd,  String str,  String[] args) {

        if (cmd.getName().equalsIgnoreCase("discord"))
            sdr.sendMessage(" ");
            sdr.sendMessage("§8§m+-----------=*§c§9Discord Invite§8§m*=-----------+");
            sdr.sendMessage("");
            sdr.sendMessage("§7Discord Link§f:");
            sdr.sendMessage("§9"+ ChatColor.BLUE +Extramentals.getPlugin().getConfig().getString("link"));
            sdr.sendMessage("");
            sdr.sendMessage("§8§m+-----------=* §9§l=+=*-==-*=+=§8§m *=-----------+");
            sdr.sendMessage(" ");
        return false;
    }
}
