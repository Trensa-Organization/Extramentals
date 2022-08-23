package me.dragontos.extramentals.Commands;

import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ExtramentalsCommands implements CommandExecutor {
    //ChatColor RED = ChatColor.RED;
    ChatColor RED = ChatColor.BLUE;


    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
                if (cmd.getName().equalsIgnoreCase(   "Extramentals")) {
                    sdr.sendMessage("1");
                    return false;
                } else if (args [0].equalsIgnoreCase("awd")) {
                    sdr.sendMessage("2");
                }
        return false;
    }
}