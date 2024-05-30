package main.Util;

import java.util.Random;

import static main.Main.app;

public class Rand {
    public static float noise(float x,float y,float scaleX,float scaleY){
        return app.noise(x*scaleX,y*scaleY);
    }
    public static float noise(float x,float y,float scale){
        return app.noise(x*scale,y*scale);
    }
    public static float worldRand(int blockX,int blockY,float min,float max){
        Random random = new Random((long) blockX *blockY*100_000);
        return (random.nextFloat()*(max-min))+min;
    }
    public static float worldRand(int blockX,int blockY){
        Random random = new Random((long) blockX *blockY*100_000);
        return random.nextFloat();
    }
}
