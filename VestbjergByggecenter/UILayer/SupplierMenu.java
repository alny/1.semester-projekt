package UILayer;

import ControllerLayer.SupplierController;
import java.util.Scanner;


/**
 * Write a description of class supplierMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SupplierMenu
{
    // instance variables - replace the example below with your own
    private SupplierController supplierCtr;
    private Scanner keyboard;

    /**
     * Constructor for objects of class supplierMenu
     */
    public SupplierMenu()
    {
        supplierCtr = new SupplierController();   
        keyboard = new Scanner(System.in);
    }

        public void supplierMenu(){
        int choice = 0;
        while(choice != 2){
            System.out.println("\f##### Leverandør Menu #####");
            System.out.println("Indtast et tal mellem 1-2 for at vælge menu");
            System.out.println(" 1. Opret leverandør");
            System.out.println(" 2. Gå tilbage");
            choice = keyboard.nextInt();
            if(choice == 1){
                createSupplier();
            } 
            else if(choice == 2) {
                
            } 
            else if(choice == 3) {

            } 
        }

    }
    
    public void createSupplier(){
    int amountOfOrders = 0;
    System.out.println("Angiv leverandør navn");
    String firmname = keyboard.next();
    supplierCtr.createSupplier(firmname, amountOfOrders);   
    System.out.println("Leverandør oprettet");
    String vent = keyboard.next();
    
  
    }
}
