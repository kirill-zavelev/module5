package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgOfDoubleValueCalcTest extends BaseTest {

    @Test(dataProvider = "ctgOfDoubleValue", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void ctgOfDoubleValue(double a, double expectedResult) {
        double actualResult = calculator.ctg(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
