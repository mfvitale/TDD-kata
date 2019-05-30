package com.qwerty.tdd.leapyear;

public class Year {

    private int year;


    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {

        if( isDivisibleBy(4) && !isDivisibleBy(100)) return true;

        return  isDivisibleBy(4) &&
                isDivisibleBy(100) &&
                isDivisibleBy(400);
    }

    private boolean isDivisibleBy(int factor) {

        return this.year % factor == 0;
    }
}
