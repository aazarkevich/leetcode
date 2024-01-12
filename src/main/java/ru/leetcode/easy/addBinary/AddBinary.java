package ru.leetcode.easy.addBinary;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            result.insert(0, 1);
        }
        return result.toString();
    }

    @Nested
    class AddBinaryTest {
        @Test
        public void test1() {
            assertEquals("100", addBinary("11", "1"));
        }

        @Test
        public void test2() {
            assertEquals("10101", addBinary("1010", "1011"));
        }

        @Test
        public void test3() {
            assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000", addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                    "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
        }
    }
}