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
    public MassProduct(int barcode, String name, String description, int price, int amount)
    {
        super(barcode, name, description, price, amount);
    }
    
    /**
     * tilføjer en mængde af produkter til amount
     * @param int i
     */
    public void addItem(int i){
        setAmount(getAmount() + i);
    }
    
    /**
     * trækker en mænge af massprodukt og returnerer produktet der er solgt noget af
     * @param int i
     * @return Item
     */
    public MassProduct Sale(int i){
        setAmount(getAmount() -i);
        return this;
    }

    
}
