package ru.leetcode.leetCode75.MaximumNumberOfVowelsInASubstringOfGivenLength;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public static int maxVowels(String s, int k) {
        int res = 0;
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < s.length(); i++) {

            if (i < k) {
                if (vowels.contains(s.charAt(i))) {
                    count++;
                }
            } else {
                if (vowels.contains(s.charAt(i))) {
                    count++;
                }
                if (vowels.contains(s.charAt(i - k))) {
                    count--;
                }
            }

            if (i >= k - 1) {
                res = Math.max(res, count);
            }
        }
        return res;
    }


    @Nested
    public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

        @Test
        public void case1() {
            assertEquals(3, maxVowels("abciiidef", 3));
        }

        @Test
        public void case2() {
            assertEquals(2, maxVowels("aeiou", 2));
        }

        @Test
        public void case3() {
            assertEquals(2, maxVowels("leetcode", 3));
        }

        @Test
        public void case4() {
            assertEquals(4, maxVowels("weallloveyou", 7));
        }

        @Test
        public void case5() {
            assertEquals(7, maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33));
        }
    }
}

