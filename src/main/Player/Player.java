package main.Player;

import main.Block.Block;
import main.World.Chunk;
import main.World.World;

import static java.awt.event.KeyEvent.*;
import static java.lang.Math.abs;
import static main.Input.KeyHandler.keysDown;
import static main.Player.PlayerPhysicsConstants.*;
import static main.Rendering.WorldRendering.blockSize;
import static main.Rendering.WorldRendering.chunkSize;
import static main.Util.Collision.*;

public class Player {
    public float x,y;
    public float xvel,yvel;

    public boolean onGround = false;
    public boolean moving = false;

    public boolean noClip = false;

    public Player(float _x,float _y){
        x = _x;
        y = _y;
        xvel = 0;
        yvel = 0;
    }

    public void update(){
        getInput();
        if(noClip){
            noClipMovement();
        }else {
            doGravity();
            doVelocity();
        }

    }

    public void doGravity(){
        if(yvel>=terminalVelocity){
            return;
        }
        yvel+=gravity;
    }

    public void doVelocity(){
        if(!onGround) {
            xvel *= 1 - airFriction;
        }else{
            if(!moving) {
                xvel *= 1 - groundFriction;
            }
        }

        if(!willCollide(xvel,0)) {
            x += xvel;
        }else{
            xvel=0;
        }
        if(!willCollide(0,yvel)) {
            y += yvel;
            onGround = false;
        }else{
            yvel=0;
            onGround = true;
        }
    }

    public void getInput(){
        moving=false;
        if(keysDown.get(VK_A)&&xvel>-maxMoveVelocity){
            xvel-=moveVelocity;
            moving=true;
        }
        if(keysDown.get(VK_D)&&xvel<maxMoveVelocity){
            xvel+=moveVelocity;
            moving=true;
        }
        if(keysDown.get(VK_SPACE)&&onGround){
            yvel+=jumpVelocity;
        }

        if(keysDown.get(VK_1)){
            noClip=true;
        }
        if(keysDown.get(VK_2)){
            noClip=false;
        }
    }

    public boolean willCollide(float dx, float dy){
        Chunk currentChunk = getCurrentChunk();
        if(noClip){
            return false;
        }
        if(currentChunk==null){
            return false;
        }
        for(Block block:currentChunk.blocks){
            if(!block.collides){
                continue;
            }
            if(blockRect(currentChunk,block,x+dx-blockSize,y+dy-blockSize,blockSize*2,blockSize*2)){
                return true;
            }
        }
        return false;
    }

    public void noClipMovement(){
        if(keysDown.get(VK_A)){
            x-=noClipSpeed;
        }
        if(keysDown.get(VK_D)){
            x+=noClipSpeed;
        }
        if((keysDown.get(VK_SPACE)||keysDown.get(VK_W))){
            y-=noClipSpeed;
        }
        if(keysDown.get(VK_S)){
            y+=noClipSpeed;
        }

        if(keysDown.get(VK_1)){
            noClip=true;
        }
        if(keysDown.get(VK_2)){
            noClip=false;
        }
    }

    public Chunk getCurrentChunk(){
        for (Chunk chunk:World.chunks){
            if(x>=chunk.chunkX*chunkSize&&x<(chunk.chunkX+1)*chunkSize&&y>=chunk.chunkY*chunkSize&&y<(chunk.chunkY+1)*chunkSize){
                return chunk;
            }
        }
        return null;
    }
}
