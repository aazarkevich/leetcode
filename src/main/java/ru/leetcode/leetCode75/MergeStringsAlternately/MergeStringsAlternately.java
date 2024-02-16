package ru.leetcode.leetCode75.MergeStringsAlternately;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        char[] chars = new char[word1.length() + word2.length()];
        int i = 0, j = 0, k = 0;
        while (k < word1.length() + word2.length()) {
            if (i < word1.length()) {
                chars[k] = word1.charAt(i);
                i++;
                k++;
            }
            if (j < word2.length()) {
                chars[k] = word2.charAt(j);
                j++;
                k++;
            }
        }
        return new String(chars);
    }

    @Nested
    class MergeStringsAlternatelyTest {
        @Test
        public void case1() {
            assertEquals("apbqcr", mergeAlternately("abc", "pqr"));
        }

        @Test
        public void case2() {
            assertEquals("apbqrs", mergeAlternately("ab", "pqrs"));
        }

        @Test
        public void case3() {
            assertEquals("apbqcd", mergeAlternately("abcd", "pq"));
        }
    }
}