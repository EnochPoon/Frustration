import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Menu World
 * 
 * @author Enoch Poon 
 * 
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1);
        
        prepare();
    }
    
    public void changeworld(){
        Greenfoot.setWorld(new theWorld());
    }
    public void end(){
        Greenfoot.setWorld(new End());
    }

    public void prepare(){

        Titlename titlename = new Titlename();
        addObject(titlename, 334, 78);
        titlename.setLocation(352, 99);
        Begin begin = new Begin();
        addObject(begin, 363, 270);
        Credits credits = new Credits();
        addObject(credits, 618, 367);
        credits.setLocation(530, 375);
    }
}
