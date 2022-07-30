import java.util.ArrayList;

/**
 * Managing stock of a business.
 * @author Rahaat Hussain
 * @version 0.1
 */
public class StockList
{
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     */
    public void add(Product item)
    {
        stock.add(item);
    }

    /**
     * A method to buy a single copy of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }


    /**
     * Buy a quantity of a product.
     * Increase the quantity of the product by the given amount.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        if(product != null)
        {
            if(product.getQuantity() < 1000)
            {
                product.increaseQuantity(amount);
                System.out.println("Bought " + (amount) + " of "  + product.getName());
            }
            else
            {
                System.out.println(product.getName() + "should be sold before buying more");
            }
        }
        else
        {
            System.out.println("The product could not be found");
        }
    }

    /**
     * Find a product to match the product id
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
                return product;
        }

        return null;
    }

    /**
     * Find a product to match the product name
     */
    public Product findName(String productName)
    {
        for(Product product : stock)
        {
            if(product.getName() == productName)
                System.out.println(product);
        }

        return null;
    }

    /**
     * Removes a product
     */
    public void removeProducts(int productID)
    {
        Product product = findProduct(productID);
        stock.remove(product);
    }


    /**
     * Checks the stock based on the productID
     * that is entered.
     */
    public void checkstockProducts(int productID)
    {
        for(Product product : stock)
        {
            if(product.getQuantity() <100)
                System.out.println( "This product " + product + " has less than 100 copies left");
        }
    }


    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }

    /**
     * Sell a number of the given product.
     * Show the before and after status of the product.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);

        if(product != null)
        {
            if(product.getQuantity() > 0 && product.getQuantity() > amount)
            {
                product.decreaseQuantity(amount);
                System.out.println("Sold " + (amount) + " copies of "  + product.getName());
            }
            else if(product.getQuantity() == 0)
            {
                System.out.println(product.getName() + "is out of stock!");
            }
            else
            {
                System.out.println(product.getName() + " cannot be sold because you only have  " + product.getQuantity());
            }
        }
        else
        {
            System.out.println("The product could not be found");
        }
    }


    /**
     * Locate product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * name and stock quantity will be shown.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);

        if(product != null)
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Print out each product in the stock
     * in order
     */
    public void print()
    {
        printHeading();

        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }

    /**
     * Print out the heading
     */
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Rahaat's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}