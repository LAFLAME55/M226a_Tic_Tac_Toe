import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tiescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tiescreen extends World
{

    /**
     * Constructor for objects of class tiescreen.
     * 
     */
    public tiescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        act();
    }
     public void act(){
        addObject(new resetbutton(), 525, 325);
    }
}
