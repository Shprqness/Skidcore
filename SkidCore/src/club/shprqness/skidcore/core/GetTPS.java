package club.shprqness.skidcore.core;

import net.minecraft.server.v1_8_R3.MinecraftServer;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GetTPS {

    public static String convertTPS(double tps) {
        NumberFormat nf = new DecimalFormat("##.##");
        return nf.format(tps);
    }


    public static double getTPS(){
        return MinecraftServer.getServer().recentTps[0];
    }


}
