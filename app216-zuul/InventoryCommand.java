
/**
 * @author Rahaat Hussain
 * @version 
 */
public class InventoryCommand extends ZuulCommand
{
    public InventoryCommand(Game zuul)
    {
        super(zuul);
    }

    /**
     * Prints the item the player has.
     */
    public void execute()
    {
        System.out.println();
        Player player = zuul.player;
        System.out.println(player.getItemString());
    }
}