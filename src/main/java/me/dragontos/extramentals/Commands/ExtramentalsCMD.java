package me.dragontos.extramentals.Commands;

import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Events.SimplePoints.Config.SimplePointsConfig;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ExtramentalsCMD implements CommandExecutor {

    private Extramentals pl;

    public ExtramentalsCMD(Extramentals pl) {
        this.pl = pl;
        pl.getCommand("Extramentals").setExecutor(this);
        pl.getCommand("EXA").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;
        //Gets config String.
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        String reload = EXAConfigManager.Messages.getString("reload");
        //Send help command if invalid.
        String help = EXAConfigManager.Messages.getString("help");
        //help msg
        String ExtrahelpRow1 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row1");
        String ExtrahelpRow2 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row2");
        String ExtrahelpRow3 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row3");
        String ExtrahelpRow4 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row4");
        String ExtrahelpRow5 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row5");
        String ExtrahelpRow6 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row6");
        String ExtrahelpRow7 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row7");
        String ExtrahelpRow8 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row8");
        String ExtrahelpRow9 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row9");
        String ExtrahelpRow10 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row10");
        String ExtrahelpRow11 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row11");
        String ExtrahelpRow12 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row12");
        String ExtrahelpRow13 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row13");
        String ExtrahelpRow14 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row14");
        String ExtrahelpRow15 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row15");
        String ExtrahelpRow16 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row16");
        String ExtrahelpRow17 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row17");
        String ExtrahelpRow18 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row18");
        String ExtrahelpRow19 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row19");
        String ExtrahelpRow20 = EXAConfigManager.Helpmsg.getString("Extrahelp-Row20");
        //info msg
        String ExtraInfoRow1 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row1");
        String ExtraInfoRow2 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row2");
        String ExtraInfoRow3 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row3");
        String ExtraInfoRow4 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row4");
        String ExtraInfoRow5 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row5");
        String ExtraInfoRow6 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row6");
        String ExtraInfoRow7 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row7");
        String ExtraInfoRow8 = EXAConfigManager.Infomsg.getString("ExtraInfo-Row8");

        if(args.length == 0) {
            p.sendMessage(Color(prefix)
                    +help);
            return false;
        }
        if (p.hasPermission("Extramentals.Commands.ExtramentalsCMD.Reload")) {
            if(args[0].equalsIgnoreCase("reload")) {
                pl.reloadConfig();
                p.sendMessage(Color(prefix
                        + reload));
                return false;
            }
        }
        if(args[0].equalsIgnoreCase("info")) {
            p.sendMessage(Color(ExtraInfoRow1));
            p.sendMessage(Color(ExtraInfoRow2));
            p.sendMessage(Color(ExtraInfoRow3));
            p.sendMessage(Color(ExtraInfoRow4));
            p.sendMessage(Color(ExtraInfoRow5));
            p.sendMessage(Color(ExtraInfoRow6));
            p.sendMessage(Color(ExtraInfoRow7));
            p.sendMessage(Color(ExtraInfoRow8));
            return false;
        }
        if(args[0].equalsIgnoreCase("help")) {
            p.sendMessage(Color(ExtrahelpRow1));
            p.sendMessage(Color(ExtrahelpRow2));
            p.sendMessage(Color(ExtrahelpRow3));
            p.sendMessage(Color(ExtrahelpRow4));
            p.sendMessage(Color(ExtrahelpRow5));
            p.sendMessage(Color(ExtrahelpRow6));
            p.sendMessage(Color(ExtrahelpRow7));
            p.sendMessage(Color(ExtrahelpRow8));
            p.sendMessage(Color(ExtrahelpRow9));
            p.sendMessage(Color(ExtrahelpRow10));
            p.sendMessage(Color(ExtrahelpRow11));
            p.sendMessage(Color(ExtrahelpRow12));
            p.sendMessage(Color(ExtrahelpRow13));
            p.sendMessage(Color(ExtrahelpRow14));
            p.sendMessage(Color(ExtrahelpRow15));
            p.sendMessage(Color(ExtrahelpRow16));
            p.sendMessage(Color(ExtrahelpRow17));
            p.sendMessage(Color(ExtrahelpRow18));
            p.sendMessage(Color(ExtrahelpRow19));
            p.sendMessage(Color(ExtrahelpRow20));
            return false;
        }
        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
