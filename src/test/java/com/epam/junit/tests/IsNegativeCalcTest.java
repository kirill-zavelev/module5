package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class IsNegativeCalcTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForIsNegativeTest")
    public void isNegativeOfLongValue(Long a, boolean expectedResult) {
        boolean actualResult = calculator.isNegative(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
