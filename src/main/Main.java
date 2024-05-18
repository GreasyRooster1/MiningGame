package main;

import main.Player.Player;
import main.Rendering.Renderer;
import main.World.Chunk;
import main.World.Generator.WorldGenerator;
import main.World.World;
import processing.core.PApplet;

import static main.Assets.AssetLoader.loadAssets;

public class Main extends PApplet {
    public static PApplet app;

    public static Player player;

    public void settings() {
        size(500, 500);
    }

    public void setup(){
        app = this;

        player = new Player(0,0);

        loadAssets();
        WorldGenerator.generateWorld();
    }

    public void draw(){
        background(64);
        Renderer.renderView();
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "main.Main" };
        PApplet.main(appletArgs);
    }
}