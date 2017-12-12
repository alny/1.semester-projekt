package ModelLayer;
import java.util.HashMap;

public class SupplierContainer{
    // instance variables - replace the example below with your own
    private HashMap<String, Supplier> supplierMap;
    public static SupplierContainer instance;;

    /**
     * Constructor for objects of class SupplierContainer
     */
    private SupplierContainer(){
        // initialise instance variables
        supplierMap = new HashMap<String, Supplier>();
    }

    public void addSupplier(Supplier supplier){
        supplierMap.put(supplier.getFirmName(), supplier);
    }
    
    public Supplier findSupplier(String firmName){
        return supplierMap.get(firmName);
    }
}
