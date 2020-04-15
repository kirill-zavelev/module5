package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalcTest extends BaseTest {

    @Test(dataProvider = "isPositiveOfLongValue", dataProviderClass = BaseDataProvider.class, groups = {"booleanValues"})
    public void isPositiveOfLongValue(long a) {
        Assert.assertFalse(calculator.isPositive(a));
    }
}
