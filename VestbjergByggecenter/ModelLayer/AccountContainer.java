package ModelLayer;
import java.util.HashMap;
public class AccountContainer {

    // Instance variables
    private Account account;
    private HashMap<String, Account> accountMap;
    public static AccountContainer instance;

    //Initialize constructor
    private AccountContainer(){
        accountMap = new HashMap<String, Account>();
    }

    // Create or return Singleton
    public static AccountContainer getInstance(){
        if(instance == null){
            instance = new AccountContainer();
        }
        return instance;
    }

    // Getter and setter methods
    public void addAccount(Account account){
        accountMap.put(account.getPhone(), account);
    }

    public Account findAccount(String phone){
        return accountMap.get(phone);
    }

    public String updatePhone(String phone, String newPhone){
        findAccount(phone).setPhone(newPhone);
        return "Telefonnr. opdateret";

    }

    public String updateaddress(String phone, String newAddress){
        findAccount(phone).setAddress(newAddress);
        return "Adresse opdateret";
    }
    
    public void addOrder(String phone,Order order){
        findAccount(phone).addOrder(order);
    }
}

