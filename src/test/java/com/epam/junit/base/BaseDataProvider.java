package com.epam.junit.base;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BaseDataProvider {

    public static Stream<Double[]> dataForSumOfDoubleValues() {
        return Stream.of(
                new Double[]{3.5, 6.5, 10.0},
                new Double[]{-5.5, 2.5, -3.0}
        );
    }

    public static Stream<Long[]> dataForSumOfLongValues() {
        return Stream.of(
                new Long[]{30L, 60L, 90L},
                new Long[]{-5L, -6L, -11L}
        );
    }

    public static Stream<Double[]> dataForSubOfDoubleValues() {
        return Stream.of(
                new Double[]{10.0458, 15.72993, -5.68413},
                new Double[]{40.578, 8.3, 32.278}

        );
    }

    public static Stream<Long[]> dataForSubOfLongValues() {
        return Stream.of(
                new Long[]{10L, 15L, -5L},
                new Long[]{25L, 5L, 20L}

        );
    }

    public static Object[][] dataForIsPositiveTest() {
        return new Object[][]{
                {0L, false},
                {1L, true},
                {-1L, false}
        };
    }

    public static Object[][] dataForIsNegativeTest() {
        return new Object[][]{
                {-2L, true},
                {0L, false},
                {1L, false}
        };
    }

    public static Stream<Double[]> dataForMultOfDoubleValues() {
        return Stream.of(
                new Double[]{5.846, 6.50, 37.0},
                new Double[]{5.846, -6.50, -38.0}
        );
    }

    public static Stream<Long[]> dataForMultOfLongValues() {
        return Stream.of(
                new Long[]{10L, 15L, 150L},
                new Long[]{-10L, 15L, -150L}
        );
    }

    public static Stream<Double[]> dataForPowOfDoubleValues() {
        return Stream.of(
                new Double[]{1.5, 3.1, 3.375},
                new Double[]{-1.5, 3.1, -3.375}
        );
    }

    public static Stream<Double[]> dataForSqrtOfDoubleValue() {
        return Stream.of(
                new Double[]{16.4, 4.049691346263317},
                new Double[]{44.78, 6.691786009728643}
        );
    }

    public static Stream<Double[]> dataForDivOfDoubleValues() {
        return Stream.of(
                new Double[]{1.5, 3.0, 0.5},
                new Double[]{-1.5, 3.0, -0.5}
        );
    }

    public static Stream<Long[]> dataForDivOfLongValues() {
        return Stream.of(
                new Long[]{10L, 0L},
                new Long[]{-10L, 0L}
        );
    }

    public static Object[][] dataForSinOfDoubleValue() {
        return new Object[][]{
                {360.0, 0.9589157234143065}
        };
    }

    public static Object[][] dataForCosOfDoubleValue() {
        return new Object[][]{
                {360.0, -0.283691091486527}
        };
    }

    public static Object[][] dataForCtgOfDoubleValue() {
        return new Object[][]{
                {3.5, 1.00182542851}
        };
    }

    public static Object[][] dataForTgOfDoubleValue() {
        return new Object[][]{
                {360.0, 0.9589157234143065/-0.283691091486527}
        };
    }

}
