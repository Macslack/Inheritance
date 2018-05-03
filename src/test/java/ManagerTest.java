import org.junit.Before;
import org.junit.Test;
import staff.mangement.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Callum", "abc12345", 100, "Callums Menagerie");
    }

    @Test
    public void canGetNAme() {
        assertEquals("Callum", manager.getName());
    }

    @Test
    public void canGetNi() {
        assertEquals("abc12345", manager.getNi());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100, manager.getSalary());
    }

    @Test
    public void canGetDepName() {
        assertEquals("Callums Menagerie", manager.getDeptname());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10.00);
        assertEquals(110.00, manager.getSalary(),0.1);
    }

    @Test
    public void canPayBonus() {
       assertEquals(1, manager.payBonus());

    }
}
