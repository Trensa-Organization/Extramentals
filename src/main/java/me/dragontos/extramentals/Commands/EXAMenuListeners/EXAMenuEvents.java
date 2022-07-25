package me.dragontos.extramentals.Commands.EXAMenuListeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class EXAMenuEvents implements Listener {

    @EventHandler
    public void clickEvenet(InventoryClickEvent e){
        ChatColor RED = ChatColor.RED;
        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase("1"));

            switch(e.getCurrentItem().getType()) {
                case TNT:
                    p.closeInventory();
                    p.setHealth(0.0);
                    p.sendMessage(RED + "You just killed yourself lol (:");
                    break;
                case BREAD:
                    p.closeInventory();
                    p.setFoodLevel(20);
                    p.sendMessage("You used the '/feed command lol'");
                    break;
                case DIAMOND_SWORD:
                    p.closeInventory();
                    p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
                    p.sendMessage("Don't slice yourself");
                    break;


            }
        e.setCancelled(false);
    }
}
