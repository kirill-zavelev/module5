package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class PowOfDoubleValuesCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForPowOfDoubleValues")
    public void powOfDoubleValues(Double a, Double b, Double expectedResult) {
        double actualResult = calculator.pow(a, b);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
