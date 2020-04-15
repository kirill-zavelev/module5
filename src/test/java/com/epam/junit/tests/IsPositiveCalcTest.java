package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class IsPositiveCalcTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForIsPositiveTest")
    public void isPositiveOfLongValue(Long a, boolean expectedResult) {
        boolean actualResult = calculator.isPositive(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
