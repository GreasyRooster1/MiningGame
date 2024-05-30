package main.World.Generator;

import main.Block.Block;

import static main.Main.app;
import static processing.core.PApplet.round;

public class GenerationLayer {
    public int startDepth=0;
    public int endDepth=0;
    public float noiseScale=0;
    public float noiseAmount=0;

    public Block checkLayerBoundsAndGenerate(int blockX, int blockY, int placeX, int placeY){
        int yShift = round(app.noise(blockX*noiseScale,startDepth)*noiseAmount);
        if(blockY>=startDepth-yShift&&blockY<endDepth){
            return generateBlock(blockX,blockY,placeX,placeY);
        }
        return null;
    }

    public Block generateBlock(int blockX, int blockY, int placeX, int placeY) {
        return null;
    }
}
