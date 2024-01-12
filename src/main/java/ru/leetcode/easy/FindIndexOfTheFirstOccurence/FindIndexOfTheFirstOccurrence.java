package ru.leetcode.easy.FindIndexOfTheFirstOccurence;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexOfTheFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    @Nested
    class FindIndexOfTheFirstOccurrenceTest {

        @Test
        public void case1() {
            assertEquals(0, strStr("sadbutsad", "sad"));
        }

        @Test
        public void case2() {
            assertEquals(-1, strStr("leetcode", "leeto"));
        }
    }
}
