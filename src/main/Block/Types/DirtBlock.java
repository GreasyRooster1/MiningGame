package main.Block.Types;

import main.Block.Block;

import static main.Assets.AssetLoader.getAsset;

public class DirtBlock extends Block {
    public DirtBlock(int _x, int _y) {
        super(_x, _y);
        texture=getAsset("block.dirt");
    }
}
