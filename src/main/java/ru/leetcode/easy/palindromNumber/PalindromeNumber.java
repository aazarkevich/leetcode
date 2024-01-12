package ru.leetcode.easy.palindromNumber;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }

    @Nested
    class PalindromeTest {
        @Test
        public void case1() {
            assertTrue(isPalindrome(121));
        }

        @Test
        public void case2() {
            assertFalse(isPalindrome(-121));
        }

        @Test
        public void case3() {
            assertFalse(isPalindrome(10));
        }
    }
}
