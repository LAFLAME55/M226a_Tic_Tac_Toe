import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Diese Welt wird angezeigt, sobald ein Sieger ermittelt wurde. Zudem kann man in dieser Welt ein Spiel nochmals neustarten indem man auf den Button reset drückt (in act() Methode).
 * 
 * Der auskommentierte Code funktioniert zum jetzigen Zeitpunkt noch nicht. Dennoch haben wir ihn drin gelassen, sodass man nachvollziehen was wir versucht haben. 
 * 
 * @Serkan Tugra & Julian Schmid
 * @Version : 1.0.0 
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
    
    // Diese Funktion dient für die Anzeige des Score Counters. Diese Funktion funktioniert noch nicht, deswegen ist alles auskommentiert
    // private void showScore()
    // {
        // addObject(yeCounter, 75, 125);
        // addObject(sketeCounter, 225, 125);
        // // ((TicTacToeULTRAPROMAX)getWorld()).getYeScore();
        // // yeScore = TicTacToeULTRAPROMAX.getYeScore();
        // // TicTacToeULTRAPROMAX world = (TicTacToeULTRAPROMAX) getWorld();
        
        // // yeCounter.setImage(new GreenfootImage("Score: "+world.getYeScore(), 24, null, null));
        // // sketeCounter.setImage(new GreenfootImage("Score: "+world.getSketeScore(), 24, null, null));
        // // showText("Score: " + score, 80, 25);
        // // showText("Score: " + score, 80, 25);
    // }
}
