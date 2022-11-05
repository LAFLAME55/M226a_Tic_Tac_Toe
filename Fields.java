import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Icon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fields extends Actor
{
    /**
     * Act - do whatever the Icon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 

public void act() {
        if(Greenfoot.mouseClicked(this)) {
            TicTacToeULTRAPROMAX game = getWorldOfType(TicTacToeULTRAPROMAX.class);
            if (game.isXTurn()) {
                game.addObject(new ye(), getX(), getY());
                game.changeXTurns();
            } else {
                game.addObject(new skete(), getX(), getY());
                game.changeXTurns();
            }
        }
    }
}
