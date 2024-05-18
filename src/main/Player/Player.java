package main.Player;

import main.Main;

import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_D;

public class Player {
    public float x,y;

    public Player(float _x,float _y){
        x = _x;
        y = _y;
    }

    public void update(){
        if(Main.keysDown.get(VK_A)){
            x-=2;
        }
        if(Main.keysDown.get(VK_D)){
            x+=2;
        }
    }
}
