package com.epam.testng.tests;

import com.epam.testng.base.BaseDataProvider;
import com.epam.testng.base.BaseTest;
import org.testng.annotations.Test;

public class DivOfLongValuesCalcTest extends BaseTest {

    @Test(dataProvider = "DivOfTwoLongValues", dataProviderClass = BaseDataProvider.class, groups = {"longValues"},
            expectedExceptions = {NumberFormatException.class},
            expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divOfTwoLongValues(long a, long b) {
        calculator.div(a, b);
    }
}
