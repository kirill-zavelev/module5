package junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    public double firstNumber;
    public double secondNumber;
    public double expectedResult;
    public static double DELTA = 0.000001;

    public BaseTest(double firstNumber, double secondNumber, double expectedResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    protected Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}
