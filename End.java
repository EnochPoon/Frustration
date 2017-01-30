import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        TheEnd theend = new TheEnd();
        addObject(theend, 277, 182);
        theend.setLocation(297, 182);
    }
}
