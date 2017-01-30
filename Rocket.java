import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private int x;
    private boolean t=true;
    public Rocket(int g){
        turn(180);
        x=g;
        getImage().scale(150,30);
    }

    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getOneObjectAtOffset(0,0,Hippo.class)==null){
            move(x);
        }
    }    
}
