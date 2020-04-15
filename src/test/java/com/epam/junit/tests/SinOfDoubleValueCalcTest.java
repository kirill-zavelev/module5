package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class SinOfDoubleValueCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForSinOfDoubleValue")
    public void sinOfDoubleValue(Double a, Double expectedResult) {
        double actualResult = calculator.sin(a);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
