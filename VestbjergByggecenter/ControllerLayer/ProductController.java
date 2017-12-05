package ControllerLayer;
import ModelLayer.ProductContainer;
import ModelLayer.Product;
import ModelLayer.MassProduct;
import ModelLayer.UniqueProduct;
import ModelLayer.Item;

/**
 * Lav en beskrivelse af klassen ProductController her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class ProductController
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private ProductContainer productContainer;
  
    /**
     * Konstruktør for objekter af klassen ProductController
     */
    public ProductController()
    {
        // initialiser instansvariable
        productContainer = ProductContainer.getInstance();
    }
    
    public Product findProduct(int barcode){
        return productContainer.findProduct(barcode);
    }
    
    public String createMassProduct(int barcode, String name, String description, int price, int amount){
        MassProduct newMassProduct = new MassProduct(barcode, name, description, price, amount);
        return "Produkt oprettet";
    }
    
    public String createUniqueProduct(int barcode, String name, String description, int price, int amount){
        Item newItem = new Item(name, description, price);
        UniqueProduct uniqueProduct = new UniqueProduct(barcode, name, description, price, amount);
        uniqueProduct.addItem(newItem);        
        productContainer.addProduct(uniqueProduct);
        return "Produkt oprettet";
    }
    
    public Product findSpecificProduct(int barcode){
        return productContainer.findProduct(barcode);
    }
    
    

 
}
