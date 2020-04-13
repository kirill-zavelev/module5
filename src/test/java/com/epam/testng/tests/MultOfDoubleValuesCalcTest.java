package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultOfDoubleValuesCalcTest extends BaseTest {

    @Test(dataProvider = "MultOfTwoDoubleValues", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void multOfTwoDoubleValues(double a, double b, double expectedResult) {
        double actualResult = calculator.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
