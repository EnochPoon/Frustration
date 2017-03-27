import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Bullet from the RedGun
 * 
 * @author Enoch Poon
 * 
 */
public class RedBullet extends Deadly
{
    private int timer = 100;
    private boolean t = true;
    Marker marker;
    public RedBullet(Marker marker){
        this.marker = marker;
        if(theWorld.lv() == 4||theWorld.lv() == 6){
            getImage().setTransparency(0);
        }
    }

    /**
     * Act - do whatever the RedBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        Actor x = getOneObjectAtOffset(0,0,Hippo.class);
        List<Marker> mlist = getWorld().getObjects(Marker.class);
        if(mlist.contains(marker)){
            turnTowards(marker.getX(), marker.getY());
        }
        if(x!=null){
            getImage().setTransparency(255);
        }
        if(intersects(marker)){
            getWorld().removeObject(marker);
        }
        outOfBounds();
    }    

    public void outOfBounds(){
        if(getX() < -5 || getX() > getWorld().getWidth() + 5 || getY() < -5 || getY() > getWorld().getHeight() + 5){
            getWorld().removeObject(this);
        }
    }
}
