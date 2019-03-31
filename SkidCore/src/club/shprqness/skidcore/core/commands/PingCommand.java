package club.shprqness.skidcore.core.commands;

import club.shprqness.skidcore.core.GetPing;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {


    public static String ping = "ping";


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase(ping)){


            p.sendMessage(ChatColor.YELLOW + "Ping » " + ChatColor.GRAY + GetPing.getPing(p) + GetPing.pingRating(p));


        }




        return true;
    }
}
