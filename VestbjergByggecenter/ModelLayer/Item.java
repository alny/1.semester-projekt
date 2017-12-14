package ModelLayer;

public class Item {
    
    private String name;
    private String description;
    private double price;
    private int serialNumber;
    private static int count = 1000;
    private boolean pickUpStorage = false;

<<<<<<< HEAD
    public Item(String name, String description, double price, boolean udlevering){
  
=======
    public Item(String name, String description, int price, boolean udlevering){  
>>>>>>> 34b77ec7050ce1e7e7197910c15bf965abf464db
        this.name = name;
        this.description = description;
        this.price = price;
        serialNumber = count;
        this.pickUpStorage = udlevering;
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

    public double getPrice(){
        return price;
    }
    
    public int getSerial(){
        return serialNumber;
    }

   
}
