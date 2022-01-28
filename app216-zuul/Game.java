import java.util.ArrayList;
/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  locations, creates the CommandReader and starts the game.  
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 
 * 
 * Modified and extended by Rahaat Hussain
 */

public class Game 
{
    public final Map MAP;
    private CommandReader reader;
    private boolean gameOver;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        MAP = new Map();
        reader = new CommandReader(this);
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();
        gameOver = false;

        // Enter the main command loop.  Here we repeatedly 
        // read commands and execute them until the game is over.
                
        while (! gameOver) 
        {
            gameOver = reader.getCommand();
        }
        
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println(" Welcome to the abandoned mining facility!");
        System.out.println(" Make your way through the facility to find the key and obtain the secret treasure.");
        System.out.println(" Type 'help' if you need help.");
        System.out.println();
        System.out.println(MAP.getCurrentLocation().getLongDescription());
        
    }
}
