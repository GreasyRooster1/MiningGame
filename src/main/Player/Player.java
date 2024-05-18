package main.Player;

import main.Main;

import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_D;
import static java.lang.Math.abs;
import static main.Input.KeyHandler.keysDown;
import static main.Player.PlayerPhysicsConstants.*;

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
        if(yvel>=terminalVelocity){
            return;
        }
        yvel+=gravity;
    }

    public void doVelocity(){
        x+=xvel;
        y+=yvel;

        xvel*=1-airFriction;
    }

    public void getInput(){
        if(keysDown.get(VK_A)&&xvel>-maxMoveVelocity){
            xvel-=moveVelocity;
        }
        if(keysDown.get(VK_D)&&xvel<maxMoveVelocity){
            xvel+=moveVelocity;
        }
    }

    public void isOnGround(){

    }
}
