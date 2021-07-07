package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class MultOfDoubleValuesCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForMultOfDoubleValues")
    public void multOfDoubleValues(Double a, Double b, Double expectedResult) {
        double actualResult = calculator.mult(a, b);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
