import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer myCustomer;

    @Before
    public void setUp() throws Exception {
        myCustomer = new Customer(2500.0);
    }

    @Test
    public void getMoney() {
        assertEquals(2500.0, myCustomer.getMoney(), 0.0);
    }

    @Test
    public void getNumberOfOwnedVehicles() {
        assertEquals(0, myCustomer.getNumberOfOwnedVehicles());
    }
}