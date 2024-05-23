package main;

import main.Input.KeyHandler;
import main.Player.Player;
import main.Rendering.Renderer;
import main.World.Chunk;
import main.World.Generator.LayerRegistry;
import main.World.Generator.WorldGenerator;
import main.World.World;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static qlogr.QLogr.*;
import static main.Assets.AssetLoader.loadAssets;

public class Main extends PApplet {
    public static Main app;

    public static Player player;

    public void settings() {
        size(500, 500);
    }

    public void setup(){
        app = this;
        info("Starting game");

        player = new Player(0,0);

        loadAssets();
        LayerRegistry.registerLayers();
        WorldGenerator.generateWorld();
    }

    public void draw(){
        background(64);

        player.update();

        Renderer.renderView();
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "main.Main" };
        PApplet.main(appletArgs);
    }

    public void keyPressed() {
        KeyHandler.keyPressedEvent();
    }

    public void keyReleased() {
        KeyHandler.keyReleasedEvent();
    }
}