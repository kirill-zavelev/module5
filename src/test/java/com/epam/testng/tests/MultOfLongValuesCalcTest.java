package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "MultOfTwoLongValues", dataProviderClass = BaseDataProvider.class, groups = {"longValues"})
    public void multOfTwoLongValues(long a, long b, long expectedResult) {
        long actualResult = calculator.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
