package ModelLayer;
import java.util.*;

public class Order{
    // instance variables
    private int orderId;
    private static int counter = 1000;
    private String date;
    private double totalPrice;
    private String delivery;
    private List<OrderLine> orderLine;
    
    //initialise contructor for class Order
    public Order(String date, double totalPrice, String delivery){
        // initialise instance variables
        orderId = counter++;
        this.date = date;
        this.totalPrice = totalPrice;
        this.delivery = delivery;
        orderLine = new LinkedList<>();
    }
    //add orderLine to order
    public void addOrderLine(OrderLine orderLine){
        this.orderLine.add(orderLine);
    }
    //set methods
    public void setDate(String newDate){
        date = newDate;
    }
    
    public void setTotalPrice(double newTotalPrice){
        totalPrice = newTotalPrice;
    }
    
    public void setDelivery(String newDelivery){
        delivery = newDelivery;
    }
    
    //get methods
    public String getDate(){
        return date;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
    
    public String getDelivery(){
        return delivery;
    }
    
}
