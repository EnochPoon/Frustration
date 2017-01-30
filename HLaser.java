import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HLaser extends Actor
{
    private int timer=5;
    private int t=100;
    private boolean x=true;
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
        death();
    }    
    private void death(){
       
    }
}
