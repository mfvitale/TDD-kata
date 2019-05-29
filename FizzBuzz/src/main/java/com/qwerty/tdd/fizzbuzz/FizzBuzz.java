package com.qwerty.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    /**
     *
     * @param number
     * @return
     * If the number is a multiple of three, return the string "Fizz".
     * If the number is a multiple of five, return the string "Buzz".
     * If the number is a multiple of both three and five, return the string "FizzBuzz".
     */
    public String convert(int number) {

        if(divisibleBy(number, 15) ) return FIZZ+BUZZ;
        if(divisibleBy(number, 3)) return FIZZ;
        if(divisibleBy(number, 5)) return BUZZ;

        return String.valueOf(number);
    }

    private boolean divisibleBy(int number, int factor) {
        return number % factor == 0;
    }
}
