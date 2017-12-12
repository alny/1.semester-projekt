package ModelLayer;

public class Supplier 
{
    private String firmName;
    private int amountOfSales;
    

    public Supplier(String firmName, int amountOfOrders){
        this.firmName = firmName;
        this.amountOfSales = amountOfSales;
    }
    
    public String getFirmName(){
        return firmName;
    }
    
    public int getAmountOfSales(){
        return amountOfSales;
    }
  
}
