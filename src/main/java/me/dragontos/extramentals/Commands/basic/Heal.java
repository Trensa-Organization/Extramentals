package me.dragontos.extramentals.Commands.basic;

import me.dragontos.extramentals.EXAConfigManager;
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
        //prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //extra
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        String subpermission = EXAConfigManager.Messages.getString("subpermission");
        String heal = EXAConfigManager.Messages.getString("heal");
        String healther = EXAConfigManager.Messages.getString("healother");

        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(prefix
                    + needtobeplayer));
        }
        Player p = (Player) sdr;
        if(!p.hasPermission("Extramentals.Commands.Basic.Heal")) {
            p.sendMessage(Color(prefix
                    + subpermission));
        }
        if(args.length == 0) {
            p.setHealth(20);
            p.sendMessage(Color(prefix
                    + heal));
        }
        if(args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if(target != null){
                target.setHealth(20);
                target.sendMessage(Color(prefix
                        + heal));
                p.sendMessage(Color(prefix
                        +target.getDisplayName()
                        + healther));
            }
        }

        return false;
    }
    private String Color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
