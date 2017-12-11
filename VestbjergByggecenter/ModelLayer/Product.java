package ModelLayer;


/**
 * Write a description of class ProductMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Product
{
    
    private int barcode;
    private String name;
    private String description;
    private int price;
    private int amount;
    /**
     * Constructor for objects of class ProductMain
     */
    public Product(int barcode, String name, String description, int price, int amount)
    {
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
    
    public int getPrice(){
        return price;
    }
    
    public void setAmount(int newAmount){
        amount = newAmount;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public abstract <T> T Sale(int i);
    
    public String create(String name, String description, int price, boolean udlevering){
        return name;
    }
        
    
    
}
