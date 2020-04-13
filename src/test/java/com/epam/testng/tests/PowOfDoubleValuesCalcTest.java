package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowOfDoubleValuesCalcTest extends BaseTest {

    @Test(dataProvider = "PowOfTwoDoubleValues", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void powOfTwoDoubleValues(double a, double b, double expectedResult) {
        double actualResult = calculator.pow(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
