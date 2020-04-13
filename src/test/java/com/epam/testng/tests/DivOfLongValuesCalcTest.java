package com.epam.testng.tests;

import com.epam.tat.module4.Calculator;
import com.epam.testng.BaseDataProvider;
import com.epam.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "DivOfTwoLongValues", dataProviderClass = BaseDataProvider.class,
            expectedExceptions = NumberFormatException.class,
            expectedExceptionsMessageRegExp = "Attempt to divide by zero", groups = {"longValues"})
    public void divOfTwoLongValues(long a, long b, long expectedResult) {
        long actualResult = calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println(actualResult);
    }
}
