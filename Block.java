import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player can stand on a block
 * 
 * @author Enoch Poon
 * 
 */
public class Block extends Actor
{
    private int x=255;
    private boolean timer=true;
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(theWorld.lv()==9){
            if(x>0){
                x-=5;
                getImage().setTransparency(x);
            }
           
        }else{
            getImage().setTransparency(255);
        }
    }    
}
