package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Fly implements CommandExecutor {

    private Extramentals pl;

    public Fly(Extramentals pl) {
        this.pl = pl;
        (pl.getCommand("fly")).setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String srt, String[] args) {
        Player player = (Player) sdr;
        //prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //extra
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        String subpermission = EXAConfigManager.Messages.getString("subpermission");
        String flyon = EXAConfigManager.Messages.getString("flyon");
        String flyoff = EXAConfigManager.Messages.getString("flyoff");


        if(cmd.getName().equalsIgnoreCase("fly")){
            if(!(sdr instanceof Player)) {
                sdr.sendMessage(Color(prefix
                + needtobeplayer));
                return false;
            }
            if(!sdr.hasPermission("pluginname.fly")){
                sdr.sendMessage(Color(prefix
                        + subpermission));
                return true;
            }

            if(!player.getAllowFlight()){
                sdr.sendMessage(Color(prefix
                        + flyon));
                player.setAllowFlight(true);
                return true;
            }
            player.setAllowFlight(false);
            sdr.sendMessage(Color(prefix
                    + flyoff));
            return true;
        }
        return true;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
