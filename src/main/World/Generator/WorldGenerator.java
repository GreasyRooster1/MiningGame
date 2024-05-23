package main.World.Generator;

import main.Block.Block;
import main.Block.Types.*;
import main.World.Chunk;
import main.World.World;

public class WorldGenerator {

    public static void generateWorld(){
        for (int i = -16; i < 16; i++) {
            for (int j = 0; j < 32; j++) {
                generateChunk(i,j);
            }
        }
    }
    public static void generateChunk(int x,int y){
        Chunk chunk = new Chunk(x,y);
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Block block = WorldGenerator.generateBlock(i,j,chunk);
                if(block!=null) {
                    chunk.blocks.add(block);
                }
            }
        }
        World.chunks.add(chunk);
    }

    public static Block generateBlock(int blockX, int blockY, Chunk chunk){
        if(blockY>10){
            return new GrassBlock(blockX,blockY);
        }
        if(blockY>8){
            return new StoneBlock(blockX,blockY);
        }
        return null;
    }
}
