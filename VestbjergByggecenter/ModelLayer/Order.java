package ModelLayer;
import java.util.*;

public class Order{
    // instance variables
    private int orderId;
    private static int counter = 1000;
    private String date;
    private double totalPrice;
    private boolean delivery = false;
    private boolean paid = false;
    private String deliveryAddress;
    private List<OrderLine> orderLine;
    
    //initialise contructor for class Order
    public Order(boolean delivery, String address){
        // initialise instance variables
        orderId = counter++;
        this.delivery = delivery;
        deliveryAddress = address;
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
    
    public void setDelivery(boolean newDelivery){
        delivery = newDelivery;
    }
    
    //get methods
    public String getDate(){
        return date;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
    
    public boolean getDelivery(){
        return delivery;
    }
    
    public int getId(){
        return orderId;
    }
    
}
