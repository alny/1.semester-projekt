package ControllerLayer;
import ModelLayer.AccountContainer;
import ModelLayer.Account;
import ModelLayer.Customer;
import ModelLayer.Order;
import ModelLayer.Loan;
/**
 * Lav en beskrivelse af klassen CustomerController her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class AccountController
{
    private AccountContainer accountContainer;

    /**
     * Konstruktør for objekter af klassen CustomerController
     */
    public AccountController(){
        accountContainer = AccountContainer.getInstance();

    }
    public String updatePhone(String phone, String newPhone){
        return accountContainer.updatePhone(phone, newPhone);
    }

    public String updateAddress(String phone, String newAddress){
        return accountContainer.updateaddress(phone, newAddress);
    }

    public String createAccount(String name, String address, 
    String zip, String city, String phone, String type){
        Account customer = new Customer(name,address,zip,city,phone,type);
        accountContainer.addAccount(customer);
        return "Succes: konto oprettet";
    }

    public Account findCustomer(String phone){
        return accountContainer.findAccount(phone);
    }

    public void addOrder(String phone, Order order){
        accountContainer.addOrder(phone,order);

    }

    public void AddLoan(String phone, Loan loan){
        accountContainer.addLoan(phone, loan);
    }

    public double getReceivable(String phone){
        return accountContainer.customerReceivable(phone);    
    }

    public void createdummydata(){
        Integer i = 1;
        int index = 0;
        String k = "1";

        while(index<10){

            createAccount("Lars", "address", 
                "zip", "city", k, "type");  
            i++;
            k = i.toString();
            index++;
        }    
    }
}