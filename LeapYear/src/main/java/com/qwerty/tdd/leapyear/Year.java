package com.qwerty.tdd.leapyear;

public class Year {

    private int year;


    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {

        if( year % 4 == 0 && year % 100 != 0) return true;

        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
}
