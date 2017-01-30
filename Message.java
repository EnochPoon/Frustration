import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    public Message(){
        setImage(new GreenfootImage("Welcome to Frustration!\nUse arrow keys to move", 30, Color.RED, null));
    }
    private boolean laser7=true;
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int level=theWorld.lv();

        if (level==1){
            setImage(new GreenfootImage("Welcome to Frustration!\nUse arrow keys to move", 30, Color.RED, null));
        }else if(level==2){
            setImage(new GreenfootImage("They're still there", 30, Color.RED, null));
        }else if(level==3){
            setImage(new GreenfootImage("Increased firing rate",30, Color.RED, null));
        }else if(level==4){
            setImage(new GreenfootImage("Like usual, they're still there", 30, Color.RED, null));
        }else if(level==5){
            setImage(new GreenfootImage("Let's get stuff moving", 30, Color.RED,null));
        }else if(level==6){
            setImage(new GreenfootImage("Do you remember?", 30, Color.RED,null));
        }else if (level==7){
            setImage(new GreenfootImage("Rushing to the top", 30, Color.RED,null));
            if(laser7==true){
                HLaser h=new HLaser();
                getWorld().addObject(h, 349,397);
                laser7=false;
            }
        }else if (level==8){
            setImage(new GreenfootImage("RUN!", 30, Color.RED,null));
        }else if(level==9){
            setImage(new GreenfootImage("Memory or guessing", 30, Color.RED,null));
        }else if(level==10){
            setImage(new GreenfootImage("The Last One", 30, Color.RED,null));
        }else{
            Greenfoot.setWorld(new End());
        }
        
    }

}
