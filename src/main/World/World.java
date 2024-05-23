package main.World;

import main.Block.Block;
import main.Block.Types.GrassBlock;
import main.World.Generator.WorldGenerator;

import java.util.ArrayList;

public class World {
    public static ArrayList<Chunk> chunks = new ArrayList<>();

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
}
