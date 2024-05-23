package main.World.Generator;

import main.Block.Block;
import main.Block.Types.*;
import main.World.Chunk;
import main.World.World;
import static qlogr.QLogr.*;

public class WorldGenerator {
    public static int startAreaWidth=32;
    public static int startAreaHeight=32;

    public static void generateWorld(){
        info("generating world ("+startAreaWidth+"x"+startAreaHeight+")");
        int c =0;
        for (int i = -startAreaWidth/2; i < startAreaWidth/2; i++) {
            for (int j = 0; j < startAreaHeight; j++) {
                generateChunk(i,j);
                c++;
                logProgress(i,j,c);
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
        for (GenerationLayer layer:LayerRegistry.registry){
            Block b = layer.generateSelf(blockX+chunk.chunkX*16,blockY+chunk.chunkY*16,blockX,blockY);
            if(b!=null) {
                return b;
            }
        }
        return null;
    }

    public static void logProgress(float cx, float cy,int count){
        if(count%10!=0&&count!=startAreaWidth*startAreaHeight){
            return;
        }
        float percent = (float) count /(startAreaWidth*startAreaHeight)*100;
        info("generating world: "+percent+"% x:"+cx+" y:"+cy);
    }
}
