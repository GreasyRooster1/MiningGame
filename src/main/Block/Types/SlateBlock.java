package main.Block.Types;

import main.Block.Block;

import static main.Assets.AssetLoader.getAsset;

public class SlateBlock extends Block {
    public SlateBlock(int _x, int _y) {
        super(_x, _y);
        texture=getAsset("block.slate");
    }
}
