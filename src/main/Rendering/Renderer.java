package main.Rendering;

import main.Main;
import main.World.Chunk;
import main.World.World;

import static main.Rendering.PlayerRendering.renderPlayer;
import static main.Rendering.WorldRendering.renderWorld;

public class Renderer {
    public static void renderView(){
        Main.app.pushMatrix();
        Main.app.translate(-(Main.player.x - (float) Main.app.width /2), -(Main.player.y - (float) Main.app.height /2));

        renderWorld();
        renderPlayer();

        Main.app.popMatrix();
        //render player, render hud, etc
    }
}
