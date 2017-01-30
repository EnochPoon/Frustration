import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explode extends Actor
{
    private int size=100;
    private int transparency=255;
    /**
     * Act - do whatever the Explode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(size,size);
        size=size+1;
        getImage().setTransparency(transparency);
        transparency=transparency-3;
        if(transparency<5){
            getWorld().removeObject(this);
        }
    }    
}
