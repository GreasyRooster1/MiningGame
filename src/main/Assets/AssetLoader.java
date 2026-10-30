package main.Assets;

import processing.core.PImage;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

import static qlogr.QLogr.*;

public class AssetLoader {
    public static ArrayList<Asset> assets = new ArrayList<>();

    public static void loadAssets(){
        info("Loading assets");

        loadBlocks();

        assets.add(new Asset("player.idle","player/idle.png"));
    }

    public static void loadBlocks(){
        File directoryPath = new File("assets/block");
        String[] contents = directoryPath.list();
        for(String filename:contents){
            String name = filename.replace(".png","");
            assets.add(new Asset("block."+name,"block/"+filename));
        }
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
