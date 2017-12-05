package ModelLayer;


/**
 * Write a description of class SimpleLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleLine extends OrderLine
{
    private Product product;

    /**
     * Constructor for objects of class SimpleLine
     */
    public SimpleLine(int amount, Product product)
    {
        super(amount);
        this.product = product;
    }

    
}
