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
        instance = getInstance();
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
}
