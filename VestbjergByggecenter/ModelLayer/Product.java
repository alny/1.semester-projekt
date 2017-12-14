package ModelLayer;


/**
 * Write a description of class ProductMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Product{
    
    private int barcode;
    private String name;
    private String description;
    private double price;
    private int amount;
    private Supplier supplier;
    /**
     * Constructor for objects of class ProductMain
     */
    public Product(int barcode, String name, String description, int price, int amount){
        this.barcode = barcode;
        this.name = name;
        this.description = description;
        this.price = price;
        this.price = price;
        
    }

    // Getters and setters methods
    public void setBarcode(int newBarcode){
        barcode = newBarcode;
    }
    
    public int getBarcode(){
        return barcode;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setDescription(String newDescription){
        description = newDescription;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setPrice(int newPrice){
        price = newPrice;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setAmount(int newAmount){
        amount = newAmount;
    }
    
    public int getAmount(){
        return amount;
    }
    
    /**
     * se uniqueproduct og massproduct 
     */
    public abstract <T> T Sale(int i);    
    
}
