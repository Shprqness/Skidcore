package club.shprqness.skidcore.core.commands;

import club.shprqness.skidcore.SkidCore;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {



    public static String spawn = "spawn";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase(spawn)){

            p.sendMessage(SkidCore.getInstance().spawnMessage);

            Location spawn = new Location(Bukkit.getWorld(SkidCore.getInstance().spawnWorld), SkidCore.getInstance().spawnX,
                    SkidCore.getInstance().spawnY, SkidCore.getInstance().spawnZ);
            p.teleport(spawn);



        }




        return true;
    }
}
