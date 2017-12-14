package ModelLayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public abstract class Account
{
    //Instance variables for class Account
    private int accountId;
    private static int counter = 1000;
    private String name;
    private String address;
    private String zip;
    private String city;
    private String phone;
    private HashMap<Integer, Order> order;
    private HashMap<Integer, Loan> loans;
    private double discount;

    //initialise constructor for Account class
    public Account (String name, String address, 
    String zip, String city, String phone){
        // initialise instance variables
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.phone = phone;
        accountId = counter++;
        order = new HashMap<Integer, Order>();
        loans = new HashMap<Integer, Loan>();
        discount = 1;
    }

    //set methods
    public void setName(String newName){
        name = newName;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public void setZip(String newZip){
        zip = newZip;
    }

    public void setCity(String newCity){
        city = newCity;
    }

    public void setPhone(String newPhone){
        phone = newPhone;
    }

    //get methods
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getZip(){
        return zip;
    }

    public String getCity(){
        return city;
    }

    public String getPhone(){
        return phone;
    }

    public int getAccId(){
        return accountId;
    }

    public void addOrder(Order order){
        this.order.put(order.getId(), order);
    }

    public void addLoan(Loan loan){
        loans.put(loan.getId(), loan);
    }

    public HashMap getorders(){
        return order;    
    }

    /**
     * tjekker tilgodehavende, på en kunde der bliver fundet i containeren,
     * ved at trække kundens keyset ud og køre igennem
     * en kundes hashmap og finder ud af hvor meget de skylder. 
     */
    public double customerReceivable(){
        HashMap<Integer, Order> map = order;
        double amount = 0;
        for(Map.Entry<Integer,Order> entry : map.entrySet()){
            int key = entry.getKey();
            Order order = entry.getValue();
            if(order.getbetalt()==false){
                amount = amount + order.getTotalPrice();
                //System.out.println(order.getTotalPrice());
            }
        }
        return amount;
    }

    public abstract double getDiscount();
    
    public abstract void setDiscount(double s);

}
