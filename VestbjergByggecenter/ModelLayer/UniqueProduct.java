package ModelLayer;

import ModelLayer.Item;
import java.util.*;
public class UniqueProduct extends Product {
    
    private Map<Integer,Item> itemMap;
<<<<<<< HEAD
    
=======
    private Item item;
    /**
     * constructor til objekter af class UniqueProduct
     */
>>>>>>> 34b77ec7050ce1e7e7197910c15bf965abf464db
    public UniqueProduct(int barcode, String name, String description, int price, int amount) {
        super(barcode,name,description,price, amount);
        itemMap = new HashMap<Integer,Item>();
    }
    
    
    public void addItem(Item item){
        itemMap.put(item.getSerial(),item);
        setAmount(getAmount()+1);
    }
    
    /**
     * Tager et item objekt og tilføjer det til vores UniqueProduct hashmap
     */
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
