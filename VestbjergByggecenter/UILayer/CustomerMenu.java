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
    private Scanner keyboard;
    public CustomerMenu()
    {
        accountCtr = new AccountController();
    }

    public void CustomerMainMenu(){
        keyboard = new Scanner(System.in);

        System.out.println("\f##### Kunde Menu #####");
        System.out.println("Indtast et tal mellem 1-2 for at vælge menu");
        System.out.println("Tast 3 for at gå tilbage");
        System.out.println(" 1. Opret Kunde");
        System.out.println(" 2. Opdater Kunde");
        System.out.println(" 3. Tjek Kunde tilgodehavende");
        System.out.println(" 4. Sæt konto rabat");
        System.out.println(" 5. tilbage");

        int choice = keyboard.nextInt();
        if(choice == 1){
            cretaAccount();

        } else if(choice == 2) {
            updateAccount();

        } else if(choice == 3) {
            getReceivable();
        }
        else if(choice == 4) {
            setDiscount();
        }
        else if(choice == 5) {

        }
    }
    public void cretaAccount(){
        
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
        try{
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
        } catch(NullPointerException e){
            System.out.println(e);
            String vent = keyboard.next();
            System.out.println(" ");
        }
    }

    public void getReceivable(){
        System.out.println("angiv kunde telefonnr.");
        String phone = keyboard.next();
        System.out.println("Vores tilgodehanvende ved kunden: "+accountCtr.getReceivable(phone));  
        String vent = keyboard.next();
    }

    public void cfretedummy(){
        accountCtr.createdummydata();    
    }

    public void setDiscount(){

        System.out.println("Angiv telefonnr. på kunde");
        String phone = keyboard.next();
        System.out.println("angiv rabat i &");
        Double rabat = keyboard.nextDouble();
        accountCtr.setDiscount(phone, rabat);

    }
}
