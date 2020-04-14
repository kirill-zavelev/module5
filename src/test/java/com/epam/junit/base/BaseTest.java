package com.epam.junit.base;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    public static final double DELTA = 0.000001;

    protected Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @BeforeEach
    public void tearDown() {
        calculator = null;
    }
}
