package ModelLayer;

import ModelLayer.Item;
import java.util.*;
public class UniqueProduct extends Product {
    
    private Map<Integer,Item> itemMap;
    private Item item;
    
    public UniqueProduct(int barcode, String name, String description, int price, int amount) {
        super(barcode,name,description,price, amount);
        itemMap = new HashMap<Integer,Item>();
    }
    
    //add item to the itemList
    public void addItem(Item item){
        itemMap.put(item.getSerial(),item);
        setAmount(getAmount()+1);
    }
    
    public String create(String name, String description, int price, boolean udlevering){
        Item item = new Item (name, description, price, udlevering);
        addItem(item);
        return item.toString();
    }
    
    public Item Sale(int id){
        setAmount(getAmount()-1);
        return itemMap.remove(id);
        
    }
    
   


}
