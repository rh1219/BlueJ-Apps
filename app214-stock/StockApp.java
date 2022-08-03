/**
 * @author Rahaat Hussain
 * * * @version 1.0
 */
public class StockApp
{
    private InputReader reader;

    private StockList stock;

    /**
     * Constructors
     */
    public StockApp()
    {
        reader = new InputReader();

        stock = new StockList();
    }

    /**
     *  Displays list of menu options
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuOptions();

            String option = reader.getString("Enter an option > ");

            finished = executeOption(option.toLowerCase());
        }
    }

    private boolean executeOption(String option)
    {
        switch (option) {
            case "add" -> {
                System.out.println("You picked: Add Product");
                addProduct();
            }
            case "remove" -> {
                System.out.println("You picked: Remove Product");
                removeProduct();
            }
            case "buy" -> {
                System.out.println("You picked: Buy Products");
                buyProduct();
            }
            case "sell" -> {
                System.out.println("You picked: Sell Products");
                sellProduct();
            }
            case "search" -> {
                System.out.println("You picked: Search Products");
                searchProduct();
            }
            case "stock" -> {
                System.out.println("You picked: Stock Check");
                checkLowStock();
            }
            case "print" -> {
                System.out.println("You picked: Print Stock");
                printStock();
            }
            case "restock" -> {
                System.out.println("You picked: Restock Low Stock");
                restock();
            }
            case "demo" ->
                    System.out.println("You picked: Demo Mode");
            demo();
        }
        case "quit" -> {
            System.out.println("You picked: Quit Application");
            System.exit(0);
        }
        default ->
                System.out.println("Invalid Input, try again.");
    }
       return false;
}

    /**
     *  Add a new product to the Stock List
     */
    private void addProduct()
    {
        int productId = reader.getInt("Enter Product ID to Create: ");
        String productName = reader.getString("Enter Product Name to Create: ");
        Product product = new Product(productId, productName);
        stock.addProduct(product);
        System.out.println("Product " + product.getID() + ": " + product.getName() + " has been added.");
    }

    /**
     *  Remove a Product from the Stock List
     */
    private void removeProduct()
    {
        int productId = reader.getInt("Enter ID to remove: ");
        stock.removeProduct(productId);
        System.out.println("Product " + productId + " has been removed.");

    }

    /**
     *  Buy a Product
     */
    private void buyProduct()
    {
        int productId = reader.getInt("Enter ID to Buy: ");
        int productQuantity = reader.getInt("Enter Quantity: ");
        stock.buyProduct(productId, productQuantity);
        System.out.println("Product " + productId + " has been bought in a quantity of  " + productQuantity);
    }

    /**
     *  Sell a Product
     */
    private void sellProduct()
    {
        int productId = reader.getInt("Enter ID to Sell: ");
        int productQuantity = reader.getInt("Enter Quantity: ");
        stock.sellProduct(productId, productQuantity);
        System.out.println("Product " + productId + " has been sold in a quantity of " + productQuantity);
    }

    /**
     *  Search for Products
     */
    private void searchProduct()
    {
        String phrase = reader.getString("Enter name or phrase related to item: ");
        stock.searchProduct(phrase);
        System.out.println("Results for " + phrase + " :");
    }

    /**
     *  Show a list of products where the stock is low
     */
    private void checkLowStock()
    {
        stock.printLowStock();
    }

    /**
     *  Automatically restocks products
     */
    private void restock()
    {
        stock.restock();
    }

    /**
     *  Print a list of all Products
     */
    private void printStock()
    {
        stock.printAllStock();
    }

    /**
     *  Add 10 Products for testing
     */
    private void demo()
    {
        stock.addProduct(new Product(101, "Playstation 4"));
        stock.addProduct(new Product(102, "Playstation 5"));
        stock.addProduct(new Product(103, "Logitech Gaming Mouse"));
        stock.addProduct(new Product(104, "iPhone 12"));
        stock.addProduct(new Product(105, "iPhone 13"));
        stock.addProduct(new Product(106, "iPhone 13 Pro Max"));
        stock.addProduct(new Product(107, "Apple Lightning Cable"));
        stock.addProduct(new Product(108, "Google Pixel 6"));
        stock.addProduct(new Product(109, "Samsung Galaxy S22 Ultra"));
        stock.addProduct(new Product(110, "Samsung Galaxy ZFold"));
    }

    /**
     * Print out an option menu
     */
    private void printMenuOptions()
    {
        System.out.println();
        System.out.println("    Add:      Add a new product");
        System.out.println("    Remove:   Remove a product");
        System.out.println("    Buy:      Buy Products");
        System.out.println("    Sell:     Sell Products");
        System.out.println("    Search:   Search for a Product");
        System.out.println("    Stock:    Check For Low Stock");
        System.out.println("    Restock:  Auto Restock all Low Stock Products");
        System.out.println("    Print:    Print Products");
        System.out.println("    Demo:     Bulk Create 10 Products");
        System.out.println("    Quit:     Quit Program");
        System.out.println();
    }

    /**
     * Print the title of the program
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application   ");
        System.out.println("      by Rahaat Hussain");
        System.out.println("********************************");
    }
}

