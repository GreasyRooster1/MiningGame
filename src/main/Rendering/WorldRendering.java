package main.Rendering;

import main.Assets.AssetLoader;
import main.Block.Block;
import main.Main;
import main.World.Chunk;
import main.World.World;

public class WorldRendering {
    public static float blockSize = 30;
    public static float chunkSize = blockSize*16;
    public static void renderWorld(){
        for(Chunk chunk : World.chunks) {
            renderChunk(chunk);
        }
    }

    public static void renderChunk(Chunk chunk){
        float chunkOffsetX = chunk.chunkX*chunkSize;
        float chunkOffsetY = chunk.chunkY*chunkSize;

        for (Block block:chunk.blocks) {
            if(block.visible) {
                Main.app.image(block.texture, chunkOffsetX + block.x * blockSize, chunkOffsetY + block.y * blockSize, blockSize, blockSize);
            }
        }

        Main.app.noFill();
        Main.app.stroke(0,0,255);
        Main.app.rect(chunkOffsetX,chunkOffsetY,chunkSize,chunkSize);
    }
}
