package club.shprqness.skidcore.core;

import club.shprqness.skidcore.SkidCore;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MOTDEvent implements Listener {


    @EventHandler
    public void setMOTD(ServerListPingEvent e){
        e.setMaxPlayers(SkidCore.getInstance().maxplayers);
        e.setMotd(SkidCore.getInstance().motd);
    }


}
