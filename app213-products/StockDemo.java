import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * Modified By Rahaat Hussain
 * @version 2.0
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random random;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = new StockList();
        this.random = new Random();
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(11, "PS5"));
        stock.add(new Product(12, "Xbox Series X"));
        stock.add(new Product(13, "iPhone 13"));
        stock.add(new Product(14, "Galaxy Z Fold3"));
        stock.add(new Product(15, "Google Pixel 6"));
        stock.add(new Product(16, "Oculus Quest 2"));
        stock.add(new Product(17, "PlayStation VR"));
        stock.add(new Product(18, "iPad mini"));
        stock.add(new Product(19, "iPad Air"));
        stock.add(new Product(20, "MacBook Pro"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        for (int i = 11; i <= 20; i++)
        {
            stock.buyProduct(i, random.nextInt(1001));
        }
    }

    private void sellProducts()
    {
        for (int i = 11; i <= 20; i++)
        {
            stock.sellProduct(i, random.nextInt(1001));
        }
    }    
}