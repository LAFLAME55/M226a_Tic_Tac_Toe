import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resetbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class resetbutton extends Actor
{
    /**
     * Act - do whatever the resetbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    // Funktion für das reseten der Welt (zurück zum 3x3 Feld).
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new TicTacToeULTRAPROMAX());
        }
    }
}
