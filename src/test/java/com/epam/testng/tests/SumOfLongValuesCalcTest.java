package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "SumOfTwoLongValues", dataProviderClass = BaseDataProvider.class, groups = {"longValues"})
    public void sumOfTwoLongValues(long a, long b, long expectedResult) {
        long actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
