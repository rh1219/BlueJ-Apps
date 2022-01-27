
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
    
    private Location outside, theater, changingRoom, pub, stockRoom, lab, office, vault;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
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
        createTheatre();
        createPub();
        createOffice();
        createLab();
        createVault();

        currentLocation = outside;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createOutside()
    {
        outside = new Location("outside in the town centre");
        
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createPub()
    {
        pub = new Location("in the town pub");
        
        pub.setExit("east", outside);
        outside.setExit("west", pub);
    }
    
    /**
     * Create the vault and link it to the office
     */
    private void createStockRoom()
    {
        stockRoom = new Location("in the pub");
        
        stockRoom.setExit("north", pub);
        pub.setExit("south", stockRoom);
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createTheatre()
    {
        theater = new Location("in the town theatre");
        
        theater.setExit("west", outside);
        outside.setExit("east", theater);
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createChangingRoom()
    {
        changingRoom = new Location("in the theatre");
        
        theater.setExit("west", outside);
        outside.setExit("east", theater);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createOffice()
    {
        office = new Location("in the admin office");
        
        office.setExit("west", lab);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createLab()
    {
        // create the Locations
        lab = new Location("in a computing lab");
        
        lab.setExit("east", office);
        office.setExit("west", lab);
        
        lab.setExit("north", outside);
        outside.setExit("south", lab);
    }
    
    /**
     * Create the vault and link it to the office
     */
    private void createVault()
    {
        vault = new Location("in the admin office");
        
        vault.setExit("north", office);
        office.setExit("south", vault);
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
