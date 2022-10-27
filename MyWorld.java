import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int mouseclicked; // Überprüft, wie viel Mal die Maus geklickt wurde
    private Actor Icon; 
    private boolean playerturn; // Überprüft, welcher Spieler am Zug ist (true=Spieler1/false=Spieler2)
    private String[][] fielddeclaration = {{"", "", ""},
                                           {"", "", ""},
                                           {"", "", ""}};
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    // Ruft alle Methoden auf
    public MyWorld()
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels. Background color set to light purple with a .png.
        super(3, 3, 200); 
        Lines();
        // setBackground("light-purple.png");
    }
    // Generiert schwarze Linien und platziert diese dynamisch in der Welt.
    public void Lines() {
        GreenfootImage backgroundimage = getBackground();
        int i = 1;
        while (i < 3) {
            backgroundimage.setColor(Color.BLACK);
            backgroundimage.drawLine(i*200, 0, i*200, 600);
            backgroundimage.drawLine(0, i*200, 600, i*200);
            i = i + 1;
        }
    }
    // 
    public void act() {
        Icon.act();
    }
    
    // public void setIcon(int getxcoordinate, int getycoordinate) {
        // if(playerturn && fielddeclaration[getycoordinate][getxcoordinate].equals("")){
            // addObject(new player1(), getxcoordinate, getycoordinate);
            
        // }
    // }
}
