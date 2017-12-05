package ModelLayer;
import java.util.*;
public class UniqueProduct extends Product {
    
    
    private Map<Integer,Item> itemList;
    
    public UniqueProduct(int barcode, String name, String description, int price) {
        super(barcode,name,description,price);
        itemList = new HashMap<Integer,Item>();
    }
    //add item to the itemList
    public void addItem(Item item){
        itemList.put(item.getSerial(),item);
        setAmount(getAmount()+1);
    }
    
    public Item Sale(int id){
        setAmount(getAmount()-1);
        return itemList.remove(id);
    }
    
   


}
