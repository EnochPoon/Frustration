import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 10 Rockets
 * 
 * @author Enoch Poon 
 * 
 */
public class Rocket extends Deadly
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
