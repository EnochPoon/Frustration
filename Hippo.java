import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    int gravity=0;
    boolean jump=false;
    int timer=105;
    boolean right=true;
    boolean x=true;
    public Hippo(){

    }

    /**
     * Act - do whatever the Hippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        nextLevel();
        scoping();
        Actor sideBlock;
        sideBlock=getOneObjectAtOffset(0,20,Block.class);

        if (sideBlock!=null&&(getOneObjectAtOffset(10,20,Block.class)!=null||getOneObjectAtOffset(-10,20,Block.class)!=null)){
            gravity=0;
            jump=false;
        }else{
            
            setLocation(getX(),getY()+(gravity/5));
            gravity++;
            if (jump==true){
                if(getOneObjectAtOffset(0,-20,Block.class)==null&&getOneObjectAtOffset(8,-20,Block.class)==null&&getOneObjectAtOffset(-8,-20,Block.class)==null){
                    setLocation(getX(),getY()-6);
                }else{
                    gravity=35;
                }
            }
        }
        
        if (Greenfoot.isKeyDown("up")&&jump==false&&!(sideBlock==null)){
            setLocation(getX(),getY()-6);
            jump=true;
        }
        if (Greenfoot.isKeyDown("left")){
            if (right==true){
                getImage().mirrorHorizontally();
                right=false;
            }

            if(getOneObjectAtOffset(-10,0,Block.class)==null){
                move(-2);
            }
        }
        if(getOneObjectAtOffset(-8,0,Block.class)!=null){
            move(1);
        }else if(getOneObjectAtOffset(8,0,Block.class)!=null){
            move(-1);
        }
        if (Greenfoot.isKeyDown("right")){
            if(right==false){
                getImage().mirrorHorizontally();
                right=true;

            }
            if(getOneObjectAtOffset(10,0,Block.class)==null&&getOneObjectAtOffset(10,15,Block.class)==null){
                move(2);
            }
        }
        if (y()>390){
            DeadHippo d=new DeadHippo();
            getWorld().addObject(d,x(),y());
        }
        if (getOneObjectAtOffset(0,19,Block.class)!=null&&(getOneObjectAtOffset(8,19,Block.class)!=null||getOneObjectAtOffset(-8,19,Block.class)!=null)){
            setLocation(getX(),getY()-1);
        }
        //if(sideBlock==null&&!(getOneObjectAtOffset(9,20,Block.class)==null||getOneObjectAtOffset(-9,20,Block.class)==null)){
        //    jump=true;
        //}
        laser();
    }

    public void nextLevel(){
        if(getOneObjectAtOffset(0,0,Finish.class)!=null&&x==true){

            FinishNote f=new FinishNote();
            getWorld().addObject(f, 300, 230);
            x=false;
        }
        if(x==false){
            timer--;
        }
        if(timer==0){
            x=true;
            setLocation(92,322);
            getWorld().removeObjects(getWorld().getObjects(RedGun.class));
            getWorld().addObject(new RedGun(),299, 177);
            getWorld().removeObjects(getWorld().getObjects(RedBullet.class));
            timer=105;
            
        }
    }   
    public boolean returnx(){
        return x;
    }

    public int returntime(){
        return timer;
    }

    public int x(){
        return getX();
    }

    public int y(){
        return getY();
    }
    private int g=200;
    private void scoping(){
        if(getOneObjectAtOffset(0,0,Finish.class)==null&&theWorld.lv()>7){
            g--;
        }
        if(g==0){
            g=200;
            Scope scope=new Scope();
            getWorld().addObject(scope, getX(), getY());
        }
    }

    private void laser(){
        if(getOneObjectAtOffset(0,0,Finish.class)==null){
            if(isTouching(HLaser.class)==true){
                getWorld().addObject(new DeadHippo(),getX(), getY());
                getWorld().removeObject(this);
            }else if(getOneObjectAtOffset(0,0,Rocket.class)!=null){
                getWorld().addObject(new Explode(),getX(),getY());
                getWorld().addObject(new DeadHippo(),getX(),getY());
                getWorld().removeObject(getOneObjectAtOffset(0,0,Rocket.class));
                getWorld().removeObject(this);
            }
        }
    }
}
