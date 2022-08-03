import java.util.ArrayList;

/**
 * Manage the stock in a business. The stock is described by zero or more Products.
 *
 * @author Rahaat Hussain
 * @version 1.0
 */

public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise stock manager.
     */

    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Find a product
     */

    public Product findProduct(int productId)
    {
        for(Product product : stock)
        {
            if(product.getID() == productId)
            {
                return product;
            }
        }
        return null;
    }


    /**
     * Add a product to the list.
     */

    public void addProduct(Product item)
    {
        if (findProduct(item.getID()) != null)
        {
            System.out.println("Product already exists under this ID, try again.");
        }

        else
        {
            stock.add(item);
        }
    }

    /**
     * Remove a Product from stock
     */

    public void removeProduct(int productId)
    {
        Product product = findProduct(productId);
        if(product != null)
        {
            stock.remove(product);
        }
        else
        {
            System.out.println("The Product can’t be found, try again.");
        }
    }

    /**
     * Buy a quantity of a specific product
     */

    public void buyProduct(int productId, int productQuantity)
    {
        Product product = findProduct(productId);
        if(product != null)
        {
            if(product.getQuantity() < 500)
            {
                product.increaseQuantity(productQuantity);
                System.out.println("Bought " + productQuantity + " of Product: " + product.getName());
            }
            else if(product.getQuantity() > 500)
            {
                System.out.println("Unable to buy " + productQuantity + " of "
                        + product + " because it exceeds 500");
            }
        }
        else
        {
            System.out.println("Can’t find product");
        }
    }

    /**
     * Sell a quantity of a specific product
     */

    public void sellProduct(int productId, int productQuantity)
    {
        Product product = findProduct(productId);
        if(product != null)
        {
            if(product.getQuantity() > 0 && product.getQuantity() >= productQuantity)
            {
                product.decreaseQuantity(productQuantity);
                System.out.println("Sold " + productQuantity + " of Product: " + product.getName());
            }
            else if(product.getQuantity() < productQuantity)
            {
                System.out.println("Unable to sell " + productQuantity + " of "
                        + product + " because it is more than the stock level of "
                        + product.getQuantity());
            }
            else
            {
                System.out.println("The product: " + product.getName() +
                        " is out of stock");
            }
        }
        else
        {
            System.out.println("Can’t find product");
        }
    }

    /**
     * Search for Product by a phrase
     */

    public void searchProduct (String phrase)
    {
        int count = 0;
        for(Product product : stock)
        {
            if(product.getName().contains(phrase))
            {
                System.out.println(product);
                count += 1;
            }
            else
            {
                System.out.println("Not found");
            }
            System.out.println("The search returned " + count + " items");
        }
    }
    /**
     * Locate a product with the given ID and print stock level
     */

    public int numberInStock(int productId)
    {
        return 0;
    }

    /**
     * Print details of a specified product.
     */

    public void printProduct(int productId)
    {
        Product product = findProduct(productId);
        if(product != null)
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Print out each product in stock
     */

    public void printAllStock()
    {
        printHeading();
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }

    /**
     * Print a list of products where the stock level is low
     */

    public void printLowStock()
    {
        printLowStockHeading();
        for(Product product : stock)
        {
            if(product.getQuantity() <= 5)
            {
                System.out.println(product);
            }
        }
        System.out.println();
    }

    /**
     * Automatically restocks all products where stock level is low
     */

    public void restock()
    {
        for(Product product : stock)
        {
            if(product.getQuantity() <= 5)
            {
                product.setQuantity(6);
                System.out.println("Product " +product.getID() + " : " + product.getName() + " restocked");
            }
        }

        System.out.println();
    }

    /**
     * Print out a Heading for the Stock List
     */

    public void printHeading()
    {
        System.out.println();
        System.out.println(" ======================");
        System.out.println("  Rahaat’s Stock List");
        System.out.println(" ======================");
        System.out.println();


    }
}