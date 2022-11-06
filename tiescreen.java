import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Diese Welt ist für das Handling eines Unentschieden zuständig. Zudem kann man in dieser Welt ein Spiel nochmals neustarten indem man auf den Button reset drückt (in act() Methode). 
 * 
 * @Serkan Tugra & Julian Schmid
 * @Version : 1.0.0 
 */
public class tiescreen extends World
{
    /**
     * Constructor for objects of class tiescreen.
     * 
     */
    // Erstellt eine Welt à 600 x 400 px und führt act() aus
    public tiescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        act();
    }
    
    // Hier wird ein neues Objekt aus der resetbutton Aktoren Klasse erstellt
     public void act(){
        addObject(new resetbutton(), 525, 325);
    }
}
