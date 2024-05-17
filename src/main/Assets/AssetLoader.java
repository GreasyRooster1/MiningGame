package main.Assets;

import java.util.ArrayList;

public class AssetLoader {
    public static ArrayList<Asset> assets = new ArrayList<>();

    public static void loadAssets(){
        assets.add(new Asset("blocks.grass","assets\\grass.png"));
    }
}
