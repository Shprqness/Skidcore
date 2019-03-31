package club.shprqness.skidcore.core.commands;

import club.shprqness.skidcore.core.GetPing;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChatCommand implements CommandExecutor {



    public static String clearchat = "clearchat";


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase(clearchat)) {
            if (p.hasPermission("skid.clearchat")) {

                for (int i = 0; i < 100; i++) {
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        all.sendMessage("  ");
                    }

                }

                for (Player all : Bukkit.getOnlinePlayers()) {
                    all.sendMessage(ChatColor.GRAY + " » " + ChatColor.YELLOW + sender.getName() + ChatColor.GRAY +
                            " has cleared the chat.");
                }
            }

        }

        return true;

    }



    }



