package main.World.Generator;

import main.Block.Block;

public class GenerationLayer {
    public int startDepth=0;
    public int endDepth=0;

    public Block generateSelf(int blockX,int blockY,int placeX,int placeY){
        if(blockY>=startDepth&&blockY<endDepth){
            return generateBlock(blockX,blockY,placeX,placeY);
        }
        return null;
    }

    public Block generateBlock(int blockX, int blockY, int placeX, int placeY) {
        return null;
    }
}
