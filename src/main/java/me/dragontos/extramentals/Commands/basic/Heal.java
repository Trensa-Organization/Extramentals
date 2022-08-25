package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    private Extramentals pl;

    public Heal(Extramentals pl) {
        this.pl = pl;
        pl.getCommand("heal").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("needtobeplayer")));
        }
        Player p = (Player) sdr;
        if(!p.hasPermission("Extramentals.Commands.Basic.Heal")) {
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("subpermission")));
        }
        if(args.length == 0) {
            p.setHealth(20);
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("heal")));
        }
        if(args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if(target != null){
                target.setHealth(20);
                target.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                        Extramentals.getPlugin().getConfig().getString("heal")));
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+target.getDisplayName()+
                        Extramentals.getPlugin().getConfig().getString("healother")));
            }
        }

        return false;
    }
    private String Color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
