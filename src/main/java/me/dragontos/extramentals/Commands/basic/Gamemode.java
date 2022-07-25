package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    public static Extramentals plugin;
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        if (cmd.getName().equalsIgnoreCase("gmc")) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gmc"));
        }
        if (cmd.getName().equalsIgnoreCase("gms")) {
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gms"));
        }
        if (cmd.getName().equalsIgnoreCase("gma")) {
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gma"));
        }
        if (cmd.getName().equalsIgnoreCase("gmsp")) {
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix")
                    + Extramentals.getPlugin().getConfig().getString("gmsp"));

        }
        return false;
    }
}

