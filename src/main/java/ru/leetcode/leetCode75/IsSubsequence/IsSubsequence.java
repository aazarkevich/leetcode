package ru.leetcode.leetCode75.IsSubsequence;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        char[] chars = new char[s.length()];
        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                chars[i] = t.charAt(j);
                i++;
            }
            if (i >= s.length()) return new String(chars).equals(s);
        }
        System.out.println(new String(chars));
        return new String(chars).equals(s);
    }

    @Nested
    public class IsSubsequenceTest {
        @Test
        public void case1() {
            assertTrue(isSubsequence("abc", "ahbgdc"));
        }

        @Test
        public void case2() {
            assertFalse(isSubsequence("axc", "ahbgdc"));
        }

        @Test
        public void case3() {
            assertFalse(isSubsequence("acb", "ahbgdc"));
        }

        @Test
        public void case4() {
            assertFalse(isSubsequence("aaaaaa", "bbaaaa"));
        }
    }
}