package ModelLayer;


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
}
