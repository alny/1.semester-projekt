package ModelLayer;

public class Customer extends Account
{
    // instance variables
    private String type;
    private double rabat;
    
    //constructor for Customer class
    public Customer(String name, String address, 
    String zip, String city, String phone, String type)
    {
        // initialise instance variables
        super(name,address,zip,city,phone);
        this.type = type;
        rabat = 1;
        
    }
    
    //set method
    public void setType(String newType){
        newType = type;
    }

    //get method
    public String getType(){
        return type;
    }
    
        public double getRabet(){
        return rabat;    
    }

    public void setRabat(double s){
        double a = 0;
        a = 1-(s/100);
        rabat = a;    
    }
}
