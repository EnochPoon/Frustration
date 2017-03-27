import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * RedGun points towards the Hippo and shoots some RedBullets
 * 
 * @author Enoch Poon
 * 
 */
public class RedGun extends Actor
{
    private int timer=100;
    private int angle=0;
    int reversetimer=0;
    boolean reverse=true;
    /**
     * Act - do whatever the RedGun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {       
        timer--;
        List<Hippo> hippo = getWorld().getObjects(Hippo.class);
        if(hippo.size() > 0){
            turnTowards(hippo.get(0).getX(), hippo.get(0).getY());
            if(timer == 0){
                Marker m = new Marker();
                getWorld().addObject(m, hippo.get(0).getX(), hippo.get(0).getY());
                getWorld().addObject(new RedBullet(m), getX(), getY());
                if(theWorld.lv() >= 3){
                    timer = 50;
                }else{
                    timer = 100;
                }
            }
        }
            
        if(theWorld.lv()>4){
            moving();
        }
    }    

    public int shot(){
        angle+=10;
        return angle;
    }
    private void moving(){
        if(reverse==true){
            setLocation(getX()+1,getY());
        }else{
            setLocation(getX()-1,getY());
        }
    }
}
