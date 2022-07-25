package me.dragontos.extramentals.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExtramentalsMenu implements CommandExecutor {
    @Override
    public boolean onCommand( CommandSender sdr,  Command cmd,  String str,  String[] args) {

        if (sdr instanceof Player) {
            ChatColor RED = ChatColor.RED;
            ChatColor GOLD = ChatColor.GOLD;
            Player p = (Player) sdr;

            Inventory gui = Bukkit.createInventory(p, 9, "1");

            ItemStack suicide = new ItemStack(Material.TNT);
            ItemStack feed = new ItemStack(Material.BREAD);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);


            ItemMeta suicide_meta = suicide.getItemMeta();
            suicide_meta.setDisplayName(RED + "Kill yourself");
            ArrayList<String> suicide_lore = new ArrayList<>();
            suicide_lore.add(RED + "Kill yourself");
            suicide_meta.setLore(suicide_lore);
            suicide.setItemMeta(suicide_meta);

            ItemMeta sword_meta = sword.getItemMeta();
            sword_meta.setDisplayName(RED + "a");
            ArrayList<String> sword_lore = new ArrayList<>();
            sword_lore.add(RED + "Kill yourself");
            sword_meta.setLore(sword_lore);
            sword.setItemMeta(sword_meta);



            ItemStack[] menu_items = {suicide, feed, sword};
            gui.setContents(menu_items);
            p.openInventory(gui);
        }

        return false;
    }
}
