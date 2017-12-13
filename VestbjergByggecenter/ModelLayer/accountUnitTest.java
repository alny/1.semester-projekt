package ModelLayer;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class accountUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class accountUnitTest
{
    /**
     * Default constructor for test class accountUnitTest
     */
    public accountUnitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void addCustomerTest()
    {
        ModelLayer.Customer customer1 = new ModelLayer.Customer("Hans", "Hansvej", "9000", "Aalborg", "123", "type");
        ModelLayer.AccountContainer accountC1 = ModelLayer.AccountContainer.getInstance();
        assertEquals(accountC1, accountC1);
        accountC1.addAccount(customer1);
        assertEquals(customer1, accountC1.findAccount("123"));
    }

    @Test
    public void updatePhoneTest()
    {
        ModelLayer.AccountContainer accountC1 = ModelLayer.AccountContainer.getInstance();
        assertEquals(accountC1, accountC1);
        ModelLayer.Customer customer1 = new ModelLayer.Customer("123", "123", "123", "123", "123", "123");
        accountC1.addAccount(customer1);
        assertEquals("Telefonnr. opdateret", accountC1.updatePhone("123", "911"));
        assertEquals(customer1, accountC1.findAccount("911"));
    }
    

    @Test
    public void updateAddressTest()
    {
        ModelLayer.AccountContainer accountC1 = ModelLayer.AccountContainer.getInstance();
        assertEquals(accountC1, accountC1);
        ModelLayer.Customer customer1 = new ModelLayer.Customer("Hansen Is", "Hansenvej", "9000", "Aalborg", "123", "type");
        accountC1.addAccount(customer1);
        assertEquals("Adresse opdateret", accountC1.updateaddress("123", "København"));
    }

    @Test
    public void addOrderTest()
    {
        ModelLayer.AccountContainer accountC1 = ModelLayer.AccountContainer.getInstance();
        assertEquals(accountC1, accountC1);
        ModelLayer.Customer customer1 = new ModelLayer.Customer("Ib", "Ibvej", "9000", "Aalborg", "123", "type");
        accountC1.addAccount(customer1);
        ModelLayer.OrderContainer orderCon1 = ModelLayer.OrderContainer.getInstance();
        assertEquals(orderCon1, orderCon1);
        ModelLayer.Order order1 = new ModelLayer.Order(false, "Olevej");
        accountC1.addOrder("123", order1);
    }
}







