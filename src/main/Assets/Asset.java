package main.Assets;

import main.Main;
import processing.core.PImage;

import static processing.core.PApplet.println;

public class Asset {
    public String id;
    public PImage image;
    public Asset(String _id,String path){
        id = _id;
        println(System.getProperty("user.dir")+"\\"+path);
        image = Main.app.loadImage(System.getProperty("user.dir")+"\\assets\\"+path);
    }
}
