package main.World.Generator.Layers;

import main.Block.Block;
import main.Block.Types.GrassBlock;
import main.World.Generator.GenerationLayer;

public class StoneLayer extends GenerationLayer {
    public StoneLayer() {
        startDepth=16;
        endDepth=100;
    }

    @Override
    public Block generateBlock(int blockX, int blockY, int placeX, int placeY) {
        return new GrassBlock(placeX,placeY);
    }
}
