import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class LvText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LvText extends Actor
{
    public LvText(){
        GreenfootImage x=new GreenfootImage ("Level: "+theWorld.lv()+"/10", 30,Color.BLACK,null);
        setImage(x);
    }
    /**
     * Act - do whatever the LvText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage x=new GreenfootImage ("Level: "+theWorld.lv()+"/10", 30,Color.BLACK,null);
        setImage(x);
    }    
}
