package ModelLayer;
import java.util.HashMap;
import java.util.Date;
import java.util.Calendar;

/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private HashMap<Integer, Item> itemMap;
    private int id;
    private static int count = 1000;
    private Date returnDate;
    private int Day;
    private Calendar calendar;
    private int totalPrice;
    private boolean paid = false;
    
    
    /**
     * Constructor for objects of class Loan
     */
    public Loan(int days)
    {
        id = count;
        Day = days;
        calendar = Calendar.getInstance();
        Date date = new Date(calendar.getTimeInMillis());
        int bDate = calendar.get(Calendar.DAY_OF_YEAR);
        int rDate = bDate + days;
        calendar.set(Calendar.DAY_OF_YEAR, rDate);
        returnDate = new Date(calendar.getTimeInMillis());
        itemMap = new HashMap<Integer,Item>();
        
    }
    
    public void addItem(Item item){
        itemMap.put(item.getSerial(), item);
        totalPrice =+ Day * 100;
    }
    
    /**
     * returnerer et item og tjekker om det er afleveret for sent, hvis det 
     * lægger 500 til totalprice.
     */
    public Item returnItem(int Serial){       
        Date date = new Date();
        if(date.after(returnDate)){
            totalPrice += 500;
        }
        return itemMap.remove(Serial);
    }
    
    public int getId(){
        return id;
    }
    
    public void pay(){
        paid = true;
    }
}
