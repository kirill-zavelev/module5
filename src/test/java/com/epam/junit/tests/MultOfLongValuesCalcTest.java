package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class MultOfLongValuesCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForMultOfLongValues")
    public void multOfLongValues(Long a, Long b, Long expectedResult) {
        double actualResult = calculator.mult(a, b);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
