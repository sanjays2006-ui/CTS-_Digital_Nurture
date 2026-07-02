import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    Calculator calc = new Calculator();

    @Test
    public void testAssertions() {

        assertEquals(5, calc.add(2, 3));

        assertTrue(5 > 3);

        assertFalse(5 < 3);

        assertNull(null);

        assertNotNull(calc);
    }
}
