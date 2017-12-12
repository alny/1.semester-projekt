package ModelLayer;
import java.util.*;
public abstract class OrderLine
{
    // instance variables
    private int amount;
    private double totalPrice;
    private String name;
    public OrderLine(int amount)
    {
        // initialise instance variables
        this.amount = amount;
        
    }
    
    public void setAmount(int newAmount){
        amount = newAmount;
    }
    
    public void setPrice(double price){
        totalPrice = price;
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
