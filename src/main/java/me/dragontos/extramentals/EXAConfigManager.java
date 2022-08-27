package me.dragontos.extramentals;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;

public class EXAConfigManager {

    public static File PrefixFile;
    public static FileConfiguration Prefix;
    public static File MessagesFile;
    public static FileConfiguration Messages;
    public static File DiscordLinkFile;
    public static FileConfiguration DiscordLink;
    public static File HelpmsgFile;
    public static FileConfiguration Helpmsg;
    public static File InfomsgFile;
    public static FileConfiguration Infomsg;
    public static File WelcomemsgFile;
    public static FileConfiguration Welcomemsg;

    public static void basePrefix(Extramentals pr) {
        if (!pr.getDataFolder().exists()) {
            pr.getDataFolder().mkdirs();
        }

        PrefixFile = new File(pr.getDataFolder(), "Messages/Prefix.yml");
        if (!PrefixFile.exists()) {
            pr.saveResource("Messages/Prefix.yml", false);
        }
        Prefix = YamlConfiguration.loadConfiguration(PrefixFile);
    }
    public static void baseMessages(Extramentals msg) {
        if (!msg.getDataFolder().exists()) {
            msg.getDataFolder().mkdirs();
        }

        MessagesFile = new File(msg.getDataFolder(), "Messages/Messages.yml");
        if (!MessagesFile.exists()) {
            msg.saveResource("Messages/Messages.yml", false);
        }
        Messages = YamlConfiguration.loadConfiguration(MessagesFile);
    }
    public static void baseDiscordLink(Extramentals DCLink) {
        if (!DCLink.getDataFolder().exists()) {
            DCLink.getDataFolder().mkdirs();
        }

        DiscordLinkFile = new File(DCLink.getDataFolder(), "data/DiscordLink.yml");
        if (!DiscordLinkFile.exists()) {
            DCLink.saveResource("data/DiscordLink.yml", false);
        }
        DiscordLink = YamlConfiguration.loadConfiguration(DiscordLinkFile);
    }
    public static void basehelpmsg(Extramentals hpmsg) {
        if (!hpmsg.getDataFolder().exists()) {
            hpmsg.getDataFolder().mkdirs();
        }

        HelpmsgFile = new File(hpmsg.getDataFolder(), "data/Helpmsg.yml");
        if (!HelpmsgFile.exists()) {
            hpmsg.saveResource("data/Helpmsg.yml", false);
        }
        Helpmsg = YamlConfiguration.loadConfiguration(HelpmsgFile);
    }
    public static void baseinfomsg(Extramentals infomsg) {
        if (!infomsg.getDataFolder().exists()) {
            infomsg.getDataFolder().mkdirs();
        }

        InfomsgFile = new File(infomsg.getDataFolder(), "data/Infomsg.yml");
        if (!InfomsgFile.exists()) {
            infomsg.saveResource("data/Infomsg.yml", false);
        }
        Infomsg = YamlConfiguration.loadConfiguration(InfomsgFile);
    }
    public static void baseWelcomemsg(Extramentals Welcmsg) {
        if (!Welcmsg.getDataFolder().exists()) {
            Welcmsg.getDataFolder().mkdirs();
        }

        WelcomemsgFile = new File(Welcmsg.getDataFolder(), "data/Welcomemsg.yml");
        if (!WelcomemsgFile.exists()) {
            Welcmsg.saveResource("data/Welcomemsg.yml", false);
        }
        Welcomemsg = YamlConfiguration.loadConfiguration(WelcomemsgFile);
    }
}

