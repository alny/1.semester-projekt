package ModelLayer;
import java.util.LinkedList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Order{
    // instance variables
    private int orderId;
    private static int counter = 1000;
    private String date;
    private double totalPrice;
    private boolean delivery = false;
    private String deliveryAddress;
    private LinkedList<OrderLine> orderLine;
    private boolean betalt;
    private Date dato;
    private String datop;
    
    

    //initialise contructor for class Order
    public Order(boolean delivery, String address){
        // initialise instance variables
        orderId = counter++;
        this.delivery = delivery;
        deliveryAddress = address;
        orderLine = new LinkedList<>();
        betalt=false;
        dato = new Date();
        datop=setDate();

    }
    //add orderLine to order
    public void addOrderUniqueLine(Item item){
        OrderLine oL = new UniqueLine(item);
        orderLine.add(oL);
        totalPrice =+ oL.getPrice();
    }

    public void addOrderSimpleLine(Product product, int amount){
        OrderLine oL = new SimpleLine(amount, product);
        orderLine.add(oL);
        totalPrice =+ oL.getPrice();
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
        return datop;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public boolean getDelivery(){
        return delivery;
    }

    public String getAdress(){
        return deliveryAddress;
    }   

    public int getId(){
        return orderId;
    }

    public boolean getbetalt(){
        return betalt;
    }

    public boolean setbetalt(){
        betalt = true;
        return betalt;
    }

    public String setDate(){
        String date1;
        date1= dato.getDate()+("-")+(dato.getMonth()+1)+("-")+(dato.getYear()+1900);
        return date1;

    }

    public LinkedList getOrderLines(){
        return orderLine; 
    }
    
    /**
     * laver en tom linkedlist og gemmer informationen fra Orderline i vores OrderLineList
     * @return OrderLineList
     */
    public LinkedList<String> getOrderLine(){
        double fakturatotalprice = 0;
        LinkedList<String> orderLineList = new LinkedList<String>();
        for(OrderLine tmp: orderLine){
            orderLineList.add(tmp.getName()+"     "+"antal:"+tmp.getAmount()+"           "+"enheds pris: "+tmp.getUnitPrice()+"  "
            +"Totalpris: "+(tmp.getAmount()*tmp.getUnitPrice()));
            fakturatotalprice = fakturatotalprice + (tmp.getAmount()*tmp.getUnitPrice());

        }
        return orderLineList;
    }

    public int amountOfProduct(){
        int amount = 0;
        for(OrderLine line: orderLine){
            amount = amount + line.getAmount();
        }
        return amount;
    }
    
}

