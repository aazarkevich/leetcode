package ru.leetcode.leetCode75.StringCompression;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompression {
    public static int compress(char[] chars) {
        if (chars.length == 1) return 1;
        StringBuilder result = new StringBuilder();
        char buf = '\u0000';
        int count = 0;
        for (char ch : chars) {
            if (buf != ch && count > 1) {
                for (char digit : Integer.toString(count).toCharArray())
                    result.append(digit);
                count = 0;
            }

            if (buf != ch) {
                count = 0;
                buf = ch;
                result.append(ch);
            }
            if (buf == ch) {
                count++;
            }
        }
        if (count > 1) {
            for (char digit : Integer.toString(count).toCharArray())
                result.append(digit);
        }
        int i = 0;
        for (char ch : result.toString().toCharArray()) {
            chars[i] = ch;
            i++;
        }
        System.gc();
        return result.length();
    }

    @Nested
    public class StringCompressionTest {
        @Test
        public void case1() {
            char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
            assertEquals(6, compress(chars));
        }

        @Test
        public void case2() {
            char[] chars = new char[]{'a'};
            assertEquals(1, compress(chars));
        }

        @Test
        public void case3() {
            char[] chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
            assertEquals(4, compress(chars));
        }

        @Test
        public void case4() {
            char[] chars = new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'};
            assertEquals(6, compress(chars));
        }

        @Test
        public void case5() {
            char[] chars = new char[]{'a', 'b', 'c'};
            assertEquals(3, compress(chars));
        }
    }
}