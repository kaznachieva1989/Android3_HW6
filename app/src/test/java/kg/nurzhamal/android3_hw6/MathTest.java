package kg.nurzhamal.android3_hw6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    private Math math;

    @Before
    public void setup() {
        math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void addTest() {
        assertEquals(5, math.add(2, 3));
        System.out.println("TEST ADD");
    }

    @Test
    public void minusTest() {
        assertEquals(5, math.minus(8, 3));
        System.out.println("TEST MINUS");
    }
    @Test
    public void multiplyTest() {
        assertEquals(6, math.multiply(2, 3));
        System.out.println("TEST MINUS");
    }
    @Test
    public void divisionTest() {
        assertEquals(2, math.division(6, 3));
        System.out.println("TEST MINUS");
    }

    @After
    public void clear() {
        math = null;
        System.out.println("CLEAR");
    }
}
