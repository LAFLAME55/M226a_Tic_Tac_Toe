import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*; // JoptionPain (Popup window)
/**
 * Dies ist die Hauptwelt. Darin sind verschiedene Funktionen enthalten, welche die Erstellung der Welt, das hohlen, wechseln und setzen von Aktoren, das herauslesen eines Gewinners und die Switches
 * zu anderen Welten abhandelt. Man kann sich die Kreuze (X) und Kreise (O) im Traditionellem Tic Tac Toe bei uns mit den Klassen ye (X) und skete (o) vergleichen. 
 * 
 * @Serkan Tugra & Julian Schmid
 * @Version : 1.0.0 
 */
public class TicTacToeULTRAPROMAX extends World
{
    private int mouseClicked; // Überprüft, wie viel Mal die Maus geklickt wurde
    private boolean checkXTurnStatus; // Überprüft, ob Spieler (YE) dran ist
    private int score;
    public boolean isWin; // Überprüft, ob es einen Win gibt oder nicht
    public int yeWinCount; // Zählt die Anzahl Wins für die Klasse ye
    public int sketeWinCount; // Zählt die Anzahl Wins für die Klasse skete
    // private Actor yeCounter = new counter();
    // private Actor sketeCounter = new counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    // Ruft Methoden für das Erstellen des Spielfelds auf. Erstellt eine neue Welt mit 3x3 Feld à 200 px
    public TicTacToeULTRAPROMAX() {    
        super(3, 3, 200);
        // createInputDialog();
        score = 0; // Score wird Standardmässig auf 0 gesetzt
        createFields();
        checkXTurnStatus = true; // Setzt den Wert auf True = ye Klasse beginnt
    }
        
    // Funktion fügt Punkte zur korrekten Spielerklasse hinzu. Die Funktion behinhaltet 2 Parameter (Anz. Punkte und Siegerklasse)
    public void addScore(int points, Object electWinner)
    {
        
        score = score + points;
        if(electWinner == ye.class) {
            yeWinCount++;
        } else if (electWinner == skete.class) {
            sketeWinCount++;
        }
        // showScore();
    }

    // Gibt aus wie viel mal die Klasse ye gewonnen hat
    public int getYeScore() {
        return yeWinCount;
    }
    
    // Gibt aus wie viel mal die Klasse ye gewonnen hat
        public int getSketeScore() {
        return sketeWinCount;
    }
    // Funktion für das Popup Window, wo man den Spieler auswählen kann
    // private void showScore()
    // {
        // addObject(yeCounter, 75, 125);
        // addObject(sketeCounter, 225, 125);
        // yeCounter.setImage(new GreenfootImage("Score: "+yeWinCount, 24, null, null));
        // sketeCounter.setImage(new GreenfootImage("Score: "+sketeWinCount, 24, null, null));
        // // showText("Score: " + score, 80, 25);
        // // showText("Score: " + score, 80, 25);
    // }
    
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
    
    // Überprüft, ob die Esc-Taste gedrückt wurde. Falls ja wird das Spiel beendet und es wird zur Welt escscreen gewechselt, welches zudem noch sound abspielt.
    public void checkKeyESC() {
        String escKey = Greenfoot.getKey();
        if("escape".equals(escKey)) {
            System.out.println("ESC Taste wurde gedrückt. Beende das Spiel...");
            Greenfoot.playSound("outro.mp3");
            Greenfoot.delay(945); //Verzögerung für den Switch zur Welt escscreen
            Greenfoot.setWorld(new escscreen());
            Greenfoot.stop();
        }
    }
    
    // Erstellt die Felder, wo die Aktoren gesetzt werden könenn. Die Felder selbst sind auch Aktoren und diese Funktion wird am Anfang ausgeführt
    public void createFields() {
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                addObject(new Fields(), x, y);
            }
        }
    }   
    
    // Gibt an, ob die Klasse ye dran ist oder nicht
    public boolean isXTurn() {
        return checkXTurnStatus;
    }
    
    // Falls die Spielerklasse ye nicht mehr dran ist, so soll diese zur skete Klasse gewechselt werden
    public void changeXTurns() {
        checkXTurnStatus = !checkXTurnStatus;
    }
    
    // Funktion für das Ausgeben des Aktors ye. Der Sieg wird geloggt und die Welt resetgame wird aufgerufen
    private void checkYeWin() {
        System.out.println("YE hat gewonnen!");
        isWin = true;         
        addScore(1, ye.class); // Fügt einen Punkt zur ye Klasse hinzu (Point Counter)
        Greenfoot.playSound("win.mp3");
        Greenfoot.setWorld(new winscreen()); // Wechselt zur Welt winscreen
    }
    
    // Funktion für das Ausgeben des Aktors skete. Der Sieg wird geloggt und die Welt resetgame wird aufgerufen
    private void checkSketeWin() {
        System.out.println("SKETE hat gewonnen!");
        addScore(1, skete.class); // Fügt einen Punkt zur skete Klasse hinzu (Point Counter)
        Greenfoot.playSound("win.mp3");
        Greenfoot.setWorld(new winscreen()); // Wechselt zur Welt winscreen
    }
    
    // Funktion für das Ausgeben des Aktors YE. Der Sieg wird geloggt und die Welt resetgame wird aufgerufen
    public void checkForTie() {
        // Greenfoot.playSound("poopity-scoop.mp3");
        System.out.println("Untentschieden! Das Spiel wird beendet...");
        Greenfoot.setWorld(new tiescreen());
    }
    
    // Act Methode, welche beim Spielen ausgeführt wird. Hier wird evaluiert, welche Klasse gewonnen hat. Man benötigt immer 3 Aktoren derselben Klasse in einer Reihe 
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
                // Überprüft, ob eine Reihe diagonal (XY-Achse) voll ist
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
                // Überprüft, ob eine Reihe diagonal (XY-Achse) voll ist
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y + 1, skete.class).size() > 0 && getObjectsAt(x + 2, y + 2, skete.class).size() > 0) {
                    checkSketeWin();
                } 
                else if(getObjectsAt(x, y, skete.class).size() > 0 && getObjectsAt(x + 1, y - 1, skete.class).size() > 0 && getObjectsAt(x + 2, y - 2, skete.class).size() > 0) {
                    checkSketeWin();
                } 
                // Überprüft, ob alle Felder voll sind (anhand von der skete Klasse)
                else if(getObjects(skete.class).size() == 5) {
                    checkForTie();
                } 
            }
        }
    }
}
