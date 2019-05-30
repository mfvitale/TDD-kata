package com.qwerty.tdd.leapyear;

public class Year {

    private int year;


    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {

        if(year % 4 == 0) return true;

        return false;
    }
}
