package com.epam.testng.tests;

import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubOfDoubleValuesCalcTest extends BaseTest {

    @Test(dataProvider = "SubOfTwoDoubleValues", dataProviderClass = BaseDataProvider.class, groups = {"doubleValues"})
    public void subOfTwoDoubleValues(double a, double b, double expectedResult) {
        double actualResult = calculator.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
