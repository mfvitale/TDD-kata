package com.qwerty.tdd.leapyear;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearUnitTest {

    @Test
    public void check_1997_is_not_a_leap_year() {

        assertFalse(new Year().isLeapYear());
    }

    @Test
    public void check_1996_is_a_leap_year() {

        assertTrue(new Year().isLeapYear());
    }
}
