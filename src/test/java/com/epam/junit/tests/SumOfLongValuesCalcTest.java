package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class SumOfLongValuesCalcTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForSumOfLongValues")
    public void sumOfLongValues(Long a, Long b, Long expectedResult) {
        Long actualResult = calculator.sum(a, b);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
