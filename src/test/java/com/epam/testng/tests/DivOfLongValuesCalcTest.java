package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "DivOfTwoLongValues", dataProviderClass = BaseDataProvider.class, groups = {"longValues"})
    public void divOfTwoLongValues(long a, long b) {
        String expectedResult = "Attempt to divide by zero";

        try {
            calculator.div(a, b);
        } catch (NumberFormatException nfe) {
            String actualResult = nfe.getMessage();
            Assert.assertEquals(actualResult, expectedResult);
        }
    }
}
