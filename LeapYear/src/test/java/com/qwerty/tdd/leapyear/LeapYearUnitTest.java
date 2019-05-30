package com.qwerty.tdd.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearUnitTest {

    @ParameterizedTest
    @ValueSource(ints = {1997, 1800, 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600})
    public void check_is_not_a_leap_year(int year) {

        assertFalse(new Year(year).isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {1996, 1600, 2000, 2400})
    public void check_is_a_leap_year(int year) {

        assertTrue(new Year(year).isLeapYear());
    }
}
