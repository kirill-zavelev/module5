package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class SubOfDoubleValuesCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForSubOfDoubleValues")
    public void subOfDoubleValues(Double a, Double b, Double expectedResult) {
        double actualResult = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
