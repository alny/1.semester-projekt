package ControllerLayer;
import ModelLayer.SupplierContainer;
import ModelLayer.Supplier;

public class SupplierController{
    // instance variables - replace the example below with your own
    private SupplierContainer supplierCon;
    
  
    public SupplierController(){
        // initialise instance variables
        supplierCon = SupplierContainer.getInstance();
        
    }
    
    /**
     * kalder metoden addSupplier fra modellayer
     * @return String
     */
    public String createSupplier(String firmName, int amountOfOrders){
        Supplier supplier = new Supplier(firmName, amountOfOrders);
        supplierCon.addSupplier(supplier);
        return ("Supplier er oprettet");
    }
}
