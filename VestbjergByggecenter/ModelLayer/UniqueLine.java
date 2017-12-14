package ModelLayer;

/**
 * Write a description of class UniqueLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniqueLine extends OrderLine{
    private Item item;
    /**
     * constructor til objekter af class UniqueLine
     */
    public UniqueLine(Item item){
        super(1);
        this.item = item;
        setPrice(item.getPrice());
        setUnitPrice(item.getPrice());
    }
    
    public String getName(){
        return item.getName();
    }    
}
