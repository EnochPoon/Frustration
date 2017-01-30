import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class FinishNote here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishNote extends Actor
{
    int level=1;
    int timer=95;
    public FinishNote(){
        setImage(new GreenfootImage ("Level "+theWorld.lv()+": Complete!", 50,Color.BLACK,null));
        
    }

    /**
     * Act - do whatever the FinishNote wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        timer--;
        if(timer==0){
            theWorld.lvup();
            if(theWorld.lv()>6&&getWorld().getObjects(HLaser.class)!=null){
                getWorld().removeObjects(getWorld().getObjects(HLaser.class));
                getWorld().addObject(new HLaser(),349,397);
            }
            getWorld().removeObjects(getWorld().getObjects(FinishNote.class));
        }
    }    
}
