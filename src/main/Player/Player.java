package main.Player;

import main.Main;

import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_D;
import static main.Input.KeyHandler.keysDown;

public class Player {
    public float x,y;
    public float xvel,yvel;

    public Player(float _x,float _y){
        x = _x;
        y = _y;
        xvel = 0;
        yvel = 0;
    }

    public void update(){
        getInput();
        doGravity();
        doVelocity();
    }

    public void doGravity(){
        yvel+=0.1f;
    }

    public void doVelocity(){
        x+=xvel;
        y+=yvel;
    }

    public void getInput(){
        if(keysDown.get(VK_A)){
            x-=2;
        }
        if(keysDown.get(VK_D)){
            x+=2;
        }
    }
}
