package main.World.Generator.Layers;

import main.Block.Block;
import main.Block.Types.GrassBlock;
import main.Block.Types.StoneBlock;
import main.World.Generator.GenerationLayer;

public class StoneLayer extends GenerationLayer {
    public StoneLayer() {
        startDepth=16;
        endDepth=100;
        noiseScale=0.04f;
        noiseAmount=5;
    }

    @Override
    public Block generateBlock(int blockX, int blockY, int placeX, int placeY) {
        return new StoneBlock(placeX,placeY);
    }
}
