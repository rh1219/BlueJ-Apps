
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

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(11, "PS5"));
        stock.add(new Product(12, "Xbox Series X"));
        stock.add(new Product(13, "iPhone 13"));
        stock.add(new Product(14, "Galaxy Z Fold3"));
        stock.add(new Product(15, "Google Pixel 6"));
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
        stock.buyProduct(11, 50);
        stock.buyProduct(12, 30);
        stock.buyProduct(13, 70);
        stock.buyProduct(14, 60);
        stock.buyProduct(15, 60);
    }

    private void sellProducts()
    {
        stock.sellProduct(11, 30);
        stock.sellProduct(12, 15);
        stock.sellProduct(13, 20);
        stock.sellProduct(14, 50);
        stock.sellProduct(15, 25);
    }    
}