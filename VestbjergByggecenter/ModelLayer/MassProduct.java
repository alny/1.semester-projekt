package ModelLayer;


/**
 * Write a description of class MassProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MassProduct extends Product
{
    

    /**
     * Constructor for objects of class MassProduct
     */
    public MassProduct(int barcode, String name, String description, int price)
    {
        super(barcode,name,description,price);
    }
    
    public void addItem(){
        setAmount(getAmount() +1);
    }
    
    public MassProduct Sale(){
        setAmount(getAmount() -1);
        return this;
    }

    
}
