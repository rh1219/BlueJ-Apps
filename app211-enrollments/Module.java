
/**
 * This class respresents the course model and contains information 
 * on the module title and code.
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
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  
     * @return code
     */
    public String getCode()
    {
        return this.code;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  
     * @return code
     */
    public String getTitle()
    {
        return this.title;
    }
    
    public int getCredit()
    {
        return this.credit;
    }
    
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
