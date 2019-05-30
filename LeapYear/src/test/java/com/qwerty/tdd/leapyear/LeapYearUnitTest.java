package com.qwerty.tdd.leapyear;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearUnitTest {

    @Test
    public void check_1997_is_not_a_leap_year() {

        assertFalse(new Year().isLeapYear());
    }
}
