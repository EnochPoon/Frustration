import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scope extends Actor
{
    private int length=80;
    private boolean f=false;
    int time=5;//switch transparency
    private boolean flash=true;
    private int fire=4;
    /**
     * Act - do whatever the Scope wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(length, length);
        if(length!=75){
            
            length--;
        }else{
            f=true;
        }
        if(f==true){
            time--;
        }
        if(time==0){
            if(flash==true){
                getImage().setTransparency(0);
                flash=false;
            }else{
                getImage().setTransparency(255);
                flash=true;
            }
            time=5;
            fire--;
        }
        
        if(fire==0){
            setImage("explode.png");
            getImage().scale(length-20,length-20);
            length=length-5;
            if(getOneObjectAtOffset(0,0,Hippo.class)!=null){
                getWorld().removeObjects(getWorld().getObjects(Hippo.class));
                getWorld().addObject(new DeadHippo(),getX(),getY());
            }
            f=false;
            time=5;
            if(length<=60){
                getWorld().removeObject(this);
            }
        }
    }
}    
