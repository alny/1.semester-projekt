package ControllerLayer;
import ModelLayer.OrderContainer;


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
    

}
