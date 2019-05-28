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

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzUnitTest {

    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    public void convert_number_to_FizzBuzz_string(int number, String expectedOutput) {

        assertEquals(expectedOutput, new FizzBuzz().convert(number));
    }

    @Test
    public void convert_3_to_Fizz() {

        assertEquals("Fizz", new FizzBuzz().convert(3));
    }

    @Test
    public void convert_6_to_Fizz() {

        assertEquals("Fizz", new FizzBuzz().convert(6));
    }
}
