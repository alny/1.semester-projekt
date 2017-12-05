package ControllerLayer;
import ModelLayer.OrderContainer;
import ModelLayer.Order;

public class OrderController
{
    private OrderContainer orderContainer;
    private ProductController productController;
    private AccountController accountController;

    /**
     * Konstruktør for objekter af klassen OrderController
     */
    public OrderController(){
        orderContainer = OrderContainer.getInstance();
        productController = new ProductController();
        accountController = new AccountController();

       
    }

    public int createOrder(boolean delivery, String address){
        Order order = new Order(delivery, address);
        orderContainer.addOrder(order);
        return order.getId();
    }
    public int createOrder(boolean delivery, String address, String phone){
        Order order = new Order(delivery, address);
        orderContainer.addOrder(order);
        accountController.addOrder(phone, order);
        return order.getId();
    }
    
    public Order findOrder(int id){
        return orderContainer.getOrder(id);
    }
}
