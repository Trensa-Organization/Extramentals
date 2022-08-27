package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.EXAConfigManager;
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
        //prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //extra
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        String subpermission = EXAConfigManager.Messages.getString("subpermission");
        String feed = EXAConfigManager.Messages.getString("feed");
        String feedother = EXAConfigManager.Messages.getString("feedother");

        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(prefix
                    + needtobeplayer));
        }
        Player p = (Player) sdr;
        if(!p.hasPermission("Extramentals.Commands.Basic.Feed")) {
            p.sendMessage(Color(prefix
                    + subpermission));
        }
        if(args.length == 0) {
            p.setFoodLevel(20);
            p.sendMessage(Color(prefix
                    + feed));
            
        }
        if(args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if(target != null){
                target.setFoodLevel(20);
                target.sendMessage(Color(prefix
                        + feed));
                p.sendMessage(Color(prefix
                        +target.getDisplayName()
                        + feedother));
            }
        }

        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
