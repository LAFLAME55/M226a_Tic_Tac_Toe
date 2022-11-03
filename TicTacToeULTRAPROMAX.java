import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
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
    private int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    // Ruft Methoden für das Erstellen des Spielfelds auf. Erstellt eine neue Welt mit 3x3 Feld à 200 px
    public TicTacToeULTRAPROMAX() {    
        super(3, 3, 200);
        // createInputDialog();
        score = 0; 
        createFields();
        checkXTurnStatus = true; 
    }
        
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < 0) 
        {
            Greenfoot.stop();
        }
    }
    
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }
    
    // Funktion für das öffnen des Popups
    // public void createInputDialog() {
        // try {
            // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        // }catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
            // | UnsupportedLookAndFeelException ex) {
        // }
        // ImageIcon displayPictureYe = new ImageIcon("/Screenshot 2022-10-29 152222.png"); 
        
        // Object[] possibleValues = { 1, 2, 3 };
        // Object selectedValue = JOptionPane.showInputDialog(null,
        // "Wähle einen Charakter:", "Input",
        // JOptionPane.INFORMATION_MESSAGE, displayPictureYe,
        // possibleValues, possibleValues[0]);
    // }   
    
    // Überprüft, ob die Esc-Taste gedrückt wurde. Falls ja wird das Spiel beendet.
    public void checkKeyESC() {
        String escKey = Greenfoot.getKey();
        if("escape".equals(escKey)) {
            System.out.println("ESC Taste wurde gedrückt. Beende das Spiel...");
            Greenfoot.setWorld(new escscreen());
            Greenfoot.stop();
        }
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
    
    
    // Scope wechseln
    // Funktion für das Ausgeben des Aktors YE. Der Sieg wird geloggt und die Welt resetgame wird aufgerufen
    public void checkYeWin() {
        System.out.println("YE hat gewonnen!");
        // TicTacToeULTRAPROMAX.addScore(+1); 
        Greenfoot.setWorld(new resetgame());
    }
    // Scope wechseln
    // Funktion für das Ausgeben des Aktors YE. Der Sieg wird geloggt und die Welt resetgame wird aufgerufen
    public void checkSketeWin() {
        System.out.println("SKETE hat gewonnen!");
        Greenfoot.setWorld(new resetgame());
    }
    // Scope wechseln
    // Funktion für das Ausgeben des Aktors YE. Der Sieg wird geloggt und die Welt resetgame wird aufgerufen
    public void checkForTie() {
        System.out.println("Untentschieden! Das Spiel wird beendet...");
        Greenfoot.setWorld(new tiescreen());
    }
    
    public void act() {
        // Funktionsblock überprüft, ob YE gewonnen hat
        checkKeyESC();
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                // Überprüft, ob eine Reihe auf X-Achse voll ist
                if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x + 1, y, ye.class).size() > 0 && getObjectsAt(x + 2, y, ye.class).size() > 0) {
                    checkYeWin();
                } 
                // Überprüft, ob eine Reihe auf Y-Achse voll ist
                else if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x, y + 1, ye.class).size() > 0 && getObjectsAt(x, y + 2, ye.class).size() > 0) {
                    checkYeWin();
                } 
                // Überprüft, ob eine Reihe quer (XY-Achse) voll ist
                else if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x + 1, y + 1, ye.class).size() > 0 && getObjectsAt(x + 2, y + 2, ye.class).size() > 0) {
                    checkYeWin();
                } 
                else if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x + 1, y - 1, ye.class).size() > 0 && getObjectsAt(x + 2, y - 2, ye.class).size() > 0) {
                    checkYeWin();
                } 
                // Überprüft, ob alle Felder voll sind (anhand von der ye Klasse)
                else if(getObjects(ye.class).size() == 5) {
                    checkForTie();
                } 
            }
        }
        // Funktionsblock überprüft, ob Skete gewonnen hat
         for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                // Überprüft, ob eine Reihe auf X-Achse voll ist
                if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y, skete.class).size() > 0 && getObjectsAt(x + 2, y, skete.class).size() > 0) {
                    checkSketeWin();
                } 
                // Überprüft, ob eine Reihe auf Y-Achse voll ist
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x, y + 1, skete.class).size() > 0 && getObjectsAt(x, y + 2, skete.class).size() > 0) {
                    checkSketeWin();
                } 
                // Überprüft, ob eine Reihe quer (XY-Achse) voll ist
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y + 1, skete.class).size() > 0 && getObjectsAt(x + 2, y + 2, skete.class).size() > 0) {
                    checkSketeWin();
                } 
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y - 1, skete.class).size() > 0 && getObjectsAt(x + 2, y - 2, skete.class).size() > 0) {
                    checkSketeWin();
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
