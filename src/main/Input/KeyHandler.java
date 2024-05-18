package main.Input;

import main.Main;

import java.util.ArrayList;
import java.util.Collections;

public class KeyHandler {
    public static ArrayList<Boolean> keysDown = new ArrayList<>(Collections.nCopies(256, false));

    public static void keyPressedEvent(){
        if(Main.app.keyCode>256){
            return;
        }
        keysDown.set(Main.app.keyCode, true);
    }

    public static void keyReleasedEvent(){
        if(Main.app.keyCode>256){
            return;
        }
        keysDown.set(Main.app.keyCode, false);
    }
}
