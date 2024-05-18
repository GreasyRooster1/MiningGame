package main.Player;

import main.Block.Block;
import main.Main;
import main.World.Chunk;
import main.World.World;

import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_D;
import static java.lang.Math.abs;
import static main.Input.KeyHandler.keysDown;
import static main.Player.PlayerPhysicsConstants.*;
import static main.Rendering.WorldRendering.blockSize;
import static main.Rendering.WorldRendering.chunkSize;
import static main.Util.Collision.*;

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
        xvel*=1-airFriction;

        if(!checkCollision(xvel,0)) {
            x += xvel;
        }else{
            xvel=0;
        }
        if(!checkCollision(0,yvel)) {
            y += yvel;
        }else{
            yvel=0;
        }
    }

    public void getInput(){
        if(keysDown.get(VK_A)&&xvel>-maxMoveVelocity){
            xvel-=moveVelocity;
        }
        if(keysDown.get(VK_D)&&xvel<maxMoveVelocity){
            xvel+=moveVelocity;
        }
    }

    public boolean checkCollision(float dx, float dy){
        Chunk currentChunk = getCurrentChunk();
        if(currentChunk==null){
            return false;
        }
        for(Block block:currentChunk.blocks){
            if(blockRect(currentChunk,block,x+dx,y+dy,blockSize*2,blockSize*2)){
                return true;
            }
        }
        return false;
    }

    public Chunk getCurrentChunk(){
        for (Chunk chunk:World.chunks){
            if(x>chunk.chunkX*chunkSize&&x<(chunk.chunkX+1)*chunkSize&&y>chunk.chunkY*chunkSize&&y<(chunk.chunkY+1)*chunkSize){
                return chunk;
            }
        }
        return null;
    }
}
