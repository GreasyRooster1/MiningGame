package main.World;

import main.Block.Block;

import java.util.ArrayList;

public class Chunk {
    public Block[] blocks = new Block[256];
    public int chunkX,chunkY;
    public Chunk(int x,int y){
        chunkX = x;
        chunkY = y;
    }

    public void add(Block block){
        blocks[block.x+ block.y*16]=block;
    }

    public Block get(int x,int y){
        return blocks[x+ y*16];
    }
}
