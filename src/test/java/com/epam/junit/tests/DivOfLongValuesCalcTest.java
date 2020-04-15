package com.epam.junit.tests;

import com.epam.junit.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivOfLongValuesCalcTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("com.epam.junit.base.BaseDataProvider#dataForDivOfLongValues")
    public void divOfLongValues(Long a, Long b) {
        Throwable thrown = assertThrows(NumberFormatException.class, () -> calculator.div(a, b));
        assertEquals("Attempt to divide by zero", thrown.getMessage());
    }
}
