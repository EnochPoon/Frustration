import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class DeathNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathNumber extends Actor
{
    private static int deaths=0;
    
    public DeathNumber(){
        deaths=0;
        GreenfootImage x=new GreenfootImage ("Deaths: "+deaths, 30,Color.BLACK,null);
        setImage(x);
    }

    /**
     * Act - do whatever the DeathNumber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage x=new GreenfootImage ("Deaths: "+deaths, 30,Color.BLACK,null);
        setImage(x);

    }    

    public static void newdeath(){
        deaths++;
    }
    public static String death(){
        if(deaths==0){
            return "no deaths";
        }else if(deaths==1){
            return "only a single death";
        }else{
            return deaths+" deaths";
        }
    }
}
