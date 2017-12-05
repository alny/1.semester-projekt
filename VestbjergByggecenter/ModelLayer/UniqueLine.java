package ModelLayer;


/**
 * Write a description of class UniqueLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniqueLine extends OrderLine
{
    private Item item;

    /**
     * Constructor for objects of class UniqueLine
     */
    public UniqueLine(int amount, Item item)
    {
        super(amount);
        this.item = item;
    }

    
}
