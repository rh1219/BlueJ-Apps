import java.util.ArrayList;
/**
 * Item variables.
 *
 * @author Rahaat Hussain
 * @version
 */

public class Item
{
    String name;
    String description;
  
    /**
     * 
     */
    public Item(String name, Stringdescription)
    {
        this.name = name;
        this.description = description;
    }
    
    /**
     * Gets name of object.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets description of object.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Prints name of object.
     */
    public void getShortDescription()
    {
        System.out.println(name);
    }
}
