package ModelLayer; 

import java.util.HashMap;
public class ProductContainer
{
    // instance variables
    private HashMap<Integer, Product> productMap;
    public static ProductContainer instance;
    //Initialize constructor
    private ProductContainer(){
        productMap = new HashMap<Integer, Product>(); 
    }
    
    // Create or return Singleton
    public static ProductContainer getInstance(){
        if(instance == null){
            instance = new ProductContainer(); 
        }
        return instance;
    }
    
    public void addProduct(Product product){
        productMap.put(product.getBarcode(), product);
    }
    
    
    public Product findProduct(int barcode){
        return productMap.get(barcode); 
    }
    
    public Boolean isUnique(int barcode){
        boolean type = false;
        if(findProduct(barcode) instanceof UniqueProduct){
            type = true;
        }
        return false;
    }
    
    public String createItem(int barcode,String name, String description, int price, boolean udlevering){
        return findProduct(barcode).create(name, description, price, udlevering);
        
    }
    
    public Item saleItem(int bar, int serial){
        return findProduct(bar).Sale(serial);
    }
    
    public MassProduct saleProduct(int bar, int amount){
        return findProduct(bar).Sale(amount);
    }
    
    
}
