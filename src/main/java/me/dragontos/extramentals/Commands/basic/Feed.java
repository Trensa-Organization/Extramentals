package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

    private Extramentals pl;

    public Feed(Extramentals pl) {
        this.pl = pl;
        pl.getCommand("feed").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("needtobeplayer")));
        }
        Player p = (Player) sdr;
        if(!p.hasPermission("Extramentals.Commands.Basic.Feed")) {
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("subpermission")));
        }
        if(args.length == 0) {
            p.setFoodLevel(20);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("feed")));
        }
        if(args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if(target != null){
                target.setFoodLevel(20);
                target.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                        Extramentals.getPlugin().getConfig().getString("feed")));
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+target.getDisplayName()+
                        Extramentals.getPlugin().getConfig().getString("feedother")));
            }
        }

        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
