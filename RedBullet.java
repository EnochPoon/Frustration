import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBullet extends Actor
{
    private int timer=100;
    private boolean t=true;
    public RedBullet(int angle){
        turn(angle);
        if(theWorld.lv()==4||theWorld.lv()==6){
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
        Actor x=getOneObjectAtOffset(0,0,Hippo.class);
        if(x!=null){
            x.getWorld().removeObject(x);
            DeadHippo deadhippo=new DeadHippo();
            getWorld().addObject (deadhippo, getX(), getY());
            getImage().setTransparency(255);
        }

        outOfBounds();
    }    

    public void outOfBounds(){
        if (getOneObjectAtOffset(0,0,Block.class)!=null){
            getWorld().removeObject(this);
        }else if(getOneObjectAtOffset(0,0,FakeBlock.class)!=null&&theWorld.lv()!=1){
            getWorld().removeObject(this);
        }
    }
}
