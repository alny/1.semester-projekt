package ControllerLayer;
import ModelLayer.LoanContainer;

/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    private LoanContainer loanCon;

    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        loanCon = LoanContainer.getInstance();
    }

    
}
