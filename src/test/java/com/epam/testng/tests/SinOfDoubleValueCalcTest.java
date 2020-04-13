package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinOfDoubleValueCalcTest extends BaseTest {

    @Test(dataProvider = "SinOfDoubleValue", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void sinOfDoubleValue(double a, double expectedResult) {
        double actualResult = calculator.sin(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
