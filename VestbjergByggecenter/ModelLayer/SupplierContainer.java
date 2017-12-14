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
    /**
     * laver en SupplierContainer hvis der ikke er en og returnerer 
     * den nye eller den ekstisterende 
     */
    public static SupplierContainer getInstance(){
        if(instance == null){
            instance = new SupplierContainer(); 
        }
        return instance;
    }
    
    /**
     * tilføjer en supplier til suppliers hashmap
     * @param Supplier supplier
     */
    public void addSupplier(Supplier supplier){
        supplierMap.put(supplier.getFirmName(), supplier);
    }
    
    public Supplier findSupplier(String firmName){
        return supplierMap.get(firmName);
    }
}
