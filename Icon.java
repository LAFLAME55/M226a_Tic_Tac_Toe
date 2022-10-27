import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Icon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icon extends Actor
{
    private int mouseclicked; // Überprüft, wie viel Mal die Maus geklickt wurde
    private Actor Icon;
    private Actor playericon;
    private boolean playerturn; // Überprüft, welcher Spieler am Zug ist (true=Spieler1/false=Spieler2)
    private String[][] fielddeclaration = {{"", "", ""},
                                           {"", "", ""},
                                           {"", "", ""}};
    /**
     * Act - do whatever the Icon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act() {
        int getxcoordinate = Greenfoot.getMouseInfo().getX();
        int getycoordinate = Greenfoot.getMouseInfo().getY();
        if(Greenfoot.mouseClicked(this)) {
            // setIcon(getxcoordinate, getycoordinate);
            Icon playericon = new Icon();
                
            .addObject(playericon, getxcoordinate, getycoordinate);
            // Maybe hier ende vom spiel falls 9 felder voll sind
            mouseclicked = mouseclicked + 1;
        }
    }
}
