package club.shprqness.skidcore.core.commands;

import club.shprqness.skidcore.SkidCore;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {



    public static String discord = "discord";


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;


        if(cmd.getName().equalsIgnoreCase(discord)){
            p.sendMessage(ChatColor.YELLOW + "Our Discord » " + ChatColor.GRAY + SkidCore.getInstance().discord);
        }


        return true;
    }


}
