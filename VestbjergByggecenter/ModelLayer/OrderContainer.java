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
        int index=0;
        boolean found = false;
        Order tmp = null;

        while(index<orderList.size()&&!found){

            if(id==orderList.get(index).getId()){
                found = true;
                tmp=orderList.get(index);
            }
            index++;

        }

        return tmp; 
    }
}
