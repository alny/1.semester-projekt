package UILayer;

import ControllerLayer.LoanController;
import java.util.Scanner;

public class LoanMenu {
    private LoanController loanCtr;
    
    public LoanMenu() {
        loanCtr = new LoanController();       
    }
    
    public void loanMenu(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\f##### Lån Menu #####");
        System.out.println("Indtast et tal mellem 1-3 for at vælge menu");
        System.out.println(" 1. Lån produkt");
        System.out.println(" 2. Find lån");
        System.out.println(" 3. Gå Tilbage");
                
        int choice = keyboard.nextInt();
          if(choice == 1){
                System.out.println("Dummy");
             } else if(choice == 2) {
                System.out.println("Dummy");
             } else if(choice == 3) {
                
             } 
       
    }
    
    
    public void loanProduct(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hvor mange dage vil du låne produktet?");
        int dage = keyboard.nextInt();
        
        // TO-DO: Kald metoden
        System.out.println("### " + loanCtr.createLoan(dage) + " ###");
        
        String vent = keyboard.next();
        System.out.println(" ");
    }
    

}
