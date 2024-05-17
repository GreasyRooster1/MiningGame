package main.World;

import main.Block.Block;

import java.util.ArrayList;

public class Chunk {
    public ArrayList<Block> blocks = new ArrayList<>();
    public int chunkX,chunkY;
    public Chunk(int x,int y){
        chunkX = x;
        chunkY = y;
    }
}
