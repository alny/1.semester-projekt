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
    
    public String createMassProduct(int barcode, String name, String description, int price, int amount){
        MassProduct newMassProduct = new MassProduct(barcode, name, description, price, amount);
        productContainer.addProduct(newMassProduct);
        return "Produkt oprettet";
    }
    
    public String createUniqueProduct(int barcode, String name, String description, int price, int amount){
        UniqueProduct uniqueProduct = new UniqueProduct(barcode, name, description, price, amount);      
        productContainer.addProduct(uniqueProduct);
        return "Produkt oprettet";
    }
    
    public Product findSpecificProduct(int barcode){
        return productContainer.findProduct(barcode);
    }
    
    public Boolean isUnique(int barcode){
        return productContainer.isUnique(barcode);
    }
    
    public String createItem(int bar ,String name, String description, int price, boolean udlevering){
        productContainer.createItem(bar, name, description, price, udlevering);
        return "Kopi oprettet";
    }
    
    public Item saleItem(int bar, int serial){
        return productContainer.saleItem(bar, serial);
    }
    
    public MassProduct saleProduct(int bar,int amount){
        return productContainer.saleProduct(bar, amount);
    } 
    
    public double getPrice(int bar){
        
    return productContainer.getPrice(bar);    
    }
    
    public void returnItem(int bar, int serail){
        productContainer.findProduct(bar).
    }
}
