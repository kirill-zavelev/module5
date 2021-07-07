package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class SqrtOfDoubleValueCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForSqrtOfDoubleValue")
    public void sqrtOfDoubleValue(Double a, Double expectedResult) {
        double actualResult = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
