package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class TgOfDoubleValueCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForTgOfDoubleValue")
    public void tgOfDoubleValue(double a, double expectedResult) {
        double actualResult = calculator.tg(a);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
