import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Message for each level
 * 
 * @author Enoch Poon
 * 
 */
public class Message extends Actor
{
    private String[]messages = {"Welcome to Frustration!\nUse arrow keys to move",
        "They're still there",
        "Increased firing rate",
        "Like usual, they're still there",
        "Let's get stuff moving",
        "Do you remember?",
        "Rushing to the top",
        "RUN!",
        "Memory or guessing",
        "The Last One"};
        private boolean laser7=true;
    public Message(){
        setImage(new GreenfootImage("Welcome to Frustration!\nUse arrow keys to move", 30, Color.RED, null));
    }
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int level=theWorld.lv();
        
        if(level <= 10){
            setImage(new GreenfootImage(messages[level - 1], 30, Color.RED, null));
            if(laser7 && level == 7){
                HLaser h = new HLaser();
                getWorld().addObject(h, 349, 397);
                laser7 = false;
            }
        }else{
            Greenfoot.setWorld(new End());
        }
        
    }

}
