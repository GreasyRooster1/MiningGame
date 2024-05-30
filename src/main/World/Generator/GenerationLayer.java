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
        int adjustedStartDepth = startDepth-yShift;
        if(blockY>=adjustedStartDepth&&blockY<endDepth){
            Block b = generateBlock(blockX,blockY,placeY-adjustedStartDepth);
            b.x = placeX;
            b.y = placeY;
            return b;
        }
        return null;
    }

    public Block generateBlock(int blockX, int blockY,int blockDepth) {
        return null;
    }
}
