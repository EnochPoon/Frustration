import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

        if(reversetimer==0){
            reverse=false;

        }

        if(reversetimer==180){
            reverse=true;

        }
        if(reverse==false){
            turn(1);
            angle++;
            reversetimer++;
        }else{
            turn(-1);
            angle--;
            reversetimer--;
        }

        if (angle%60==0&&theWorld.lv()<3){//timer==0
            //getWorld().removeObjects(getWorld().getObjects(RedBullet.class));
            RedBullet bullet=new RedBullet(angle);
            getWorld().addObject(bullet, getX(), getY());
            timer=100;
        }
        if (angle%45==0&&theWorld.lv()>2){
            //getWorld().removeObjects(getWorld().getObjects(RedBullet.class));
            RedBullet bullet=new RedBullet(angle);
            getWorld().addObject(bullet, getX(), getY());
            timer=100;
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
