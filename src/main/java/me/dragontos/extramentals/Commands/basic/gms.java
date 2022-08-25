package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms implements CommandExecutor {
    public static Extramentals plugin;
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        if (cmd.getName().equalsIgnoreCase("gmc")) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gmc")));
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("gms")) {
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gms")));
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("gma")) {
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gma")));
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("gmsp")) {
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gmsp")));
            return false;
        }
        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
