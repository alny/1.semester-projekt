package ModelLayer;

public class Item {
    
    private String name;
    private String description;
    private int price;
    private int serialNumber;
    private static int count = 1000;

    public Item(String name, String description, int price){
  
        this.name = name;
        this.description = description;
        this.price = price;
        serialNumber = count;
        count++;
    }
    
    // Getters and setters methods
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
    
    public int getSerial(){
        return serialNumber;
    }

   
}
