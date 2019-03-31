package club.shprqness.skidcore;

import club.shprqness.skidcore.core.HelpCommand;
import club.shprqness.skidcore.core.MOTDEvent;
import club.shprqness.skidcore.core.commands.*;
import club.shprqness.skidcore.core.AntiGrief.AntiGreif;
import club.shprqness.skidcore.core.event.EventOptions;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SkidCore extends JavaPlugin {


    private static SkidCore instance;

    //options

    public boolean antigreif = this.getConfig().getBoolean("AntiGreif.enabled");

    public String permissiontobreak = this.getConfig().getString("AntiGreif.permission-to-break-blocks");

    public String permissiontoplace = this.getConfig().getString("AntiGreif.permission-to-place-blocks");

    public double spawnY = this.getConfig().getDouble("Spawn.Y");

    public double spawnZ = this.getConfig().getDouble("Spawn.Z");

    public double spawnX = this.getConfig().getDouble("Spawn.X");

    public String spawnMessage = this.getConfig().getString("Spawn.message");

    public String spawnWorld = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Spawn.worldname"));

    public String website = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Options.website"));

    public String discord = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Options.discord"));

    public int maxplayers = this.getConfig().getInt("Options.maxplayers");

    public String motd = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Options.motd"));

    //events for damages

    public boolean voidDamage = this.getConfig().getBoolean("Events.void-damage");

    public boolean pvp = this.getConfig().getBoolean("Events.player-vs-player");

    public boolean fallDamage = this.getConfig().getBoolean("Events.fall-damage");

    public boolean fireTick = this.getConfig().getBoolean("Events.fire-tick");

    public boolean fire = this.getConfig().getBoolean("Events.fire");

    //end options

    @Override
    public void onEnable() {
        setInstance(this);
        commands();
        regEvents();
        loadConfig();
    }

    public void onDisable(){
        //----
    }

    private static void setInstance(SkidCore instance){
        SkidCore.instance = instance;
    }

    public static SkidCore getInstance(){
        return instance;
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();

    }

    public void regEvents(){
        Bukkit.getServer().getPluginManager().registerEvents(new MOTDEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new AntiGreif(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new EventOptions(), this);
    }


    private HelpCommand helpCommand = new HelpCommand();
    private WebsiteCommand websiteCommand = new WebsiteCommand();
    private DiscordCommand discordCommand = new DiscordCommand();
    private PingCommand pingCommand = new PingCommand();
    private ClearChatCommand clearChatCommand = new ClearChatCommand();
    private SpawnCommand spawnCommand = new SpawnCommand();
    private TPSCommand tpsCommand = new TPSCommand();

    public void commands(){
        getCommand(HelpCommand.help).setExecutor(helpCommand);
        getCommand(TPSCommand.tps).setExecutor(tpsCommand);
        getCommand(ClearChatCommand.clearchat).setExecutor(clearChatCommand);
        getCommand(WebsiteCommand.website).setExecutor(websiteCommand);
        getCommand(PingCommand.ping).setExecutor(pingCommand);
        getCommand(DiscordCommand.discord).setExecutor(discordCommand);
        getCommand(SpawnCommand.spawn).setExecutor(spawnCommand);
    }

}
