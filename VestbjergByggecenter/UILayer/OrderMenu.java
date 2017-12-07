package UILayer;
import ControllerLayer.*;
import java.util.Scanner;

public class OrderMenu
{
    private OrderController orderCtr;
    private MainMenuUI mainMenuUI;
    private ProductController productCtr;

    public OrderMenu()
    {
        orderCtr = new OrderController();
        productCtr = new ProductController();
    }

    public void OrderMainMenu(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\f##### Produkt Menu #####");
        System.out.println("Indtast et tal mellem 1-4 for at vælge menu");
        System.out.println(" 1. Salg m. kunde");
        System.out.println(" 2. Salg u. kunde");
        System.out.println(" 3. Opret ordre");
        System.out.println(" 4.");
        System.out.println(" 5. Go Back");

        int choice = keyboard.nextInt();
        if(choice == 1){
            custSale();
        } else if(choice == 2) {

        } else if(choice == 3) {

        } else if(choice == 4) {

        } else if(choice == 5) {
            
        }

    }

    public void custSale(){
        boolean delivery;
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Skal varen leveres?");
        System.out.println("tast 1 for afhentning");
        System.out.println("tast 2 for levering");
        int levering = keyboard.nextInt();
        String address = "";
        if(levering == 1){
            delivery = false;
        }else{
            delivery = true; 
            System.out.println("angiv leverings adresse");
            address = keyboard.next();
        }
        System.out.println("Angiv kunde telefon nr.");
        String phone = keyboard.next();

        int id = orderCtr.createOrder(delivery, address, phone);       
        boolean done = false;
        while(done == false){
            System.out.println("Scan eller tilføj vare");
            System.out.println("tast 5 for at stoppe indtastninger af varer");
            int barcode = keyboard.nextInt();
            System.out.println(barcode);
              
            
                if(barcode==5){
                done = true;    
                }
            else if(productCtr.isUnique(barcode)==true){
                System.out.println("Angiv serie nr.");
                int serial = keyboard.nextInt();
                orderCtr.addItem(id,barcode,serial);   
            }else{
            System.out.println("angiv antal");
            int amount = keyboard.nextInt();
                orderCtr.addProduct(id,barcode,amount);    
                
            }

           

        }
    }
    
    public void noCustSale(){
    }
    public void createOrder(){
        Scanner keyboard =  new Scanner(System.in);

    
    }

}
