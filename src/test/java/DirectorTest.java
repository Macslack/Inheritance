import org.junit.Before;
import org.junit.Test;
import staff.mangement.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Callum", "abc12345", 200, "TopLevel", 2000.00);
    }


    @Test
    public void canGetNAme() {
        assertEquals("Callum", director.getName());
    }

    @Test
    public void canGetNi() {
        assertEquals("abc12345", director.getNi());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100, director.getSalary());
    }

    @Test
    public void canGetDepName() {
        assertEquals("Callums Menagerie", director.getDeptname());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10.00);
        assertEquals(110.00, director.getSalary(),0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1, director.payBonus());

    }
}
