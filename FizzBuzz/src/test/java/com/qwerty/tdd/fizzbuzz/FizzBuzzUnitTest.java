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

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzUnitTest {

    @Test
    public void convert_1_to_1() {

        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    public void convert_2_to_2() {

        assertEquals("2", new FizzBuzz().convert(2));
    }
}
