package ModelLayer;
import java.util.HashMap;

import java.util.*;
public class AccountContainer {

    // Instance variables
    private HashMap<String, Account> accountMap;
    public static AccountContainer instance;

    //Initialize constructor
    private AccountContainer(){
        accountMap = new HashMap<String, Account>();
    }

    // Create or return Singleton
    /**
     * laver er AccountContainer hvis en ikke eksistere og returnere den
     * @return AccountContainer
     */
    public static AccountContainer getInstance(){
        if(instance == null){
            instance = new AccountContainer();
        }
        return instance;
    }

    /**
     * tilføjer en konto til accounts hashmap 
     * @param Account account
     */ public void addAccount(Account account){
        accountMap.put(account.getPhone(), account);
    }

    /**
     * henter en account på phone og returnerer den
     * @param String phone
     * @return account 
     */
    public Account findAccount(String phone) throws NullPointerException {
        Account findCustomer = accountMap.get(phone);
        if(findCustomer == null){
            throw new NullPointerException("Kunde kan ikke findes.");
        }
        return findCustomer;
    }

    // Getter and setter methods
    public String updatePhone(String phone, String newPhone)  {
        Account a = findAccount(phone);
        accountMap.remove(phone);
        a.setPhone(newPhone);
        addAccount(a);
        return "Telefonnr. opdateret";
    }

    public String updateaddress(String phone, String newAddress){
        findAccount(phone).setAddress(newAddress);
        return "Adresse opdateret";
    }
    
    /**
     * tilføjer en order til en account som hentes på phone 
     * @param String phone og Order order
     */
    public void addOrder(String phone,Order order){
        findAccount(phone).addOrder(order);
    }

    /**
     * tilføjer et lån til en account som hentes på phone 
     * @param Loan loan og String phone 
     */
    public void addLoan(String phone, Loan loan){
        accountMap.get(phone).addLoan(loan);
    }

    public double customerReceivable(String phone){
        return findAccount(phone).customerReceivable();
    }
    
    public double getDiscount(String phone){
      return accountMap.get(phone).getDiscount();    
    }
    
    public void setDiscount(String phone, double s){
      accountMap.get(phone).setDiscount(s);    
    }
}

