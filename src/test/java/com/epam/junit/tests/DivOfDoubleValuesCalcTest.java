package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class DivOfDoubleValuesCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForDivOfDoubleValues")
    public void divOfDoubleValues(Double a, Double b, Double expectedResult) {
        double actualResult = calculator.div(a, b);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
