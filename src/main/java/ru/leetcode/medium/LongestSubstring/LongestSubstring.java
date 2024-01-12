package ru.leetcode.medium.LongestSubstring;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstring {

    static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (!list.contains(chars[i])) {
                list.add(chars[i]);
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (list.contains(chars[j])) {
                    max = max < list.size() ? list.size() : max;
                    list.clear();
                    break;
                }
                list.add(chars[j]);
            }
        }
        return max >= list.size() ? max : list.size();
    }

    @Nested
    class LongestSubstringTest {
        @Test
        public void case1() {
            assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
        }

        @Test
        public void case2() {
            assertEquals(1, lengthOfLongestSubstring("bbbbb"));
        }

        @Test
        public void case3() {
            assertEquals(3, lengthOfLongestSubstring("pwwkew"));
        }

        @Test
        public void case4() {
            assertEquals(1, lengthOfLongestSubstring(" "));
        }

        @Test
        public void case5() {
            assertEquals(2, lengthOfLongestSubstring("au"));
        }

        @Test
        public void case6() {
            assertEquals(2, lengthOfLongestSubstring("aab"));
        }
    }
}
