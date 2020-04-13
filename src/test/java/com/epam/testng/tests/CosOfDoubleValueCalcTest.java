package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosOfDoubleValueCalcTest extends BaseTest {

    @Test(dataProvider = "CosOfDoubleValue", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void cosOfDoubleValue(double a, double expectedResult) {
        double actualResult = calculator.cos(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
