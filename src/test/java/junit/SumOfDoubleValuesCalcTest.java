package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SumOfDoubleValuesCalcTest extends BaseTest {

    public SumOfDoubleValuesCalcTest(double firstNumber, double secondNumber, double expectedResult) {
        super(firstNumber, secondNumber, expectedResult);
    }

    @Parameterized.Parameters
    public static List<Object[]> dataForSumOfDoubleValues() {
        return Arrays.asList(new Object[][] {
                {3.5, 6.5, 10.0},
                {-5.5, 2.5, -3.0}
        });
    }

    @Test
    public void SumOfDoubleValues() {
        double actualResult = calculator.sum(super.firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
