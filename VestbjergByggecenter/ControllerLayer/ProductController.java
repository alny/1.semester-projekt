package ControllerLayer;
import ModelLayer.ProductContainer;
import ModelLayer.Product;


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

 
}
