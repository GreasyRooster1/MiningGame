package main.World.Generator;

import main.Block.Block;
import main.Block.Types.*;
import main.World.Chunk;

public class WorldGenerator {
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
