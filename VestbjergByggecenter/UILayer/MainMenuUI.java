package UILayer;

import ControllerLayer.*;
import java.util.Scanner;

public class MainMenuUI
{
    // Controllers
    private AccountController accountCtr;
    private OrderController orderCtr;
    private ProductController productCtr;
    
    //Sub Menus
    private LoanMenu loanMenu;
    private OrderMenu orderMenu;
    private CustomerMenu customerMenu;
    private ProductMenu productMenu;
    private SupplierMenu supplierMenu;
   
    public MainMenuUI()
    {
        productMenu = new ProductMenu();
        customerMenu = new CustomerMenu();
        orderMenu = new OrderMenu();
        loanMenu = new LoanMenu();
        supplierMenu = new SupplierMenu();
        entryMenu();
                
    }
    
    public void entryMenu(){
        boolean exit = false;
        
        
        while(!exit){
          int choice = chooseMenu();
            
             if(choice == 1){
                 productMenu.ProductMainMenu();
             }
             else if(choice == 2) {
                 orderMenu.OrderMainMenu();
             }
             else if(choice == 3) {
                 loanMenu.loanMenu();
             }
             else if(choice == 4) {
                 customerMenu.CustomerMainMenu();
             }
             else  if(choice ==5){
                 supplierMenu.supplierMenu();
                 
             }   
             else  if(choice ==6){
                 cretadummydata();
             } 
               else  if(choice ==7){
                 exit = true;
                 System.out.println("Ses snart igen");
             } 
        }
    
    }
    
    private int chooseMenu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f##### Velkommen til Vestbjerg Byggecenter #####");
        System.out.println(" - Indtast et tal mellem 1-4 for at vælge menu -");
        System.out.println(" 1. Produkt");
        System.out.println(" 2. Ordre");
        System.out.println(" 3. Lån");
        System.out.println(" 4. Kunde");
        System.out.println(" 5. Leverandør");
        System.out.println(" 6. opret dummy data");
        System.out.println(" 7. afslut");
        
        int choice = keyboard.nextInt();
        return choice;
    
    }
    
    public void cretadummydata(){
    customerMenu.cfretedummy(); 
    productMenu.cretedummy();
    orderMenu.createDummy();    
    
    }
    
}
