package ru.leetcode.leetCode75.ReverseWordsInAString;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            res.append(strings[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }

    @Nested
    public class ReverseWordsInAStringTest {
        @Test
        public void case1() {
            assertEquals("blue is sky the", reverseWords("the sky is blue"));
        }

        @Test
        public void case2() {
            assertEquals("world hello", reverseWords("  hello world  "));
        }

        @Test
        public void case3() {
            assertEquals("example good a", reverseWords(" a good   example "));
        }
    }
}
