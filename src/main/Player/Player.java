package main.Player;

import main.Main;

import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_D;
import static main.Input.KeyHandler.keysDown;

public class Player {
    public float x,y;

    public Player(float _x,float _y){
        x = _x;
        y = _y;
    }

    public void update(){
        if(keysDown.get(VK_A)){
            x-=2;
        }
        if(keysDown.get(VK_D)){
            x+=2;
        }
    }
}
