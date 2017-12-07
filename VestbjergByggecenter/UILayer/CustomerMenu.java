package UILayer;
import ControllerLayer.*;
import java.util.Scanner;

/**
 * Write a description of class AccountMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerMenu
{
    private AccountController accountCtr;
    private MainMenuUI mainMenuUI;
    public CustomerMenu()
    {
        accountCtr = new AccountController();
    }

    public void CustomerMainMenu(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\f##### Kunde Menu #####");
        System.out.println("Indtast et tal mellem 1-4 for at vælge menu");
        System.out.println(" 1");
        System.out.println(" 2");
        System.out.println(" 3");
        System.out.println(" 4");
        System.out.println(" 5. Go Back");
        
        int choice = keyboard.nextInt();
          if(choice == 1){
                
             } else if(choice == 2) {
                 
             } else if(choice == 3) {
                
             } else if(choice == 4) {
                
             } else if(choice == 5) {
             MainMenuUI mainMenuUI = new MainMenuUI();
                mainMenuUI.entryMenu();
                    
             }
    
    }
    
    
}
