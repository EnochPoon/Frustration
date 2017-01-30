import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeadHippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
            Hippo hippo = new Hippo();
            getWorld().addObject(hippo, 85, 347);
            DeathNumber.newdeath();
            if(theWorld.lv()>6){
                getWorld().removeObjects(getWorld().getObjects(HLaser.class));
                HLaser h=new HLaser();
                getWorld().addObject(h, 349,397);
            }
            if(theWorld.lv()==10&&getWorld().getObjects(Rocket.class)!=null){
                getWorld().removeObjects(getWorld().getObjects(Rocket.class));
            }
            getWorld().removeObjects(getWorld().getObjects(DeadHippo.class));
        }

    }
}    

