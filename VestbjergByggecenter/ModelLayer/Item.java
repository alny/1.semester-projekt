package ModelLayer;

public class Item {

    private String name;
    private String description;
    private double price;
    private int serialNumber;
    private static int count = 1000;
    private boolean pickUpStorage = false;

    public Item(String name, String description, double price, boolean udlevering){
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
