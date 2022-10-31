import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToeULTRAPROMAX extends World
{
    private int mouseclicked; // Überprüft, wie viel Mal die Maus geklickt wurde
    private boolean checkXTurnStatus;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    // Ruft Methoden für das Erstellen des Spielfelds auf. Erstellt eine neue Welt mit 3x3 Feld à 200 px
    public TicTacToeULTRAPROMAX() {    
        super(3, 3, 200); 
        createFields();
        checkXTurnStatus = true; 
    }

    public void createFields() {
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                addObject(new Fields(), x, y);
            }
        }
    }   
    
    public boolean isXTurn() {
        return checkXTurnStatus;
    }
    
    public void changeXTurns() {
        checkXTurnStatus = !checkXTurnStatus;
    }

    public void act() {
        // Funktionsblock überprüft, ob YE gewonnen hat
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                // Überprüft, ob eine Reihe auf X-Achse voll ist
                if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x + 1, y, ye.class).size() > 0 && getObjectsAt(x + 2, y, ye.class).size() > 0) {
                        System.out.println("YE hat gewonnen!");
                        Greenfoot.stop();
                } 
                // Überprüft, ob eine Reihe auf Y-Achse voll ist
                else if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x, y + 1, ye.class).size() > 0 && getObjectsAt(x, y + 2, ye.class).size() > 0) {
                        System.out.println("YE hat gewonnen!");
                        Greenfoot.stop();
                } 
                // Überprüft, ob eine Reihe quer (XY-Achse) voll ist
                else if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x + 1, y + 1, ye.class).size() > 0 && getObjectsAt(x + 2, y + 2, ye.class).size() > 0) {
                        System.out.println("YE hat gewonnen!");
                        Greenfoot.stop();
                } 
                else if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x + 1, y - 1, ye.class).size() > 0 && getObjectsAt(x + 2, y - 2, ye.class).size() > 0) {
                        System.out.println("YE hat gewonnen!");
                        Greenfoot.stop();
                } 
                // Überprüft, ob alle Felder voll sind (anhand von der ye Klasse)
                else if(getObjects(ye.class).size() == 5) {
                        System.out.println("Untentschieden! Das Spiel wird beendet...");
                        Greenfoot.stop();
                } 
            }
        }
        // Funktionsblock überprüft, ob Skete gewonnen hat
         for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                // Überprüft, ob eine Reihe auf X-Achse voll ist
                if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y, skete.class).size() > 0 && getObjectsAt(x + 2, y, skete.class).size() > 0) {
                        System.out.println("SKETE hat gewonnen!");
                        Greenfoot.stop();
                } 
                // Überprüft, ob eine Reihe auf Y-Achse voll ist
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x, y + 1, skete.class).size() > 0 && getObjectsAt(x, y + 2, skete.class).size() > 0) {
                        System.out.println("SKETE hat gewonnen!");
                        mouseclicked++; 
                        System.out.println(mouseclicked);
                        Greenfoot.stop();
                } 
                // Überprüft, ob eine Reihe quer (XY-Achse) voll ist
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y + 1, skete.class).size() > 0 && getObjectsAt(x + 2, y + 2, skete.class).size() > 0) {
                        System.out.println("SKETE hat gewonnen!");
                        Greenfoot.stop();
                } 
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y - 1, skete.class).size() > 0 && getObjectsAt(x + 2, y - 2, skete.class).size() > 0) {
                        System.out.println("SKETE hat gewonnen!");
                        Greenfoot.stop();
                } 
                // Überprüft, ob alle Felder voll sind (anhand von der skete Klasse)
                else if(getObjects(skete.class).size() == 5) {
                        System.out.println("Untentschieden! Das Spiel wird beendet...");
                        Greenfoot.stop();
                } 
            }
        }
    }
}
