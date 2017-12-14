package UILayer;

import ControllerLayer.LoanController;
import java.util.Scanner;

public class LoanMenu {
    private LoanController loanCtr;
    private Scanner keyboard;
    public LoanMenu() {
        loanCtr = new LoanController();   
        keyboard = new Scanner(System.in);
    }

    public void loanMenu(){
        int choice = 0;
        while(choice != 5){
            System.out.println("\f##### Lån Menu #####");
            System.out.println("Indtast et tal mellem 1-3 for at vælge menu");
            System.out.println(" 1. Lån produkt");
            System.out.println(" 2. return Item lån");
            System.out.println(" 3. Gå Tilbage");
            choice = keyboard.nextInt();
            if(choice == 1){
                createLoan();
            } 
            else if(choice == 2) {
                returnItem();
            } 
            else if(choice == 3) {

            } 
        }

    }

    public void createLoan(){
        System.out.println("Hvor mange dage vil du låne produktet?");
        int day = keyboard.nextInt();
        System.out.println("skriv telefon nummber");
        System.out.println("skriv slut for at afslutte");
        String phone = keyboard.next();
        int id = loanCtr.createLoan(day, phone);
        String s = "";
        while(s != "slut"){
            addItem(id);
            System.out.println(loanCtr.getPrice(id));
        }
        String vent = keyboard.next();
        System.out.println("Loan id er: " + id);
        System.out.println(" ");
    }

    public void addItem(int id){
        System.out.println("skriv varer barcode");
        int bar = keyboard.nextInt();
        System.out.println("skriv varer serial code");
        int serial = keyboard.nextInt();
        loanCtr.addItem(id,bar,serial);
    }

    public void returnItem(){
        System.out.println("Skriv lån id");
        int id = keyboard.nextInt();
        System.out.println("Skriv item barcode");
        int bar = keyboard.nextInt();
        System.out.println("Skriv item serial code");
        int serial = keyboard.nextInt();
        loanCtr.returnItem(id, bar, serial);
    }
}
