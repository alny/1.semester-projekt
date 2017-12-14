package UILayer;
import ControllerLayer.*;
import java.util.Scanner;
import java.util.LinkedList;

public class OrderMenu
{
    private OrderController orderCtr;
    private MainMenuUI mainMenuUI;
    private ProductController productCtr;
    private Scanner keyboard;
    private double tmpsum=0;

    public OrderMenu()
    {
        orderCtr = new OrderController();
        productCtr = new ProductController();
        keyboard = new Scanner(System.in);
    }

    public void OrderMainMenu(){
        int choice = 0;
        while(choice != 5){
            System.out.println("\f##### Produkt Menu #####");
            System.out.println("Indtast et tal mellem 1-4 for at vælge menu");
            System.out.println("Tast 5 for at gå tilbage");
            System.out.println(" 1. Salg m. kunde");
            System.out.println(" 2. Salg u. kunde");
            System.out.println(" 3. Print faktura");
            System.out.println(" 4. Print følgeseddel");
            System.out.println(" 5. Gå Tilbage");
            choice = keyboard.nextInt();
            if(choice == 1){
                custSale();
            } 
            else if(choice == 2) {
                noCustSale();
            }
            else if(choice == 3) {
                printInvoice();
            } 
            else if(choice == 4) {
                printDeliveryNote();
            }
            else if(choice == 5) {

            }
        }

    }

    public void custSale(){
        System.out.println("Skal varen leveres?");
        System.out.println("tast 1 for afhentning");
        System.out.println("tast 2 for levering");
        int levering = keyboard.nextInt();
        String address = "";
        tmpsum=0;
        boolean delivery;
        if(levering == 1){
            delivery = false;
        }
        else{
            delivery = true; 
            System.out.println("Angiv leverings adresse");
            address = keyboard.nextLine();
            keyboard.nextLine();
        }
        System.out.println("Angiv kunde telefon nr.");
        String phone = keyboard.next();
        int id = orderCtr.createOrder(delivery, address, phone);       
        boolean done = false;
        while(done == false){
            System.out.println("Scan eller tilføj vare");
            System.out.println("tast 5 for at stoppe indtastninger af varer");
            int barcode = keyboard.nextInt();

            if(barcode==5){
                done = true;
                endSale(phone,id);
            }
            else if(productCtr.isUnique(barcode)==true){
                createUniqueSale(id,barcode);
            }
            else{
                createSimpleSale(id,barcode);
            }
        }
    }

    public void createSimpleSale(int id, int barcode){
        System.out.println("Angiv antal");
        int amount = keyboard.nextInt();
        orderCtr.addProduct(id,barcode,amount);
        tmpsum = tmpsum+(productCtr.getPrice(barcode)*amount);
        System.out.println("Subtotal: "+tmpsum);
    }

    public void createUniqueSale(int id, int barcode){
        System.out.println("Angiv serie nr.");
        int serial = keyboard.nextInt();
        orderCtr.addItem(id,barcode,serial);
        tmpsum = tmpsum+productCtr.getPrice(barcode);
        System.out.println("Sub total: "+tmpsum);
        String vent = keyboard.next();
        System.out.println(" ");
    }

    public void endSale(String phone,int id){
        System.out.println("Total = " + tmpsum);
        System.out.println("1. for at give rabat");
        System.out.println("2. for at forsætte med normal pris");
        int givrabat= keyboard.nextInt();
        double discount = 0;
        if(givrabat==1){
            System.out.println("angiv rabat i &");
            discount = keyboard.nextDouble();

        }
        double rabat = orderCtr.getDicount(discount, phone, id);
        if(rabat<1){
            System.out.println("Total pris efter straksrabat, kontorabat og mængderabat  = " +(tmpsum*rabat));
        }
        else{
            System.out.println("Total pris = "+tmpsum);    
        }
        System.out.println("ja/nej for at bekræfte eller annullere");
        String bekræft = keyboard.next();
        if(bekræft.equals("nej")){
            orderCtr.removeOrder(id);
            System.out.println("Ordrer anulleret");
            String vent = keyboard.next();
        }
        else{
            System.out.println("Order oprettet");
            String vent = keyboard.next();
        }
    }

    public void noCustSale(){
        tmpsum=0;
        int id = orderCtr.createOrder();      
        boolean done = false;
        while(done == false){
            System.out.println("Scan eller tilføj vare");
            System.out.println("Tast 5 for at stoppe indtastninger af varer");
            int barcode = keyboard.nextInt();
            if(barcode==5){
                done = true;
                System.out.println("Total = " + tmpsum);
                System.out.println("ja/nej for at bekræfte eller annullere");
                String confirm = keyboard.next();

                if(confirm.equals("nej")){
                    orderCtr.removeOrder(id);
                    System.out.println("Ordrer anulleret");
                    String vent = keyboard.next();

                }else{
                    System.out.println("Order oprettet");
                    String vent = keyboard.next();
                }
            }

            else if(productCtr.isUnique(barcode)==true){
                createUniqueSale(id,barcode);
            }
            else{
                createSimpleSale(id,barcode);
            }

        }
    }

    public void printInvoice(){
        System.out.println("Angiv ordrenr.");
        int id = keyboard.nextInt();
        System.out.println("### Vestbjerg byggecenter ###");
        System.out.println("Faktura");
        System.out.println("Fakturanr.: " + orderCtr.findOrder(id).getId()+"              "+"Dato:"+ orderCtr.findOrder(id).getDate());
        for(String string : orderCtr.invoiceLineList(id)){
            System.out.println(string);
        }
        System.out.println("Total = " + orderCtr.getFakturaTotalPrice(id));
        System.out.println("Tak fordi du handlede ved Vestbjerg byggecenter"); 
        String vent = keyboard.next();

    }

    public void printDeliveryNote(){
        System.out.println ("Angiv ordrenr.");
        int id = keyboard.nextInt();
        System.out.println("### Vestbjerg byggecenter ###");
        System.out.println("Følgeseddel");
        System.out.println("Fakturanr.: " + orderCtr.findOrder(id).getId());
        System.out.println("Leveringsadresse: " + orderCtr.findOrder(id).getAdress());
        System.out.println("Vareliste:");
        for(String string : orderCtr.invoiceLineList(id)){
            System.out.println(string);
        }
        System.out.println("Tak fordi du handlede ved Vestbjerg byggecenter"); 
        String vent = keyboard.next();
    }

    public void createDummy(){
        orderCtr.createdummydata();    
    }
}

