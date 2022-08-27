package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.EXAConfigManager;
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
        //Prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //Extra
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        //dc
        String DcRow1 = EXAConfigManager.DiscordLink.getString("Dc-Row1");
        String DcRow2 = EXAConfigManager.DiscordLink.getString("Dc-Row2");
        String DcRow3 = EXAConfigManager.DiscordLink.getString("Dc-Row3");
        String DcRow4 = EXAConfigManager.DiscordLink.getString("Dc-Row4");
        String DcRow5 = EXAConfigManager.DiscordLink.getString("Dc-Row5");
        String DcRow6 = EXAConfigManager.DiscordLink.getString("Dc-Row6");
        String DcRow7 = EXAConfigManager.DiscordLink.getString("Dc-Row7");
        String DcRow8 = EXAConfigManager.DiscordLink.getString("Dc-Row8");

        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(prefix
                    + needtobeplayer));
            return false;
        }
        Player p = (Player) sdr;
        if(args.length == 0) {
            p.sendMessage(Color(DcRow1));
            p.sendMessage(Color(DcRow2));
            p.sendMessage(Color(DcRow3));
            p.sendMessage(Color(DcRow4));
            p.sendMessage(Color(DcRow5));
            p.sendMessage(Color(DcRow6));
            p.sendMessage(Color(DcRow7));
            p.sendMessage(Color(DcRow8));
            return false;
        }

        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
