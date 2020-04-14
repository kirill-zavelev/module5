package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgOfDoubleValueCalcTest extends BaseTest {

    @Test(dataProvider = "TgOfDoubleValue", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void tgOfDoubleValue(double a, double expectedResult) {
        double actualResult = calculator.tg(a);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
