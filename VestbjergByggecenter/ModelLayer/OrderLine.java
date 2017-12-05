package ModelLayer;
import java.util.*;
public abstract class OrderLine
{
    // instance variables
    private int amount;
       
   
    public OrderLine(int amount)
    {
        // initialise instance variables
        this.amount = amount;
        
    }
    
    public void setAmount(int newAmount){
        amount = newAmount;
    }
    
    public int getAmount(){
        return amount;
    }
}
