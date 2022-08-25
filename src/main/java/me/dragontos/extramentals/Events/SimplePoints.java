package me.dragontos.extramentals.Events;

import me.dragontos.extramentals.Extramentals;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
public class SimplePoints implements Listener {

    static Extramentals pl;
    public SimplePoints(Extramentals i) {
        pl = i;
    }



    @EventHandler
    public static void onplayerjoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String uuid = p.getUniqueId().toString();

        if(!pl.getConfig().contains("Players." + uuid)){
            pl.getConfig().set("Players." + uuid + ".Points", 0);
            pl.saveConfig();
        }


    }
    @EventHandler
    public void killpoints(EntityDeathEvent e) {
        Player p = e.getEntity().getKiller();
        String xpUUID = null;
        if (p != null) {
            xpUUID = p.getUniqueId().toString();
            Location loc = p.getLocation();
            int xp = pl.getConfig().getInt("Players." + xpUUID + ".Points");
            pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);

            if(e.getEntityType().equals(EntityType.BAT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 10);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("BAT")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.BEE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("BEE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.BLAZE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 350);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("BLAZE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.CAT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("CAT")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.CAVE_SPIDER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 280);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("CAVE_SPIDER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.CHICKEN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 10);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("CHICKEN")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.COD)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("COD")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.COW)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("COW")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.CREEPER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("CREEPER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.DOLPHIN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("DOLPHIN")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.DONKEY)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("DONKEY")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.DROWNED)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("DROWNED")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.ELDER_GUARDIAN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 10000);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("ELDER_GUARDIAN")));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.ENDERMAN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 300);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("ENDERMAN")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.ENDER_DRAGON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 50000);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("ENDER_DRAGON")));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.ENDERMITE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 300);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("ENDERMITE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.EVOKER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("EVOKER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.FOX)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("FOX")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.GHAST)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 5000);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("GHAST")));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.GUARDIAN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("GUARDIAN")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.HORSE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("HORSE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.HUSK)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("HUSK")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.LLAMA)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("LLAMA")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.MAGMA_CUBE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("MAGMA_CUBE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.MUSHROOM_COW)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("MUSHROOM_COW")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.MULE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("MULE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.OCELOT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("OCELOT")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.PANDA)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 280);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("PANDA")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.PHANTOM)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("PHANTOM")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.PIG)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("PIG")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.PILLAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 120);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("PILLAGER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.POLAR_BEAR)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 280);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("POLAR_BEAR")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.PUFFERFISH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("PUFFERFISH")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.RABBIT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("RABBIT")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.RAVAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 320);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("RAVAGER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SALMON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SALMON")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SHEEP)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SHEEP")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SHULKER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 140);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SHULKER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SILVERFISH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SILVERFISH")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SKELETON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 250);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SKELETON")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SKELETON_HORSE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 360);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SKELETON_HORSE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SLIME)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 180);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SLIME")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SPIDER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 140);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SPIDER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.SQUID)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 80);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("SQUID")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.STRAY)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 270);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("STRAY")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.TRADER_LLAMA)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("TRADER_LLAMA")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.TROPICAL_FISH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 50);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("TROPICAL_FISH")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.TURTLE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("TURTLE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.VEX)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("VEX")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.VILLAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("VILLAGER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.VINDICATOR)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("VINDICATOR")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.WANDERING_TRADER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("WANDERING_TRADER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.WITCH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 270);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("WITCH")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.WITHER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 20000);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("WITHER")));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.WITHER_SKELETON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 320);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("WITHER_SKELETON")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.WOLF)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("WOLF")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOMBIE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("ZOMBIE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOMBIE_HORSE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 120);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("ZOMBIE_HORSE")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOMBIE_VILLAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("ZOMBIE_VILLAGER")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            if(e.getEntityType().equals(EntityType.PARROT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("PARROT")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                return;
            }
            pl.saveConfig();
        }

    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
