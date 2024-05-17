package main.Assets;

import main.Main;
import processing.core.PImage;

public class Asset {
    public String id;
    public PImage image;
    public Asset(String _id,String path){
        id = _id;
        image = Main.app.loadImage(System.getProperty("user.dir")+path);
    }
}
