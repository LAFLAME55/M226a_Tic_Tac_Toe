import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Diese Welt ist für die Erstellung der Felder zuständig. Zudem handelt diese Welt das Abwechslungsverhalten im Spiel ab. Darunter versteht man das zuerste ein Spieler und nachher der andere
 * Spieler am Zug ist. 
 * 
 * @Serkan Tugra & Julian Schmid
 * @Version : 1.0.0 
*/
public class Fields extends Actor
{
    /**
     * Act - do whatever the Icon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
// Bei dieser Act Methode werden die Felder für die Welt (TicTacToeULTRAPROMAX) erstellt. Darauf werden nachher die einzelnen Aktoren der Klassen ye & skete gesetzt
public void act() {
        if(Greenfoot.mouseClicked(this)) {
            TicTacToeULTRAPROMAX game = getWorldOfType(TicTacToeULTRAPROMAX.class);
            if (game.isXTurn()) {
                game.addObject(new ye(), getX(), getY()); // Fügt den Aktor Ye auf das angeklickte Feld hinzu
                game.changeXTurns();    // Wechselt den Wert zu False = skete Klasse wieder am Zug
            } else {
                game.addObject(new skete(), getX(), getY()); // Fügt den Aktor Ye auf das angeklickte Feld hinzu
                game.changeXTurns(); // Wechselt den Wert zu True = ye Klasse wieder am Zug
            }
        }
    }
}
