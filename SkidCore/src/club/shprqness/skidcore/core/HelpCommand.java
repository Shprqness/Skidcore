package club.shprqness.skidcore.core;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {


    public static String help = "help";


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;


        if(cmd.getName().equalsIgnoreCase(help)){



                p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "                            ");

                p.sendMessage(" ");

                p.sendMessage(ChatColor.YELLOW + "/website » " + ChatColor.GRAY + "" + ChatColor.ITALIC
                + "View our website!");
                p.sendMessage(ChatColor.YELLOW + "/discord » " + ChatColor.GRAY + "" + ChatColor.ITALIC
                        + "Join our discord!");
                p.sendMessage(ChatColor.YELLOW + "/ping » " + ChatColor.GRAY + "" + ChatColor.ITALIC
                        + "Check your ping!");
            p.sendMessage(ChatColor.YELLOW + "/spawn » " + ChatColor.GRAY + "" + ChatColor.ITALIC
                    + "Go to spawn!");

                p.sendMessage(" ");

                p.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + ChatColor.BOLD + "                            ");




        }



        return true;
    }
}
