package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtOfDoubleValueCalcTest extends BaseTest {

    @Test(dataProvider = "SqrtOfDoubleValue", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void sqrtOfDoubleValue(double a, double expectedResult) {
        double actualResult = calculator.sqrt(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
