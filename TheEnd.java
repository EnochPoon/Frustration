import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Message when game finished
 * 
 * @author Enoch Poon
 * 
 */
public class TheEnd extends Actor
{
    /**
     * Act - do whatever the TheEnd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("The End! You finished the game with " + DeathNumber.death() + ".\nThanks for playing!\nClick here to return back to the beginning",30,Color.RED,Color.BLUE));
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Title());
        }
    }    
}
