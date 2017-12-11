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
    public UniqueLine(Item item)
    {
        super(1);
        this.item = item;
        setPrice(item.getPrice());
    }

    
}
