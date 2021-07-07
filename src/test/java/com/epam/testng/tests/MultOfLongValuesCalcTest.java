package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "multOfTwoLongValues", dataProviderClass = BaseDataProvider.class, groups = {"longValues"})
    public void multOfTwoLongValues(long a, long b, long expectedResult) {
        long actualResult = calculator.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
