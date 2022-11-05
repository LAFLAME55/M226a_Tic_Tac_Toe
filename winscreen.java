import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resetgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class winscreen extends World
{
    private Actor yeCounter = new counter();
    private Actor sketeCounter = new counter();
    /**
     * Constructor for objects of class resetgame.
     * 
     */
    public winscreen()
    {    
        // Erstellt eine gleiches Feld wie bei der Klasse TicTacToeULTRAPROMAX
        super(600, 400, 1); 
        act();
    }
    // Erstellt ein neues Objekt vom Typ resetbutton auf Positon 200px x 200px
    public void act(){
        addObject(new resetbutton(), 525, 325);
        
        // addObject(new Counter(), 75, 25);
        // addObject(new Counter(), 525, 25);
    }
       private void showScore()
    {
        addObject(yeCounter, 75, 125);
        addObject(sketeCounter, 225, 125);
        // ((TicTacToeULTRAPROMAX)getWorld()).getYeScore();
        // yeScore = TicTacToeULTRAPROMAX.getYeScore();
        // TicTacToeULTRAPROMAX world = (TicTacToeULTRAPROMAX) getWorld();
        
        // yeCounter.setImage(new GreenfootImage("Score: "+world.getYeScore(), 24, null, null));
        // sketeCounter.setImage(new GreenfootImage("Score: "+world.getSketeScore(), 24, null, null));
        // showText("Score: " + score, 80, 25);
        // showText("Score: " + score, 80, 25);
    }
}
