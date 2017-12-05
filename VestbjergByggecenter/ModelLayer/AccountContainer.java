package ModelLayer;

import java.util.ArrayList;
public class AccountContainer {

    // Instance variables
    private Account account;
    private ArrayList<Account> accountList;
    public static AccountContainer instance;

    //Initialize constructor
    private AccountContainer(){
        accountList = new ArrayList();
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
        accountList.add(account);
    }

    public Account getAccount(int id){
        return accountList.get(id);
    }

    public Account findAccount(String phone){
        int index=0;
        boolean found = false;
        Account tmp = null;

        while(index<accountList.size()&&!found){

            if(phone==accountList.get(index).getPhone()){
                found = true;
                tmp=accountList.get(index);
            }
            index++;

        }

        return tmp; 
    }

    public String updatePhone(String phone, String newPhone){
        findAccount(phone).setPhone(newPhone);
        return "Telefonnr. opdateret";

    }

    public String updateaddress(String phone, String newAddress){
        findAccount(phone).setAddress(newAddress);
        return "Adresse opdateret";
    }
    
}

