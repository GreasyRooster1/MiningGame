package main.Assets;

import processing.core.PImage;

import java.util.ArrayList;
import java.util.Objects;

public class AssetLoader {
    public static ArrayList<Asset> assets = new ArrayList<>();

    public static void loadAssets(){
        loadBlocks();

        assets.add(new Asset("player.idle","player\\idle.png"));
    }

    public static void loadBlocks(){
        assets.add(new Asset("block.grass","block\\grass.png"));
        assets.add(new Asset("block.stone","block\\stone.png"));
        assets.add(new Asset("block.stone","block\\slate.png"));
        assets.add(new Asset("block.stone","block\\limestone.png"));
    }

    public static PImage getAsset(String id){
        for(Asset asset:assets){
            if(Objects.equals(asset.id, id)){
                return asset.image;
            }
        }
        return null;
    }
}
