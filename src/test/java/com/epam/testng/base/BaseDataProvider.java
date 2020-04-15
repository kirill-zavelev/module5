package com.epam.testng.base;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.DataProvider;

public class BaseDataProvider {

    @DataProvider(name = "subOfTwoLongValues")
    public Object[][] dataForSubOfTwoLongValues() {
        return new Object[][] {
                {10L, 15L, -5L}
        };
    }

    @DataProvider(name = "subOfTwoDoubleValues")
    public Object[][] dataForSubOfTwoDoubleValues() {
        return new Object[][] {
                {10.0458, 15.72993, -5.68413}
        };
    }

    @DataProvider(name = "sumOfTwoDoubleValues")
    public Object[][] dataForSumOfTwoDoubleValues() {
        return new Object[][] {
                {5.50, 6.50, 12.0}
        };
    }

    @DataProvider(name = "sumOfTwoLongValues")
    public Object[][] dataForSumOfTwoLongValues() {
        return new Object[][] {
                {10L, 15L, 25L}
        };
    }

    @DataProvider(name = "multOfTwoLongValues")
    public Object[][] dataForMultOfTwoLongValues() {
        return new Object[][] {
                {10L, 15L, 150L}
        };
    }

    @DataProvider(name = "multOfTwoDoubleValues")
    public Object[][] dataForMultOfTwoDoubleValues() {
        return new Object[][] {
                {5.846, 6.50, 37.0}
        };
    }

    @DataProvider(name = "divOfTwoLongValues")
    public Object[][] dataForDivOfTwoLongValues() {
        return new Object[][] {
                new Object[]{4L, 0}
        };
    }

    @DataProvider(name = "divOfTwoDoubleValues")
    public Object[][] dataForDivOfTwoDoubleValues() {
        return new Object[][] {
                {1.5, 3.0, 0.5}
        };
    }

    @DataProvider(name = "powOfTwoDoubleValues")
    public Object[][] dataForPowOfTwoDoubleValues() {
        return new Object[][] {
                {1.5, 3.1, 3.375},
                {-1.5, 3.1, -3.375}
        };
    }

    @DataProvider(name = "sqrtOfDoubleValue")
    public Object[][] dataForSqrtOfDoubleValue() {
        return new Object[][] {
                {16.4, 4.049691346263317}
        };
    }

    @DataProvider(name = "cosOfDoubleValue")
    public Object[][] dataForCosOfDoubleValue() {
        return new Object[][] {
                {360.0, -0.283691091486527}
        };
    }

    @DataProvider(name = "sinOfDoubleValue")
    public Object[][] dataForSinOfDoubleValue() {
        return new Object[][] {
                {360.0, 0.9589157234143065}
        };
    }

    @DataProvider(name = "ctgOfDoubleValue")
    public Object[][] dataForCtgOfDoubleValue() {
        return new Object[][] {
                {3.5, 1.00182542851}
        };
    }

    @DataProvider(name = "tgOfDoubleValue")
    public Object[][] dataForTgOfDoubleValue() {
        return new Object[][] {
                {360.0, 0.9589157234143065/-0.283691091486527}
        };
    }

    @DataProvider(name = "isPositiveOfLongValue")
    public Object[][] dataForIsPositiveOfLongValue() {
        return new Object[][] {
                {-1L}
        };
    }

    @DataProvider(name = "isNegativeOfLongValue")
    public Object[][] dataForIsNegativeOfLongValue() {
        return new Object[][] {
                {-2L}
        };
    }
}
