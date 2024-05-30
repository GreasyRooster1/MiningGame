package main.Block;

import processing.core.PImage;

public class Block {
    public int x,y;
    public String id;
    public PImage texture;
    public boolean visible = true;
    public boolean collides = true;

    public Block(int _x,int _y){
        x=_x;
        y=_y;
    }
}
