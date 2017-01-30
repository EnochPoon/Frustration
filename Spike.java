import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Actor
{
    private int timer=100;
    private boolean reveal=false;
    public Spike(){
        
    }

    /**
     * Act - do whatever the Spike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor boy=getOneObjectAtOffset(0,3,Hippo.class);
        if(theWorld.lv()!=1&&reveal==false){
            getImage().setTransparency(0);
        }
        if(!(boy==null)){
            setImage("spike.png");//appear from invisible
            DeadHippo d=new DeadHippo();
            getWorld().addObject(d,getX(),getY());
            removeTouching(Hippo.class);
            reveal=true;
        }
        if (reveal==true){
            timer--;
        }
        if (timer==0){
            if(theWorld.lv()!=1){
                getImage().setTransparency(0);
                reveal=false;
            }
            timer=100;
        }
    }    
}
