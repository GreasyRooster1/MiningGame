package main.Rendering;

import main.World.Chunk;
import main.World.World;

import static main.Rendering.PlayerRendering.renderPlayer;
import static main.Rendering.WorldRendering.renderWorld;

public class Renderer {
    public static void renderView(){
        renderWorld();
        renderPlayer();
        //render player, render hud, etc
    }
}
