package ModelLayer;

public class MassProduct extends Product{
    /**
     * constructor til objekter af class MassProduct
     */
    public MassProduct(int barcode, String name, String description, int price, int amount, int min, int max){
        super(barcode, name, description, price, amount, min, max);
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
