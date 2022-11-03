import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resetgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class resetgame extends World
{
    /**
     * Constructor for objects of class resetgame.
     * 
     */
    public resetgame()
    {    
        // Erstellt eine gleiches Feld wie bei der Klasse TicTacToeULTRAPROMAX
        super(600, 400, 1); 
        act();
    }
    // Erstellt ein neues Objekt vom Typ resetbutton auf Positon 200px x 200px
    public void act(){
        addObject(new resetbutton(), 525, 325);
    }
}
