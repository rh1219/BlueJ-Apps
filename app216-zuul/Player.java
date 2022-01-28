import java.util.ArrayList;
/**
 * Player variables.
 *
 * @author Rahaat Hussain
 * @version 
 */
public class Player
{
    private int stamina = 15;
    private int score = 0;
    public ArrayList <Item> inventory;
    public HashMap <String, Item> inventories;

    /**
     * Player Variables
     */
    public Player() 
    {            
        this.health = health;
        this.score = score;
        inventory = new ArrayList <>();
        inventories = new HashMap <>();
    }
    
    /**
     * Decrease stamina when moving through rooms.
     */
    public void decreaseStamina() 
    {            
        stamina = stamina - 1;
    }
    
    /**
     * Checks if player has the torch to enter the cave.
     */
    public boolean caveUnlocked() 
    {            
        String returnString = " Inventory:";
        Set <String> torch = inventory.torchSet();
        for(String item: torch)
        {
            returnString += " " + item;
        }
        if(returnString.contains("torch"))
        {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if player has the snorkel to enter the underground lake.
     */
    public boolean lakeUnlocked() 
    {            
        String returnString = " Inventory:";
        Set <String> snorkel = inventory.snorkelSet();
        for(String item: torch)
        {
            returnString += " " + item;
        }
        if(returnString.contains("snorkel"))
        {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if player has key to open vault.
     */
    public boolean vaultUnlocked() 
    {            
        String returnString = " Inventory:";
        Set <String> key = inventory.keySet();
        for(String item: key)
        {
            returnString += " " + item;
        }
        if(returnString.contains("key"))
        {
            return true;
        }
        return false;
    }
}
