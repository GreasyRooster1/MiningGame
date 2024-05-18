package main.Block.Types;

import main.Block.Block;

import static main.Assets.AssetLoader.getAsset;

public class GrassBlock extends Block {
    public GrassBlock(int _x, int _y) {
        super(_x, _y);
        texture=getAsset("block.grass");
    }
}
