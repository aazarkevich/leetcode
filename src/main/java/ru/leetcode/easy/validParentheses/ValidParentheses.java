package ru.leetcode.easy.validParentheses;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i;

        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0) {
                    return false;

                } else if (st.peek() != '(') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == '}') {
                if (st.size() == 0) {
                    return false;

                } else if (st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.size() == 0) {
                    return false;

                } else if (st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            }

        }
        return st.size() == 0;
    }

    @Nested
    class ValidParenthesesTest {
        @Test
        public void case1() {
            assertTrue(isValid("()"));
        }

        @Test
        public void case2() {
            assertTrue(isValid("()[]{}"));
        }

        @Test
        public void case3() {
            assertFalse(isValid("(]"));
        }

        @Test
        public void case4() {
            assertFalse(isValid("([)]"));
        }
    }
}
