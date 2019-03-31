package club.shprqness.skidcore.core.commands;

import club.shprqness.skidcore.SkidCore;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WebsiteCommand implements CommandExecutor {


    public static String website = "website";


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;


        if(cmd.getName().equalsIgnoreCase(website)){
            p.sendMessage(ChatColor.YELLOW + "Our Website » " + ChatColor.GRAY + SkidCore.getInstance().website);
        }


        return true;
    }
}
