package ModelLayer;

public class SimpleLine extends OrderLine{
    private Product product;
    
    /**
     * Constructor til objekter af class SimpleLine
     */
    public SimpleLine(int amount, Product product){
        super(amount);
        this.product = product;
        setPrice(product.getPrice()*getAmount());
        setUnitPrice(product.getPrice());
    }

    public String getName(){
        return product.getName();
    }
}
