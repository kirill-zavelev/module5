package com.epam.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.DataProvider;

public class BaseDataProvider {

    @DataProvider(name = "SubOfTwoLongValues")
    public Object[][] dataForSubOfTwoLongValues() {
        return new Object[][] {
                {10L, 15L, -5L}
        };
    }

    @DataProvider(name = "SubOfTwoDoubleValues")
    public Object[][] dataForSubOfTwoDoubleValues() {
        return new Object[][] {
                {10.0458, 15.72993, -5.68413}
        };
    }

    @DataProvider(name = "SumOfTwoDoubleValues")
    public Object[][] dataForSumOfTwoDoubleValues() {
        return new Object[][] {
                {5.50, 6.50, 12.0}
        };
    }

    @DataProvider(name = "SumOfTwoLongValues")
    public Object[][] dataForSumOfTwoLongValues() {
        return new Object[][] {
                {10L, 15L, 25L}
        };
    }

    @DataProvider(name = "MultOfTwoLongValues")
    public Object[][] dataForMultOfTwoLongValues() {
        return new Object[][] {
                {10L, 15L, 150L}
        };
    }

    @DataProvider(name = "MultOfTwoDoubleValues")
    public Object[][] dataForMultOfTwoDoubleValues() {
        return new Object[][] {
                {5.846, 6.50, 37.0}
        };
    }

    @DataProvider(name = "DivOfTwoLongValues")
    public Object[][] dataForDivOfTwoLongValues() {
        return new Object[][] {
                new Object[]{4L, 0}
        };
    }

    @DataProvider(name = "DivOfTwoDoubleValues")
    public Object[][] dataForDivOfTwoDoubleValues() {
        return new Object[][] {
                {1.5, 3.0, 0.5}
        };
    }

    @DataProvider(name = "PowOfTwoDoubleValues")
    public Object[][] dataForPowOfTwoDoubleValues() {
        return new Object[][] {
                {1.5, 3.1, 3.375},
                {-1.5, 3.1, -3.375}
        };
    }

    @DataProvider(name = "SqrtOfDoubleValue")
    public Object[][] dataForSqrtOfDoubleValue() {
        return new Object[][] {
                {16.4, 4.049691346263317}
        };
    }

    @DataProvider(name = "CosOfDoubleValue")
    public Object[][] dataForCosOfDoubleValue() {
        return new Object[][] {
                {360.0, -0.283691091486527}
        };
    }

    @DataProvider(name = "SinOfDoubleValue")
    public Object[][] dataForSinOfDoubleValue() {
        return new Object[][] {
                {360.0, 0.9589157234143065}
        };
    }

    @DataProvider(name = "CtgOfDoubleValue")
    public Object[][] dataForCtgOfDoubleValue() {
        return new Object[][] {
                {3.5, 1.00182542851}
        };
    }

    @DataProvider(name = "TgOfDoubleValue")
    public Object[][] dataForTgOfDoubleValue() {
        return new Object[][] {
                {360.0, 0.9589157234143065/-0.283691091486527}
        };
    }

    @DataProvider(name = "IsPositiveOfLongValue")
    public Object[][] dataForIsPositiveOfLongValue() {
        return new Object[][] {
                {0L, false},
                {1L, true},
                {-1L, false}
        };
    }

    @DataProvider(name = "IsNegativeOfLongValue")
    public Object[][] dataForIsNegativeOfLongValue() {
        return new Object[][] {
                {-2L, true},
                {0L, false},
                {1L, false}
        };
    }
}
