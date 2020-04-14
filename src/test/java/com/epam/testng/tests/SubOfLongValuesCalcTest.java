package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "SubOfTwoLongValues", dataProviderClass = BaseDataProvider.class, groups = {"longValues"})
    public void subOfTwoLongValues(long a, long b, long expectedResult) {
        long actualResult = calculator.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
