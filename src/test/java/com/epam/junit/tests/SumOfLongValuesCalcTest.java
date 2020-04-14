package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SumOfLongValuesCalcTest extends BaseTest {

    public SumOfLongValuesCalcTest(double firstNumber, double secondNumber, double expectedResult) {
        super(firstNumber, secondNumber, expectedResult);
    }

    @Parameterized.Parameters
    public static List<Object[]> dataForSumOfLongValues() {
        return Arrays.asList(new Object[][] {
                {30L, 60L, 90L},
                {-5L, -6L, -11L}
        });
    }

    @Test
    public void SumOfLongValues() {
        double actualResult = calculator.sum(super.firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
