import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Begin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Begin extends Actor
{
    /**
     * Act - do whatever the Begin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)==true){
            Greenfoot.setWorld(new theWorld());
        }
        
    }    
}
