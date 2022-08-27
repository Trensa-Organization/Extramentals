package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.EXAConfigManager;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;

        String prefix = EXAConfigManager.Messages.getString("prefix");
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        String subpermission = EXAConfigManager.Messages.getString("subpermission");
        String help = EXAConfigManager.Messages.getString("help");
        String gms = EXAConfigManager.Messages.getString("gms");
        String gmc = EXAConfigManager.Messages.getString("gmc");
        String gma = EXAConfigManager.Messages.getString("gma");
        String gmsp = EXAConfigManager.Messages.getString("gmsp");

        if (!(sdr instanceof Player)) {
            p.sendMessage(Color(prefix + needtobeplayer));
            return false;
        }

        if(!p.hasPermission("Extramentals.Commands.Basic.Gamemode")) {
            p.sendMessage(Color(prefix + subpermission));
            return false;
        }

        if (cmd.getName().equalsIgnoreCase("gms")) {
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage(Color(prefix
                    + gms));
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("gmc")) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(Color(prefix
                    + gmc));
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("gma")) {
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage(Color(prefix
                    + gma));
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("gmsp")) {
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(Color(prefix
                    + gmsp));
            return false;
        }
        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
