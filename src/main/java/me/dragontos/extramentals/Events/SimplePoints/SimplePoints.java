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

import java.util.HashMap;

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
            //Prefix/announce
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

            HashMap<EntityType, Integer> entityPoints = new HashMap<>();
            entityPoints.put(EntityType.ALLAY, 300);
            entityPoints.put(EntityType.AXOLOTL, 40);
            entityPoints.put(EntityType.BAT, 10);
            entityPoints.put(EntityType.BEE, 60);
            entityPoints.put(EntityType.BLAZE, 350);
            entityPoints.put(EntityType.CAT, 60);
            entityPoints.put(EntityType.CAVE_SPIDER, 280);
            entityPoints.put(EntityType.CHICKEN, 10);
            entityPoints.put(EntityType.COD, 40);
            entityPoints.put(EntityType.COW, 60);
            entityPoints.put(EntityType.CREEPER, 200);
            entityPoints.put(EntityType.DOLPHIN, 60);
            entityPoints.put(EntityType.DONKEY, 60);
            entityPoints.put(EntityType.DROWNED, 160);
            entityPoints.put(EntityType.ENDERMAN, 300);
            entityPoints.put(EntityType.ENDERMITE, 300);
            entityPoints.put(EntityType.EVOKER, 200);
            entityPoints.put(EntityType.FOX, 60);
            entityPoints.put(EntityType.FROG, 60);
            entityPoints.put(EntityType.GHAST, 2000);
            entityPoints.put(EntityType.GLOW_SQUID, 120);
            entityPoints.put(EntityType.GUARDIAN, 160);
            entityPoints.put(EntityType.HORSE, 60);
            entityPoints.put(EntityType.HUSK, 100);
            entityPoints.put(EntityType.LLAMA, 70);
            entityPoints.put(EntityType.MAGMA_CUBE, 200);
            entityPoints.put(EntityType.MUSHROOM_COW, 60);
            entityPoints.put(EntityType.MULE, 60);
            entityPoints.put(EntityType.OCELOT, 60);
            entityPoints.put(EntityType.PANDA, 280);
            entityPoints.put(EntityType.PHANTOM, 100);
            entityPoints.put(EntityType.PIG, 60);
            entityPoints.put(EntityType.PIGLIN, 120);
            entityPoints.put(EntityType.PIGLIN_BRUTE, 800);
            entityPoints.put(EntityType.PILLAGER, 120);
            entityPoints.put(EntityType.POLAR_BEAR, 280);
            entityPoints.put(EntityType.PUFFERFISH, 70);
            entityPoints.put(EntityType.RABBIT, 40);
            entityPoints.put(EntityType.SALMON, 40);
            entityPoints.put(EntityType.SHEEP, 40);
            entityPoints.put(EntityType.SHULKER, 140);
            entityPoints.put(EntityType.SILVERFISH, 60);
            entityPoints.put(EntityType.SKELETON, 250);
            entityPoints.put(EntityType.SKELETON_HORSE, 360);
            entityPoints.put(EntityType.SLIME, 180);
            entityPoints.put(EntityType.SPIDER, 140);
            entityPoints.put(EntityType.SQUID, 80);
            entityPoints.put(EntityType.STRAY, 270);
            entityPoints.put(EntityType.STRIDER, 160);
            entityPoints.put(EntityType.TADPOLE, 40);
            entityPoints.put(EntityType.TRADER_LLAMA, 160);
            entityPoints.put(EntityType.TROPICAL_FISH, 50);
            entityPoints.put(EntityType.TURTLE, 60);
            entityPoints.put(EntityType.VEX, 200);
            entityPoints.put(EntityType.VILLAGER, 60);
            entityPoints.put(EntityType.VINDICATOR, 160);
            entityPoints.put(EntityType.WANDERING_TRADER, 70);
            entityPoints.put(EntityType.WITCH, 270);
            entityPoints.put(EntityType.WITHER_SKELETON, 320);
            entityPoints.put(EntityType.WOLF, 70);
            entityPoints.put(EntityType.ZOGLIN, 300);
            entityPoints.put(EntityType.ZOMBIE, 100);
            entityPoints.put(EntityType.ZOMBIE_HORSE, 120);
            entityPoints.put(EntityType.ZOMBIE_VILLAGER, 100);
            entityPoints.put(EntityType.ZOMBIFIED_PIGLIN, 150);
            entityPoints.put(EntityType.PARROT, 40);

            HashMap<EntityType, Integer> entityPointsboss = new HashMap<>();
            entityPointsboss.put(EntityType.WITHER, 50000);
            entityPointsboss.put(EntityType.WARDEN, 200000);
            entityPointsboss.put(EntityType.ENDER_DRAGON, 500000);
            entityPointsboss.put(EntityType.ELDER_GUARDIAN, 25000);
            entityPointsboss.put(EntityType.RAVAGER, 10000);

// Check if the entity type is in the map and update points accordingly
            // normal
            if (entityPoints.containsKey(e.getEntityType())) {
                int newPoints = xp + entityPoints.get(e.getEntityType());
                pl.getConfig().set("Players." + xpUUID + ".Points", newPoints);
                p.sendMessage(Color(prefix + entityPoints.get(e.getEntityType())));
                p.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 5, 1);
                Extramentals.getPlugin().saveConfig();
                return;
            }

            // broadcast version
            if (entityPointsboss.containsKey(e.getEntityType())) {
                int newPoints = xp + entityPointsboss.get(e.getEntityType());
                pl.getConfig().set("Players." + xpUUID + ".Points", newPoints);
                p.sendMessage(Color(prefix + entityPointsboss.get(e.getEntityType())));
                p.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 5,  1);
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
