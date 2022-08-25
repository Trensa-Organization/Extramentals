package me.dragontos.extramentals.Commands.basic;

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
        if(cmd.getName().equalsIgnoreCase("fly")){
            if(!sdr.hasPermission("pluginname.fly")){
                sdr.sendMessage(Color(pl.getConfig().getString("prefix") + pl.getConfig().getString("subpermission")));
                return true;
            }

            if(!player.getAllowFlight()){
                sdr.sendMessage(Color(pl.getConfig().getString("prefix") + pl.getConfig().getString("flyon")));
                player.setAllowFlight(true);
                return true;
            }
            player.setAllowFlight(false);
            sdr.sendMessage(Color(pl.getConfig().getString("prefix") + pl.getConfig().getString("flyoff")));
            return true;
        }
        return true;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
