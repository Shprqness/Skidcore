package club.shprqness.skidcore.core;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class GetPing {


    public static int getPing (Player p) {

        int ms = ((CraftPlayer) p).getHandle().ping;

        return ms;
    }

    public static String pingRating(Player p){
        String rating = null;

        if(getPing(p) < 30){
            rating = ChatColor.GRAY + " (" + ChatColor.GOLD + "Perfect" + ChatColor.GRAY + ")";
            return rating;
        }

        if(getPing(p) < 60){
            rating = ChatColor.GRAY + " (" + ChatColor.GREEN + "Good" + ChatColor.GRAY + ")";
            return rating;
        }


        if(getPing(p) > 60){
            rating = ChatColor.GRAY + " (" + ChatColor.YELLOW + "Decent" + ChatColor.GRAY + ")";
            return rating;
        }

        if(getPing(p) < 180){
            rating = ChatColor.GRAY + " (" + ChatColor.RED + "Bad" + ChatColor.GRAY + ")";
            return rating;

        }


        return rating;
    }




}
