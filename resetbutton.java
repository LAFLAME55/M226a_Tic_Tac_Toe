import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Der Aktor resetbutton ist dazu da ein neues Spiel zu erstellen, falls bereits eins durchgelaufen ist.
 * 
 * @Serkan Tugra & Julian Schmid
 * @Version : 1.0.0 
 */
public class resetbutton extends Actor
{
    /**
     * Act - do whatever the resetbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    // Funktion für das reseten der Welt (zurück zum 3x3 Feld). Die Welt TiTicTacToeULTRAPROMAX wird wieder aufgerufen
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new TicTacToeULTRAPROMAX());
        }
    }
}
