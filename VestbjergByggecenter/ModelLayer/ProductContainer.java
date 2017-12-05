package ModelLayer; 

import java.util.ArrayList;
public class ProductContainer
{
    // instance variables
    private ArrayList<Product> productList;
    public static ProductContainer instance;
    //Initialize constructor
    private ProductContainer(){
        productList = new ArrayList(); 
    }
    
    // Create or return Singleton
    public static ProductContainer getInstance(){
        if(instance == null){
            instance = new ProductContainer(); 
        }
        return instance;
    }
    
    public void addProduct(Product product){
        productList.add(product);
    }
    
    
    public Product findProduct(int barcode){
        return productList.get(barcode); 
    }
}
