package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "SumOfTwoLongValues", dataProviderClass = BaseDataProvider.class, groups = {"longValues"})
    public void sumOfTwoLongValues(long a, long b, long expectedResult) {
        long actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
