package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Discord implements CommandExecutor {

    private Extramentals pl;

    public Discord(Extramentals pl) {
        this.pl = pl;
        pl.getCommand("dc").setExecutor(this);
        pl.getCommand("discord").setExecutor(this);
    }

    @Override
    public boolean onCommand( CommandSender sdr,  Command cmd,  String str,  String[] args) {
        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("needtobeplayer")));
            return false;
        }
        Player p = (Player) sdr;
        if(args.length == 0) {
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row1")));
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row2")));
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row3")));
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row4")));
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row5")));
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row6")));
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row7")));
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("Dc-Row8")));
            return false;
        }

        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
