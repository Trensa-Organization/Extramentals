package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String srt, String[] args) {
        Player player = (Player) sdr;
        if(cmd.getName().equalsIgnoreCase("fly")){
            if(!sdr.hasPermission("pluginname.fly")){
                sdr.sendMessage(ChatColor.DARK_RED + "You Dont Have Permissions For Using This Command.");
                return true;
            }

            if(player.getAllowFlight() == false){
                sdr.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix") + Extramentals.getPlugin().getConfig().getString("flyon"));
                player.setAllowFlight(true);
                return true;
            }
            player.setAllowFlight(false);
            sdr.sendMessage(Extramentals.getPlugin().getConfig().getString("prefix") + Extramentals.getPlugin().getConfig().getString("flyoff"));
            return true;
        }
        return true;
    }
}
