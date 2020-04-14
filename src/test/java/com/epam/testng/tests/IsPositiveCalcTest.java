package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalcTest extends BaseTest {

    @Test(dataProvider = "IsPositiveOfLongValue", dataProviderClass = BaseDataProvider.class, groups = {"boolean"})
    public void isPositiveOfLongValue(long a, boolean expectedResult) {
        boolean actualResult = calculator.isPositive(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
