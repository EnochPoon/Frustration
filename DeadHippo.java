import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dead Player
 * 
 * @author Enoch Poon
 * 
 */
public class DeadHippo extends Actor
{
    private int gravity=0;
    private int timer=100;
    public DeadHippo(){
        turn(90);
    }

    /**
     * Act - do whatever the DeadHippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeTouching(Hippo.class);
        move(gravity/5);
        gravity++;
        timer--;
        if(timer==0){
            reset();
        }

    }

    public void reset(){
        Hippo hippo = new Hippo();
        getWorld().addObject(hippo, 85, 347);
        DeathNumber.newdeath();
        getWorld().removeObjects(getWorld().getObjects(Deadly.class));
        if(theWorld.lv() > 6){
            HLaser h=new HLaser();
            getWorld().addObject(h, 349,397);
        }
        getWorld().addObject(new RedGun(), 299, 177);
        getWorld().removeObject(this);
    }
}    

