import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Icon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fields extends Actor
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

public void act() {
        // int getxcoordinate = Greenfoot.getMouseInfo().getX();
        // int getycoordinate = Greenfoot.getMouseInfo().getY();
        if(Greenfoot.mouseClicked(this)) {
            TicTacToeULTRAPROMAX game = getWorldOfType(TicTacToeULTRAPROMAX.class);
            if (game.isXTurn()) {
                game.addObject(new ye(), getX(), getY());
                game.changeXTurns();
            } else {
                game.addObject(new skete(), getX(), getY());
                game.changeXTurns();
            }
            // setIcon(getxcoordinate, getycoordinate);
            // playerIcon = new playericon(this);
            // getWorld().addObject(playericon, getxcoordinate, getycoordinate);
            // Icon playericon = new Icon();
                
            // .addObject(playericon, getxcoordinate, getycoordinate);
            // Maybe hier ende vom spiel falls 9 felder voll sind
            mouseclicked = mouseclicked + 1;
        }
    }
}
