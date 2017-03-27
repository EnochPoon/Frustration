import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A horizontal laser found in level 7 and above
 * 
 * @author Enoch Poon 
 * 
 */
public class HLaser extends Deadly
{
    private int timer=5;
    private int t=100;
    /**
     * Act - do whatever the HLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        timer--;
        if(timer==0){
            setLocation(getX(),getY()-1);
            timer=5;
        }
        
    }    
}
