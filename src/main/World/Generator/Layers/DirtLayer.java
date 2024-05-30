package main.World.Generator.Layers;

import main.Block.Block;
import main.Block.Types.*;
import main.World.Generator.GenerationLayer;

public class DirtLayer extends GenerationLayer {
    public DirtLayer() {
        startDepth=8;
        endDepth=16;
        noiseScale=0.04f;
        noiseAmount=5;
    }

    @Override
    public Block generateBlock(int blockX, int blockY,int blockDepth) {
        if(blockDepth==0) {
            return new GrassBlock(0, 0);
        }else{
            return new DirtBlock(0, 0);
        }
    }
}
