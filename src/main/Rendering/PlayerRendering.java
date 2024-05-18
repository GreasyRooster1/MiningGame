package main.Rendering;

import main.Main;

import static main.Assets.AssetLoader.getAsset;
import static main.Rendering.WorldRendering.blockSize;

public class PlayerRendering {
    public static void renderPlayer(){
        Main.app.image(getAsset("player.idle"),Main.player.x-blockSize,Main.player.y-blockSize,blockSize*2,blockSize*2);
    }
}
