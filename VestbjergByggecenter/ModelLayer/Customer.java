package ModelLayer;

public class Customer extends Account
{
    // instance variables
    private String type;
    
    //constructor for Customer class
    public Customer(String name, String address, 
    String zip, String city, String phone, String type)
    {
        // initialise instance variables
        super(name,address,zip,city,phone);
        this.type = type;
        
    }
    
    //set method
    public void setType(String newType){
        newType = type;
    }

    //get method
    public String getType(){
        return type;
    }
}
