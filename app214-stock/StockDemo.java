import java.util.Random; // Reserved for future expansion. 
/**
 * Demonstrate the StockManager and Product classes. The demonstration becomes properly functional as the StockManager
 * class is completed.
 *
 * @author David J. Barnes and Michael Kölling (1.0)
 * Modified by Rahaat Hussain
 * @version 2.0
 */
public class StockDemo
{
    private StockList stock;

    private Random generatedStock = new Random();

    /**
     * Create a StockManager and populate it with at least 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();


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
}