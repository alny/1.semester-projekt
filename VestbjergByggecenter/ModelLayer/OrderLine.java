package ModelLayer;
import java.util.*;
public abstract class OrderLine
{
    // instance variables
    private int amount;
    private double totalPrice;
    private double unitPrice;
    private String name;
    public OrderLine(int amount)
    {
        // initialise instance variables
        this.amount = amount;
        
    }
    
    /**
     * getter og setter metoder
     */
    public void setAmount(int newAmount){
        amount = newAmount;
    }
    
    public void setPrice(double price){
        totalPrice = price;
    }
    
    public void setUnitPrice(double price){
        unitPrice = price;
    }
    
    public double getUnitPrice(){
        return unitPrice;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public double getPrice(){
        return totalPrice;
    }
    
    public String getName(){
        return name;
    }
    
    
}
