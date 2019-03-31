package club.shprqness.skidcore.core.commands;

import club.shprqness.skidcore.core.GetTPS;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPSCommand implements CommandExecutor {


    public static String tps = "tps";


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
//you can delete if u want lol i am not to focus on this rn
        if(cmd.getName().equalsIgnoreCase(tps)){
            if(p.hasPermission("view.tps")){
                if(GetTPS.getTPS() >=19.80){
                    p.sendMessage(ChatColor.YELLOW + "TPS » " + GetTPS.convertTPS(GetTPS.getTPS()) +
                            ChatColor.GRAY + " [" + ChatColor.GREEN + "||||||||" + ChatColor.GRAY + "]");
                }

                if(GetTPS.getTPS() <19.80){
                    p.sendMessage(ChatColor.YELLOW + "TPS » " + GetTPS.convertTPS(GetTPS.getTPS()) +
                            ChatColor.GRAY + " [" + ChatColor.YELLOW + "||||||" + ChatColor.GRAY + "]");
                }

                if(GetTPS.getTPS() <19){
                    p.sendMessage(ChatColor.YELLOW + "TPS » " + GetTPS.convertTPS(GetTPS.getTPS()) +
                            ChatColor.GRAY + " [" + ChatColor.RED + "|||" + ChatColor.GRAY + "]");
                }

            }
        }


        return true;
    }
}
