package main;

import main.Rendering.Renderer;
import main.World.World;
import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet app;
    public void settings() {
        size(500, 500);
    }

    public void setup(){
        app = this;
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