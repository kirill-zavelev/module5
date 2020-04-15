package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalcTest extends BaseTest {

    @Test(dataProvider = "isNegativeOfLongValue", dataProviderClass = BaseDataProvider.class, groups = {"booleanValues"})
    public void isNegativeOfLongValue(long a) {
        Assert.assertTrue(calculator.isNegative(a));
    }
}
