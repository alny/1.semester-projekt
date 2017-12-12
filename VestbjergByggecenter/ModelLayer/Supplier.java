package ModelLayer;
;

/**
 * Write a description of class Supplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Supplier 
{
    private String firmName;
    private int amountProduct;
    

    public Supplier(String firmName, int amountProduct){
        this.firmName = firmName;
        this.amountProduct = amountProduct;
    }
    
    public String getFirmName(){
        return firmName;
    }
    
    public void addProduct(){
        
    }
}
