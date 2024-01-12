package ru.leetcode.easy.divideTwoIntegers;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {

        return (int) (dividend * Math.pow(divisor, -1));
    }

    @Nested
    class DivideTwoIntegersTest {

        @Test
        public void case1() {
            assertEquals(3, divide(10, 3));
        }

        @Test
        public void case2() {
            assertEquals(-2, divide(7, -3));
        }
    }
}
