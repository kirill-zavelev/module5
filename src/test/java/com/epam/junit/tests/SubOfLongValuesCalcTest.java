package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

public class SubOfLongValuesCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForSubOfLongValues")
    public void subOfLongValues(Long a, Long b, Long expectedResult) {
        double actualResult = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }
}
