package ControllerLayer;
import ModelLayer.LoanContainer;
import ModelLayer.Loan;
/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    private LoanContainer loanCon;
    private ProductController pController;
    private AccountController aC;
    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        loanCon = LoanContainer.getInstance();
        pController = new ProductController();
        aC = new AccountController();
    }

    public String createLoan(int day, String phone){
        Loan loan = new Loan(day);
        loanCon.addLoan(loan);
        aC.AddLoan(phone, loan);
        return loan.toString();
    }
    
    public void AddItem(int id, int bar, int serial){
        loanCon.addItem(id, pController.saleItem(bar, serial));
    }
    
    public String ReturnItem(int id, int bar, int serial){
        pController.returnItem(bar, loanCon.returnItem(id));
        return "item er returneret";
    }
    
    
}
