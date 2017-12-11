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
    
    /**
     * tiføjer et Item til lån
     * @param item 
     */
    public void addItem(Item item){
        itemMap.put(item.getSerial(), item);
        totalPrice =+ Day * 100;
    }

    /**
     * fjerner og returnere et Item fra lån
     * @param serialNumber
     */
    public void returnItem(int Serial){
        itemMap.remove(Serial);
    }
    
    public int getId(){
        return id;
    }
}
