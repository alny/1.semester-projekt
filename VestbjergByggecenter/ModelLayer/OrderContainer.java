package ModelLayer;
import java.util.HashMap;
import java.util.LinkedList;

public class OrderContainer{
    private HashMap<Integer, Order> orderMap;
    public static OrderContainer instance;   
    private OrderContainer(){
        orderMap = new HashMap<Integer, Order>();        
    }
    
    /**
     * laver en OrderContainer hvis der ikke er en og returnerer 
     * den nye eller den ekstisterende 
     */
    public static OrderContainer getInstance(){
        if(instance == null){
            instance = new OrderContainer();
        }
        return instance;
    }
    
    /**
     * tilføjer en order til orders hashmap
     * @param Order order
     */ 
    public void addOrder(Order order){
        orderMap.put(order.getId(),order);
    }
    
    public Order getOrder(int id){
        return orderMap.get(id);
    }
    
    
    /**
     * Tilføjer et product til
     */
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
