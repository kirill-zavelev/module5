package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class CtgOfDoubleValueCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForCtgOfDoubleValue")
    public void ctgOfDoubleValue(Double a, Double expectedResult) {
        double actualResult = calculator.ctg(a);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
