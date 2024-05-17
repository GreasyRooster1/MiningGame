package main.Assets;

import processing.core.PImage;

import java.util.ArrayList;
import java.util.Objects;

public class AssetLoader {
    public static ArrayList<Asset> assets = new ArrayList<>();

    public static void loadAssets(){
        assets.add(new Asset("block.grass","assets\\grass.png"));
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
