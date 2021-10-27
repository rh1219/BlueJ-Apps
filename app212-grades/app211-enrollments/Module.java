
/**
 * This class respresents the Module and contains information 
 * on the module title, code and credits.
 *
 * @author Rahaat Hussain
 * @version 2 01/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;

    /**
     * Create a Module with code, title and credit. 
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * Return the code of the module.
     */
    public String getCode()
    {
        return this.code;
    }

    /**
     * Return the title of the module.
     */
    public String getTitle()
    {
        return this.title;
    }
    
    /**
     * Return the credits of the module.
     */
    public int getCredit()
    {
        return this.credit;
    }
    
    /**
     * Set the value of the credits.
     */
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
     /**
     * Print the details of the module, the code
     * and credits.
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " 
                            + title + ": " + " Credit " + credit);
        System.out.println();
    }
}
