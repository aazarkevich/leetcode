package ru.leetcode.leetCode75.ReverseVowelsOfAString;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!vowels.contains(chars[i])) {
                i++;
            } else if (!vowels.contains(chars[j])) {
                j--;
            } else {
                char buf = chars[i];
                chars[i] = chars[j];
                chars[j] = buf;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    @Nested
    class ReverseVowelsOfAStringTest {
        @Test
        public void case1() {
            assertEquals("holle", reverseVowels("hello"));
        }

        @Test
        public void case2() {
            assertEquals("leotcede", reverseVowels("leetcode"));
        }

        @Test
        public void case3() {
            assertEquals("race car", reverseVowels("race car"));
        }
    }
}
