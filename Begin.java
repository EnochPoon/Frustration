import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Press to begin game.
 * 
 * @author Enoch Poon
 * 
 */
public class Begin extends Actor
{
    /**
     * Act - do whatever the Begin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)==true){
            Greenfoot.setWorld(new theWorld());
        }
        
    }    
}
