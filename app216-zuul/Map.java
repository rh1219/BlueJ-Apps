import java.util.ArrayList;
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location outside, minersBuilding, office, vault, campsite, caveEntrance, miningArea, undergroundLake;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
        setRequiredItems();
        
        ArrayList<Items> inventory = new ArrayList<Items>();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createOutside();
        createMinersBuilding();
        createOffice();
        createVault();
        createCampsite();
        createCaveEntrance();
        createMiningArea();
        createUndergroundLake();
        
        currentLocation = outside;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * miner's building, campsite and cave entrance
     */
    private void createOutside()
    {
        outside = new Location("outside of the old mining facility");
    }
    
    /**
     // * Create the miner's building and link it to the outside
     */
    private void createMinersBuilding()
    {
        minersBuilding = new Location("the old miner's building");
    }
    
    /**
     * Create the office and link it to the miner's building
     */
    private void createOffice()
    {
        office = new Location("this is the chief miner's office");
    }
    
    /**
     * Create the vault and link it to the office
     */
    private void createVault()
    {
        vault = new Location("a vault found inside of the chief miner's office, you need a key to enter!");
    }
    
    /**
     * Create the campsite and link it to the outside
     */
    private void createCampsite()
    {
        campsite = new Location("this is where the miner's rested after a long day of work");
    }
    
    /**
     * Create the cave entrance and link it to the outside
     */
    private void createCaveEntrance()
    {
        caveEntrance = new Location("the entrance to a dark cave, you need a torch to enter!");
    }
    
    /**
     * Create the mining area and link it to the cave entrance
     */
    private void createMiningArea()
    {
        // create the Locations
        miningArea = new Location("this is where the miner's found their treasure");
    }
    
    /**
     * Create the underground lake and link it to the cave entrance
     */
    private void createUndergroundLake()
    {
        undergroundLake = new Location("you find a mysterious underground lake, you need a snorkel to enter!");
    }
    
    
    /**
     * Set the required items needed to enter certain rooms
     */
    private void setRequiredItems()
    {
        vault.setRequiredItem(Items.KEY);
        caveEntrance.setRequiredItem(Items.TORCH);
        undergroundLake.setRequiredItem(Items.SNORKEL);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
