package me.dragontos.extramentals.Commands.basic;

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
    public static Extramentals plugin;
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    +Extramentals.getPlugin().getConfig().getString("needtobeplayer")));
            return false;
        }
        Player p = (Player) sdr;
        if(!p.hasPermission("Extramentals.Commands.Basic.Gamemode")) {
            sdr.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    +Extramentals.getPlugin().getConfig().getString("subpermission")));
            return false;
        }

        if(args.length == 0) {
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    +Extramentals.getPlugin().getConfig().getString("help")));
            return false;
        }

        if(args[0].equalsIgnoreCase("0")) {
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    +Extramentals.getPlugin().getConfig().getString("gms")));
            return false;
        }

        if(args[0].equalsIgnoreCase("1")) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    +Extramentals.getPlugin().getConfig().getString("gmc")));
            return false;
        }

        if(args[0].equalsIgnoreCase("2")) {
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    +Extramentals.getPlugin().getConfig().getString("gma")));
            return false;
        }

        if(args[0].equalsIgnoreCase("3")) {
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                    +Extramentals.getPlugin().getConfig().getString("gmsp")));
            return false;
        }


        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}


