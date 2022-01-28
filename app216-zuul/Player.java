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
     * Checks if player has key to open vault.
     */
    public boolean vaultUnlocked() 
    {            
        String returnString = " Inventory:";
        Set <String> keys = inventory.keySet();
        for(String item: keys)
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
