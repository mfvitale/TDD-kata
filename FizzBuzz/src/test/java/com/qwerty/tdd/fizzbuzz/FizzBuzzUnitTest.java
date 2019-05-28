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


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzUnitTest {

    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    public void convert_number_to_FizzBuzz_string(int number, String expectedOutput) {

        assertEquals(expectedOutput, new FizzBuzz().convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27})
    public void convert_multiple_of_3_to_Fizz(int number) {

        assertEquals("Fizz", new FizzBuzz().convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40, 50})
    public void convert_multiple_of_5_to_Buzz(int number) {

        assertEquals("Buzz", new FizzBuzz().convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90, 105})
    public void convert_multiple_of_3_and_5_to_FizzBuzz(int number) {

        assertEquals("FizzBuzz", new FizzBuzz().convert(number));
    }
}
