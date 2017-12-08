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
        System.out.println("Indtast et tal mellem 1-2 for at vælge menu");
        System.out.println("Tast 3 for at gå tilbage");
        System.out.println(" 1. Opret Kunde");
        System.out.println(" 2. Opdater Kunde");
        System.out.println(" 3. Go Back");

        int choice = keyboard.nextInt();
        if(choice == 1){
            cretaAccount();

        } else if(choice == 2) {
            updateAccount();

        } else if(choice == 3) {


        }

    }

    public void cretaAccount(){

        Scanner keyboard =  new Scanner(System.in);

        System.out.println("Kunde Navn:" );
        String name = keyboard.next();
        System.out.println("Kunde Adresse:" );
        String address = keyboard.next();
        System.out.println("Kunde Postnr:" );
        String zip = keyboard.next();
        System.out.println("Kunde By:" );
        String city = keyboard.next();
        System.out.println("Kunde telefon:" );
        String phone = keyboard.next();
        System.out.println("Kunde type:" );
        String type = keyboard.next();

        System.out.println("### " +accountCtr.createAccount(name, address, zip, city, phone, type)+" ###");

        String vent = keyboard.next();
        System.out.println(" ");

    }

    public void updateAccount(){
        Scanner keyboard =  new Scanner(System.in);

        System.out.println("Vælg hvilket felt du vil opdatere");
        System.out.println("tast 1. for Telefon");
        System.out.println("tast 2. for Adresse");
        int valg = keyboard.nextInt();
        if(valg==1){
            System.out.println("angiv nuværende telefon nr.");
            String phone = keyboard.next();
            System.out.println("angiv nyt telefon nr.");
            String newPhone = keyboard.next();      

            accountCtr.updatePhone(phone, newPhone);

        }

        if(valg==2){
            System.out.println("angiv telefon nr.");
            String phone = keyboard.next();
            System.out.println("angiv ny adresse");
            String newAddress = keyboard.next();      

            accountCtr.updateAddress(phone, newAddress);

        }

    }
}
