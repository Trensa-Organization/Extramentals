package me.dragontos.extramentals.Commands.basic;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Enderchest implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args) {
        Player p = (Player) sdr;

        if(cmd.getName().equalsIgnoreCase("ec")){
            p.openInventory(p.getEnderChest());
        }
        if(cmd.getName().equalsIgnoreCase("enderchest")); {
            p.openInventory(p.getEnderChest());
        }
        return false;
    }
}
