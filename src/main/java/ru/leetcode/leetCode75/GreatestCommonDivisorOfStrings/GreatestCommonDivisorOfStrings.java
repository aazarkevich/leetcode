package ru.leetcode.leetCode75.GreatestCommonDivisorOfStrings;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int len = gcd(str1.length(), str2.length());
        return str1.substring(0, len);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Nested
    class GreatestCommonDivisorOfStringsTest {
        @Test
        public void case1() {
            assertEquals("ABC", gcdOfStrings("ABCABC", "ABC"));
        }

        @Test
        public void case2() {
            assertEquals("AB", gcdOfStrings("ABABAB", "ABAB"));
        }

        @Test
        public void case3() {
            assertEquals("", gcdOfStrings("LEET", "CODE"));
        }

        @Test
        public void case4() {
            assertEquals("", gcdOfStrings("ABCDEF", "ABC"));
        }

        @Test
        public void case5() {
            assertEquals("TAUXX", gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        }

        @Test
        public void case6() {
            assertEquals("CXTXN", gcdOfStrings("CXTXNCXTXNCXTXNCXTXNCXTXN", "CXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXN"));
        }

        @Test
        public void case7() {
            assertEquals("ABAB", gcdOfStrings("ABABABAB", "ABAB"));
        }

        @Test
        public void case8() {
            assertEquals("", gcdOfStrings("AABB", "AB"));
        }
    }
}
