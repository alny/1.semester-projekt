package ModelLayer;
import java.util.HashMap;

/**
 * Loancontainer står for at holde alle lån, søge igennem dem og lave lån.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    private HashMap<Integer, Loan> loan;
    private static LoanContainer instance;
    /**
     * Constructor for objects of class LoanContainer
     */
    private LoanContainer()
    {
        loan = new HashMap<Integer, Loan>();
    }
    /**
     * laver en LoanContainer hvis der ikke er en og returnerer 
     * den nye eller den ekstisterende 
     */
    public static LoanContainer getInstance(){
        if(instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }
    
    /**
     * tilføjer et lån til containerens hashmap
     * @param Loan loan
     */
    public void addLoan(Loan loan){
        this.loan.put(loan.getId(),loan);
    }
    
    /**
     * returnerer et lån på id 
     * @param id på lånet 
     */
    public void returnLoan(int id){
        findLoan(id).returnItem(id);
    }
    
    /**
     * finder et lån og sætter status til betalt
     * @param id på lån 
     * @return String 
     */
    public String payLoan(int id){
        findLoan(id).pay();
        return "lån betalt";
    }
    
    /**
     * finder et lån på id
     * @param id på loan
     * @return returnerer et lån objekt 
     */
    public Loan findLoan(int id){
        return loan.get(id);
    }
    
    /**
     * tilføjer et item til et lån på låns id og tager et item objekt
     * @param id på lån og et item objekt 
     */
    public void addItem(int id, Item  item){
        findLoan(id).addItem(item);
    }
    
    /**
     * returnere et item og ændrer status på objekt
     * @param id på lån og serienummer på et item
     * @return returnere et item objekt
     */
    public Item returnItem(int id, int serial){
        return findLoan(id).returnItem(serial);
    }
}
