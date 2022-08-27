package me.dragontos.extramentals.Events.SimplePoints;

import me.clip.placeholderapi.PlaceholderAPI;
import me.dragontos.extramentals.EXAConfigManager;
import me.dragontos.extramentals.Events.SimplePoints.Config.SimplePointsConfig;
import me.dragontos.extramentals.Extramentals;
import org.bukkit.Bukkit;
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
            int xp = Extramentals.getPlugin().getConfig().getInt("Players." + xpUUID + ".Points");
            //Prefix
            String prefix = EXAConfigManager.Prefix.getString("prefix");
            String announce = EXAConfigManager.Prefix.getString("announce");
            //mobs
            String allay = SimplePointsConfig.MobPoints.getString("ALLAY");
            String axolotl = SimplePointsConfig.MobPoints.getString("AXOLOTL");
            String bat = SimplePointsConfig.MobPoints.getString("BAT");
            String bee = SimplePointsConfig.MobPoints.getString("BEE");
            String blaze = SimplePointsConfig.MobPoints.getString("BLAZE");
            String cat = SimplePointsConfig.MobPoints.getString("CAT");
            String cave_spider = SimplePointsConfig.MobPoints.getString("CAVE_SPIDER");
            String chicken = SimplePointsConfig.MobPoints.getString("CHICKEN");
            String cod = SimplePointsConfig.MobPoints.getString("COD");
            String cow = SimplePointsConfig.MobPoints.getString("COW");
            String creeper = SimplePointsConfig.MobPoints.getString("CREEPER");
            String dolphin = SimplePointsConfig.MobPoints.getString("DOLPHIN");
            String donkey = SimplePointsConfig.MobPoints.getString("DONKEY");
            String drowned = SimplePointsConfig.MobPoints.getString("DROWNED");
            String elder_guardian = SimplePointsConfig.MobPoints.getString("ELDER_GUARDIAN");
            String enderman = SimplePointsConfig.MobPoints.getString("ENDERMAN");
            String ender_dragon = SimplePointsConfig.MobPoints.getString("ENDER_DRAGON");
            String endermite = SimplePointsConfig.MobPoints.getString("ENDERMITE");
            String evoker = SimplePointsConfig.MobPoints.getString("EVOKER");
            String fox = SimplePointsConfig.MobPoints.getString("FOX");
            String frog = SimplePointsConfig.MobPoints.getString("FROG");
            String ghast = SimplePointsConfig.MobPoints.getString("GHAST");
            String glow_squid = SimplePointsConfig.MobPoints.getString("GLOW_SQUID");
            String guardian = SimplePointsConfig.MobPoints.getString("GUARDIAN");
            String horse = SimplePointsConfig.MobPoints.getString("HORSE");
            String hoglin = SimplePointsConfig.MobPoints.getString("Hoglin");
            String husk = SimplePointsConfig.MobPoints.getString("HUSK");
            String llama = SimplePointsConfig.MobPoints.getString("LLAMA");
            String magma_cube = SimplePointsConfig.MobPoints.getString("MAGMA_CUBE");
            String mushroom_cow = SimplePointsConfig.MobPoints.getString("MUSHROOM_COW");
            String mule = SimplePointsConfig.MobPoints.getString("MULE");
            String ocelot = SimplePointsConfig.MobPoints.getString("OCELOT");
            String panda = SimplePointsConfig.MobPoints.getString("PANDA");
            String phantom = SimplePointsConfig.MobPoints.getString("PHANTOM");
            String pig = SimplePointsConfig.MobPoints.getString("PIG");
            String piglin = SimplePointsConfig.MobPoints.getString("PIGLIN");
            String piglin_brute = SimplePointsConfig.MobPoints.getString("PIGLIN_BRUTE");
            String pillager = SimplePointsConfig.MobPoints.getString("PILLAGER");
            String polar_bear = SimplePointsConfig.MobPoints.getString("POLAR_BEAR");
            String pufferfish = SimplePointsConfig.MobPoints.getString("PUFFERFISH");
            String rabbit = SimplePointsConfig.MobPoints.getString("RABBIT");
            String ravager = SimplePointsConfig.MobPoints.getString("RAVAGER");
            String salmon = SimplePointsConfig.MobPoints.getString("SALMON");
            String sheep = SimplePointsConfig.MobPoints.getString("SHEEP");
            String shulker = SimplePointsConfig.MobPoints.getString("SHULKER");
            String silverfish = SimplePointsConfig.MobPoints.getString("SILVERFISH");
            String skeleton = SimplePointsConfig.MobPoints.getString("SKELETON");
            String skeleton_horse = SimplePointsConfig.MobPoints.getString("SKELETON_HORSE");
            String slime = SimplePointsConfig.MobPoints.getString("SLIME");
            String spider = SimplePointsConfig.MobPoints.getString("SPIDER");
            String squid = SimplePointsConfig.MobPoints.getString("SQUID");
            String stray = SimplePointsConfig.MobPoints.getString("STRAY");
            String strider = SimplePointsConfig.MobPoints.getString("STRIDER");
            String tadpole = SimplePointsConfig.MobPoints.getString("TADPOLE");
            String trader_llama = SimplePointsConfig.MobPoints.getString("TRADER_LLAMA");
            String tropical_fish = SimplePointsConfig.MobPoints.getString("TROPICAL_FISH");
            String turtle = SimplePointsConfig.MobPoints.getString("TURTLE");
            String vex = SimplePointsConfig.MobPoints.getString("VEX");
            String villager = SimplePointsConfig.MobPoints.getString("VILLAGER");
            String vindicator = SimplePointsConfig.MobPoints.getString("VINDICATOR");
            String wandering_trader = SimplePointsConfig.MobPoints.getString("WANDERING_TRADER");
            String warden = SimplePointsConfig.MobPoints.getString("WARDEN");
            String witch = SimplePointsConfig.MobPoints.getString("WITCH");
            String wither = SimplePointsConfig.MobPoints.getString("WITHER");
            String wither_skeleton = SimplePointsConfig.MobPoints.getString("WITHER_SKELETON");
            String wolf = SimplePointsConfig.MobPoints.getString("WOLF");
            String zoglin = SimplePointsConfig.MobPoints.getString("ZOGLIN");
            String zombie = SimplePointsConfig.MobPoints.getString("ZOMBIE");
            String zombie_horse = SimplePointsConfig.MobPoints.getString("ZOMBIE_HORSE");
            String zombie_villager = SimplePointsConfig.MobPoints.getString("ZOMBIE_VILLAGER");
            String zombifiedPiglin = SimplePointsConfig.MobPoints.getString("ZOMBIFIED_PIGLIN");
            String parrot = SimplePointsConfig.MobPoints.getString("PARROT");
            //broadcast
            String castelder_guardian = SimplePointsConfig.MobPoints.getString("castelder_guardian");
            String castender_dragon = SimplePointsConfig.MobPoints.getString("castender_dragon");
            String castghast = SimplePointsConfig.MobPoints.getString("castghast");
            String castpiglin_brute = SimplePointsConfig.MobPoints.getString("castpiglin_brute");
            String castwarden = SimplePointsConfig.MobPoints.getString("castwarden");
            String castwither = SimplePointsConfig.MobPoints.getString("castwither");

            if(e.getEntityType().equals(EntityType.ALLAY)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 300);
                p.sendMessage(Color(prefix
                        + allay));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.AXOLOTL)) {
                Extramentals.getPlugin().getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(prefix
                        + axolotl));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.BAT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 10);
                p.sendMessage(Color(Extramentals.getPlugin().getConfig().getString("prefix")
                        + Extramentals.getPlugin().getConfig().getString("BAT")));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.BEE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + bee));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.BLAZE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 350);
                p.sendMessage(Color(prefix
                        + blaze));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.CAT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + cat));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.CAVE_SPIDER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 280);
                p.sendMessage(Color(prefix
                        + cave_spider));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.CHICKEN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 10);
                p.sendMessage(Color(prefix
                        + chicken));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.COD)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(prefix
                        + cod));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.COW)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + cow));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.CREEPER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(prefix
                        + creeper));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.DOLPHIN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + dolphin));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.DONKEY)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + donkey));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.DROWNED)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(prefix
                        + drowned));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ELDER_GUARDIAN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 10000);
                Bukkit.broadcastMessage(Color(PlaceholderAPI.setPlaceholders(p,announce
                        + castelder_guardian)));
                p.sendMessage(Color(announce
                        + elder_guardian));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ENDERMAN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 300);
                p.sendMessage(Color(prefix
                        + enderman));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ENDER_DRAGON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 50000);
                Bukkit.broadcastMessage(Color(PlaceholderAPI.setPlaceholders(p,announce
                        + castender_dragon)));
                p.sendMessage(Color(prefix
                        + ender_dragon));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ENDERMITE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 300);
                p.sendMessage(Color(prefix
                        + endermite));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.EVOKER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(prefix
                        + evoker));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.FOX)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + fox));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.FROG)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + frog));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.GHAST)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 5000);
                Bukkit.broadcastMessage(Color(PlaceholderAPI.setPlaceholders(p,announce
                        + castghast)));
                p.sendMessage(Color(prefix
                        + ghast));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.GLOW_SQUID)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 120);
                p.sendMessage(Color(prefix
                        + glow_squid));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.GUARDIAN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(prefix
                        + guardian));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.HORSE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + horse));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.HUSK)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(prefix
                        + husk));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.LLAMA)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(prefix
                        + llama));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.MAGMA_CUBE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(prefix
                        + magma_cube));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.MUSHROOM_COW)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + mushroom_cow));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.MULE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + mule));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.OCELOT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + ocelot));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PANDA)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 280);
                p.sendMessage(Color(prefix
                        + panda));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PHANTOM)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(prefix
                        + phantom));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PIG)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + pig));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PIGLIN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 120);
                p.sendMessage(Color(prefix
                        + piglin));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PIGLIN_BRUTE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 800);
                Bukkit.broadcastMessage(Color(PlaceholderAPI.setPlaceholders(p,announce
                        + castpiglin_brute)));
                p.sendMessage(Color(prefix
                        + piglin_brute));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PILLAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 120);
                p.sendMessage(Color(prefix
                        + pillager));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.POLAR_BEAR)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 280);
                p.sendMessage(Color(prefix
                        + polar_bear));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PUFFERFISH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(prefix
                        + pufferfish));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.RABBIT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(prefix
                        + rabbit));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.RAVAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 320);
                p.sendMessage(Color(prefix
                        + ravager));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SALMON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(prefix
                        + salmon));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SHEEP)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(prefix
                        + sheep));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SHULKER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 140);
                p.sendMessage(Color(prefix
                        + shulker));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SILVERFISH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + silverfish));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SKELETON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 250);
                p.sendMessage(Color(prefix
                        + skeleton));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SKELETON_HORSE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 360);
                p.sendMessage(Color(prefix
                        + skeleton_horse));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SLIME)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 180);
                p.sendMessage(Color(prefix
                        + slime));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SPIDER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 140);
                p.sendMessage(Color(prefix
                        + spider));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.SQUID)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 80);
                p.sendMessage(Color(prefix
                        + squid));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.STRAY)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 270);
                p.sendMessage(Color(prefix
                        + stray));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.STRIDER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(prefix
                        + strider));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.TADPOLE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(prefix
                        + tadpole));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.TRADER_LLAMA)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(prefix
                        + trader_llama));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.TROPICAL_FISH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 50);
                p.sendMessage(Color(prefix
                        + tropical_fish));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.TURTLE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + turtle));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.VEX)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 200);
                p.sendMessage(Color(prefix
                        + vex));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.VILLAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 60);
                p.sendMessage(Color(prefix
                        + villager));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.VINDICATOR)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 160);
                p.sendMessage(Color(prefix
                        + vindicator));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.WANDERING_TRADER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(prefix
                        + wandering_trader));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.WARDEN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 20000);
                Bukkit.broadcastMessage(Color(PlaceholderAPI.setPlaceholders(p,announce
                        + castwarden)));
                p.sendMessage(Color(prefix
                        + warden));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.WITCH)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 270);
                p.sendMessage(Color(prefix
                        + witch));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.WITHER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 20000);
                Bukkit.broadcastMessage(Color(PlaceholderAPI.setPlaceholders(p,announce
                        + castwither)));
                p.sendMessage(Color(prefix
                        + wither));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.WITHER_SKELETON)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 320);
                p.sendMessage(Color(prefix
                        + wither_skeleton));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.WOLF)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 70);
                p.sendMessage(Color(prefix
                        + wolf));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOGLIN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 300);
                p.sendMessage(Color(prefix
                        + zoglin));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOMBIE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(prefix
                        + zombie));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOMBIE_HORSE)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 120);
                p.sendMessage(Color(prefix
                        + zombie_horse));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOMBIE_VILLAGER)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 100);
                p.sendMessage(Color(prefix
                        + zombie_villager));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.ZOMBIFIED_PIGLIN)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 150);
                p.sendMessage(Color(prefix
                        + zombifiedPiglin));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            if(e.getEntityType().equals(EntityType.PARROT)) {
                pl.getConfig().set("Players." + xpUUID + ".Points", xp + 40);
                p.sendMessage(Color(prefix
                        + parrot));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5,  1);
                Extramentals.getPlugin().saveConfig();
                return;
            }
            Extramentals.getPlugin().saveConfig();
        }

    }
    private String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
