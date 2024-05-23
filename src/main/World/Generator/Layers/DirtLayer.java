package main.World.Generator.Layers;

import main.Block.Block;
import main.Block.Types.*;
import main.World.Generator.GenerationLayer;

public class DirtLayer extends GenerationLayer {
    public DirtLayer() {
        startDepth=8;
        endDepth=32;
    }

    @Override
    public Block generateBlock(int blockX, int blockY, int placeX, int placeY) {
        return new GrassBlock(placeX,placeY);
    }
}
