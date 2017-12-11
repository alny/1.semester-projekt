package ModelLayer;
import java.util.HashMap;

/**
 * Write a description of class LoanContainer here.
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

    public static LoanContainer getInstance(){
        if(instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public void addLoan(Loan loan){
        this.loan.put(loan.getId(),loan);
    }
    
    public void returnLoan(int id){
        findLoan(id).returnItem(id);
    }
    
    public String payLoan(int id){
        findLoan(id).pay();
        return "lån betalt";
    }
    
    public Loan findLoan(int id){
        return loan.get(id);
    }
    
    public void addItem(int id, Item  item){
        findLoan(id).addItem(item);
    }
    
    public Item returnItem(int id){
        return findLoan(id).returnItem(id);
    }
}
