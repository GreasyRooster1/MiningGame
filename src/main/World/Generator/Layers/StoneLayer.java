package main.World.Generator.Layers;

import main.Block.Block;
import main.Block.Types.GrassBlock;
import main.Block.Types.SlateBlock;
import main.Block.Types.StoneBlock;
import main.World.Generator.GenerationLayer;

import static main.Main.app;

public class StoneLayer extends GenerationLayer {
    public StoneLayer() {
        startDepth=16;
        endDepth=100;
        noiseScale=0.04f;
        noiseAmount=5;
    }

    @Override
    public Block generateBlock(int blockX, int blockY,int blockDepth) {

        if(app.noise(blockX*0.08f,blockY*0.64f)>.5){
            return new SlateBlock(0,0);
        }

        return new StoneBlock(0,0);
    }
}
