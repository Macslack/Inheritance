import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Callum", "abc12345", 100);
    }

    @Test
    public void canGetNAme() {
        assertEquals("Callum", databaseAdmin.getName());
    }

    @Test
    public void canGetNi() {
        assertEquals("abc12345", databaseAdmin.getNi());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(10.00);
        assertEquals(110.00, databaseAdmin.getSalary(),0.1);
    }
    @Test
    public void canPayBonus() {
        assertEquals(1, databaseAdmin.payBonus());

    }
}
