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
        Extramentals.getPlugin();
        if (cmd.getName().equalsIgnoreCase("Extramentals")) {

        }
        if (args[0].equalsIgnoreCase("help")) {
            sdr.sendMessage("");
            sdr.sendMessage("§8§m+---------------=*§c§9WHelp§8§m*=---------------+");
            sdr.sendMessage("");
            sdr.sendMessage("");
            sdr.sendMessage(Extramentals.getPlugin().getConfig().getString("link"));
            sdr.sendMessage("");
            sdr.sendMessage("");
            sdr.sendMessage("§8§m+-----------=* §9§l=+=*-==-*=+=§8§m *=-----------+");
            sdr.sendMessage("");

        }
        if (args[0].equalsIgnoreCase("bye")) {
            sdr.sendMessage("BYE.... FACKER!!!");
        }
        return false;
    }
}
