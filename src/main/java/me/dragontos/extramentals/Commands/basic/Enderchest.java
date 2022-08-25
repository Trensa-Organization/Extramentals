package me.dragontos.extramentals.Commands.basic;

import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Enderchest implements CommandExecutor {

    private Extramentals pl;

    public Enderchest(Extramentals pl) {
        this.pl = pl;
        pl.getCommand("ec").setExecutor(this);
        pl.getCommand("enderchest").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("needtobeplayer")));
        }
        Player p = (Player) sdr;
        if(!p.hasPermission("Extramentals.Commands.Basic.Enderchest")) {
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("subpermission")));
        }
        if(args.length == 0) {
            p.openInventory(p.getEnderChest());
            p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                    Extramentals.getPlugin().getConfig().getString("Enderchest")));
        }
        if(args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if(target != null){
                p.openInventory(target.getEnderChest());
                p.sendMessage(PlaceholderAPI.setPlaceholders(p,Color(Extramentals.getPlugin().getConfig().getString("prefix")+
                        Extramentals.getPlugin().getConfig().getString("EC1") + target.getDisplayName()+
                        Extramentals.getPlugin().getConfig().getString("EC2"))));
            }

        }

        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
