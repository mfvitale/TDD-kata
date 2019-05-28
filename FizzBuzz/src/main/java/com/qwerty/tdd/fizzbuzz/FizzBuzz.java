/************************************************************************************
 * Copyright © BMC Software Inc.                                                    *
 *                                                                                  *
 *                                                                                  *
 *  `.-.`                                                                           *
 *  +oooo/:.                                                                        *
 *  `ooo-/+oo+:.`                                                                   *
 *  `ooo  `.:+ooo/-`           bmmm`                                                *
 *  `ooo.     `-/+oo+:.`       bmmm`                                                *
 *   -+oo/-`     `.:+oo+.      bmmm`                                                *
 *    `-/+oo+:.`  `-/ooo-      bmmm:+cccb/.   +mmm:mmmm+mm/mmmmm+-    `:+cccc+:`    *
 *       `.:+oo+/+oo+/-`       bmmmmbcbmmmb/  cmmmmbbmmmmmmbbmmmm/  :bmmbccbmmb-    *
 *         `-+oooooo/.`        bmmm:` `.cdmm: cmmm:``-mmmm-``-mmmb -mmdo`  .+oo/    *
 *     `.:+ooo/:.-/+oo+:`      bmmm`    .mmmo cmmm`   bmmm`   mmmb ommm.            *
 *   `:+oo+/-`     .:ooo:      bmmm`    /dmm+ cmmm`   bmmm`   mmmb /mmd/    ---.    *
 *   /oo/.`     .:/+oo/:`      bmmmb+//cmmmb` cmmm`   bmmm`   mmmb `cmmmo//ommm/    *
 *  `ooo    `-/+oo+/-`         cmmmcbmmmmc/`  cmmm`   cmmb`   bmmc  `:cbmmmmbc:     *
 *  `ooo .-/ooo+:.`            ```` `...``    ````    ````    ````     `....`       *
 *  `ooo+ooo/-`                                                                     *
 *  -+++:.`                                                                         *
 *                                                                                  *
 *                                                                                  *
 * This source code is property of BMC Software Inc.,                               *
 * covered by Copyright. All rights reserved.                                       *
 *                                                                                  *
 ************************************************************************************/
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
