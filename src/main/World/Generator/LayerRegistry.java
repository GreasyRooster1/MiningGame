package main.World.Generator;

import java.util.ArrayList;

import main.World.Generator.Layers.DirtLayer;

public class LayerRegistry {

    public static ArrayList<GenerationLayer> registry = new ArrayList<>();

    public static void registerLayers(){
        registerLayer(new DirtLayer());
    }
    public static void registerLayer(GenerationLayer layer){
        registry.add(layer);
    }
}
