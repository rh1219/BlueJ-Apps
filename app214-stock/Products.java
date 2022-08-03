/**
 *Details of a product sold by a company.
 *
 * @author David J. Barnes and Michael Kölling (1.0)
 * @modified by Rahaat Hussain, version 1.0
 */

public class Product
{
    private int id;
    private String name;
    private int quantity;

    /**
     * Constructors
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;

        quantity = 0;
    }

    /**
     * print ID
     */
    public int getID()
    {
        return id;
    }

    /**
     * print product name
     */
    public String getName()
    {
        return name;
    }

    /**
     * print quantity of stock
     */
    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void increaseQuantity(int amount)
    {
        quantity = quantity + amount;
    }

    public void decreaseQuantity(int amount)
    {
        if(quantity >= amount)
            quantity = quantity - amount;
    }

    /**
     * print ID, name and quantity of stock.
     */
    public String toString()
    {
        return " ID: " + id + " | " +  name + " | Stock Level: " + quantity;
    }


    public void print()
    {
        System.out.println(toString());
    }
}