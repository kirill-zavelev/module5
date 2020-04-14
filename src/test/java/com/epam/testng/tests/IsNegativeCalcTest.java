package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalcTest extends BaseTest {

    @Test(dataProvider = "IsNegativeOfLongValue", dataProviderClass = BaseDataProvider.class, groups = {"boolean"})
    public void isNegativeOfLongValue(long a, boolean expectedResult) {
        boolean actualResult = calculator.isNegative(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
