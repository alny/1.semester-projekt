package ModelLayer;
import java.util.HashMap;
import java.util.LinkedList;

public class OrderContainer {
    // instance variables

    private HashMap<Integer, Order> orderMap;
    public static OrderContainer instance;

    //Initialize constructorr
    private OrderContainer(){
        orderMap = new HashMap<Integer, Order>();
        
    }
    
    // Create or return Singleton
    public static OrderContainer getInstance(){
        if(instance == null){
            instance = new OrderContainer();
        }
        return instance;
    }
    
    public void addOrder(Order order){
        orderMap.put(order.getId(),order);
    }
    
    public Order getOrder(int id){
        return orderMap.get(id);
    }
    
    public String addProduct(int id,Product product, int amount){
        getOrder(id).addOrderSimpleLine(product, amount);
        return "varer tilføjet";
    }
    
    public String addItem(int id, Item item){
        getOrder(id).addOrderUniqueLine(item);
        return "varer tilføjet";
    }
    
    public void removeOrder(int id){
        orderMap.remove(id);  
        
    }
    
    public void setTotalPrice(int id,double price){
        orderMap.get(id).setTotalPrice(price);
    }
    
    public LinkedList<String> invoiceLinePrint(int id){
        return orderMap.get(id).getOrderLine();    
    }
    
    public double totalPrice(int id){
        return orderMap.get(id).getTotalPrice();    
    }
    
    public int amountOfProduct(int id){
        return orderMap.get(id).amountOfProduct();
    }
}
