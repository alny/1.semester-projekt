package UILayer;
import ControllerLayer.*;
import java.util.Scanner;

public class ProductMenu {
    
    private ProductController productCtr;
    private MainMenuUI mainMenuUI;
    
    public ProductMenu(){
        productCtr = new ProductController();
    }
    
    public void ProductMainMenu(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\f##### Produkt Menu #####");
        System.out.println("Indtast et tal mellem 1-4 for at vælge menu");
        System.out.println(" 1. Opret Produkt");
        System.out.println(" 2. Find Produkt");
        System.out.println(" 3.");
        System.out.println(" 4.");
        System.out.println(" 5. Go Back");
        
        int choice = keyboard.nextInt();
          if(choice == 1){
                createMassProduct();
              
             } else if(choice == 2) {
                 
             } else if(choice == 3) {
                
             } else if(choice == 4) {
                
             } else if(choice == 5) {
                MainMenuUI mainMenuUI = new MainMenuUI();
                mainMenuUI.entryMenu(); 
             }
    
    }
    
    public void createMassProduct(){
        Scanner keyboard =  new Scanner(System.in);
        
        System.out.println("Produkt barkode:" );
        int barcode = keyboard.nextInt();
        System.out.println("Produkt navn:" );
        String name = keyboard.next();
        System.out.println("Produkt description:" );
        String description = keyboard.next();
        System.out.println("Produkt pris:" );
        int price = keyboard.nextInt();
        System.out.println("Produkt antal:" );
        int amount = keyboard.nextInt();
                
        System.out.println("### " + productCtr.createMassProduct(barcode, name, description, price, amount) + " ###");
        
        String vent = keyboard.next();
        System.out.println(" ");
        
    
    }

}
