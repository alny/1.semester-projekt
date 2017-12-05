package ModelLayer;
import java.util.ArrayList;
public class ProductContainer
{
    // instance variables
    private ArrayList<ProductMain> productList;
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
    
    public void addProduct(ProductMain product){
        productList.add(product);
    }
    
    public ProductMain getProduct(int barcode){
        return productList.get(barcode);
    }
    
    public Product findProduct(String barcode){
    return null;    
    }
}
