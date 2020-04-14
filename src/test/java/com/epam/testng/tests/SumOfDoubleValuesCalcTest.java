package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfDoubleValuesCalcTest extends BaseTest {

    @Test(dataProvider = "SumOfTwoDoubleValues", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void sumOfTwoDoubleValues(double a, double b, double expectedValue) {
        double actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedValue);
    }
}
