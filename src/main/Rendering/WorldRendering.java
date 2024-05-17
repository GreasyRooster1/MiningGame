package main.Rendering;

import main.Block;
import main.Main;
import main.World.Chunk;
import main.World.World;

public class WorldRendering {
    public static float blockSize = 30;
    public static void renderWorld(){
        for(Chunk chunk : World.chunks){
            renderChunk(chunk);
        }
    }

    public static void renderChunk(Chunk chunk){
        for (Block block:chunk.blocks) {
            float chunkOffsetX = chunk.chunkX*(blockSize*16);
            float chunkOffsetY = chunk.chunkY*(blockSize*16);
            Main.app.rect(chunkOffsetX+block.x*blockSize,chunkOffsetY+block.y*blockSize,blockSize,blockSize);
        }
    }
}
