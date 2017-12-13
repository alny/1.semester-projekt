package ModelLayer;

public class Customer extends Account
{
    // instance variables
    private String type;
    private double discount;
    
    //constructor for Customer class
    public Customer(String name, String address, 
    String zip, String city, String phone, String type)
    {
        // initialise instance variables
        super(name,address,zip,city,phone);
        this.type = type;
        discount = 1;
        
    }
    
    //set method
    public void setType(String newType){
        newType = type;
    }

    //get method
    public String getType(){
        return type;
    }
    
        public double getDiscount(){
        return discount;    
    }

    public void setDiscount (double d){
        double a = 0;
        a = 1-(d/100);
        discount = a;    
    }
}
