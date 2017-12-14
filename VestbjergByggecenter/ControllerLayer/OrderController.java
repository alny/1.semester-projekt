package ControllerLayer;
import ModelLayer.OrderContainer;
import ModelLayer.Order;
import java.util.LinkedList;

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
    public int createOrder(){
        Order order = new Order(false, null);
        orderContainer.addOrder(order);
        return order.getId();
    }

    public int createOrder(boolean delivery, String address, String phone){
        Order order = new Order(delivery, address);
        orderContainer.addOrder(order);
        accountController.addOrder(phone, order);
        return order.getId();
    }

    public String addItem(int id, int bar, int serial){
        orderContainer.addItem(id, productController.saleItem(bar, serial));
        return "item tilføjet";
    }

    public String addProduct(int id, int bar, int amount){
        orderContainer.addProduct(id, productController.saleProduct(bar, amount), amount);
        return "varer tilføjet";
    }

    public Order findOrder(int id){
        return orderContainer.getOrder(id);
    }

    public void removeOrder(int id){
        orderContainer.removeOrder(id);  
    }

    public LinkedList<String> invoiceLineList(int id){
    return orderContainer.invoiceLinePrint(id);    
    }
    
     public void createdummydata(){
        Integer i = 1;
        int index = 0;
        String k = "1";
        int o = 1000;

        while(index<10){

            createOrder(false,"address", k);  
            addProduct(o,i, 100);
            i++;
            k = i.toString();
            index++;
            o++;
        }    
    }
    
    /**
     * spørg om der skal gives rabat og udregner rabaten der bliver givet og giver en ny totalPrice med rabat.
     * rabaten kan ikke overskride 30%
     * @return totalDiscount
     */
    public double getDicount(double discount, String phone, int id){
        double totalDiscount = 0;
        double temp = (1 - accountController.getDiscount(phone))*100;
        double temp2 = 0;
        String s = "ingen rabat";
        int amount = orderContainer.amountOfProduct(id);
        if(amount < 10){
            temp2 = 10;
        }
        totalDiscount = temp + temp2 + discount;
        if(totalDiscount > 30){
            totalDiscount = 30;
        }
        if(totalDiscount != 1){
            s = "Rabet givet: " + totalDiscount + "%";
        }
        totalDiscount = 1 - totalDiscount/100;
        orderContainer.setTotalPrice(id, orderContainer.totalPrice(id)*totalDiscount);
        
        return totalDiscount;
    }
    
    public double getFakturaTotalPrice(int id){
        return orderContainer.totalPrice(id);    
    }
    
}
