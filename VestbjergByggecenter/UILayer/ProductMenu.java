package UILayer;
import ControllerLayer.*;
import java.util.Scanner;

public class ProductMenu {
    
    private ProductController productCtr;
    private MainMenuUI mainMenuUI;
    
    public ProductMenu(){
        ProductController productCtr = new ProductController();
    }
    
    public void ProductMainMenu(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\f##### Produkt Menu #####");
        System.out.println("Indtast et tal mellem 1-4 for at vælge menu");
        System.out.println(" 1");
        System.out.println(" 2");
        System.out.println(" 3");
        System.out.println(" 4");
        System.out.println(" 5. Go Back");
        
        int choice = keyboard.nextInt();
          if(choice == 1){
                MainMenuUI mainMenuUI = new MainMenuUI();
                mainMenuUI.entryMenu();
             } else if(choice == 2) {
                 
             } else if(choice == 3) {
                
             } else if(choice == 4) {
                
             } else if(choice == 5) {
                    
             }
    
    }
    

}
