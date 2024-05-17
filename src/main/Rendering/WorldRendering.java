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

    public static void renderChunk(Chunk chunk,int chunkX,int chunkY){
        for (Block block:chunk.blocks) {
            float chunkOffsetX = chunkX*(blockSize*16);
            float chunkOffsetY = chunkY*(blockSize*16);
            Main.app.rect(chunkOffsetX+block.x,chunkOffsetY+block.y,blockSize,blockSize);
        }
    }
}
