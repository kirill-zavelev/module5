package com.epam.junit.dataprovider;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BaseDataProvider {

    public static Stream<Double[]> doubleValuesForSum() {
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

}
