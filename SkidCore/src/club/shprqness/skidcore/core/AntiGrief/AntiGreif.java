package club.shprqness.skidcore.core.AntiGrief;

import club.shprqness.skidcore.SkidCore;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class AntiGreif implements Listener {


    @EventHandler
    public void onPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        if(SkidCore.getInstance().antigreif == true){
            if(!p.hasPermission(SkidCore.getInstance().permissiontoplace)){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        if(SkidCore.getInstance().antigreif == true){
            if(!p.hasPermission(SkidCore.getInstance().permissiontobreak)){
                e.setCancelled(true);
            }
        }
    }

}
