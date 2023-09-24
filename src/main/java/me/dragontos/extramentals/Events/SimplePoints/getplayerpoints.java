package me.dragontos.extramentals.Events.SimplePoints;

import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class getplayerpoints implements CommandExecutor {

    private Extramentals pl;

    public getplayerpoints(Extramentals pl) {
        this.pl = pl;
        pl.getCommand("points").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        if (!(sdr instanceof Player)) {
            sdr.sendMessage("This command can only be run by players.");
            return false;
        }
        Player p = (Player) sdr;
        String xpUUID = p.getUniqueId().toString();
        int points = pl.getConfig().getInt("Players." + xpUUID + ".Points");
        String xp = String.valueOf(points);
        //prefix
        String prefix = EXAConfigManager.Prefix.getString("prefix");
        //extra
        String needtobeplayer = EXAConfigManager.Messages.getString("needtobeplayer");
        String playerpoints = EXAConfigManager.Messages.getString("playerpoints");
        String otherplayerpoints = EXAConfigManager.Messages.getString("gms");

        if(!(sdr instanceof Player)) {
            sdr.sendMessage(Color(needtobeplayer));
            return false;
        }
        if(args.length == 0) {
            p.sendMessage(Color(PlaceholderAPI.setPlaceholders(p,prefix
                    + playerpoints
                    + xp)));
            return false;
        }
        if(args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            String targetxpUUID = target.getUniqueId().toString();
            int targetpoints = pl.getConfig().getInt("Players."
                    + targetxpUUID
                    + ".Points");
            String targetxp = String.valueOf(targetpoints);

            if(target != null) {
                p.sendMessage(Color(PlaceholderAPI.setPlaceholders(p,prefix
                        + target.getDisplayName()
                        + otherplayerpoints
                        + targetxp)));
            }
        }
        return false;
    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}

