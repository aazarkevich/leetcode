package ru.leetcode.easy.lengthOfLastWord;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split.length > 0 ? split[split.length - 1].length() : 0;
    }


    @Nested
    class LengthOfLastWordTest {
        @Test
        public void test1() {
            assertEquals(5, lengthOfLastWord("Hello World"));
        }

        @Test
        public void test2() {
            assertEquals(4, lengthOfLastWord("   fly me   to   the moon  "));
        }

        @Test
        public void test3() {
            assertEquals(6, lengthOfLastWord("luffy is still joyboy"));
        }
    }
}