package ru.leetcode.medium.reverseInteger;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseInteger {
    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        int i = stringBuilder.indexOf("-");
        try {
            return i > -1 ? -1 * Integer.parseInt(stringBuilder.reverse().deleteCharAt(stringBuilder.length() - 1).toString()) :
                    Integer.parseInt(stringBuilder.reverse().toString());
        } catch (Exception e) {
            return 0;
        }
    }

    @Nested
    class ReverseIntegerTest {
        @Test
        public void case1() {
            assertEquals(321, reverse(123));
        }

        @Test
        public void case2() {
            assertEquals(-321, reverse(-123));
        }

        @Test
        public void case3() {
            assertEquals(21, reverse(120));
        }

    }
}
