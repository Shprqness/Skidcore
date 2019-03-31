package club.shprqness.skidcore.core.event;

import club.shprqness.skidcore.SkidCore;
import club.shprqness.skidcore.core.GetTPS;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class EventOptions implements Listener {


    @EventHandler
    public void tpsFix(PlayerCommandPreprocessEvent e){
        Player p = e.getPlayer();
        if(e.getMessage().equalsIgnoreCase("/tps")){
            e.setCancelled(true);
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

    @EventHandler
    public void damageEvent(EntityDamageEvent e){
        if(e.getEntity() instanceof Player){

            Player p = ((Player) e.getEntity());

            if(e.getCause() == EntityDamageEvent.DamageCause.VOID){
                if(SkidCore.getInstance().voidDamage == true){
                    return;
                }else{
                    e.setCancelled(true);
                }
            }

            if(e.getCause() == EntityDamageEvent.DamageCause.FALL){
                if(SkidCore.getInstance().fallDamage == true){
                    return;
                }else{
                    e.setCancelled(true);
                }
            }

            if(e.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK){
                if(SkidCore.getInstance().fireTick == true){
                    return;
                }else{
                    e.setCancelled(true);
                }
            }

            if(e.getCause() == EntityDamageEvent.DamageCause.FIRE){
                if(SkidCore.getInstance().fire == true){
                    return;
                }else{
                    e.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void pvpEvent(EntityDamageByEntityEvent e){

        if(e.getEntity() instanceof Player && e.getDamager() instanceof Player){
            if(SkidCore.getInstance().pvp == true){
                return;
            }else{
                e.setCancelled(true);
            }
        }


    }



}
