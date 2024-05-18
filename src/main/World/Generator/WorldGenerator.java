package main.World.Generator;

import main.Block.Block;
import main.Block.Types.GrassBlock;
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
                if(j>8) {
                    chunk.blocks.add(new GrassBlock(i, j));
                }
            }
        }
        World.chunks.add(chunk);
    }
}
