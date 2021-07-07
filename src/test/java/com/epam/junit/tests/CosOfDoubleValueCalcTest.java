package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class CosOfDoubleValueCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForCosOfDoubleValue")
    public void cosOfDoubleValue(Double a, Double expectedResult) {
        double actualResult = calculator.cos(a);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
