
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Rahaat Hussain
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;

    private StockList stock;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();

        stock = new StockList();
    }

    /**
     *  Display a list of menu choices and then executes
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = reader.getString("Please enter your choice > ");

            finished = executeChoice(choice.toLowerCase());
        }
    }

    /**
     *  Runs a method based on the input entered by the user.
     */
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            System.out.println("You have quit the application");
            return true;
        }
        else if(choice.equals("add"))
        {
            int id = reader.getInt("Enter ID");
            Product find = stock.findProduct(id);
            if(find == null)
            {
                String name = reader.getString("Enter the name of the product");
                Product product = new Product(id, name);
                stock.add(product);
                System.out.println("Product " + product.getID() + ", " + product.getName() + " has been added to the stock list");
            }
            else
            {
                System.out.println("This ID is already in use, select a different ID");
            }
        }

        else if(choice.equals("remove"))
        {
            int id = reader.getInt("Please enter the ID");
            Product find = stock.findProduct(id);
            if(find == null)
            {
                System.out.println("This product ID does not exist");
            }
            else
            {
                stock.removeProducts(id);
                System.out.println("Product " + id +  " has been removed from the stock list");
            }
        }
        else if(choice.equals("print"))
        {
            System.out.println("Here is the current stock");
            stock.print();

        }
        else if(choice.equals("buy"))
        {
            int id = reader.getInt("Enter the ID");
            int amount = reader.getInt("Enter the amount you would like to buy");

            {
                stock.buyProduct(id,amount);
                System.out.println("This product has been purchased " + amount + " times");
            }
        }
        else if(choice.equals("sell"))
        {
            int id = reader.getInt("Enter the ID");
            int amount = reader.getInt("Enter the amount you would like to sell");

            {
                stock.sellProduct(id,amount);
                System.out.println("This product has been sold " + amount + " times");
            }
        }
        else if (choice.equals("search"))
        {
            String keyword = reader.getString("Enter a keyword to search for");
            stock.findName(keyword);
        }

        return false;
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:                Add a new product");
        System.out.println("    Remove:             Remove an old product");
        System.out.println("    Print:              Print all products");
        System.out.println("    Buy :               Buy a product");
        System.out.println("    Sell :              Sell a product");
        System.out.println("    Search:             Search for a product");
        System.out.println("    Quit:               Quit the program");
        System.out.println();
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Rahaat Hussain");
        System.out.println("********************************");
    }
}