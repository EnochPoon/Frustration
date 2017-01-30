import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Actor
{
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Credits() 
    {
        setImage(new GreenfootImage("Lead programmer: Enoch Poon \nSkilled programmer who never helped: Tiger Zhao \nSuper noob tester: Aaron Lam", 15,Color.GREEN,null));
    }    
}
