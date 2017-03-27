import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player can pass through this block. Appears starting at level 2
 * 
 * @author Enoch Poon
 * 
 */
public class FakeBlock extends Actor
{
    private int x=255;
    public FakeBlock(){
        getImage().setTransparency(0);
    }
    /**
     * Act - do whatever the FakeBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Hippo.class)&&theWorld.lv()!=1&&theWorld.lv()!=9){
            getImage().setTransparency(50);
            
        }else if(theWorld.lv()!=1&&theWorld.lv()!=9){
            getImage().setTransparency(255);
        }
        if((theWorld.lv()==1)){
            getImage().setTransparency(0);
        }else if(theWorld.lv()==9&&x>0){
            getImage().setTransparency(x);
            x-=5;
        }
    }
}
