package main.World;

import main.Block;

public class Chunk {
    public Block[] blocks = {};
    public int chunkX,chunkY;
    public Chunk(int x,int y){
        chunkX = x;
        chunkY = y;
    }
}
