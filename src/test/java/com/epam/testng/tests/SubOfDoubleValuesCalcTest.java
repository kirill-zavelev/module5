package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubOfDoubleValuesCalcTest extends BaseTest {

    @Test(dataProvider = "SubOfTwoDoubleValues", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void subOfTwoDoubleValues(double a, double b, double expectedResult) {
        double actualResult = calculator.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
