import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(5, 3), 8);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(10, 4), 6);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(6, 7), 42);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(10, 2), 5.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
