package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gm implements CommandExecutor {
    private Extramentals pl;

    public Gm(Extramentals pl) {
        this.pl = pl;
        pl.getCommand("gm").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        //prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //extra
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        String subpermission = EXAConfigManager.Messages.getString("subpermission");
        String help = EXAConfigManager.Messages.getString("help");
        String gms = EXAConfigManager.Messages.getString("gms");
        String gmc = EXAConfigManager.Messages.getString("gmc");
        String gma = EXAConfigManager.Messages.getString("gma");
        String gmsp = EXAConfigManager.Messages.getString("gmsp");

        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(prefix
                    +needtobeplayer));
            return false;
        }
        if(!p.hasPermission("Extramentals.Commands.Basic.Gamemode")) {
            sdr.sendMessage(Color(prefix
                    +subpermission));
            return false;
        }

        if(args.length == 0) {
            p.sendMessage(Color(prefix
                    +help));
            return false;
        }

        if(args[0].equalsIgnoreCase("0")) {
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage(Color(prefix
                    +gms));
            return false;
        }

        if(args[0].equalsIgnoreCase("1")) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(Color(prefix
                    +gmc));
            return false;
        }

        if(args[0].equalsIgnoreCase("2")) {
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage(Color(prefix
                    +gma));
            return false;
        }

        if(args[0].equalsIgnoreCase("3")) {
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(Color(prefix
                    +gmsp));
            return false;
        }
        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}


