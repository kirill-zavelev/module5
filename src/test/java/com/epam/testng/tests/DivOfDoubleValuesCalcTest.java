package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivOfDoubleValuesCalcTest extends BaseTest {

    @Test(dataProvider = "DivOfTwoDoubleValues", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void divOfTwoDoubleValues(double a, double b, double expectedResult) {
        double actualResult = calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
