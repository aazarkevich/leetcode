package ru.leetcode.leetCode75.RemovingStarsFromAString;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovingStarsFromAString {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    @Nested
    public class RemovingStarsFromAStringTest {
        @Test
        public void case1() {
            assertEquals("lecoe", removeStars("leet**cod*e"));
        }

        @Test
        public void case2() {
            assertEquals("", removeStars("erase*****"));
        }

        @Test
        public void case3() {
            assertEquals("a", removeStars("abb*cdfg*****x*"));
        }
    }
}