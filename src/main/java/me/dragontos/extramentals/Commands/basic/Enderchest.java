package me.dragontos.extramentals.Commands.basic;

import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.EXAConfigManager;
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
        //prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //extra
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        String subpermission = EXAConfigManager.Messages.getString("subpermission");
        String enderchest = EXAConfigManager.Messages.getString("Enderchest");
        String ec1 = EXAConfigManager.Messages.getString("EC1");
        String ec2 = EXAConfigManager.Messages.getString("EC2");
        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(prefix
                    + needtobeplayer));
        }
        Player p = (Player) sdr;
        if(!p.hasPermission("Extramentals.Commands.Basic.Enderchest")) {
            p.sendMessage(Color(prefix
                    +subpermission));
        }
        if(args.length == 0) {
            p.openInventory(p.getEnderChest());
            p.sendMessage(Color(prefix
                    +enderchest));
        }
        if(args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if(target != null){
                p.openInventory(target.getEnderChest());
                p.sendMessage(PlaceholderAPI.setPlaceholders(p,Color(prefix
                        +ec1
                        +target.getDisplayName()
                        +ec2)));
            }

        }

        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
