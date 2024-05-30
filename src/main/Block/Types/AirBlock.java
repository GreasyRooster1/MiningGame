package main.Block.Types;

import main.Block.Block;

import static main.Assets.AssetLoader.getAsset;

public class AirBlock extends Block {
    public AirBlock(int _x, int _y) {
        super(_x, _y);
        visible = false;
        collides = false;
    }
}
