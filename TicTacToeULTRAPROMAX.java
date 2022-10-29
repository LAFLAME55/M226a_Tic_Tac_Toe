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
    private Actor Icon; 
    private boolean playerturn; // Überprüft, welcher Spieler am Zug ist (true=Spieler1/false=Spieler2)
    private String[][] fielddeclaration = {{"", "", ""},
                                           {"", "", ""},
                                           {"", "", ""}};
    private boolean checkXTurnStatus;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    // Ruft alle Methoden auf
    public TicTacToeULTRAPROMAX() {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels. Background color set to light purple with a .png.
        super(3, 3, 200); 
        createFields();
        // setLines();
        checkXTurnStatus = true; 
        // setBackground("light-purple.png");
    }
    // Generiert schwarze Linien und platziert diese dynamisch in der Welt.
    // public void setLines() {
        // GreenfootImage backgroundimage = getBackground();
        // int i = 1;
        // while (i < 3) {
            // backgroundimage.setColor(Color.BLACK);
            // backgroundimage.drawLine(i*200, 0, i*200, 600);
            // backgroundimage.drawLine(0, i*200, 600, i*200);
            // i = i + 1;
        // }
    // }
    // 
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
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x + 1, y, ye.class).size() > 0 && getObjectsAt(x + 1, y, ye.class).size() > 0) {
                        System.out.println("YE hat gewonnen!");
                        Greenfoot.stop();
                } 
                if(getObjectsAt(x, y, ye.class).size() > 0 && getObjectsAt(x, y + 1, ye.class).size() > 0 && getObjectsAt(x, y + 2, ye.class).size() > 0) {
                        System.out.println("YE hat gewonnen!");
                        Greenfoot.stop();
                } 
            }
        }
    }
}
