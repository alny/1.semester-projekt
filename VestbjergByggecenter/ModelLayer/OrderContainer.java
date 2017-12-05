package ModelLayer;
import java.util.ArrayList;

public class OrderContainer {
    // instance variables
    private Order order;
    private ArrayList<Order> orderList;
    public static OrderContainer instance;

    //Initialize constructorr
    private OrderContainer(){
        orderList = new ArrayList();
    }
    
    // Create or return Singleton
    public static OrderContainer getInstance(){
        if(instance == null){
            instance = new OrderContainer();
        }
        return instance;
    }
    
    public void addOrder(Order order){
        orderList.add(order);
    }
    
    public Order getOrder(int id){
        return orderList.get(id);
    }
}
