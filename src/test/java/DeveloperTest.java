import org.junit.Before;
import org.junit.Test;
import staff.mangement.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {


    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Callum", "abc12345", 100);
    }

    @Test
    public void canGetNAme() {
        assertEquals("Callum", developer.getName());
    }

    @Test
    public void canGetNi() {
        assertEquals("abc12345", developer.getNi());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10.00);
        assertEquals(110.00, developer.getSalary(),0.1);
    }
    @Test
    public void canPayBonus() {
        assertEquals(1, developer.payBonus());

    }
}
