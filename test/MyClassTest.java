import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testQuotient() {
        MyClass tester = new MyClass();
        assertEquals("10 / 5 must be 2", 2, tester.quotient(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        MyClass tester = new MyClass();
        tester.quotient(10, 0);
    }
}